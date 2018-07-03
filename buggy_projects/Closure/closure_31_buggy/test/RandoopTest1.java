
import junit.framework.*;

public class RandoopTest1 extends TestCase {

  public static boolean debug = false;

  public void test1() {}
//   public void test1() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test1"); }
// 
// 
//     com.google.javascript.jscomp.CodingConvention var0 = null;
//     com.google.javascript.jscomp.ClosureCodingConvention var1 = new com.google.javascript.jscomp.ClosureCodingConvention(var0);
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.number(10.0d);
//     boolean var4 = var3.isLabel();
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var9 = var6.useSourceInfoIfMissingFrom(var8);
//     boolean var10 = var8.isFalse();
//     com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.sheq(var3, var8);
//     com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.Node.newString(0, "hi!");
//     java.lang.String var15 = var1.extractClassNameIfRequire(var3, var14);
//     com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var20 = var17.useSourceInfoIfMissingFrom(var19);
//     com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.exprResult(var20);
//     com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.block(var21);
//     com.google.javascript.rhino.Node var23 = var21.getLastSibling();
//     boolean var24 = var21.isFalse();
//     boolean var25 = var1.isOptionalParameter(var21);
//     boolean var28 = var1.isExported("module${1101839915}", true);
// 
//   }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test2"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var3 = null;
    boolean var5 = var2.canPropertyBeDefined(var3, "EMPTY\n");
    com.google.javascript.rhino.jstype.FunctionBuilder var6 = new com.google.javascript.rhino.jstype.FunctionBuilder(var2);
    com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode var7 = null;
    var2.setResolveMode(var7);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var14 = var11.useSourceInfoIfMissingFrom(var13);
    java.lang.Object var16 = var14.getProp(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.jstype.FunctionType var17 = var2.createInterfaceType("ECMASCRIPT3", var14);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test3() {}
//   public void test3() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test3"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var4 = var1.useSourceInfoIfMissingFrom(var3);
//     boolean var5 = var3.isFromExterns();
//     java.lang.Iterable var6 = var3.children();
//     com.google.javascript.rhino.Node var8 = var3.getChildAtIndex(10);
// 
//   }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test4"); }


    com.google.javascript.jscomp.CodingConvention var0 = null;
    com.google.javascript.jscomp.ClosureCodingConvention var1 = new com.google.javascript.jscomp.ClosureCodingConvention(var0);
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = null;
    com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter var3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter((com.google.javascript.jscomp.CodingConvention)var1, var2);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var8 = var5.useSourceInfoIfMissingFrom(var7);
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.eq(var7, var10);
    var11.setSourceEncodedPosition(100);
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var18 = var15.useSourceInfoIfMissingFrom(var17);
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.eq(var17, var20);
    com.google.javascript.rhino.Node var22 = var17.cloneNode();
    boolean var23 = var22.isOr();
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var28 = var25.useSourceInfoIfMissingFrom(var27);
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.eq(var27, var30);
    com.google.javascript.rhino.Node var32 = var27.cloneNode();
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.or(var22, var32);
    com.google.javascript.rhino.Node var34 = var11.useSourceInfoFromForTree(var22);
    com.google.javascript.rhino.Node var35 = var11.removeFirstChild();
    com.google.javascript.jscomp.CodingConvention var36 = null;
    com.google.javascript.jscomp.ClosureCodingConvention var37 = new com.google.javascript.jscomp.ClosureCodingConvention(var36);
    com.google.javascript.rhino.jstype.JSTypeRegistry var38 = null;
    com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter var39 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter((com.google.javascript.jscomp.CodingConvention)var37, var38);
    com.google.javascript.jscomp.ClosureCodingConvention var40 = new com.google.javascript.jscomp.ClosureCodingConvention((com.google.javascript.jscomp.CodingConvention)var37);
    com.google.javascript.rhino.Node var42 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var44 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var45 = var42.useSourceInfoIfMissingFrom(var44);
    com.google.javascript.rhino.Node var47 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.IR.eq(var44, var47);
    com.google.javascript.rhino.Node var49 = var44.cloneNode();
    boolean var50 = var49.isOr();
    com.google.javascript.rhino.jstype.StaticSourceFile var51 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var49);
    boolean var52 = var49.isDec();
    boolean var53 = var49.isFor();
    boolean var54 = var37.isVarArgsParameter(var49);
    boolean var55 = var49.isEmpty();
    boolean var56 = var35.hasChild(var49);
    com.google.javascript.rhino.Node var58 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var60 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var61 = var58.useSourceInfoIfMissingFrom(var60);
    com.google.javascript.rhino.Node var63 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var64 = com.google.javascript.rhino.IR.eq(var60, var63);
    com.google.javascript.rhino.Node var65 = var60.cloneNode();
    boolean var66 = var65.isOr();
    com.google.javascript.rhino.Node var68 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var70 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var71 = var68.useSourceInfoIfMissingFrom(var70);
    com.google.javascript.rhino.Node var73 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var74 = com.google.javascript.rhino.IR.eq(var70, var73);
    com.google.javascript.rhino.Node var75 = var70.cloneNode();
    com.google.javascript.rhino.Node var76 = com.google.javascript.rhino.IR.or(var65, var75);
    int var77 = var65.getCharno();
    java.lang.String var78 = var1.extractClassNameIfRequire(var35, var65);
    com.google.javascript.rhino.Node var80 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var82 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var83 = var80.useSourceInfoIfMissingFrom(var82);
    com.google.javascript.rhino.Node var85 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var86 = com.google.javascript.rhino.IR.eq(var82, var85);
    var86.setSourceEncodedPosition(100);
    var35.addChildrenToFront(var86);
    com.google.javascript.rhino.Node var90 = var35.removeFirstChild();
    boolean var91 = var35.isDelProp();
    int var92 = var35.getSideEffectFlags();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
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
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
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
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
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
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
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
    assertTrue(var77 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == 0);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test5"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    com.google.javascript.rhino.ErrorReporter var1 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var1, true);
    com.google.javascript.rhino.ErrorReporter var4 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var4, true);
    com.google.javascript.rhino.jstype.ObjectType var7 = var6.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var8 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var8, true);
    com.google.javascript.rhino.jstype.ObjectType var11 = var10.createAnonymousObjectType();
    boolean var12 = var11.isUnknownType();
    boolean var13 = var7.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var11);
    boolean var14 = var11.isFunctionPrototypeType();
    var11.clearCachedValues();
    com.google.javascript.rhino.jstype.ObjectType var16 = var11.dereference();
    com.google.javascript.rhino.jstype.JSType[] var17 = new com.google.javascript.rhino.jstype.JSType[] { var16};
    com.google.javascript.rhino.jstype.JSType var18 = var3.createUnionType(var17);
    com.google.javascript.rhino.ErrorReporter var19 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var19, true);
    com.google.javascript.rhino.jstype.JSType var22 = null;
    boolean var24 = var21.canPropertyBeDefined(var22, "hi!");
    boolean var26 = var21.hasNamespace("");
    com.google.javascript.rhino.jstype.FunctionBuilder var27 = new com.google.javascript.rhino.jstype.FunctionBuilder(var21);
    com.google.javascript.rhino.jstype.FunctionBuilder var29 = var27.withName("NUMBER 10.0\n");
    com.google.javascript.rhino.ErrorReporter var30 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var30, true);
    com.google.javascript.rhino.jstype.ObjectType var33 = var32.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var34 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var34, true);
    com.google.javascript.rhino.jstype.ObjectType var37 = var36.createAnonymousObjectType();
    boolean var38 = var37.isUnknownType();
    boolean var39 = var33.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var37);
    boolean var40 = var37.isFunctionPrototypeType();
    com.google.javascript.rhino.jstype.FunctionBuilder var42 = var29.withReturnType((com.google.javascript.rhino.jstype.JSType)var37, true);
    com.google.javascript.rhino.Node var44 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var46 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var47 = var44.useSourceInfoIfMissingFrom(var46);
    com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var50 = com.google.javascript.rhino.IR.eq(var46, var49);
    com.google.javascript.rhino.Node var51 = var46.cloneNode();
    boolean var52 = var51.isOr();
    com.google.javascript.rhino.jstype.StaticSourceFile var53 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var51);
    boolean var54 = var51.isDec();
    boolean var55 = var51.isFor();
    boolean var56 = var51.isNoSideEffectsCall();
    com.google.javascript.rhino.jstype.FunctionType var57 = var3.createFunctionType((com.google.javascript.rhino.jstype.JSType)var37, var51);
    int var58 = var57.getExtendedInterfacesCount();
    boolean var59 = var57.isReturnTypeInferred();
    boolean var60 = var57.isOrdinaryFunction();
    int var61 = var57.getMaxArguments();
    boolean var62 = var57.isGlobalThisType();
    com.google.javascript.rhino.JSDocInfoBuilder var64 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
    java.nio.charset.Charset var67 = null;
    com.google.javascript.jscomp.SourceFile var68 = com.google.javascript.jscomp.SourceFile.fromFile("NUMBER 10.0", var67);
    var64.markName("{1459695149}", (com.google.javascript.rhino.jstype.StaticSourceFile)var68, 10, 39);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var72 = var0.getDirectedGraphEdges((java.lang.Object)var57, (java.lang.Object)10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test6"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.jscomp.CompilerOptions var2 = new com.google.javascript.jscomp.CompilerOptions();
    var2.setCrossModuleCodeMotion(false);
    var2.setLabelRenaming(true);
    java.util.Set var7 = null;
    var2.setStripTypePrefixes(var7);
    var1.initOptions(var2);
    java.nio.charset.Charset var11 = null;
    com.google.javascript.jscomp.SourceFile var12 = com.google.javascript.jscomp.SourceFile.fromFile("NUMBER 10.0", var11);
    com.google.javascript.jscomp.Region var14 = var12.getRegion(100);
    java.lang.String var15 = var12.toString();
    com.google.javascript.rhino.Node var16 = var1.parse(var12);
    com.google.javascript.jscomp.CodingConvention var17 = var1.getCodingConvention();
    var1.disableThreads();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.check();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "NUMBER 10.0"+ "'", var15.equals("NUMBER 10.0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test7"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.ObjectType var3 = var2.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var4 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var4, true);
    com.google.javascript.rhino.jstype.ObjectType var7 = var6.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var8 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var8, true);
    com.google.javascript.rhino.jstype.ObjectType var11 = var10.createAnonymousObjectType();
    boolean var12 = var11.isUnknownType();
    boolean var13 = var7.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var11);
    com.google.javascript.rhino.jstype.JSType var14 = var2.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType)var7);
    boolean var15 = var7.isBooleanValueType();
    com.google.javascript.rhino.jstype.FunctionType var16 = com.google.javascript.rhino.jstype.JSType.toMaybeFunctionType((com.google.javascript.rhino.jstype.JSType)var7);
    com.google.javascript.rhino.ErrorReporter var17 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var17, true);
    com.google.javascript.rhino.jstype.ObjectType var20 = var19.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var21 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var21, true);
    com.google.javascript.rhino.jstype.ObjectType var24 = var23.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var25 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var25, true);
    com.google.javascript.rhino.jstype.ObjectType var28 = var27.createAnonymousObjectType();
    boolean var29 = var28.isUnknownType();
    boolean var30 = var24.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var28);
    com.google.javascript.rhino.jstype.JSType var31 = var19.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType)var24);
    boolean var32 = var24.isBooleanValueType();
    com.google.javascript.rhino.jstype.JSType var33 = var7.getGreatestSubtype((com.google.javascript.rhino.jstype.JSType)var24);
    boolean var34 = var24.isVoidType();
    com.google.javascript.rhino.jstype.ObjectType var35 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test8"); }


    com.google.javascript.rhino.Node var1 = new com.google.javascript.rhino.Node(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var2 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(var1);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test9"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var3 = null;
    boolean var5 = var2.canPropertyBeDefined(var3, "hi!");
    boolean var7 = var2.hasNamespace("");
    com.google.javascript.rhino.ErrorReporter var8 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var8, true);
    com.google.javascript.rhino.jstype.ObjectType var11 = var10.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var12 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var12, true);
    com.google.javascript.rhino.jstype.ObjectType var15 = var14.createAnonymousObjectType();
    boolean var16 = var15.isUnknownType();
    boolean var17 = var11.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var15);
    boolean var18 = var15.isFunctionPrototypeType();
    var2.resolveTypesInScope((com.google.javascript.rhino.jstype.StaticScope)var15);
    com.google.javascript.rhino.Node var20 = var15.getRootNode();
    boolean var21 = var15.isNominalType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test10() {}
//   public void test10() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test10"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var4 = var1.useSourceInfoIfMissingFrom(var3);
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.eq(var3, var6);
//     com.google.javascript.rhino.Node var8 = var3.cloneNode();
//     boolean var9 = var3.isDelProp();
//     boolean var10 = var3.isIf();
//     com.google.javascript.rhino.Node var11 = null;
//     var3.addChildToBack(var11);
// 
//   }

  public void test11() {}
//   public void test11() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test11"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     double var2 = var1.getProgress();
//     java.lang.String[] var3 = var1.toSourceArray();
// 
//   }

  public void test12() {}
//   public void test12() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test12"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = null;
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.number(10.0d);
//     boolean var3 = var2.isLabel();
//     com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var8 = var5.useSourceInfoIfMissingFrom(var7);
//     boolean var9 = var7.isFalse();
//     com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.sheq(var2, var7);
//     boolean var11 = var2.isTrue();
//     com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.sub(var0, var2);
// 
//   }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test13"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.ObjectType var3 = var2.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var4 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var4, true);
    com.google.javascript.rhino.jstype.ObjectType var7 = var6.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var8 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var8, true);
    com.google.javascript.rhino.jstype.ObjectType var11 = var10.createAnonymousObjectType();
    boolean var12 = var11.isUnknownType();
    boolean var13 = var7.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var11);
    com.google.javascript.rhino.jstype.JSType var14 = var2.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType)var7);
    boolean var15 = var7.isBooleanValueType();
    com.google.javascript.rhino.jstype.FunctionType var16 = com.google.javascript.rhino.jstype.JSType.toMaybeFunctionType((com.google.javascript.rhino.jstype.JSType)var7);
    com.google.javascript.rhino.ErrorReporter var17 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var17, true);
    com.google.javascript.rhino.jstype.ObjectType var20 = var19.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var21 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var21, true);
    com.google.javascript.rhino.jstype.ObjectType var24 = var23.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var25 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var25, true);
    com.google.javascript.rhino.jstype.ObjectType var28 = var27.createAnonymousObjectType();
    boolean var29 = var28.isUnknownType();
    boolean var30 = var24.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var28);
    com.google.javascript.rhino.jstype.JSType var31 = var19.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType)var24);
    boolean var32 = var24.isBooleanValueType();
    com.google.javascript.rhino.jstype.JSType var33 = var7.getGreatestSubtype((com.google.javascript.rhino.jstype.JSType)var24);
    boolean var34 = var24.matchesUint32Context();
    com.google.javascript.rhino.jstype.EnumType var35 = var24.toMaybeEnumType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test14"); }


    com.google.javascript.rhino.JSDocInfoBuilder var1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    boolean var4 = var1.recordParameterDescription("NUMBER 10.0", "{505847021}");
    com.google.javascript.rhino.JSTypeExpression var5 = null;
    boolean var6 = var1.recordReturnType(var5);
    boolean var7 = var1.recordNoShadow();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test15"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.ErrorReporter var3 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var3, true);
    com.google.javascript.rhino.jstype.ObjectType var6 = var5.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var7 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7, true);
    com.google.javascript.rhino.jstype.ObjectType var10 = var9.createAnonymousObjectType();
    boolean var11 = var10.isUnknownType();
    boolean var12 = var6.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var10);
    boolean var13 = var10.isFunctionPrototypeType();
    var10.clearCachedValues();
    com.google.javascript.rhino.jstype.ObjectType var15 = var10.dereference();
    com.google.javascript.rhino.jstype.JSType[] var16 = new com.google.javascript.rhino.jstype.JSType[] { var15};
    com.google.javascript.rhino.jstype.JSType var17 = var2.createUnionType(var16);
    com.google.javascript.rhino.ErrorReporter var18 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var18, true);
    com.google.javascript.rhino.jstype.JSType var21 = null;
    boolean var23 = var20.canPropertyBeDefined(var21, "hi!");
    boolean var25 = var20.hasNamespace("");
    com.google.javascript.rhino.jstype.FunctionBuilder var26 = new com.google.javascript.rhino.jstype.FunctionBuilder(var20);
    com.google.javascript.rhino.jstype.FunctionBuilder var28 = var26.withName("NUMBER 10.0\n");
    com.google.javascript.rhino.ErrorReporter var29 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var29, true);
    com.google.javascript.rhino.jstype.ObjectType var32 = var31.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var33 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var33, true);
    com.google.javascript.rhino.jstype.ObjectType var36 = var35.createAnonymousObjectType();
    boolean var37 = var36.isUnknownType();
    boolean var38 = var32.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var36);
    boolean var39 = var36.isFunctionPrototypeType();
    com.google.javascript.rhino.jstype.FunctionBuilder var41 = var28.withReturnType((com.google.javascript.rhino.jstype.JSType)var36, true);
    com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var46 = var43.useSourceInfoIfMissingFrom(var45);
    com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.eq(var45, var48);
    com.google.javascript.rhino.Node var50 = var45.cloneNode();
    boolean var51 = var50.isOr();
    com.google.javascript.rhino.jstype.StaticSourceFile var52 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var50);
    boolean var53 = var50.isDec();
    boolean var54 = var50.isFor();
    boolean var55 = var50.isNoSideEffectsCall();
    com.google.javascript.rhino.jstype.FunctionType var56 = var2.createFunctionType((com.google.javascript.rhino.jstype.JSType)var36, var50);
    boolean var57 = var56.isReturnTypeInferred();
    boolean var58 = var56.hasInstanceType();
    com.google.javascript.rhino.jstype.FunctionType var59 = var56.toMaybeFunctionType();
    boolean var60 = var59.isNativeObjectType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.jstype.ObjectType var62 = var59.getTopMostDefiningType("{505847021}");
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
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
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test16"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var4 = var1.useSourceInfoIfMissingFrom(var3);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.eq(var3, var6);
    var7.setSourceEncodedPosition(100);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var14 = var11.useSourceInfoIfMissingFrom(var13);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.eq(var13, var16);
    com.google.javascript.rhino.Node var18 = var13.cloneNode();
    boolean var19 = var18.isOr();
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var24 = var21.useSourceInfoIfMissingFrom(var23);
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.eq(var23, var26);
    com.google.javascript.rhino.Node var28 = var23.cloneNode();
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.or(var18, var28);
    com.google.javascript.rhino.Node var30 = var7.useSourceInfoFromForTree(var18);
    boolean var31 = var30.isScript();
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var36 = var33.useSourceInfoIfMissingFrom(var35);
    com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.IR.eq(var35, var38);
    com.google.javascript.rhino.Node var40 = var35.cloneNode();
    java.lang.String var41 = var30.checkTreeEquals(var40);
    com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.IR.number(10.0d);
    boolean var44 = var43.isLabel();
    com.google.javascript.rhino.Node var46 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var49 = var46.useSourceInfoIfMissingFrom(var48);
    boolean var50 = var48.isFalse();
    com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.IR.sheq(var43, var48);
    java.lang.Iterable var52 = var48.siblings();
    com.google.javascript.rhino.Node var54 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var56 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var57 = var54.useSourceInfoIfMissingFrom(var56);
    com.google.javascript.rhino.Node var59 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var60 = com.google.javascript.rhino.IR.eq(var56, var59);
    com.google.javascript.rhino.Node var61 = var56.cloneNode();
    boolean var62 = var56.isDelProp();
    boolean var63 = var56.isIf();
    java.lang.String var64 = var56.toString();
    boolean var65 = var48.isEquivalentToTyped(var56);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var66 = com.google.javascript.rhino.IR.comma(var40, var56);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "Node tree inequality:\nTree1:\nEQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nTree2:\nNUMBER 10.0\n\n\nSubtree1: EQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nSubtree2: NUMBER 10.0\n"+ "'", var41.equals("Node tree inequality:\nTree1:\nEQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nTree2:\nNUMBER 10.0\n\n\nSubtree1: EQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nSubtree2: NUMBER 10.0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
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
    assertTrue("'" + var64 + "' != '" + "NUMBER 10.0"+ "'", var64.equals("NUMBER 10.0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test17"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setCrossModuleCodeMotion(false);
    var0.setLabelRenaming(true);
    var0.setGenerateExports(false);
    var0.setTweakToBooleanLiteral("{723551193}", true);
    com.google.javascript.jscomp.SourceMap.DetailLevel var10 = null;
    var0.setSourceMapDetailLevel(var10);

  }

  public void test18() {}
//   public void test18() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test18"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var4 = var1.useSourceInfoIfMissingFrom(var3);
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.eq(var3, var6);
//     com.google.javascript.rhino.Node var8 = var3.cloneNode();
//     boolean var9 = var8.isOr();
//     com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var14 = var11.useSourceInfoIfMissingFrom(var13);
//     com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.eq(var13, var16);
//     com.google.javascript.rhino.Node var18 = var13.cloneNode();
//     com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.or(var8, var18);
//     com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var24 = var21.useSourceInfoIfMissingFrom(var23);
//     com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var27 = var24.copyInformationFrom(var26);
//     com.google.javascript.rhino.Node var28 = var8.srcrefTree(var26);
//     com.google.javascript.rhino.Node.SideEffectFlags var29 = null;
//     var26.setSideEffectFlags(var29);
// 
//   }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test19"); }


    com.google.javascript.rhino.JSDocInfoBuilder var1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.JSDocInfo.Visibility var2 = null;
    boolean var3 = var1.recordVisibility(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.markAnnotation("", 1, (-1));
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test20() {}
//   public void test20() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test20"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.type.ReverseAbstractInterpreter var2 = var1.getReverseAbstractInterpreter();
// 
//   }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test21"); }


    com.google.javascript.rhino.JSDocInfoBuilder var1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    boolean var2 = var1.recordImplicitCast();
    com.google.javascript.rhino.JSTypeExpression var4 = null;
    boolean var5 = var1.recordParameter("hi!", var4);
    boolean var6 = var1.recordOverride();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test22"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    java.lang.Iterable var3 = var1.getTypesWithProperty("");
    com.google.javascript.rhino.ErrorReporter var5 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var5, true);
    com.google.javascript.rhino.jstype.ObjectType var8 = var7.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var9 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var9, true);
    com.google.javascript.rhino.jstype.ObjectType var12 = var11.createAnonymousObjectType();
    boolean var13 = var12.isUnknownType();
    boolean var14 = var8.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var12);
    boolean var15 = var8.isBooleanValueType();
    boolean var16 = var8.isNoType();
    java.util.Set var17 = var8.getPropertyNames();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.overwriteDeclaredType("Node tree inequality:\nTree1:\nEQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nTree2:\nNUMBER 10.0\n\n\nSubtree1: EQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nSubtree2: NUMBER 10.0\n", (com.google.javascript.rhino.jstype.JSType)var8);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test23() {}
//   public void test23() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test23"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.SourceMap var2 = var1.getSourceMap();
//     var1.disableThreads();
//     com.google.javascript.jscomp.JSError[] var4 = var1.getErrors();
// 
//   }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test24"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var3 = null;
    boolean var5 = var2.canPropertyBeDefined(var3, "hi!");
    boolean var7 = var2.hasNamespace("");
    com.google.javascript.rhino.jstype.FunctionBuilder var8 = new com.google.javascript.rhino.jstype.FunctionBuilder(var2);
    com.google.javascript.rhino.ErrorReporter var9 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var9);
    com.google.javascript.rhino.ErrorReporter var11 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var11, true);
    com.google.javascript.rhino.jstype.ObjectType var14 = var13.createAnonymousObjectType();
    java.util.Collection var15 = var10.getDirectImplementors(var14);
    java.lang.String var16 = var14.toAnnotationString();
    com.google.javascript.rhino.jstype.JSType var17 = var2.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType)var14);
    boolean var18 = var17.isUnknownType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "{}"+ "'", var16.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test25"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var3 = null;
    boolean var5 = var2.canPropertyBeDefined(var3, "hi!");
    boolean var7 = var2.hasNamespace("");
    com.google.javascript.rhino.jstype.FunctionBuilder var8 = new com.google.javascript.rhino.jstype.FunctionBuilder(var2);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var14 = var11.useSourceInfoIfMissingFrom(var13);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.eq(var13, var16);
    com.google.javascript.rhino.Node var18 = var13.cloneNode();
    boolean var19 = var18.isOr();
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var24 = var21.useSourceInfoIfMissingFrom(var23);
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.eq(var23, var26);
    com.google.javascript.rhino.Node var28 = var23.cloneNode();
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.or(var18, var28);
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.voidNode(var29);
    com.google.javascript.rhino.Node var31 = var30.getFirstChild();
    com.google.javascript.rhino.Node var32 = var31.getLastSibling();
    com.google.javascript.rhino.ErrorReporter var33 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var33, true);
    com.google.javascript.rhino.jstype.ObjectType var36 = var35.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var37 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var37, true);
    com.google.javascript.rhino.jstype.ObjectType var40 = var39.createAnonymousObjectType();
    boolean var41 = var40.isUnknownType();
    boolean var42 = var36.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var40);
    boolean var43 = var40.isFunctionPrototypeType();
    var40.clearCachedValues();
    com.google.javascript.rhino.jstype.ObjectType var45 = var40.dereference();
    boolean var46 = var40.isFunctionPrototypeType();
    com.google.javascript.rhino.jstype.ObjectType var47 = var2.createObjectType("null(null)", var32, var40);
    boolean var48 = var47.isNominalType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
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
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test26"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.ErrorReporter var3 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var3, true);
    com.google.javascript.rhino.jstype.ObjectType var6 = var5.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var7 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7, true);
    com.google.javascript.rhino.jstype.ObjectType var10 = var9.createAnonymousObjectType();
    boolean var11 = var10.isUnknownType();
    boolean var12 = var6.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var10);
    boolean var13 = var10.isFunctionPrototypeType();
    var10.clearCachedValues();
    com.google.javascript.rhino.jstype.ObjectType var15 = var10.dereference();
    com.google.javascript.rhino.jstype.JSType[] var16 = new com.google.javascript.rhino.jstype.JSType[] { var15};
    com.google.javascript.rhino.jstype.JSType var17 = var2.createUnionType(var16);
    com.google.javascript.rhino.ErrorReporter var18 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var18, true);
    com.google.javascript.rhino.jstype.JSType var21 = null;
    boolean var23 = var20.canPropertyBeDefined(var21, "hi!");
    boolean var25 = var20.hasNamespace("");
    com.google.javascript.rhino.jstype.FunctionBuilder var26 = new com.google.javascript.rhino.jstype.FunctionBuilder(var20);
    com.google.javascript.rhino.jstype.FunctionBuilder var28 = var26.withName("NUMBER 10.0\n");
    com.google.javascript.rhino.ErrorReporter var29 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var29, true);
    com.google.javascript.rhino.jstype.ObjectType var32 = var31.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var33 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var33, true);
    com.google.javascript.rhino.jstype.ObjectType var36 = var35.createAnonymousObjectType();
    boolean var37 = var36.isUnknownType();
    boolean var38 = var32.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var36);
    boolean var39 = var36.isFunctionPrototypeType();
    com.google.javascript.rhino.jstype.FunctionBuilder var41 = var28.withReturnType((com.google.javascript.rhino.jstype.JSType)var36, true);
    com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var46 = var43.useSourceInfoIfMissingFrom(var45);
    com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.eq(var45, var48);
    com.google.javascript.rhino.Node var50 = var45.cloneNode();
    boolean var51 = var50.isOr();
    com.google.javascript.rhino.jstype.StaticSourceFile var52 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var50);
    boolean var53 = var50.isDec();
    boolean var54 = var50.isFor();
    boolean var55 = var50.isNoSideEffectsCall();
    com.google.javascript.rhino.jstype.FunctionType var56 = var2.createFunctionType((com.google.javascript.rhino.jstype.JSType)var36, var50);
    com.google.javascript.rhino.jstype.ObjectType var57 = var56.getTypeOfThis();
    com.google.javascript.rhino.jstype.ObjectType var58 = var56.getTypeOfThis();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.jstype.ObjectType var59 = var56.getInstanceType();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
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
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test27"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.block();
    boolean var2 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(var1);
    boolean var3 = var1.isObjectLit();
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var8 = var5.useSourceInfoIfMissingFrom(var7);
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.eq(var7, var10);
    com.google.javascript.rhino.Node var12 = var7.cloneNode();
    boolean var13 = var12.isOr();
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var18 = var15.useSourceInfoIfMissingFrom(var17);
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.eq(var17, var20);
    com.google.javascript.rhino.Node var22 = var17.cloneNode();
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.or(var12, var22);
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var28 = var25.useSourceInfoIfMissingFrom(var27);
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var31 = var28.copyInformationFrom(var30);
    com.google.javascript.rhino.Node var32 = var12.srcrefTree(var30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var35 = new com.google.javascript.rhino.Node(100, var1, var32, 0, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
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
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test28() {}
//   public void test28() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test28"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.rhino.InputId var1 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, var1, true);
//     com.google.javascript.jscomp.JSModule var4 = var3.getModule();
//     com.google.javascript.jscomp.SourceAst var5 = var3.getSourceAst();
//     com.google.javascript.jscomp.Region var7 = var3.getRegion((-1));
// 
//   }

  public void test29() {}
//   public void test29() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test29"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
//     com.google.javascript.rhino.ErrorReporter var3 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var3, true);
//     com.google.javascript.rhino.jstype.ObjectType var6 = var5.createAnonymousObjectType();
//     com.google.javascript.rhino.ErrorReporter var7 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7, true);
//     com.google.javascript.rhino.jstype.ObjectType var10 = var9.createAnonymousObjectType();
//     boolean var11 = var10.isUnknownType();
//     boolean var12 = var6.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var10);
//     boolean var13 = var10.isFunctionPrototypeType();
//     var10.clearCachedValues();
//     com.google.javascript.rhino.jstype.ObjectType var15 = var10.dereference();
//     com.google.javascript.rhino.jstype.JSType[] var16 = new com.google.javascript.rhino.jstype.JSType[] { var15};
//     com.google.javascript.rhino.jstype.JSType var17 = var2.createUnionType(var16);
//     com.google.javascript.rhino.ErrorReporter var18 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var18, true);
//     com.google.javascript.rhino.jstype.JSType var21 = null;
//     boolean var23 = var20.canPropertyBeDefined(var21, "hi!");
//     boolean var25 = var20.hasNamespace("");
//     com.google.javascript.rhino.jstype.FunctionBuilder var26 = new com.google.javascript.rhino.jstype.FunctionBuilder(var20);
//     com.google.javascript.rhino.jstype.FunctionBuilder var28 = var26.withName("NUMBER 10.0\n");
//     com.google.javascript.rhino.ErrorReporter var29 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var29, true);
//     com.google.javascript.rhino.jstype.ObjectType var32 = var31.createAnonymousObjectType();
//     com.google.javascript.rhino.ErrorReporter var33 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var33, true);
//     com.google.javascript.rhino.jstype.ObjectType var36 = var35.createAnonymousObjectType();
//     boolean var37 = var36.isUnknownType();
//     boolean var38 = var32.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var36);
//     boolean var39 = var36.isFunctionPrototypeType();
//     com.google.javascript.rhino.jstype.FunctionBuilder var41 = var28.withReturnType((com.google.javascript.rhino.jstype.JSType)var36, true);
//     com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var46 = var43.useSourceInfoIfMissingFrom(var45);
//     com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.eq(var45, var48);
//     com.google.javascript.rhino.Node var50 = var45.cloneNode();
//     boolean var51 = var50.isOr();
//     com.google.javascript.rhino.jstype.StaticSourceFile var52 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var50);
//     boolean var53 = var50.isDec();
//     boolean var54 = var50.isFor();
//     boolean var55 = var50.isNoSideEffectsCall();
//     com.google.javascript.rhino.jstype.FunctionType var56 = var2.createFunctionType((com.google.javascript.rhino.jstype.JSType)var36, var50);
//     com.google.javascript.rhino.jstype.ObjectType var57 = var56.getTypeOfThis();
//     java.lang.Iterable var58 = var56.getAllImplementedInterfaces();
//     com.google.javascript.rhino.jstype.Visitor var59 = null;
//     java.lang.Object var60 = var56.visit(var59);
// 
//   }

  public void test30() {}
//   public void test30() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test30"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.SourceMap var2 = var1.getSourceMap();
//     com.google.javascript.rhino.Node var3 = var1.getRoot();
//     com.google.javascript.jscomp.CodingConvention var4 = var1.getCodingConvention();
// 
//   }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test31"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var5 = var2.useSourceInfoIfMissingFrom(var4);
    boolean var6 = var4.isSetterDef();
    com.google.javascript.rhino.Node[] var7 = new com.google.javascript.rhino.Node[] { var4};
    com.google.javascript.rhino.Node var8 = new com.google.javascript.rhino.Node(100, var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.block(var7);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test32() {}
//   public void test32() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test32"); }
// 
// 
//     com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
//     var0.setTweakToNumberLiteral("", 1);
//     java.util.Set var4 = null;
//     var0.setStripTypePrefixes(var4);
//     com.google.javascript.jscomp.DiagnosticGroup var6 = null;
//     com.google.javascript.jscomp.CheckLevel var7 = null;
//     com.google.javascript.jscomp.DiagnosticGroupWarningsGuard var8 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(var6, var7);
//     var0.addWarningsGuard((com.google.javascript.jscomp.WarningsGuard)var8);
//     com.google.javascript.jscomp.WarningsGuard[] var10 = new com.google.javascript.jscomp.WarningsGuard[] { var8};
//     com.google.javascript.jscomp.ComposeWarningsGuard var11 = new com.google.javascript.jscomp.ComposeWarningsGuard(var10);
//     com.google.javascript.jscomp.ComposeWarningsGuard var12 = new com.google.javascript.jscomp.ComposeWarningsGuard(var10);
//     com.google.javascript.jscomp.DiagnosticType var15 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
//     com.google.javascript.jscomp.DiagnosticType[] var16 = new com.google.javascript.jscomp.DiagnosticType[] { var15};
//     com.google.javascript.jscomp.DiagnosticGroup var17 = new com.google.javascript.jscomp.DiagnosticGroup(var16);
//     com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var23 = var20.useSourceInfoIfMissingFrom(var22);
//     com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.eq(var22, var25);
//     var25.setSourceEncodedPositionForTree(100);
//     java.lang.Object var30 = var25.getProp(10);
//     com.google.javascript.jscomp.CheckLevel var31 = null;
//     com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.empty();
//     com.google.javascript.jscomp.DiagnosticType var39 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
//     java.lang.String[] var41 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var42 = com.google.javascript.jscomp.JSError.make("", 1, 39, var39, var41);
//     com.google.javascript.jscomp.CheckLevel var46 = null;
//     com.google.javascript.jscomp.DiagnosticType var49 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
//     com.google.javascript.jscomp.DiagnosticType var55 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
//     java.lang.String[] var57 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var58 = com.google.javascript.jscomp.JSError.make("", 1, 39, var55, var57);
//     com.google.javascript.jscomp.JSError var59 = com.google.javascript.jscomp.JSError.make("hi!", 100, 100, var46, var49, var57);
//     com.google.javascript.jscomp.JSError var60 = com.google.javascript.jscomp.JSError.make("NUMBER 10.0\n", var33, var39, var57);
//     com.google.javascript.jscomp.DiagnosticType var66 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
//     java.lang.String[] var68 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var69 = com.google.javascript.jscomp.JSError.make("", 1, 39, var66, var68);
//     com.google.javascript.jscomp.JSError var70 = com.google.javascript.jscomp.JSError.make("{505847021}", var25, var31, var39, var68);
//     boolean var71 = var17.matches(var70);
//     boolean var72 = var12.enables(var17);
// 
//   }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test33"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var1 = null;
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

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test34"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var4 = var1.useSourceInfoIfMissingFrom(var3);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.eq(var3, var6);
    com.google.javascript.rhino.Node var8 = var3.cloneNode();
    boolean var9 = var8.isOr();
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var14 = var11.useSourceInfoIfMissingFrom(var13);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.eq(var13, var16);
    com.google.javascript.rhino.Node var18 = var13.cloneNode();
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.or(var8, var18);
    boolean var20 = var8.isOptionalArg();
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var25 = var22.useSourceInfoIfMissingFrom(var24);
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.eq(var24, var27);
    com.google.javascript.rhino.Node var29 = var24.cloneNode();
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var34 = var31.useSourceInfoIfMissingFrom(var33);
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var39 = var36.useSourceInfoIfMissingFrom(var38);
    com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.IR.exprResult(var39);
    java.lang.String var41 = var33.checkTreeEquals(var39);
    com.google.javascript.rhino.Node var42 = var24.srcref(var33);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.IR.comma(var8, var42);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test35() {}
//   public void test35() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test35"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.number(10.0d);
//     boolean var4 = var3.isLabel();
//     java.nio.charset.Charset var6 = null;
//     com.google.javascript.jscomp.SourceFile var7 = com.google.javascript.jscomp.SourceFile.fromFile("NUMBER 10.0", var6);
//     var3.setStaticSourceFile((com.google.javascript.rhino.jstype.StaticSourceFile)var7);
//     java.nio.charset.Charset var10 = null;
//     com.google.javascript.jscomp.SourceFile var11 = com.google.javascript.jscomp.SourceFile.fromFile("NUMBER 10.0", var10);
//     com.google.javascript.jscomp.Region var13 = var11.getRegion(100);
//     java.lang.String var14 = var11.toString();
//     com.google.javascript.jscomp.CompilerOptions var15 = new com.google.javascript.jscomp.CompilerOptions();
//     var15.setCrossModuleCodeMotion(false);
//     com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var18 = null;
//     var15.setAnonymousFunctionNaming(var18);
//     var15.setExtractPrototypeMemberDeclarations(true);
//     var15.setRemoveTryCatchFinally(true);
//     var15.setFoldConstants(false);
//     var15.setInlineGetters(false);
//     com.google.javascript.jscomp.Result var28 = var1.compile(var7, var11, var15);
//     java.util.Map var29 = var1.getInputsById();
//     com.google.javascript.jscomp.CheckLevel var33 = null;
//     com.google.javascript.jscomp.DiagnosticType var36 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
//     com.google.javascript.jscomp.DiagnosticType var42 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
//     java.lang.String[] var44 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var45 = com.google.javascript.jscomp.JSError.make("", 1, 39, var42, var44);
//     com.google.javascript.jscomp.JSError var46 = com.google.javascript.jscomp.JSError.make("hi!", 100, 100, var33, var36, var44);
//     java.lang.String var47 = var46.toString();
//     var1.report(var46);
//     com.google.javascript.jscomp.JSSourceFile var49 = null;
//     com.google.javascript.jscomp.JSSourceFile[] var50 = new com.google.javascript.jscomp.JSSourceFile[] { var49};
//     com.google.javascript.rhino.ErrorReporter var51 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var51);
//     com.google.javascript.rhino.ErrorReporter var53 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var53, true);
//     com.google.javascript.rhino.jstype.ObjectType var56 = var55.createAnonymousObjectType();
//     java.util.Collection var57 = var52.getDirectImplementors(var56);
//     com.google.javascript.jscomp.JSModule[] var58 = com.google.javascript.jscomp.JSModule.sortJsModules(var57);
//     com.google.javascript.jscomp.CompilerOptions var59 = new com.google.javascript.jscomp.CompilerOptions();
//     var59.setSourceMapOutputPath("hi!");
//     var59.setReplaceStringsPlaceholderToken("hi!");
//     var59.setCheckCaja(true);
//     var59.setSummaryDetailLevel((-1));
//     var59.setSpecializeInitialModule(false);
//     var59.setDeadAssignmentElimination(false);
//     com.google.javascript.jscomp.Result var72 = var1.compile(var50, var58, var59);
// 
//   }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test36"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
    com.google.javascript.jscomp.DiagnosticType[] var3 = new com.google.javascript.jscomp.DiagnosticType[] { var2};
    com.google.javascript.jscomp.DiagnosticGroup var4 = new com.google.javascript.jscomp.DiagnosticGroup(var3);
    java.lang.Iterable var5 = var4.getTypes();
    com.google.javascript.jscomp.DiagnosticGroup[] var6 = new com.google.javascript.jscomp.DiagnosticGroup[] { var4};
    com.google.javascript.jscomp.DiagnosticGroup var7 = new com.google.javascript.jscomp.DiagnosticGroup(var6);
    java.lang.String var8 = var7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test37"); }


    java.nio.charset.Charset var1 = null;
    com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromFile("NUMBER 10.0", var1);
    com.google.javascript.jscomp.Region var4 = var2.getRegion(100);
    com.google.javascript.jscomp.Region var6 = var2.getRegion(39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test38() {}
//   public void test38() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test38"); }
// 
// 
//     com.google.javascript.jscomp.CodingConvention var0 = null;
//     com.google.javascript.jscomp.ClosureCodingConvention var1 = new com.google.javascript.jscomp.ClosureCodingConvention(var0);
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.number(10.0d);
//     boolean var4 = var3.isLabel();
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var9 = var6.useSourceInfoIfMissingFrom(var8);
//     boolean var10 = var8.isFalse();
//     com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.sheq(var3, var8);
//     com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.Node.newString(0, "hi!");
//     java.lang.String var15 = var1.extractClassNameIfRequire(var3, var14);
//     com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var20 = var17.useSourceInfoIfMissingFrom(var19);
//     com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.exprResult(var20);
//     com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.block(var21);
//     com.google.javascript.rhino.Node var23 = var21.getLastSibling();
//     boolean var24 = var21.isFalse();
//     boolean var25 = var1.isOptionalParameter(var21);
//     com.google.javascript.rhino.Node var27 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode((com.google.javascript.jscomp.CodingConvention)var1, "goog.exportSymbol");
// 
//   }

  public void test39() {}
//   public void test39() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test39"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
//     var0.pushNodeAnnotations();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var2 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithNodeAnnotations();
//     java.util.List var3 = var0.getNeighborNodes((java.lang.Object)var2);
// 
//   }

  public void test40() {}
//   public void test40() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test40"); }
// 
// 
//     com.google.javascript.jscomp.CodingConvention var0 = null;
//     com.google.javascript.jscomp.ClosureCodingConvention var1 = new com.google.javascript.jscomp.ClosureCodingConvention(var0);
//     com.google.javascript.rhino.ErrorReporter var2 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2);
//     com.google.javascript.rhino.ErrorReporter var4 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var4, true);
//     com.google.javascript.rhino.jstype.JSType var7 = null;
//     boolean var9 = var6.canPropertyBeDefined(var7, "hi!");
//     boolean var11 = var6.hasNamespace("");
//     com.google.javascript.rhino.jstype.FunctionBuilder var12 = new com.google.javascript.rhino.jstype.FunctionBuilder(var6);
//     com.google.javascript.rhino.ErrorReporter var13 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var13, true);
//     com.google.javascript.rhino.ErrorReporter var16 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var16, true);
//     com.google.javascript.rhino.jstype.ObjectType var19 = var18.createAnonymousObjectType();
//     com.google.javascript.rhino.ErrorReporter var20 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var20, true);
//     com.google.javascript.rhino.jstype.ObjectType var23 = var22.createAnonymousObjectType();
//     boolean var24 = var23.isUnknownType();
//     boolean var25 = var19.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var23);
//     boolean var26 = var23.isFunctionPrototypeType();
//     var23.clearCachedValues();
//     com.google.javascript.rhino.jstype.ObjectType var28 = var23.dereference();
//     com.google.javascript.rhino.jstype.JSType[] var29 = new com.google.javascript.rhino.jstype.JSType[] { var28};
//     com.google.javascript.rhino.jstype.JSType var30 = var15.createUnionType(var29);
//     com.google.javascript.rhino.ErrorReporter var31 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var31, true);
//     com.google.javascript.rhino.ErrorReporter var34 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var34, true);
//     com.google.javascript.rhino.jstype.ObjectType var37 = var36.createAnonymousObjectType();
//     com.google.javascript.rhino.ErrorReporter var38 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var38, true);
//     com.google.javascript.rhino.jstype.ObjectType var41 = var40.createAnonymousObjectType();
//     boolean var42 = var41.isUnknownType();
//     boolean var43 = var37.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var41);
//     boolean var44 = var41.isFunctionPrototypeType();
//     var41.clearCachedValues();
//     com.google.javascript.rhino.jstype.ObjectType var46 = var41.dereference();
//     com.google.javascript.rhino.jstype.JSType[] var47 = new com.google.javascript.rhino.jstype.JSType[] { var46};
//     com.google.javascript.rhino.jstype.JSType var48 = var33.createUnionType(var47);
//     com.google.javascript.rhino.jstype.FunctionType var49 = var6.createFunctionTypeWithVarArgs(var30, var47);
//     com.google.javascript.rhino.jstype.JSType[] var50 = new com.google.javascript.rhino.jstype.JSType[] { var30};
//     com.google.javascript.rhino.Node var51 = var3.createParameters(var50);
//     com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter var52 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter((com.google.javascript.jscomp.CodingConvention)var1, var3);
//     boolean var54 = var1.isConstantKey("TRUE\n");
// 
//   }

  public void test41() {}
//   public void test41() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test41"); }
// 
// 
//     com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
//     var0.setSourceMapOutputPath("hi!");
//     var0.setReplaceStringsPlaceholderToken("hi!");
//     var0.setIdeMode(false);
//     var0.setColorizeErrorOutput(false);
//     com.google.javascript.jscomp.CheckLevel var9 = null;
//     var0.setReportUnknownTypes(var9);
//     var0.setCollapseVariableDeclarations(true);
//     var0.setDefineToStringLiteral("module$", "module$Node tree inequality:\\nTree1:\\nNUMBER 10.0\\n\\n\\nTree2:\\nEQ\\n    NUMBER 10.0\\n    NUMBER 10.0\\n\\n\\nSubtree1: NUMBER 10.0\\n\\n\\nSubtree2: EQ\\n    NUMBER 10.0\\n    NUMBER 10.0\\n");
//     var0.setClosurePass(false);
//     com.google.javascript.jscomp.CompilerOptions var18 = new com.google.javascript.jscomp.CompilerOptions();
//     var18.setTweakToNumberLiteral("", 1);
//     java.util.Set var22 = null;
//     var18.setStripTypePrefixes(var22);
//     com.google.javascript.jscomp.DiagnosticGroup var24 = null;
//     com.google.javascript.jscomp.CheckLevel var25 = null;
//     com.google.javascript.jscomp.DiagnosticGroupWarningsGuard var26 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(var24, var25);
//     var18.addWarningsGuard((com.google.javascript.jscomp.WarningsGuard)var26);
//     com.google.javascript.jscomp.WarningsGuard[] var28 = new com.google.javascript.jscomp.WarningsGuard[] { var26};
//     com.google.javascript.jscomp.ComposeWarningsGuard var29 = new com.google.javascript.jscomp.ComposeWarningsGuard(var28);
//     com.google.javascript.jscomp.WarningsGuard[] var30 = new com.google.javascript.jscomp.WarningsGuard[] { var29};
//     com.google.javascript.jscomp.ComposeWarningsGuard var31 = new com.google.javascript.jscomp.ComposeWarningsGuard(var30);
//     java.lang.String var32 = var31.toString();
//     var0.setWarningsGuard(var31);
//     com.google.javascript.jscomp.DiagnosticType var36 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
//     com.google.javascript.jscomp.DiagnosticType[] var37 = new com.google.javascript.jscomp.DiagnosticType[] { var36};
//     com.google.javascript.jscomp.DiagnosticGroup var38 = new com.google.javascript.jscomp.DiagnosticGroup(var37);
//     com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var44 = var41.useSourceInfoIfMissingFrom(var43);
//     com.google.javascript.rhino.Node var46 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var47 = com.google.javascript.rhino.IR.eq(var43, var46);
//     var46.setSourceEncodedPositionForTree(100);
//     java.lang.Object var51 = var46.getProp(10);
//     com.google.javascript.jscomp.CheckLevel var52 = null;
//     com.google.javascript.rhino.Node var54 = com.google.javascript.rhino.IR.empty();
//     com.google.javascript.jscomp.DiagnosticType var60 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
//     java.lang.String[] var62 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var63 = com.google.javascript.jscomp.JSError.make("", 1, 39, var60, var62);
//     com.google.javascript.jscomp.CheckLevel var67 = null;
//     com.google.javascript.jscomp.DiagnosticType var70 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
//     com.google.javascript.jscomp.DiagnosticType var76 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
//     java.lang.String[] var78 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var79 = com.google.javascript.jscomp.JSError.make("", 1, 39, var76, var78);
//     com.google.javascript.jscomp.JSError var80 = com.google.javascript.jscomp.JSError.make("hi!", 100, 100, var67, var70, var78);
//     com.google.javascript.jscomp.JSError var81 = com.google.javascript.jscomp.JSError.make("NUMBER 10.0\n", var54, var60, var78);
//     com.google.javascript.jscomp.DiagnosticType var87 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
//     java.lang.String[] var89 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var90 = com.google.javascript.jscomp.JSError.make("", 1, 39, var87, var89);
//     com.google.javascript.jscomp.JSError var91 = com.google.javascript.jscomp.JSError.make("{505847021}", var46, var52, var60, var89);
//     boolean var92 = var38.matches(var91);
//     boolean var93 = var31.enables(var38);
// 
//   }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test42"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var5 = var2.useSourceInfoIfMissingFrom(var4);
    boolean var6 = var4.isSetterDef();
    com.google.javascript.rhino.Node[] var7 = new com.google.javascript.rhino.Node[] { var4};
    com.google.javascript.rhino.Node var8 = new com.google.javascript.rhino.Node(100, var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.arraylit(var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test43"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var3 = null;
    boolean var5 = var2.canPropertyBeDefined(var3, "hi!");
    boolean var7 = var2.hasNamespace("");
    com.google.javascript.rhino.ErrorReporter var8 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var8, true);
    com.google.javascript.rhino.jstype.ObjectType var11 = var10.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var12 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var12, true);
    com.google.javascript.rhino.jstype.ObjectType var15 = var14.createAnonymousObjectType();
    boolean var16 = var15.isUnknownType();
    boolean var17 = var11.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var15);
    boolean var18 = var15.isFunctionPrototypeType();
    var2.resolveTypesInScope((com.google.javascript.rhino.jstype.StaticScope)var15);
    com.google.javascript.rhino.Node var20 = var15.getRootNode();
    boolean var21 = var15.isNoType();
    com.google.javascript.rhino.ErrorReporter var22 = null;
    com.google.javascript.rhino.ErrorReporter var23 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var23, true);
    com.google.javascript.rhino.ErrorReporter var26 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var26, true);
    com.google.javascript.rhino.jstype.ObjectType var29 = var28.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var30 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var30, true);
    com.google.javascript.rhino.jstype.ObjectType var33 = var32.createAnonymousObjectType();
    boolean var34 = var33.isUnknownType();
    boolean var35 = var29.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var33);
    boolean var36 = var33.isFunctionPrototypeType();
    var33.clearCachedValues();
    com.google.javascript.rhino.jstype.ObjectType var38 = var33.dereference();
    com.google.javascript.rhino.jstype.JSType[] var39 = new com.google.javascript.rhino.jstype.JSType[] { var38};
    com.google.javascript.rhino.jstype.JSType var40 = var25.createUnionType(var39);
    com.google.javascript.rhino.ErrorReporter var41 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var41, true);
    com.google.javascript.rhino.jstype.JSType var44 = null;
    boolean var46 = var43.canPropertyBeDefined(var44, "hi!");
    boolean var48 = var43.hasNamespace("");
    com.google.javascript.rhino.jstype.FunctionBuilder var49 = new com.google.javascript.rhino.jstype.FunctionBuilder(var43);
    com.google.javascript.rhino.jstype.FunctionBuilder var51 = var49.withName("NUMBER 10.0\n");
    com.google.javascript.rhino.ErrorReporter var52 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var52, true);
    com.google.javascript.rhino.jstype.ObjectType var55 = var54.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var56 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var56, true);
    com.google.javascript.rhino.jstype.ObjectType var59 = var58.createAnonymousObjectType();
    boolean var60 = var59.isUnknownType();
    boolean var61 = var55.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var59);
    boolean var62 = var59.isFunctionPrototypeType();
    com.google.javascript.rhino.jstype.FunctionBuilder var64 = var51.withReturnType((com.google.javascript.rhino.jstype.JSType)var59, true);
    com.google.javascript.rhino.Node var66 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var68 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var69 = var66.useSourceInfoIfMissingFrom(var68);
    com.google.javascript.rhino.Node var71 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var72 = com.google.javascript.rhino.IR.eq(var68, var71);
    com.google.javascript.rhino.Node var73 = var68.cloneNode();
    boolean var74 = var73.isOr();
    com.google.javascript.rhino.jstype.StaticSourceFile var75 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var73);
    boolean var76 = var73.isDec();
    boolean var77 = var73.isFor();
    boolean var78 = var73.isNoSideEffectsCall();
    com.google.javascript.rhino.jstype.FunctionType var79 = var25.createFunctionType((com.google.javascript.rhino.jstype.JSType)var59, var73);
    int var80 = var79.getExtendedInterfacesCount();
    boolean var81 = var79.isReturnTypeInferred();
    boolean var82 = var79.isOrdinaryFunction();
    com.google.javascript.rhino.jstype.JSType var83 = var15.resolve(var22, (com.google.javascript.rhino.jstype.StaticScope)var79);
    int var84 = var79.getExtendedInterfacesCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == 0);

  }

  public void test44() {}
//   public void test44() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test44"); }
// 
// 
//     com.google.javascript.jscomp.CodingConvention var0 = null;
//     com.google.javascript.jscomp.ClosureCodingConvention var1 = new com.google.javascript.jscomp.ClosureCodingConvention(var0);
//     com.google.javascript.rhino.ErrorReporter var2 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2);
//     com.google.javascript.rhino.ErrorReporter var4 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var4, true);
//     com.google.javascript.rhino.jstype.JSType var7 = null;
//     boolean var9 = var6.canPropertyBeDefined(var7, "hi!");
//     boolean var11 = var6.hasNamespace("");
//     com.google.javascript.rhino.jstype.FunctionBuilder var12 = new com.google.javascript.rhino.jstype.FunctionBuilder(var6);
//     com.google.javascript.rhino.ErrorReporter var13 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var13, true);
//     com.google.javascript.rhino.ErrorReporter var16 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var16, true);
//     com.google.javascript.rhino.jstype.ObjectType var19 = var18.createAnonymousObjectType();
//     com.google.javascript.rhino.ErrorReporter var20 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var20, true);
//     com.google.javascript.rhino.jstype.ObjectType var23 = var22.createAnonymousObjectType();
//     boolean var24 = var23.isUnknownType();
//     boolean var25 = var19.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var23);
//     boolean var26 = var23.isFunctionPrototypeType();
//     var23.clearCachedValues();
//     com.google.javascript.rhino.jstype.ObjectType var28 = var23.dereference();
//     com.google.javascript.rhino.jstype.JSType[] var29 = new com.google.javascript.rhino.jstype.JSType[] { var28};
//     com.google.javascript.rhino.jstype.JSType var30 = var15.createUnionType(var29);
//     com.google.javascript.rhino.ErrorReporter var31 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var31, true);
//     com.google.javascript.rhino.ErrorReporter var34 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var34, true);
//     com.google.javascript.rhino.jstype.ObjectType var37 = var36.createAnonymousObjectType();
//     com.google.javascript.rhino.ErrorReporter var38 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var38, true);
//     com.google.javascript.rhino.jstype.ObjectType var41 = var40.createAnonymousObjectType();
//     boolean var42 = var41.isUnknownType();
//     boolean var43 = var37.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var41);
//     boolean var44 = var41.isFunctionPrototypeType();
//     var41.clearCachedValues();
//     com.google.javascript.rhino.jstype.ObjectType var46 = var41.dereference();
//     com.google.javascript.rhino.jstype.JSType[] var47 = new com.google.javascript.rhino.jstype.JSType[] { var46};
//     com.google.javascript.rhino.jstype.JSType var48 = var33.createUnionType(var47);
//     com.google.javascript.rhino.jstype.FunctionType var49 = var6.createFunctionTypeWithVarArgs(var30, var47);
//     com.google.javascript.rhino.jstype.JSType[] var50 = new com.google.javascript.rhino.jstype.JSType[] { var30};
//     com.google.javascript.rhino.Node var51 = var3.createParameters(var50);
//     com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter var52 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter((com.google.javascript.jscomp.CodingConvention)var1, var3);
//     boolean var54 = var1.isConstantKey("null");
// 
//   }

  public void test45() {}
//   public void test45() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test45"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.CompilerOptions var2 = new com.google.javascript.jscomp.CompilerOptions();
//     var2.setCrossModuleCodeMotion(false);
//     var2.setLabelRenaming(true);
//     java.util.Set var7 = null;
//     var2.setStripTypePrefixes(var7);
//     var1.initOptions(var2);
//     java.nio.charset.Charset var11 = null;
//     com.google.javascript.jscomp.SourceFile var12 = com.google.javascript.jscomp.SourceFile.fromFile("NUMBER 10.0", var11);
//     com.google.javascript.jscomp.Region var14 = var12.getRegion(100);
//     java.lang.String var15 = var12.toString();
//     com.google.javascript.rhino.Node var16 = var1.parse(var12);
//     com.google.javascript.jscomp.CompilerOptions.LanguageMode var17 = var1.languageMode();
//     boolean var18 = var1.isTypeCheckingEnabled();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var19 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithNodeAnnotations();
//     java.util.List var20 = var19.getGraphvizNodes();
//     java.io.PrintStream var21 = null;
//     com.google.javascript.jscomp.Compiler var22 = new com.google.javascript.jscomp.Compiler(var21);
//     com.google.javascript.jscomp.CompilerOptions var23 = new com.google.javascript.jscomp.CompilerOptions();
//     var23.setCrossModuleCodeMotion(false);
//     var23.setLabelRenaming(true);
//     java.util.Set var28 = null;
//     var23.setStripTypePrefixes(var28);
//     var22.initOptions(var23);
//     boolean var31 = var22.acceptConstKeyword();
//     com.google.javascript.jscomp.CodingConvention var32 = var22.getCodingConvention();
//     boolean var33 = var22.acceptConstKeyword();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var34 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithNodeAnnotations();
//     java.util.List var35 = var34.getGraphvizNodes();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var36 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithNodeAnnotations();
//     java.util.List var37 = var36.getGraphvizNodes();
//     com.google.javascript.jscomp.CompilerOptions var38 = new com.google.javascript.jscomp.CompilerOptions();
//     var38.setCrossModuleCodeMotion(false);
//     boolean var41 = var38.isExternExportsEnabled();
//     var38.setCheckTypes(false);
//     var38.setPreferLineBreakAtEndOfFile(false);
//     var38.setNameReferenceGraphPath("{1125981799}");
//     var22.<com.google.javascript.jscomp.SourceFile,com.google.javascript.jscomp.SourceFile>init(var35, var37, var38);
//     com.google.javascript.jscomp.CompilerOptions var49 = new com.google.javascript.jscomp.CompilerOptions();
//     var49.setCrossModuleCodeMotion(false);
//     com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var52 = null;
//     var49.setAnonymousFunctionNaming(var52);
//     var49.setExtractPrototypeMemberDeclarations(true);
//     var49.setPropertyAffinity(false);
//     var49.setRemoveUnusedPrototypePropertiesInExterns(false);
//     var1.<com.google.javascript.jscomp.SourceFile,com.google.javascript.jscomp.SourceFile>init(var20, var35, var49);
//     com.google.javascript.jscomp.JSSourceFile var61 = null;
//     com.google.javascript.jscomp.JSSourceFile[] var62 = new com.google.javascript.jscomp.JSSourceFile[] { var61};
//     com.google.javascript.rhino.ErrorReporter var63 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var63);
//     com.google.javascript.rhino.ErrorReporter var65 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var65, true);
//     com.google.javascript.rhino.jstype.ObjectType var68 = var67.createAnonymousObjectType();
//     java.util.Collection var69 = var64.getDirectImplementors(var68);
//     com.google.javascript.jscomp.JSModule[] var70 = com.google.javascript.jscomp.JSModule.sortJsModules(var69);
//     com.google.javascript.jscomp.CompilerOptions var71 = new com.google.javascript.jscomp.CompilerOptions();
//     var71.setSourceMapOutputPath("hi!");
//     var71.setIdeMode(false);
//     com.google.javascript.jscomp.CompilerOptions var76 = new com.google.javascript.jscomp.CompilerOptions();
//     var76.setCrossModuleCodeMotion(false);
//     com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var79 = null;
//     var76.setAnonymousFunctionNaming(var79);
//     var76.setExtractPrototypeMemberDeclarations(true);
//     var76.setRemoveTryCatchFinally(true);
//     var76.setFoldConstants(false);
//     com.google.javascript.jscomp.ErrorHandler var87 = null;
//     var76.setErrorHandler(var87);
//     var76.enableRuntimeTypeCheck("");
//     java.util.Map var91 = var76.getDefineReplacements();
//     var71.setTweakReplacements(var91);
//     com.google.common.collect.Multimap var93 = null;
//     var71.setCustomPasses(var93);
//     var71.setOutputCharset("module$Node tree inequality:\nTree1:\nNUMBER 10.0\n\n\nTree2:\nEQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nSubtree1: NUMBER 10.0\n\n\nSubtree2: EQ\n    NUMBER 10.0\n    NUMBER 10.0\n");
//     var1.init(var62, var70, var71);
// 
//   }

  public void test46() {}
//   public void test46() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test46"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var2 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
//     java.io.PrintStream var3 = null;
//     com.google.javascript.jscomp.PrintStreamErrorManager var4 = new com.google.javascript.jscomp.PrintStreamErrorManager((com.google.javascript.jscomp.MessageFormatter)var2, var3);
//     com.google.javascript.jscomp.Compiler var5 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var4);
//     com.google.javascript.rhino.Node var6 = var5.getRoot();
//     var5.normalize();
// 
//   }

  public void test47() {}
//   public void test47() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test47"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = null;
//     com.google.javascript.rhino.Node var1 = com.google.javascript.jscomp.NodeUtil.newExpr(var0);
// 
//   }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test48"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var5 = var2.useSourceInfoIfMissingFrom(var4);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.eq(var4, var7);
    com.google.javascript.rhino.Node var9 = var4.cloneNode();
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var14 = var11.useSourceInfoIfMissingFrom(var13);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var19 = var16.useSourceInfoIfMissingFrom(var18);
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.exprResult(var19);
    java.lang.String var21 = var13.checkTreeEquals(var19);
    com.google.javascript.rhino.Node var22 = var4.srcref(var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var23 = new com.google.javascript.rhino.Node(1, var22);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test49"); }


    java.lang.String[] var0 = null;
    com.google.javascript.jscomp.ShowByPathWarningsGuard.ShowType var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.ShowByPathWarningsGuard var2 = new com.google.javascript.jscomp.ShowByPathWarningsGuard(var0, var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test50() {}
//   public void test50() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test50"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.rhino.InputId var1 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, var1, true);
//     com.google.javascript.jscomp.SourceAst var4 = var3.getAst();
//     boolean var5 = var3.isExtern();
//     java.lang.String var6 = var3.getCode();
// 
//   }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test51"); }


    com.google.javascript.jscomp.CodingConvention var0 = null;
    com.google.javascript.jscomp.ClosureCodingConvention var1 = new com.google.javascript.jscomp.ClosureCodingConvention(var0);
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.number(10.0d);
    boolean var4 = var3.isLabel();
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var9 = var6.useSourceInfoIfMissingFrom(var8);
    boolean var10 = var8.isFalse();
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.sheq(var3, var8);
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.Node.newString(0, "hi!");
    java.lang.String var15 = var1.extractClassNameIfRequire(var3, var14);
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var20 = var17.useSourceInfoIfMissingFrom(var19);
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.exprResult(var20);
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.block(var21);
    com.google.javascript.rhino.Node var23 = var21.getLastSibling();
    boolean var24 = var21.isFalse();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.getprop(var14, var21);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
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
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test52"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.jscomp.LightweightMessageFormatter var2 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
    java.io.PrintStream var3 = null;
    com.google.javascript.jscomp.PrintStreamErrorManager var4 = new com.google.javascript.jscomp.PrintStreamErrorManager((com.google.javascript.jscomp.MessageFormatter)var2, var3);
    double var5 = var4.getTypedPercent();
    com.google.javascript.jscomp.JSError[] var6 = var4.getErrors();
    com.google.javascript.jscomp.JSError var7 = null;
    com.google.javascript.jscomp.JSError[] var8 = new com.google.javascript.jscomp.JSError[] { var7};
    com.google.javascript.jscomp.JSError var9 = null;
    com.google.javascript.jscomp.JSError[] var10 = new com.google.javascript.jscomp.JSError[] { var9};
    com.google.javascript.jscomp.VariableMap var12 = null;
    com.google.javascript.jscomp.VariableMap var13 = null;
    com.google.javascript.jscomp.VariableMap var14 = null;
    com.google.javascript.jscomp.FunctionInformationMap var15 = null;
    com.google.javascript.jscomp.SourceMap var16 = null;
    com.google.javascript.jscomp.Result var18 = new com.google.javascript.jscomp.Result(var8, var10, "", var12, var13, var14, var15, var16, "");
    com.google.javascript.jscomp.VariableMap var20 = null;
    com.google.javascript.jscomp.VariableMap var21 = null;
    com.google.javascript.jscomp.VariableMap var22 = null;
    com.google.javascript.jscomp.FunctionInformationMap var23 = null;
    com.google.javascript.jscomp.SourceMap var24 = null;
    com.google.javascript.jscomp.Result var26 = new com.google.javascript.jscomp.Result(var6, var10, "NUMBER 10.0\n", var20, var21, var22, var23, var24, "");
    java.io.PrintStream var27 = null;
    com.google.javascript.jscomp.Compiler var28 = new com.google.javascript.jscomp.Compiler(var27);
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.number(10.0d);
    boolean var31 = var30.isLabel();
    java.nio.charset.Charset var33 = null;
    com.google.javascript.jscomp.SourceFile var34 = com.google.javascript.jscomp.SourceFile.fromFile("NUMBER 10.0", var33);
    var30.setStaticSourceFile((com.google.javascript.rhino.jstype.StaticSourceFile)var34);
    java.nio.charset.Charset var37 = null;
    com.google.javascript.jscomp.SourceFile var38 = com.google.javascript.jscomp.SourceFile.fromFile("NUMBER 10.0", var37);
    com.google.javascript.jscomp.Region var40 = var38.getRegion(100);
    java.lang.String var41 = var38.toString();
    com.google.javascript.jscomp.CompilerOptions var42 = new com.google.javascript.jscomp.CompilerOptions();
    var42.setCrossModuleCodeMotion(false);
    com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var45 = null;
    var42.setAnonymousFunctionNaming(var45);
    var42.setExtractPrototypeMemberDeclarations(true);
    var42.setRemoveTryCatchFinally(true);
    var42.setFoldConstants(false);
    var42.setInlineGetters(false);
    com.google.javascript.jscomp.Result var55 = var28.compile(var34, var38, var42);
    com.google.javascript.jscomp.JSError[] var56 = var28.getWarnings();
    com.google.javascript.jscomp.VariableMap var58 = null;
    com.google.javascript.jscomp.VariableMap var59 = null;
    com.google.javascript.jscomp.VariableMap var60 = null;
    com.google.javascript.jscomp.FunctionInformationMap var61 = null;
    com.google.javascript.jscomp.SourceMap var62 = null;
    com.google.javascript.jscomp.Result var64 = new com.google.javascript.jscomp.Result(var6, var56, "hi!", var58, var59, var60, var61, var62, "Node tree inequality:\nTree1:\nEQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nTree2:\nNUMBER 10.0\n\n\nSubtree1: EQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nSubtree2: NUMBER 10.0\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "NUMBER 10.0"+ "'", var41.equals("NUMBER 10.0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);

  }

  public void test53() {}
//   public void test53() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test53"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.rhino.InputId var1 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, var1, true);
//     com.google.javascript.jscomp.JSModule var4 = var3.getModule();
//     com.google.javascript.jscomp.JSModule var5 = null;
//     var3.setModule(var5);
//     com.google.javascript.jscomp.SourceFile var7 = var3.getSourceFile();
// 
//   }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test54"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setSourceMapOutputPath("hi!");
    var0.setIdeMode(false);
    com.google.javascript.jscomp.CompilerOptions.LanguageMode var5 = var0.getLanguageIn();
    var0.setRemoveUnusedLocalVars(true);
    var0.setCollapsePropertiesOnExternTypes(true);
    var0.setNameAnonymousFunctionsOnly(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test55() {}
//   public void test55() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test55"); }
// 
// 
//     com.google.javascript.jscomp.CheckLevel var3 = null;
//     com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
//     com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.empty();
//     com.google.javascript.jscomp.DiagnosticType var14 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
//     java.lang.String[] var16 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var17 = com.google.javascript.jscomp.JSError.make("", 1, 39, var14, var16);
//     com.google.javascript.jscomp.CheckLevel var21 = null;
//     com.google.javascript.jscomp.DiagnosticType var24 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
//     com.google.javascript.jscomp.DiagnosticType var30 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
//     java.lang.String[] var32 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var33 = com.google.javascript.jscomp.JSError.make("", 1, 39, var30, var32);
//     com.google.javascript.jscomp.JSError var34 = com.google.javascript.jscomp.JSError.make("hi!", 100, 100, var21, var24, var32);
//     com.google.javascript.jscomp.JSError var35 = com.google.javascript.jscomp.JSError.make("NUMBER 10.0\n", var8, var14, var32);
//     com.google.javascript.jscomp.JSError var36 = com.google.javascript.jscomp.JSError.make("NUMBER 10.0\n", 0, 0, var3, var6, var32);
//     com.google.javascript.jscomp.CheckLevel var37 = null;
//     java.io.PrintStream var38 = null;
//     com.google.javascript.jscomp.Compiler var39 = new com.google.javascript.jscomp.Compiler(var38);
//     com.google.javascript.jscomp.LightweightMessageFormatter var40 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var39);
//     java.io.PrintStream var41 = null;
//     com.google.javascript.jscomp.PrintStreamErrorManager var42 = new com.google.javascript.jscomp.PrintStreamErrorManager((com.google.javascript.jscomp.MessageFormatter)var40, var41);
//     java.io.PrintStream var43 = null;
//     com.google.javascript.jscomp.PrintStreamErrorManager var44 = new com.google.javascript.jscomp.PrintStreamErrorManager((com.google.javascript.jscomp.MessageFormatter)var40, var43);
//     java.lang.String var45 = var36.format(var37, (com.google.javascript.jscomp.MessageFormatter)var40);
// 
//   }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test56"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.ErrorReporter var3 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var3, true);
    com.google.javascript.rhino.jstype.ObjectType var6 = var5.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var7 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7, true);
    com.google.javascript.rhino.jstype.ObjectType var10 = var9.createAnonymousObjectType();
    boolean var11 = var10.isUnknownType();
    boolean var12 = var6.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var10);
    boolean var13 = var10.isFunctionPrototypeType();
    var10.clearCachedValues();
    com.google.javascript.rhino.jstype.ObjectType var15 = var10.dereference();
    com.google.javascript.rhino.jstype.JSType[] var16 = new com.google.javascript.rhino.jstype.JSType[] { var15};
    com.google.javascript.rhino.jstype.JSType var17 = var2.createUnionType(var16);
    com.google.javascript.rhino.ErrorReporter var18 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var18, true);
    com.google.javascript.rhino.jstype.JSType var21 = null;
    boolean var23 = var20.canPropertyBeDefined(var21, "hi!");
    boolean var25 = var20.hasNamespace("");
    com.google.javascript.rhino.jstype.FunctionBuilder var26 = new com.google.javascript.rhino.jstype.FunctionBuilder(var20);
    com.google.javascript.rhino.jstype.FunctionBuilder var28 = var26.withName("NUMBER 10.0\n");
    com.google.javascript.rhino.ErrorReporter var29 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var29, true);
    com.google.javascript.rhino.jstype.ObjectType var32 = var31.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var33 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var33, true);
    com.google.javascript.rhino.jstype.ObjectType var36 = var35.createAnonymousObjectType();
    boolean var37 = var36.isUnknownType();
    boolean var38 = var32.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var36);
    boolean var39 = var36.isFunctionPrototypeType();
    com.google.javascript.rhino.jstype.FunctionBuilder var41 = var28.withReturnType((com.google.javascript.rhino.jstype.JSType)var36, true);
    com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var46 = var43.useSourceInfoIfMissingFrom(var45);
    com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.eq(var45, var48);
    com.google.javascript.rhino.Node var50 = var45.cloneNode();
    boolean var51 = var50.isOr();
    com.google.javascript.rhino.jstype.StaticSourceFile var52 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var50);
    boolean var53 = var50.isDec();
    boolean var54 = var50.isFor();
    boolean var55 = var50.isNoSideEffectsCall();
    com.google.javascript.rhino.jstype.FunctionType var56 = var2.createFunctionType((com.google.javascript.rhino.jstype.JSType)var36, var50);
    com.google.javascript.rhino.jstype.ObjectType var57 = var56.getTypeOfThis();
    boolean var58 = var57.isNominalConstructor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
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
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test57"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.ObjectType var3 = var2.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var4 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var4, true);
    com.google.javascript.rhino.jstype.ObjectType var7 = var6.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var8 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var8, true);
    com.google.javascript.rhino.jstype.ObjectType var11 = var10.createAnonymousObjectType();
    boolean var12 = var11.isUnknownType();
    boolean var13 = var7.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var11);
    com.google.javascript.rhino.jstype.JSType var14 = var2.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType)var7);
    boolean var15 = var7.isBooleanValueType();
    com.google.javascript.rhino.jstype.FunctionType var16 = com.google.javascript.rhino.jstype.JSType.toMaybeFunctionType((com.google.javascript.rhino.jstype.JSType)var7);
    com.google.javascript.rhino.ErrorReporter var17 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var17, true);
    com.google.javascript.rhino.jstype.ObjectType var20 = var19.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var21 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var21, true);
    com.google.javascript.rhino.jstype.ObjectType var24 = var23.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var25 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var25, true);
    com.google.javascript.rhino.jstype.ObjectType var28 = var27.createAnonymousObjectType();
    boolean var29 = var28.isUnknownType();
    boolean var30 = var24.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var28);
    com.google.javascript.rhino.jstype.JSType var31 = var19.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType)var24);
    boolean var32 = var24.isBooleanValueType();
    com.google.javascript.rhino.jstype.JSType var33 = var7.getGreatestSubtype((com.google.javascript.rhino.jstype.JSType)var24);
    boolean var34 = var24.isConstructor();
    boolean var35 = var24.isUnionType();
    java.lang.Iterable var36 = var24.getCtorImplementedInterfaces();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
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
    assertNotNull(var36);

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test58"); }


    com.google.javascript.jscomp.parsing.Config.LanguageMode var1 = null;
    com.google.javascript.rhino.ErrorReporter var3 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var3, true);
    com.google.javascript.rhino.jstype.ObjectType var6 = var5.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var7 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7, true);
    com.google.javascript.rhino.jstype.ObjectType var10 = var9.createAnonymousObjectType();
    boolean var11 = var10.isUnknownType();
    boolean var12 = var6.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var10);
    boolean var13 = var6.isBooleanValueType();
    boolean var14 = var6.isNoType();
    java.util.Set var15 = var6.getPropertyNames();
    com.google.javascript.jscomp.parsing.Config var16 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig(true, var1, true, var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test59"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    var0.pushNodeAnnotations();
    com.google.javascript.rhino.JSDocInfoBuilder var3 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    boolean var4 = var3.recordOverride();
    java.util.Set var5 = null;
    boolean var6 = var3.recordModifies(var5);
    boolean var8 = var3.recordFileOverview("hi!");
    boolean var9 = var3.isJavaDispatch();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var10 = var0.getOutEdges((java.lang.Object)var9);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test60() {}
//   public void test60() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test60"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var2 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
//     java.io.PrintStream var3 = null;
//     com.google.javascript.jscomp.PrintStreamErrorManager var4 = new com.google.javascript.jscomp.PrintStreamErrorManager((com.google.javascript.jscomp.MessageFormatter)var2, var3);
//     com.google.javascript.jscomp.Compiler var5 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var4);
//     com.google.javascript.rhino.Node var6 = var5.getRoot();
//     boolean var7 = var5.isTypeCheckingEnabled();
// 
//   }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test61"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithNodeAnnotations();
    java.util.List var1 = var0.getGraphvizNodes();
    java.util.Collection var2 = var0.getNodes();
    boolean var3 = var0.isDirected();
    com.google.javascript.jscomp.graph.SubGraph var4 = var0.newSubGraph();
    var0.clearNodeAnnotations();
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.number(10.0d);
    boolean var8 = var7.isLabel();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var13 = var10.useSourceInfoIfMissingFrom(var12);
    boolean var14 = var12.isFalse();
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.sheq(var7, var12);
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var21 = var18.useSourceInfoIfMissingFrom(var20);
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.IR.eq(var20, var23);
    com.google.javascript.rhino.Node var25 = var20.cloneNode();
    boolean var26 = var25.isOr();
    com.google.javascript.rhino.jstype.StaticSourceFile var27 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var25);
    boolean var28 = var25.isDec();
    var25.setVarArgs(true);
    com.google.javascript.rhino.Node var33 = new com.google.javascript.rhino.Node(0, var25, (-1), (-1));
    boolean var34 = var15.isEquivalentTo(var33);
    com.google.javascript.jscomp.JSError var35 = null;
    com.google.javascript.jscomp.JSError[] var36 = new com.google.javascript.jscomp.JSError[] { var35};
    com.google.javascript.jscomp.JSError var37 = null;
    com.google.javascript.jscomp.JSError[] var38 = new com.google.javascript.jscomp.JSError[] { var37};
    com.google.javascript.jscomp.VariableMap var40 = null;
    com.google.javascript.jscomp.VariableMap var41 = null;
    com.google.javascript.jscomp.VariableMap var42 = null;
    com.google.javascript.jscomp.FunctionInformationMap var43 = null;
    com.google.javascript.jscomp.SourceMap var44 = null;
    com.google.javascript.jscomp.Result var46 = new com.google.javascript.jscomp.Result(var36, var38, "", var40, var41, var42, var43, var44, "");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.disconnect((java.lang.Object)var15, (java.lang.Object)var40);
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
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
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test62"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.empty();
    com.google.javascript.jscomp.DiagnosticType var7 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
    java.lang.String[] var9 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var10 = com.google.javascript.jscomp.JSError.make("", 1, 39, var7, var9);
    com.google.javascript.jscomp.CheckLevel var14 = null;
    com.google.javascript.jscomp.DiagnosticType var17 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
    com.google.javascript.jscomp.DiagnosticType var23 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
    java.lang.String[] var25 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var26 = com.google.javascript.jscomp.JSError.make("", 1, 39, var23, var25);
    com.google.javascript.jscomp.JSError var27 = com.google.javascript.jscomp.JSError.make("hi!", 100, 100, var14, var17, var25);
    com.google.javascript.jscomp.JSError var28 = com.google.javascript.jscomp.JSError.make("NUMBER 10.0\n", var1, var7, var25);
    int var29 = var28.getNodeSourceOffset();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
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
    assertTrue(var29 == (-1));

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test63"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.number(10.0d);
    boolean var2 = var1.isLabel();
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var7 = var4.useSourceInfoIfMissingFrom(var6);
    boolean var8 = var6.isFalse();
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.sheq(var1, var6);
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var15 = var12.useSourceInfoIfMissingFrom(var14);
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.eq(var14, var17);
    com.google.javascript.rhino.Node var19 = var14.cloneNode();
    boolean var20 = var19.isOr();
    com.google.javascript.rhino.jstype.StaticSourceFile var21 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var19);
    boolean var22 = var19.isDec();
    var19.setVarArgs(true);
    com.google.javascript.rhino.Node var27 = new com.google.javascript.rhino.Node(0, var19, (-1), (-1));
    boolean var28 = var9.isEquivalentTo(var27);
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var33 = var30.useSourceInfoIfMissingFrom(var32);
    com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.eq(var32, var35);
    com.google.javascript.rhino.Node var37 = var32.cloneNode();
    boolean var38 = var37.isOr();
    com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var42 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var43 = var40.useSourceInfoIfMissingFrom(var42);
    com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var46 = com.google.javascript.rhino.IR.eq(var42, var45);
    com.google.javascript.rhino.Node var47 = var42.cloneNode();
    com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.IR.or(var37, var47);
    com.google.javascript.rhino.Node var50 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var52 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var53 = var50.useSourceInfoIfMissingFrom(var52);
    com.google.javascript.rhino.Node var55 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var56 = var53.copyInformationFrom(var55);
    com.google.javascript.rhino.Node var57 = var37.srcrefTree(var55);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var58 = com.google.javascript.rhino.IR.catchNode(var9, var37);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
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
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
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
    assertNotNull(var50);
    
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

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test64"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.ErrorReporter var3 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var3, true);
    com.google.javascript.rhino.jstype.ObjectType var6 = var5.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var7 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7, true);
    com.google.javascript.rhino.jstype.ObjectType var10 = var9.createAnonymousObjectType();
    boolean var11 = var10.isUnknownType();
    boolean var12 = var6.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var10);
    boolean var13 = var10.isFunctionPrototypeType();
    var10.clearCachedValues();
    com.google.javascript.rhino.jstype.ObjectType var15 = var10.dereference();
    com.google.javascript.rhino.jstype.JSType[] var16 = new com.google.javascript.rhino.jstype.JSType[] { var15};
    com.google.javascript.rhino.jstype.JSType var17 = var2.createUnionType(var16);
    com.google.javascript.rhino.ErrorReporter var18 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var18, true);
    com.google.javascript.rhino.jstype.JSType var21 = null;
    boolean var23 = var20.canPropertyBeDefined(var21, "hi!");
    boolean var25 = var20.hasNamespace("");
    com.google.javascript.rhino.jstype.FunctionBuilder var26 = new com.google.javascript.rhino.jstype.FunctionBuilder(var20);
    com.google.javascript.rhino.jstype.FunctionBuilder var28 = var26.withName("NUMBER 10.0\n");
    com.google.javascript.rhino.ErrorReporter var29 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var29, true);
    com.google.javascript.rhino.jstype.ObjectType var32 = var31.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var33 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var33, true);
    com.google.javascript.rhino.jstype.ObjectType var36 = var35.createAnonymousObjectType();
    boolean var37 = var36.isUnknownType();
    boolean var38 = var32.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var36);
    boolean var39 = var36.isFunctionPrototypeType();
    com.google.javascript.rhino.jstype.FunctionBuilder var41 = var28.withReturnType((com.google.javascript.rhino.jstype.JSType)var36, true);
    com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var46 = var43.useSourceInfoIfMissingFrom(var45);
    com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.eq(var45, var48);
    com.google.javascript.rhino.Node var50 = var45.cloneNode();
    boolean var51 = var50.isOr();
    com.google.javascript.rhino.jstype.StaticSourceFile var52 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var50);
    boolean var53 = var50.isDec();
    boolean var54 = var50.isFor();
    boolean var55 = var50.isNoSideEffectsCall();
    com.google.javascript.rhino.jstype.FunctionType var56 = var2.createFunctionType((com.google.javascript.rhino.jstype.JSType)var36, var50);
    int var57 = var56.getExtendedInterfacesCount();
    boolean var58 = var56.isReturnTypeInferred();
    boolean var59 = var56.isOrdinaryFunction();
    int var60 = var56.getMaxArguments();
    com.google.javascript.rhino.jstype.ObjectType var61 = var56.getTypeOfThis();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.jstype.ObjectType var62 = var56.getInstanceType();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
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
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);

  }

  public void test65() {}
//   public void test65() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test65"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
//     com.google.javascript.rhino.ErrorReporter var3 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var3, true);
//     com.google.javascript.rhino.jstype.ObjectType var6 = var5.createAnonymousObjectType();
//     com.google.javascript.rhino.ErrorReporter var7 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7, true);
//     com.google.javascript.rhino.jstype.ObjectType var10 = var9.createAnonymousObjectType();
//     boolean var11 = var10.isUnknownType();
//     boolean var12 = var6.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var10);
//     boolean var13 = var10.isFunctionPrototypeType();
//     var10.clearCachedValues();
//     com.google.javascript.rhino.jstype.ObjectType var15 = var10.dereference();
//     com.google.javascript.rhino.jstype.JSType[] var16 = new com.google.javascript.rhino.jstype.JSType[] { var15};
//     com.google.javascript.rhino.jstype.JSType var17 = var2.createUnionType(var16);
//     com.google.javascript.rhino.ErrorReporter var18 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var18, true);
//     com.google.javascript.rhino.jstype.JSType var21 = null;
//     boolean var23 = var20.canPropertyBeDefined(var21, "hi!");
//     boolean var25 = var20.hasNamespace("");
//     com.google.javascript.rhino.jstype.FunctionBuilder var26 = new com.google.javascript.rhino.jstype.FunctionBuilder(var20);
//     com.google.javascript.rhino.jstype.FunctionBuilder var28 = var26.withName("NUMBER 10.0\n");
//     com.google.javascript.rhino.ErrorReporter var29 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var29, true);
//     com.google.javascript.rhino.jstype.ObjectType var32 = var31.createAnonymousObjectType();
//     com.google.javascript.rhino.ErrorReporter var33 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var33, true);
//     com.google.javascript.rhino.jstype.ObjectType var36 = var35.createAnonymousObjectType();
//     boolean var37 = var36.isUnknownType();
//     boolean var38 = var32.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var36);
//     boolean var39 = var36.isFunctionPrototypeType();
//     com.google.javascript.rhino.jstype.FunctionBuilder var41 = var28.withReturnType((com.google.javascript.rhino.jstype.JSType)var36, true);
//     com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var46 = var43.useSourceInfoIfMissingFrom(var45);
//     com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.eq(var45, var48);
//     com.google.javascript.rhino.Node var50 = var45.cloneNode();
//     boolean var51 = var50.isOr();
//     com.google.javascript.rhino.jstype.StaticSourceFile var52 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var50);
//     boolean var53 = var50.isDec();
//     boolean var54 = var50.isFor();
//     boolean var55 = var50.isNoSideEffectsCall();
//     com.google.javascript.rhino.jstype.FunctionType var56 = var2.createFunctionType((com.google.javascript.rhino.jstype.JSType)var36, var50);
//     com.google.javascript.rhino.jstype.ObjectType var57 = var56.getTypeOfThis();
//     com.google.javascript.rhino.jstype.ObjectType var58 = var56.getTypeOfThis();
//     com.google.javascript.rhino.jstype.ObjectType var59 = var56.getParentScope();
//     boolean var60 = var56.hasCachedValues();
//     java.lang.String var61 = var56.toDebugHashCodeString();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var6);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var10);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var15);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var16);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var17);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var23 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var25 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var28);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var32);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var36);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var37 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var38 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var39 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var41);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var43);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var45);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var46);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var48);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var49);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var50);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var51 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var52);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var53 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var54 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var55 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var56);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var57);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var58);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var59);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var60 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var61 + "' != '" + "function (): {992738826}"+ "'", var61.equals("function (): {992738826}"));
// 
//   }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test66"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.ErrorReporter var3 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var3, true);
    com.google.javascript.rhino.jstype.ObjectType var6 = var5.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var7 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7, true);
    com.google.javascript.rhino.jstype.ObjectType var10 = var9.createAnonymousObjectType();
    boolean var11 = var10.isUnknownType();
    boolean var12 = var6.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var10);
    boolean var13 = var10.isFunctionPrototypeType();
    var10.clearCachedValues();
    com.google.javascript.rhino.jstype.ObjectType var15 = var10.dereference();
    com.google.javascript.rhino.jstype.JSType[] var16 = new com.google.javascript.rhino.jstype.JSType[] { var15};
    com.google.javascript.rhino.jstype.JSType var17 = var2.createUnionType(var16);
    com.google.javascript.rhino.ErrorReporter var18 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var18, true);
    com.google.javascript.rhino.jstype.JSType var21 = null;
    boolean var23 = var20.canPropertyBeDefined(var21, "hi!");
    boolean var25 = var20.hasNamespace("");
    com.google.javascript.rhino.jstype.FunctionBuilder var26 = new com.google.javascript.rhino.jstype.FunctionBuilder(var20);
    com.google.javascript.rhino.jstype.FunctionBuilder var28 = var26.withName("NUMBER 10.0\n");
    com.google.javascript.rhino.ErrorReporter var29 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var29, true);
    com.google.javascript.rhino.jstype.ObjectType var32 = var31.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var33 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var33, true);
    com.google.javascript.rhino.jstype.ObjectType var36 = var35.createAnonymousObjectType();
    boolean var37 = var36.isUnknownType();
    boolean var38 = var32.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var36);
    boolean var39 = var36.isFunctionPrototypeType();
    com.google.javascript.rhino.jstype.FunctionBuilder var41 = var28.withReturnType((com.google.javascript.rhino.jstype.JSType)var36, true);
    com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var46 = var43.useSourceInfoIfMissingFrom(var45);
    com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.eq(var45, var48);
    com.google.javascript.rhino.Node var50 = var45.cloneNode();
    boolean var51 = var50.isOr();
    com.google.javascript.rhino.jstype.StaticSourceFile var52 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var50);
    boolean var53 = var50.isDec();
    boolean var54 = var50.isFor();
    boolean var55 = var50.isNoSideEffectsCall();
    com.google.javascript.rhino.jstype.FunctionType var56 = var2.createFunctionType((com.google.javascript.rhino.jstype.JSType)var36, var50);
    int var57 = var56.getExtendedInterfacesCount();
    boolean var58 = var56.isReturnTypeInferred();
    boolean var59 = var56.isOrdinaryFunction();
    boolean var60 = var56.isInstanceType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
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
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test67"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    var0.pushNodeAnnotations();
    com.google.javascript.jscomp.CompilerOptions var2 = new com.google.javascript.jscomp.CompilerOptions();
    var2.setSourceMapOutputPath("hi!");
    var2.setIdeMode(false);
    com.google.javascript.jscomp.CompilerOptions.LanguageMode var7 = var2.getLanguageIn();
    var2.setClosurePass(false);
    var2.setRenamePrefix("hi!");
    var2.setRuntimeTypeCheckLogFunction("NUMBER 10.0");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var14 = var0.getDirectedSuccNodes((java.lang.Object)"NUMBER 10.0");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test68"); }


    java.lang.String var1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("null(null)");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "(null(null))"+ "'", var1.equals("(null(null))"));

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test69"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.lang.Object var1 = null;
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var2 = var0.createDirectedGraphNode(var1);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var8 = var5.useSourceInfoIfMissingFrom(var7);
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.exprResult(var8);
    var9.setLength(10);
    com.google.javascript.jscomp.CheckLevel var12 = null;
    com.google.javascript.jscomp.CheckLevel var16 = null;
    com.google.javascript.jscomp.DiagnosticType var19 = com.google.javascript.jscomp.DiagnosticType.warning("{505847021}", "{505847021}");
    com.google.javascript.jscomp.DiagnosticType var25 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
    java.lang.String[] var27 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var28 = com.google.javascript.jscomp.JSError.make("", 1, 39, var25, var27);
    com.google.javascript.jscomp.ShowByPathWarningsGuard var29 = new com.google.javascript.jscomp.ShowByPathWarningsGuard(var27);
    com.google.javascript.jscomp.JSError var30 = com.google.javascript.jscomp.JSError.make("Node tree inequality:\nTree1:\nNUMBER 10.0\n\n\nTree2:\nEQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nSubtree1: NUMBER 10.0\n\n\nSubtree2: EQ\n    NUMBER 10.0\n    NUMBER 10.0\n", (-1), 10, var16, var19, var27);
    java.lang.String[] var32 = new java.lang.String[] { "null(null)"};
    com.google.javascript.jscomp.JSError var33 = com.google.javascript.jscomp.JSError.make("hi!", var9, var12, var19, var32);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var34 = var0.getWeight((java.lang.Object)"hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test70"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.jscomp.CompilerOptions var2 = new com.google.javascript.jscomp.CompilerOptions();
    var2.setCrossModuleCodeMotion(false);
    var2.setLabelRenaming(true);
    java.util.Set var7 = null;
    var2.setStripTypePrefixes(var7);
    var1.initOptions(var2);
    boolean var10 = var1.acceptConstKeyword();
    com.google.javascript.jscomp.CodingConvention var11 = var1.getCodingConvention();
    com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt var12 = null;
    com.google.javascript.jscomp.LightweightMessageFormatter var13 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1, var12);
    var1.reportCodeChange();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.processDefines();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test71"); }


    com.google.javascript.rhino.JSDocInfoBuilder var1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    boolean var2 = var1.isPopulated();
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var7 = var4.useSourceInfoIfMissingFrom(var6);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.exprResult(var7);
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var13 = var10.useSourceInfoIfMissingFrom(var12);
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.eq(var12, var15);
    com.google.javascript.rhino.Node var17 = var12.cloneNode();
    boolean var18 = var17.isOr();
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var23 = var20.useSourceInfoIfMissingFrom(var22);
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.eq(var22, var25);
    com.google.javascript.rhino.Node var27 = var22.cloneNode();
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.or(var17, var27);
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var33 = var30.useSourceInfoIfMissingFrom(var32);
    com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.eq(var32, var35);
    var36.setSourceEncodedPosition(100);
    com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var42 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var43 = var40.useSourceInfoIfMissingFrom(var42);
    com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var46 = com.google.javascript.rhino.IR.eq(var42, var45);
    com.google.javascript.rhino.Node var47 = var42.cloneNode();
    boolean var48 = var47.isOr();
    com.google.javascript.rhino.Node var50 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var52 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var53 = var50.useSourceInfoIfMissingFrom(var52);
    com.google.javascript.rhino.Node var55 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var56 = com.google.javascript.rhino.IR.eq(var52, var55);
    com.google.javascript.rhino.Node var57 = var52.cloneNode();
    com.google.javascript.rhino.Node var58 = com.google.javascript.rhino.IR.or(var47, var57);
    com.google.javascript.rhino.Node var59 = var36.useSourceInfoFromForTree(var47);
    com.google.javascript.rhino.Node.AncestorIterable var60 = var59.getAncestors();
    java.lang.String var61 = var17.checkTreeEquals(var59);
    com.google.javascript.rhino.Node var63 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var65 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var66 = var63.useSourceInfoIfMissingFrom(var65);
    com.google.javascript.rhino.Node var68 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var69 = com.google.javascript.rhino.IR.eq(var65, var68);
    com.google.javascript.rhino.Node var70 = var65.cloneNode();
    boolean var71 = var70.isOr();
    com.google.javascript.rhino.Node var73 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var75 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var76 = var73.useSourceInfoIfMissingFrom(var75);
    com.google.javascript.rhino.Node var78 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var79 = com.google.javascript.rhino.IR.eq(var75, var78);
    com.google.javascript.rhino.Node var80 = var75.cloneNode();
    com.google.javascript.rhino.Node var81 = com.google.javascript.rhino.IR.or(var70, var80);
    com.google.javascript.rhino.Node[] var82 = new com.google.javascript.rhino.Node[] { var81};
    com.google.javascript.rhino.Node var83 = com.google.javascript.rhino.IR.call(var59, var82);
    java.lang.String var84 = var8.checkTreeEquals(var83);
    com.google.javascript.rhino.Node var86 = com.google.javascript.rhino.IR.number(10.0d);
    boolean var87 = var86.isExprResult();
    com.google.javascript.rhino.Node var88 = var8.copyInformationFromForTree(var86);
    com.google.javascript.rhino.JSDocInfo var89 = var1.build(var86);
    boolean var91 = var1.recordTemplateTypeName("{505847021}");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
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
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
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
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "Node tree inequality:\nTree1:\nNUMBER 10.0\n\n\nTree2:\nEQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nSubtree1: NUMBER 10.0\n\n\nSubtree2: EQ\n    NUMBER 10.0\n    NUMBER 10.0\n"+ "'", var61.equals("Node tree inequality:\nTree1:\nNUMBER 10.0\n\n\nTree2:\nEQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nSubtree1: NUMBER 10.0\n\n\nSubtree2: EQ\n    NUMBER 10.0\n    NUMBER 10.0\n"));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
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
    assertTrue("'" + var84 + "' != '" + "Node tree inequality:\nTree1:\nEXPR_RESULT\n    NUMBER 10.0\n\n\nTree2:\nCALL\n    EQ\n        NUMBER 10.0\n        NUMBER 10.0\n    OR\n        NUMBER 10.0\n        NUMBER 10.0\n\n\nSubtree1: EXPR_RESULT\n    NUMBER 10.0\n\n\nSubtree2: CALL\n    EQ\n        NUMBER 10.0\n        NUMBER 10.0\n    OR\n        NUMBER 10.0\n        NUMBER 10.0\n"+ "'", var84.equals("Node tree inequality:\nTree1:\nEXPR_RESULT\n    NUMBER 10.0\n\n\nTree2:\nCALL\n    EQ\n        NUMBER 10.0\n        NUMBER 10.0\n    OR\n        NUMBER 10.0\n        NUMBER 10.0\n\n\nSubtree1: EXPR_RESULT\n    NUMBER 10.0\n\n\nSubtree2: CALL\n    EQ\n        NUMBER 10.0\n        NUMBER 10.0\n    OR\n        NUMBER 10.0\n        NUMBER 10.0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == true);

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test72"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setCrossModuleCodeMotion(false);
    com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var3 = null;
    var0.setAnonymousFunctionNaming(var3);
    var0.setExtractPrototypeMemberDeclarations(true);
    var0.setRemoveClosureAsserts(false);
    var0.setAliasExternals(false);
    var0.setRewriteFunctionExpressions(true);
    var0.setSourceMapOutputPath("hi!");
    var0.setTransformAMDToCJSModules(false);
    java.util.List var17 = null;
    var0.setSourceMapLocationMappings(var17);
    var0.setLineLengthThreshold((-1));

  }

  public void test73() {}
//   public void test73() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test73"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
//     com.google.javascript.rhino.jstype.ObjectType var3 = var2.createAnonymousObjectType();
//     boolean var4 = var3.isUnknownType();
//     com.google.javascript.rhino.JSDocInfo var6 = var3.getOwnPropertyJSDocInfo("{505847021}");
//     com.google.javascript.rhino.ErrorReporter var8 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var8, false);
//     com.google.javascript.rhino.ErrorReporter var11 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var11, true);
//     com.google.javascript.rhino.jstype.JSType var14 = null;
//     boolean var16 = var13.canPropertyBeDefined(var14, "hi!");
//     boolean var18 = var13.hasNamespace("");
//     com.google.javascript.rhino.jstype.FunctionBuilder var19 = new com.google.javascript.rhino.jstype.FunctionBuilder(var13);
//     com.google.javascript.rhino.ErrorReporter var20 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var20, true);
//     com.google.javascript.rhino.ErrorReporter var23 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var23, true);
//     com.google.javascript.rhino.jstype.ObjectType var26 = var25.createAnonymousObjectType();
//     com.google.javascript.rhino.ErrorReporter var27 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var27, true);
//     com.google.javascript.rhino.jstype.ObjectType var30 = var29.createAnonymousObjectType();
//     boolean var31 = var30.isUnknownType();
//     boolean var32 = var26.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var30);
//     boolean var33 = var30.isFunctionPrototypeType();
//     var30.clearCachedValues();
//     com.google.javascript.rhino.jstype.ObjectType var35 = var30.dereference();
//     com.google.javascript.rhino.jstype.JSType[] var36 = new com.google.javascript.rhino.jstype.JSType[] { var35};
//     com.google.javascript.rhino.jstype.JSType var37 = var22.createUnionType(var36);
//     com.google.javascript.rhino.ErrorReporter var38 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var38, true);
//     com.google.javascript.rhino.ErrorReporter var41 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var41, true);
//     com.google.javascript.rhino.jstype.ObjectType var44 = var43.createAnonymousObjectType();
//     com.google.javascript.rhino.ErrorReporter var45 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var45, true);
//     com.google.javascript.rhino.jstype.ObjectType var48 = var47.createAnonymousObjectType();
//     boolean var49 = var48.isUnknownType();
//     boolean var50 = var44.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var48);
//     boolean var51 = var48.isFunctionPrototypeType();
//     var48.clearCachedValues();
//     com.google.javascript.rhino.jstype.ObjectType var53 = var48.dereference();
//     com.google.javascript.rhino.jstype.JSType[] var54 = new com.google.javascript.rhino.jstype.JSType[] { var53};
//     com.google.javascript.rhino.jstype.JSType var55 = var40.createUnionType(var54);
//     com.google.javascript.rhino.jstype.FunctionType var56 = var13.createFunctionTypeWithVarArgs(var37, var54);
//     boolean var57 = var37.isEnumElementType();
//     com.google.javascript.rhino.jstype.JSType var58 = var10.createOptionalType(var37);
//     com.google.javascript.rhino.Node var60 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var62 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var63 = var60.useSourceInfoIfMissingFrom(var62);
//     com.google.javascript.rhino.Node var65 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var66 = com.google.javascript.rhino.IR.eq(var62, var65);
//     com.google.javascript.rhino.Node var67 = var62.cloneNode();
//     boolean var68 = var67.isOr();
//     com.google.javascript.rhino.Node var70 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var72 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var73 = var70.useSourceInfoIfMissingFrom(var72);
//     com.google.javascript.rhino.Node var75 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var76 = com.google.javascript.rhino.IR.eq(var72, var75);
//     com.google.javascript.rhino.Node var77 = var72.cloneNode();
//     com.google.javascript.rhino.Node var78 = com.google.javascript.rhino.IR.or(var67, var77);
//     com.google.javascript.rhino.Node var80 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var82 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var83 = var80.useSourceInfoIfMissingFrom(var82);
//     com.google.javascript.rhino.Node var85 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var86 = var83.copyInformationFrom(var85);
//     com.google.javascript.rhino.Node var87 = var67.srcrefTree(var85);
//     com.google.javascript.rhino.Node var89 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var91 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var92 = var89.useSourceInfoIfMissingFrom(var91);
//     com.google.javascript.rhino.Node var93 = com.google.javascript.rhino.IR.exprResult(var92);
//     com.google.javascript.rhino.Node var94 = com.google.javascript.rhino.IR.block(var93);
//     com.google.javascript.rhino.Node var95 = var87.clonePropsFrom(var94);
//     boolean var96 = var3.defineDeclaredProperty("goog.global", var37, var87);
//     com.google.javascript.rhino.jstype.JSType var97 = null;
//     boolean var98 = var3.canTestForShallowEqualityWith(var97);
// 
//   }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test74"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.ErrorReporter var3 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var3, true);
    com.google.javascript.rhino.jstype.ObjectType var6 = var5.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var7 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7, true);
    com.google.javascript.rhino.jstype.ObjectType var10 = var9.createAnonymousObjectType();
    boolean var11 = var10.isUnknownType();
    boolean var12 = var6.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var10);
    boolean var13 = var10.isFunctionPrototypeType();
    var10.clearCachedValues();
    com.google.javascript.rhino.jstype.ObjectType var15 = var10.dereference();
    com.google.javascript.rhino.jstype.JSType[] var16 = new com.google.javascript.rhino.jstype.JSType[] { var15};
    com.google.javascript.rhino.jstype.JSType var17 = var2.createUnionType(var16);
    com.google.javascript.rhino.ErrorReporter var18 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var18, true);
    com.google.javascript.rhino.jstype.JSType var21 = null;
    boolean var23 = var20.canPropertyBeDefined(var21, "hi!");
    boolean var25 = var20.hasNamespace("");
    com.google.javascript.rhino.jstype.FunctionBuilder var26 = new com.google.javascript.rhino.jstype.FunctionBuilder(var20);
    com.google.javascript.rhino.jstype.FunctionBuilder var28 = var26.withName("NUMBER 10.0\n");
    com.google.javascript.rhino.ErrorReporter var29 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var29, true);
    com.google.javascript.rhino.jstype.ObjectType var32 = var31.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var33 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var33, true);
    com.google.javascript.rhino.jstype.ObjectType var36 = var35.createAnonymousObjectType();
    boolean var37 = var36.isUnknownType();
    boolean var38 = var32.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var36);
    boolean var39 = var36.isFunctionPrototypeType();
    com.google.javascript.rhino.jstype.FunctionBuilder var41 = var28.withReturnType((com.google.javascript.rhino.jstype.JSType)var36, true);
    com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var46 = var43.useSourceInfoIfMissingFrom(var45);
    com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.eq(var45, var48);
    com.google.javascript.rhino.Node var50 = var45.cloneNode();
    boolean var51 = var50.isOr();
    com.google.javascript.rhino.jstype.StaticSourceFile var52 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var50);
    boolean var53 = var50.isDec();
    boolean var54 = var50.isFor();
    boolean var55 = var50.isNoSideEffectsCall();
    com.google.javascript.rhino.jstype.FunctionType var56 = var2.createFunctionType((com.google.javascript.rhino.jstype.JSType)var36, var50);
    boolean var57 = var56.isReturnTypeInferred();
    boolean var58 = var56.hasInstanceType();
    com.google.javascript.rhino.jstype.FunctionType var59 = var56.toMaybeFunctionType();
    com.google.javascript.rhino.jstype.JSType var61 = var56.getPropertyType("NUMBER 10.0");
    com.google.javascript.rhino.jstype.FunctionType var62 = var61.toMaybeFunctionType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
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
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);

  }

  public void test75() {}
//   public void test75() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test75"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
//     com.google.javascript.rhino.ErrorReporter var3 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var3, true);
//     com.google.javascript.rhino.jstype.ObjectType var6 = var5.createAnonymousObjectType();
//     com.google.javascript.rhino.ErrorReporter var7 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7, true);
//     com.google.javascript.rhino.jstype.ObjectType var10 = var9.createAnonymousObjectType();
//     boolean var11 = var10.isUnknownType();
//     boolean var12 = var6.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var10);
//     boolean var13 = var10.isFunctionPrototypeType();
//     var10.clearCachedValues();
//     com.google.javascript.rhino.jstype.ObjectType var15 = var10.dereference();
//     com.google.javascript.rhino.jstype.JSType[] var16 = new com.google.javascript.rhino.jstype.JSType[] { var15};
//     com.google.javascript.rhino.jstype.JSType var17 = var2.createUnionType(var16);
//     com.google.javascript.rhino.jstype.JSType var18 = null;
//     com.google.javascript.rhino.jstype.JSType.TypePair var19 = var17.getTypesUnderEquality(var18);
// 
//   }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test76"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setSourceMapOutputPath("hi!");
    var0.setIdeMode(false);
    java.util.Set var5 = null;
    var0.setReplaceStringsReservedStrings(var5);
    var0.resetWarningsGuard();
    var0.setInputDelimiter("");
    com.google.javascript.jscomp.CompilerOptions.LanguageMode var10 = var0.getLanguageOut();
    var0.setTweakToNumberLiteral("{723551193}", 0);
    var0.setRemoveTryCatchFinally(false);
    com.google.javascript.jscomp.CompilerOptions var16 = new com.google.javascript.jscomp.CompilerOptions();
    var16.setSourceMapOutputPath("hi!");
    var16.setReplaceStringsPlaceholderToken("hi!");
    var16.setCheckCaja(true);
    com.google.javascript.jscomp.CompilerOptions var23 = new com.google.javascript.jscomp.CompilerOptions();
    var23.setTweakToNumberLiteral("", 1);
    var23.setInlineVariables(false);
    com.google.javascript.jscomp.CompilerOptions.TracerMode var29 = var23.getTracerMode();
    var23.setPrintInputDelimiter(false);
    var23.setCheckMissingGetCssNameBlacklist("");
    var23.setCollapseObjectLiterals(false);
    com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler var36 = var23.getAliasTransformationHandler();
    var16.setAliasTransformationHandler(var36);
    com.google.javascript.jscomp.CompilerOptions.LanguageMode var38 = var16.getLanguageIn();
    var0.setLanguageIn(var38);
    var0.setCheckMissingGetCssNameBlacklist("null(null)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test77"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var4 = var1.useSourceInfoIfMissingFrom(var3);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.eq(var3, var6);
    com.google.javascript.rhino.Node var8 = var3.cloneNode();
    boolean var9 = var8.isOr();
    com.google.javascript.rhino.jstype.StaticSourceFile var10 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var8);
    boolean var11 = var8.isDec();
    boolean var12 = var8.isBlock();
    int var13 = var8.getCharno();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test78"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setSourceMapOutputPath("hi!");
    var0.setIdeMode(false);
    com.google.javascript.jscomp.CompilerOptions.LanguageMode var5 = var0.getLanguageIn();
    var0.setRemoveUnusedLocalVars(true);
    var0.setManageClosureDependencies(false);
    com.google.javascript.jscomp.CompilerOptions var10 = new com.google.javascript.jscomp.CompilerOptions();
    var10.setSourceMapOutputPath("hi!");
    var10.setIdeMode(false);
    com.google.javascript.jscomp.CompilerOptions.LanguageMode var15 = var10.getLanguageIn();
    var0.setLanguageIn(var15);
    var0.setFlowSensitiveInlineVariables(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test79"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.jscomp.CompilerOptions var2 = new com.google.javascript.jscomp.CompilerOptions();
    var2.setCrossModuleCodeMotion(false);
    var2.setLabelRenaming(true);
    java.util.Set var7 = null;
    var2.setStripTypePrefixes(var7);
    var1.initOptions(var2);
    boolean var10 = var1.acceptConstKeyword();
    com.google.javascript.jscomp.CodingConvention var11 = var1.getCodingConvention();
    com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt var12 = null;
    com.google.javascript.jscomp.LightweightMessageFormatter var13 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1, var12);
    com.google.javascript.jscomp.type.ReverseAbstractInterpreter var14 = var1.getReverseAbstractInterpreter();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test80"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.trueNode();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var5 = var2.useSourceInfoIfMissingFrom(var4);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.eq(var4, var7);
    java.lang.String var9 = com.google.javascript.jscomp.NodeUtil.getSourceName(var7);
    boolean var10 = var7.isVoid();
    com.google.javascript.jscomp.CodingConvention var11 = null;
    com.google.javascript.jscomp.ClosureCodingConvention var12 = new com.google.javascript.jscomp.ClosureCodingConvention(var11);
    com.google.javascript.rhino.jstype.JSTypeRegistry var13 = null;
    com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter var14 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter((com.google.javascript.jscomp.CodingConvention)var12, var13);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var19 = var16.useSourceInfoIfMissingFrom(var18);
    boolean var20 = var18.isSetterDef();
    boolean var21 = var18.isNoSideEffectsCall();
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var26 = var23.useSourceInfoIfMissingFrom(var25);
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.eq(var25, var28);
    com.google.javascript.rhino.Node var30 = var25.cloneNode();
    boolean var31 = var30.isOr();
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var36 = var33.useSourceInfoIfMissingFrom(var35);
    com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.IR.eq(var35, var38);
    com.google.javascript.rhino.Node var40 = var35.cloneNode();
    com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.IR.or(var30, var40);
    com.google.javascript.rhino.Node var42 = com.google.javascript.rhino.IR.voidNode(var41);
    com.google.javascript.rhino.Node var43 = var18.srcref(var41);
    com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var47 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var48 = var45.useSourceInfoIfMissingFrom(var47);
    com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.exprResult(var48);
    com.google.javascript.rhino.Node var50 = com.google.javascript.rhino.IR.block(var49);
    com.google.javascript.rhino.InputId var51 = null;
    var49.setInputId(var51);
    java.lang.String var53 = var12.extractClassNameIfRequire(var43, var49);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var54 = com.google.javascript.rhino.IR.forIn(var0, var7, var43);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
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
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
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
    assertNull(var53);

  }

  public void test81() {}
//   public void test81() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test81"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var2 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
//     com.google.javascript.jscomp.JSError[] var3 = var1.getWarnings();
// 
//   }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test82"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.ErrorReporter var3 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var3, true);
    com.google.javascript.rhino.jstype.ObjectType var6 = var5.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var7 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7, true);
    com.google.javascript.rhino.jstype.ObjectType var10 = var9.createAnonymousObjectType();
    boolean var11 = var10.isUnknownType();
    boolean var12 = var6.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var10);
    boolean var13 = var10.isFunctionPrototypeType();
    var10.clearCachedValues();
    com.google.javascript.rhino.jstype.ObjectType var15 = var10.dereference();
    com.google.javascript.rhino.jstype.JSType[] var16 = new com.google.javascript.rhino.jstype.JSType[] { var15};
    com.google.javascript.rhino.jstype.JSType var17 = var2.createUnionType(var16);
    com.google.javascript.rhino.ErrorReporter var18 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var18, true);
    com.google.javascript.rhino.jstype.JSType var21 = null;
    boolean var23 = var20.canPropertyBeDefined(var21, "hi!");
    boolean var25 = var20.hasNamespace("");
    com.google.javascript.rhino.jstype.FunctionBuilder var26 = new com.google.javascript.rhino.jstype.FunctionBuilder(var20);
    com.google.javascript.rhino.jstype.FunctionBuilder var28 = var26.withName("NUMBER 10.0\n");
    com.google.javascript.rhino.ErrorReporter var29 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var29, true);
    com.google.javascript.rhino.jstype.ObjectType var32 = var31.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var33 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var33, true);
    com.google.javascript.rhino.jstype.ObjectType var36 = var35.createAnonymousObjectType();
    boolean var37 = var36.isUnknownType();
    boolean var38 = var32.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var36);
    boolean var39 = var36.isFunctionPrototypeType();
    com.google.javascript.rhino.jstype.FunctionBuilder var41 = var28.withReturnType((com.google.javascript.rhino.jstype.JSType)var36, true);
    com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var46 = var43.useSourceInfoIfMissingFrom(var45);
    com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.eq(var45, var48);
    com.google.javascript.rhino.Node var50 = var45.cloneNode();
    boolean var51 = var50.isOr();
    com.google.javascript.rhino.jstype.StaticSourceFile var52 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var50);
    boolean var53 = var50.isDec();
    boolean var54 = var50.isFor();
    boolean var55 = var50.isNoSideEffectsCall();
    com.google.javascript.rhino.jstype.FunctionType var56 = var2.createFunctionType((com.google.javascript.rhino.jstype.JSType)var36, var50);
    int var57 = var56.getExtendedInterfacesCount();
    com.google.javascript.rhino.ErrorReporter var58 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var58, true);
    com.google.javascript.rhino.jstype.ObjectType var61 = var60.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var62 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var62, true);
    com.google.javascript.rhino.jstype.ObjectType var65 = var64.createAnonymousObjectType();
    boolean var66 = var65.isUnknownType();
    boolean var67 = var61.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var65);
    boolean var68 = var61.isStringValueType();
    com.google.javascript.rhino.jstype.ObjectType var69 = var61.dereference();
    var56.setPrototypeBasedOn(var69);
    com.google.javascript.rhino.Node var72 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var74 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var75 = var72.useSourceInfoIfMissingFrom(var74);
    com.google.javascript.rhino.Node var77 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var78 = com.google.javascript.rhino.IR.eq(var74, var77);
    com.google.javascript.rhino.Node var79 = var74.cloneNode();
    com.google.javascript.rhino.Node var81 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var83 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var84 = var81.useSourceInfoIfMissingFrom(var83);
    com.google.javascript.rhino.Node var86 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var88 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var89 = var86.useSourceInfoIfMissingFrom(var88);
    com.google.javascript.rhino.Node var90 = com.google.javascript.rhino.IR.exprResult(var89);
    java.lang.String var91 = var83.checkTreeEquals(var89);
    com.google.javascript.rhino.Node var92 = var74.srcref(var83);
    var56.setSource(var92);
    boolean var94 = var92.isWith();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
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
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == false);

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test83"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var3 = null;
    boolean var5 = var2.canPropertyBeDefined(var3, "hi!");
    boolean var7 = var2.hasNamespace("");
    com.google.javascript.rhino.ErrorReporter var8 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var8, true);
    com.google.javascript.rhino.jstype.ObjectType var11 = var10.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var12 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var12, true);
    com.google.javascript.rhino.jstype.ObjectType var15 = var14.createAnonymousObjectType();
    boolean var16 = var15.isUnknownType();
    boolean var17 = var11.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var15);
    boolean var18 = var15.isFunctionPrototypeType();
    var2.resolveTypesInScope((com.google.javascript.rhino.jstype.StaticScope)var15);
    com.google.javascript.rhino.ErrorReporter var20 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var20, true);
    com.google.javascript.rhino.ErrorReporter var23 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var23, true);
    com.google.javascript.rhino.jstype.ObjectType var26 = var25.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var27 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var27, true);
    com.google.javascript.rhino.jstype.ObjectType var30 = var29.createAnonymousObjectType();
    boolean var31 = var30.isUnknownType();
    boolean var32 = var26.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var30);
    boolean var33 = var30.isFunctionPrototypeType();
    var30.clearCachedValues();
    com.google.javascript.rhino.jstype.ObjectType var35 = var30.dereference();
    com.google.javascript.rhino.jstype.JSType[] var36 = new com.google.javascript.rhino.jstype.JSType[] { var35};
    com.google.javascript.rhino.jstype.JSType var37 = var22.createUnionType(var36);
    com.google.javascript.rhino.ErrorReporter var38 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var38, true);
    com.google.javascript.rhino.jstype.JSType var41 = null;
    boolean var43 = var40.canPropertyBeDefined(var41, "hi!");
    boolean var45 = var40.hasNamespace("");
    com.google.javascript.rhino.jstype.FunctionBuilder var46 = new com.google.javascript.rhino.jstype.FunctionBuilder(var40);
    com.google.javascript.rhino.jstype.FunctionBuilder var48 = var46.withName("NUMBER 10.0\n");
    com.google.javascript.rhino.ErrorReporter var49 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var49, true);
    com.google.javascript.rhino.jstype.ObjectType var52 = var51.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var53 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var53, true);
    com.google.javascript.rhino.jstype.ObjectType var56 = var55.createAnonymousObjectType();
    boolean var57 = var56.isUnknownType();
    boolean var58 = var52.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var56);
    boolean var59 = var56.isFunctionPrototypeType();
    com.google.javascript.rhino.jstype.FunctionBuilder var61 = var48.withReturnType((com.google.javascript.rhino.jstype.JSType)var56, true);
    com.google.javascript.rhino.Node var63 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var65 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var66 = var63.useSourceInfoIfMissingFrom(var65);
    com.google.javascript.rhino.Node var68 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var69 = com.google.javascript.rhino.IR.eq(var65, var68);
    com.google.javascript.rhino.Node var70 = var65.cloneNode();
    boolean var71 = var70.isOr();
    com.google.javascript.rhino.jstype.StaticSourceFile var72 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var70);
    boolean var73 = var70.isDec();
    boolean var74 = var70.isFor();
    boolean var75 = var70.isNoSideEffectsCall();
    com.google.javascript.rhino.jstype.FunctionType var76 = var22.createFunctionType((com.google.javascript.rhino.jstype.JSType)var56, var70);
    boolean var77 = var76.isReturnTypeInferred();
    int var78 = var76.getMaxArguments();
    com.google.javascript.rhino.jstype.JSType var79 = null;
    com.google.javascript.rhino.jstype.FunctionType var80 = var2.createFunctionTypeWithNewReturnType(var76, var79);
    boolean var82 = var76.isPropertyInExterns("function (): {909579166}");
    com.google.javascript.rhino.jstype.JSType var84 = var76.getPropertyType("module$Node tree inequality:\nTree1:\nNUMBER 10.0\n\n\nTree2:\nEQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nSubtree1: NUMBER 10.0\n\n\nSubtree2: EQ\n    NUMBER 10.0\n    NUMBER 10.0\n");
    com.google.javascript.rhino.jstype.JSType var85 = var84.autobox();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test84"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.PropertyRenamingPolicy var1 = com.google.javascript.jscomp.PropertyRenamingPolicy.valueOf("ECMASCRIPT3");
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
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.SourceMap var2 = var1.getSourceMap();
//     com.google.javascript.rhino.Node var3 = var1.getRoot();
//     java.lang.String[] var4 = var1.toSourceArray();
// 
//   }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test86"); }


    com.google.javascript.jscomp.CodingConvention var0 = null;
    com.google.javascript.jscomp.ClosureCodingConvention var1 = new com.google.javascript.jscomp.ClosureCodingConvention(var0);
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = null;
    com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter var3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter((com.google.javascript.jscomp.CodingConvention)var1, var2);
    com.google.javascript.rhino.ErrorReporter var4 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var4, true);
    com.google.javascript.rhino.jstype.JSType var7 = null;
    boolean var9 = var6.canPropertyBeDefined(var7, "hi!");
    boolean var11 = var6.hasNamespace("");
    com.google.javascript.rhino.jstype.FunctionBuilder var12 = new com.google.javascript.rhino.jstype.FunctionBuilder(var6);
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.ErrorReporter var16 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var16, true);
    com.google.javascript.rhino.jstype.ObjectType var19 = var18.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var20 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var20, true);
    com.google.javascript.rhino.jstype.ObjectType var23 = var22.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var24 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var24, true);
    com.google.javascript.rhino.jstype.ObjectType var27 = var26.createAnonymousObjectType();
    boolean var28 = var27.isUnknownType();
    boolean var29 = var23.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var27);
    com.google.javascript.rhino.jstype.JSType var30 = var18.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType)var23);
    com.google.javascript.rhino.jstype.EnumType var31 = var6.createEnumType("Node tree inequality:\nTree1:\nNUMBER 10.0\n\n\nTree2:\nEQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nSubtree1: NUMBER 10.0\n\n\nSubtree2: EQ\n    NUMBER 10.0\n    NUMBER 10.0\n", var15, var30);
    com.google.javascript.jscomp.type.FlowScope var32 = null;
    com.google.javascript.jscomp.type.FlowScope var34 = var3.getPreciserScopeKnowingConditionOutcome(var15, var32, true);
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.empty();
    com.google.javascript.jscomp.DiagnosticType var42 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
    java.lang.String[] var44 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var45 = com.google.javascript.jscomp.JSError.make("", 1, 39, var42, var44);
    com.google.javascript.jscomp.CheckLevel var49 = null;
    com.google.javascript.jscomp.DiagnosticType var52 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
    com.google.javascript.jscomp.DiagnosticType var58 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
    java.lang.String[] var60 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var61 = com.google.javascript.jscomp.JSError.make("", 1, 39, var58, var60);
    com.google.javascript.jscomp.JSError var62 = com.google.javascript.jscomp.JSError.make("hi!", 100, 100, var49, var52, var60);
    com.google.javascript.jscomp.JSError var63 = com.google.javascript.jscomp.JSError.make("NUMBER 10.0\n", var36, var42, var60);
    boolean var64 = var36.isThis();
    boolean var65 = var36.isThrow();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var66 = com.google.javascript.rhino.IR.label(var15, var36);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
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

  public void test87() {}
//   public void test87() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test87"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.rhino.InputId var1 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, var1, false);
//     com.google.javascript.jscomp.JSModule var4 = var3.getModule();
//     java.lang.String var5 = var3.getName();
// 
//   }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test88"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setTweakToNumberLiteral("", 1);
    java.util.Set var4 = null;
    var0.setStripTypePrefixes(var4);
    var0.setGeneratePseudoNames(false);
    com.google.javascript.jscomp.SourceMap.DetailLevel var8 = null;
    var0.setSourceMapDetailLevel(var8);
    var0.setManageClosureDependencies(true);

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test89"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.VariableRenamingPolicy var1 = com.google.javascript.jscomp.VariableRenamingPolicy.valueOf("function (): {552562541}");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test90"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var1 = com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.valueOf("{723551193}");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test91"); }


    boolean var1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName("InputId: NUMBER 10.0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test92"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    var0.pushNodeAnnotations();
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

  }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test93"); }


    com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "goog.exportSymbol", "Node tree inequality:\nTree1:\nEXPR_RESULT\n    NUMBER 10.0\n\n\nTree2:\nCALL\n    EQ\n        NUMBER 10.0\n        NUMBER 10.0\n    OR\n        NUMBER 10.0\n        NUMBER 10.0\n\n\nSubtree1: EXPR_RESULT\n    NUMBER 10.0\n\n\nSubtree2: CALL\n    EQ\n        NUMBER 10.0\n        NUMBER 10.0\n    OR\n        NUMBER 10.0\n        NUMBER 10.0\n");
    com.google.javascript.jscomp.Region var5 = var3.getRegion(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test94"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setSourceMapOutputPath("hi!");
    var0.setIdeMode(false);
    com.google.javascript.jscomp.CompilerOptions.LanguageMode var5 = var0.getLanguageIn();
    com.google.javascript.jscomp.PropertyRenamingPolicy var6 = null;
    var0.setPropertyRenaming(var6);
    var0.setCommonJSModulePathPrefix("");
    com.google.javascript.jscomp.CodingConvention var10 = var0.getCodingConvention();
    var0.setOutputCharset("goog.exportSymbol");
    var0.setAmbiguateProperties(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test95() {}
//   public void test95() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test95"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.CompilerOptions var2 = new com.google.javascript.jscomp.CompilerOptions();
//     var2.setCrossModuleCodeMotion(false);
//     var2.setLabelRenaming(true);
//     java.util.Set var7 = null;
//     var2.setStripTypePrefixes(var7);
//     var1.initOptions(var2);
//     java.nio.charset.Charset var11 = null;
//     com.google.javascript.jscomp.SourceFile var12 = com.google.javascript.jscomp.SourceFile.fromFile("NUMBER 10.0", var11);
//     com.google.javascript.jscomp.Region var14 = var12.getRegion(100);
//     java.lang.String var15 = var12.toString();
//     com.google.javascript.rhino.Node var16 = var1.parse(var12);
//     com.google.javascript.jscomp.CompilerInput var18 = var1.newExternInput("ECMASCRIPT3");
// 
//   }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test96"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var2 = com.google.javascript.rhino.ScriptRuntime.escapeString("{2028411030}", '4');
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test97"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setTweakToNumberLiteral("", 1);
    var0.setInlineVariables(false);
    com.google.javascript.jscomp.CompilerOptions.TracerMode var6 = var0.getTracerMode();
    var0.setPrintInputDelimiter(false);
    var0.setCheckMissingGetCssNameBlacklist("");
    var0.setCollapseObjectLiterals(false);
    var0.setLooseTypes(true);
    var0.setCollapsePropertiesOnExternTypes(false);
    var0.setSyntheticBlockEndMarker("{1459695149}");
    var0.setAliasStringsBlacklist("Node tree inequality:\nTree1:\nNUMBER 10.0\n\n\nTree2:\nEQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nSubtree1: NUMBER 10.0\n\n\nSubtree2: EQ\n    NUMBER 10.0\n    NUMBER 10.0\n");
    var0.setDevirtualizePrototypeMethods(true);
    var0.setRenamePrefix("module$");
    com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler var25 = var0.getAliasTransformationHandler();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test98"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setTweakToNumberLiteral("", 1);
    java.util.Set var4 = null;
    var0.setStripTypePrefixes(var4);
    com.google.javascript.jscomp.VariableRenamingPolicy var6 = null;
    var0.setVariableRenaming(var6);
    com.google.javascript.jscomp.CssRenamingMap var8 = null;
    var0.setCssRenamingMap(var8);

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test99"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.number(10.0d);
    boolean var2 = var1.isLabel();
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var7 = var4.useSourceInfoIfMissingFrom(var6);
    boolean var8 = var6.isFalse();
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.sheq(var1, var6);
    java.lang.Iterable var10 = var6.siblings();
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var15 = var12.useSourceInfoIfMissingFrom(var14);
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.eq(var14, var17);
    com.google.javascript.rhino.Node var19 = var14.cloneNode();
    boolean var20 = var14.isDelProp();
    boolean var21 = var14.isIf();
    java.lang.String var22 = var14.toString();
    boolean var23 = var6.isEquivalentToTyped(var14);
    var14.putIntProp(0, (-1));
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.number(10.0d);
    boolean var29 = var28.isLabel();
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var34 = var31.useSourceInfoIfMissingFrom(var33);
    boolean var35 = var33.isFalse();
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.sheq(var28, var33);
    java.lang.Iterable var37 = var33.siblings();
    com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var42 = var39.useSourceInfoIfMissingFrom(var41);
    com.google.javascript.rhino.Node var44 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.IR.eq(var41, var44);
    com.google.javascript.rhino.Node var46 = var41.cloneNode();
    boolean var47 = var41.isDelProp();
    boolean var48 = var41.isIf();
    java.lang.String var49 = var41.toString();
    boolean var50 = var33.isEquivalentToTyped(var41);
    boolean var52 = var41.getBooleanProp(100);
    com.google.javascript.rhino.Node var54 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var56 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var57 = var54.useSourceInfoIfMissingFrom(var56);
    com.google.javascript.rhino.Node var59 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var60 = com.google.javascript.rhino.IR.eq(var56, var59);
    com.google.javascript.rhino.Node var61 = var56.cloneNode();
    boolean var62 = var56.isDelProp();
    boolean var63 = var56.isIf();
    java.lang.String var64 = var56.toString();
    boolean var65 = var56.isArrayLit();
    com.google.javascript.rhino.ErrorReporter var66 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var66, true);
    com.google.javascript.rhino.jstype.JSType var69 = null;
    boolean var71 = var68.canPropertyBeDefined(var69, "hi!");
    boolean var73 = var68.hasNamespace("");
    com.google.javascript.rhino.jstype.FunctionBuilder var74 = new com.google.javascript.rhino.jstype.FunctionBuilder(var68);
    com.google.javascript.rhino.Node var77 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.ErrorReporter var78 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var80 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var78, true);
    com.google.javascript.rhino.jstype.ObjectType var81 = var80.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var82 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var84 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var82, true);
    com.google.javascript.rhino.jstype.ObjectType var85 = var84.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var86 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var88 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var86, true);
    com.google.javascript.rhino.jstype.ObjectType var89 = var88.createAnonymousObjectType();
    boolean var90 = var89.isUnknownType();
    boolean var91 = var85.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var89);
    com.google.javascript.rhino.jstype.JSType var92 = var80.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType)var85);
    com.google.javascript.rhino.jstype.EnumType var93 = var68.createEnumType("Node tree inequality:\nTree1:\nNUMBER 10.0\n\n\nTree2:\nEQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nSubtree1: NUMBER 10.0\n\n\nSubtree2: EQ\n    NUMBER 10.0\n    NUMBER 10.0\n", var77, var92);
    com.google.javascript.rhino.Node var94 = var56.copyInformationFrom(var77);
    com.google.javascript.rhino.Node var95 = var41.useSourceInfoIfMissingFromForTree(var94);
    boolean var96 = var95.isUnscopedQualifiedName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var97 = com.google.javascript.rhino.IR.eq(var14, var95);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
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
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "NUMBER 10.0"+ "'", var22.equals("NUMBER 10.0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "NUMBER 10.0"+ "'", var49.equals("NUMBER 10.0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
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
    assertTrue("'" + var64 + "' != '" + "NUMBER 10.0"+ "'", var64.equals("NUMBER 10.0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == false);
    
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

  }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test100"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.PropertyRenamingPolicy var1 = com.google.javascript.jscomp.PropertyRenamingPolicy.valueOf("function (): {909579166}");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test101"); }


    com.google.javascript.jscomp.SourceAst var0 = null;
    com.google.javascript.rhino.InputId var1 = null;
    com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, var1, false);
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

  public void test102() {}
//   public void test102() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test102"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
//     com.google.javascript.rhino.jstype.ObjectType var3 = var2.createAnonymousObjectType();
//     com.google.javascript.rhino.ErrorReporter var4 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var4, true);
//     com.google.javascript.rhino.jstype.ObjectType var7 = var6.createAnonymousObjectType();
//     com.google.javascript.rhino.ErrorReporter var8 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var8, true);
//     com.google.javascript.rhino.jstype.ObjectType var11 = var10.createAnonymousObjectType();
//     boolean var12 = var11.isUnknownType();
//     boolean var13 = var7.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var11);
//     com.google.javascript.rhino.jstype.JSType var14 = var2.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType)var7);
//     boolean var15 = var7.isBooleanValueType();
//     boolean var16 = var7.isNumber();
//     var7.clearCachedValues();
//     boolean var18 = var7.isObject();
//     com.google.javascript.rhino.jstype.JSType var19 = null;
//     com.google.javascript.rhino.jstype.JSType var20 = var7.getGreatestSubtype(var19);
// 
//   }

  public void test103() {}
//   public void test103() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test103"); }
// 
// 
//     com.google.javascript.jscomp.CodingConvention var0 = null;
//     com.google.javascript.jscomp.ClosureCodingConvention var1 = new com.google.javascript.jscomp.ClosureCodingConvention(var0);
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = null;
//     com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter var3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter((com.google.javascript.jscomp.CodingConvention)var1, var2);
//     com.google.javascript.jscomp.ClosureCodingConvention var4 = new com.google.javascript.jscomp.ClosureCodingConvention((com.google.javascript.jscomp.CodingConvention)var1);
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var9 = var6.useSourceInfoIfMissingFrom(var8);
//     com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.eq(var8, var11);
//     com.google.javascript.rhino.Node var13 = var8.cloneNode();
//     boolean var14 = var13.isOr();
//     com.google.javascript.rhino.jstype.StaticSourceFile var15 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var13);
//     boolean var16 = var13.isDec();
//     boolean var17 = var13.isFor();
//     boolean var18 = var1.isVarArgsParameter(var13);
//     java.lang.String var19 = var1.getExportSymbolFunction();
//     com.google.javascript.rhino.Node var20 = null;
//     boolean var21 = var1.isPrototypeAlias(var20);
//     boolean var23 = var1.isValidEnumKey("{2028411030}");
// 
//   }

  public void test104() {}
//   public void test104() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test104"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var4 = var1.useSourceInfoIfMissingFrom(var3);
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.eq(var3, var6);
//     com.google.javascript.rhino.Node var8 = var3.cloneNode();
//     boolean var9 = var8.isOr();
//     com.google.javascript.rhino.jstype.StaticSourceFile var10 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var8);
//     boolean var11 = var8.isDec();
//     boolean var12 = var8.isFor();
//     boolean var13 = var8.isNoSideEffectsCall();
//     boolean var14 = var8.isOptionalArg();
//     boolean var15 = var8.isAdd();
//     java.lang.String var16 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(var8);
// 
//   }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test105"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0\n", "NUMBER 10.0\n");
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var7 = var4.useSourceInfoIfMissingFrom(var6);
    boolean var8 = var6.isSetterDef();
    boolean var9 = var6.isNoSideEffectsCall();
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var14 = var11.useSourceInfoIfMissingFrom(var13);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.eq(var13, var16);
    com.google.javascript.rhino.Node var18 = var13.cloneNode();
    boolean var19 = var18.isOr();
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var24 = var21.useSourceInfoIfMissingFrom(var23);
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.eq(var23, var26);
    com.google.javascript.rhino.Node var28 = var23.cloneNode();
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.or(var18, var28);
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.voidNode(var29);
    com.google.javascript.rhino.Node var31 = var6.srcref(var29);
    boolean var32 = var2.equals((java.lang.Object)var29);
    com.google.javascript.rhino.jstype.JSType var33 = var29.getJSType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var34 = com.google.javascript.rhino.IR.breakNode(var29);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test106"); }


    com.google.javascript.jscomp.parsing.Config.LanguageMode var1 = null;
    com.google.javascript.jscomp.parsing.Config var3 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig(false, var1, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test107"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.jscomp.LightweightMessageFormatter var2 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
    com.google.javascript.jscomp.Compiler.IntermediateState var3 = var1.getState();
    double var4 = var1.getProgress();
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var9 = var6.useSourceInfoIfMissingFrom(var8);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.eq(var8, var11);
    com.google.javascript.rhino.Node var13 = var11.cloneNode();
    var13.setCharno(10);
    com.google.javascript.jscomp.NodeTraversal.Callback var16 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.NodeTraversal.traverse((com.google.javascript.jscomp.AbstractCompiler)var1, var13, var16);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
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
    assertNotNull(var13);

  }

  public void test108() {}
//   public void test108() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test108"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.rhino.InputId var1 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, var1, true);
//     com.google.javascript.jscomp.JSModule var4 = var3.getModule();
//     com.google.javascript.jscomp.JSModule var5 = null;
//     var3.setModule(var5);
//     java.lang.String var7 = var3.getName();
// 
//   }

  public void test109() {}
//   public void test109() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test109"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
//     com.google.javascript.rhino.ErrorReporter var3 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var3, true);
//     com.google.javascript.rhino.jstype.ObjectType var6 = var5.createAnonymousObjectType();
//     com.google.javascript.rhino.ErrorReporter var7 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7, true);
//     com.google.javascript.rhino.jstype.ObjectType var10 = var9.createAnonymousObjectType();
//     boolean var11 = var10.isUnknownType();
//     boolean var12 = var6.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var10);
//     boolean var13 = var10.isFunctionPrototypeType();
//     var10.clearCachedValues();
//     com.google.javascript.rhino.jstype.ObjectType var15 = var10.dereference();
//     com.google.javascript.rhino.jstype.JSType[] var16 = new com.google.javascript.rhino.jstype.JSType[] { var15};
//     com.google.javascript.rhino.jstype.JSType var17 = var2.createUnionType(var16);
//     com.google.javascript.rhino.ErrorReporter var18 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var18, true);
//     com.google.javascript.rhino.jstype.JSType var21 = null;
//     boolean var23 = var20.canPropertyBeDefined(var21, "hi!");
//     boolean var25 = var20.hasNamespace("");
//     com.google.javascript.rhino.jstype.FunctionBuilder var26 = new com.google.javascript.rhino.jstype.FunctionBuilder(var20);
//     com.google.javascript.rhino.jstype.FunctionBuilder var28 = var26.withName("NUMBER 10.0\n");
//     com.google.javascript.rhino.ErrorReporter var29 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var29, true);
//     com.google.javascript.rhino.jstype.ObjectType var32 = var31.createAnonymousObjectType();
//     com.google.javascript.rhino.ErrorReporter var33 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var33, true);
//     com.google.javascript.rhino.jstype.ObjectType var36 = var35.createAnonymousObjectType();
//     boolean var37 = var36.isUnknownType();
//     boolean var38 = var32.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var36);
//     boolean var39 = var36.isFunctionPrototypeType();
//     com.google.javascript.rhino.jstype.FunctionBuilder var41 = var28.withReturnType((com.google.javascript.rhino.jstype.JSType)var36, true);
//     com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var46 = var43.useSourceInfoIfMissingFrom(var45);
//     com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.eq(var45, var48);
//     com.google.javascript.rhino.Node var50 = var45.cloneNode();
//     boolean var51 = var50.isOr();
//     com.google.javascript.rhino.jstype.StaticSourceFile var52 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var50);
//     boolean var53 = var50.isDec();
//     boolean var54 = var50.isFor();
//     boolean var55 = var50.isNoSideEffectsCall();
//     com.google.javascript.rhino.jstype.FunctionType var56 = var2.createFunctionType((com.google.javascript.rhino.jstype.JSType)var36, var50);
//     int var57 = var56.getExtendedInterfacesCount();
//     com.google.javascript.rhino.ErrorReporter var58 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var58, true);
//     com.google.javascript.rhino.jstype.ObjectType var61 = var60.createAnonymousObjectType();
//     com.google.javascript.rhino.ErrorReporter var62 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var62, true);
//     com.google.javascript.rhino.jstype.ObjectType var65 = var64.createAnonymousObjectType();
//     boolean var66 = var65.isUnknownType();
//     boolean var67 = var61.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var65);
//     boolean var68 = var61.isStringValueType();
//     com.google.javascript.rhino.jstype.ObjectType var69 = var61.dereference();
//     var56.setPrototypeBasedOn(var69);
//     com.google.javascript.rhino.Node var72 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var74 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var75 = var72.useSourceInfoIfMissingFrom(var74);
//     com.google.javascript.rhino.Node var77 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var78 = com.google.javascript.rhino.IR.eq(var74, var77);
//     com.google.javascript.rhino.Node var79 = var74.cloneNode();
//     com.google.javascript.rhino.Node var81 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var83 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var84 = var81.useSourceInfoIfMissingFrom(var83);
//     com.google.javascript.rhino.Node var86 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var88 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var89 = var86.useSourceInfoIfMissingFrom(var88);
//     com.google.javascript.rhino.Node var90 = com.google.javascript.rhino.IR.exprResult(var89);
//     java.lang.String var91 = var83.checkTreeEquals(var89);
//     com.google.javascript.rhino.Node var92 = var74.srcref(var83);
//     var56.setSource(var92);
//     com.google.javascript.rhino.jstype.JSType var94 = null;
//     boolean var95 = var56.differsFrom(var94);
// 
//   }

  public void test110() {}
//   public void test110() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test110"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var2 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
//     java.io.PrintStream var3 = null;
//     com.google.javascript.jscomp.PrintStreamErrorManager var4 = new com.google.javascript.jscomp.PrintStreamErrorManager((com.google.javascript.jscomp.MessageFormatter)var2, var3);
//     java.io.PrintStream var5 = null;
//     com.google.javascript.jscomp.PrintStreamErrorManager var6 = new com.google.javascript.jscomp.PrintStreamErrorManager((com.google.javascript.jscomp.MessageFormatter)var2, var5);
//     com.google.javascript.jscomp.CheckLevel var10 = null;
//     com.google.javascript.jscomp.DiagnosticType var13 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0\n", "NUMBER 10.0\n");
//     com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var18 = var15.useSourceInfoIfMissingFrom(var17);
//     boolean var19 = var17.isSetterDef();
//     boolean var20 = var17.isNoSideEffectsCall();
//     com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var25 = var22.useSourceInfoIfMissingFrom(var24);
//     com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.eq(var24, var27);
//     com.google.javascript.rhino.Node var29 = var24.cloneNode();
//     boolean var30 = var29.isOr();
//     com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var34 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var35 = var32.useSourceInfoIfMissingFrom(var34);
//     com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.IR.eq(var34, var37);
//     com.google.javascript.rhino.Node var39 = var34.cloneNode();
//     com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.IR.or(var29, var39);
//     com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.IR.voidNode(var40);
//     com.google.javascript.rhino.Node var42 = var17.srcref(var40);
//     boolean var43 = var13.equals((java.lang.Object)var40);
//     com.google.javascript.jscomp.DiagnosticType var49 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
//     java.lang.String[] var51 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var52 = com.google.javascript.jscomp.JSError.make("", 1, 39, var49, var51);
//     com.google.javascript.jscomp.JSError var53 = com.google.javascript.jscomp.JSError.make("Node tree inequality:\nTree1:\nEQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nTree2:\nNUMBER 10.0\n\n\nSubtree1: EQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nSubtree2: NUMBER 10.0\n", 100, (-1), var10, var13, var51);
//     java.lang.String var54 = var2.formatError(var53);
// 
//   }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test111"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setCrossModuleCodeMotion(false);
    com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var3 = null;
    var0.setAnonymousFunctionNaming(var3);
    var0.setExtractPrototypeMemberDeclarations(true);
    var0.setRemoveClosureAsserts(false);
    var0.setAliasExternals(false);
    var0.setCollapseProperties(false);
    var0.skipAllCompilerPasses();

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test112"); }


    com.google.javascript.rhino.JSDocInfoBuilder var1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    boolean var2 = var1.recordOverride();
    java.util.Set var3 = null;
    boolean var4 = var1.recordModifies(var3);
    boolean var6 = var1.recordMeaning("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test113"); }


    com.google.javascript.rhino.JSDocInfoBuilder var1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
    java.nio.charset.Charset var4 = null;
    com.google.javascript.jscomp.SourceFile var5 = com.google.javascript.jscomp.SourceFile.fromFile("NUMBER 10.0", var4);
    var1.markName("{1459695149}", (com.google.javascript.rhino.jstype.StaticSourceFile)var5, 10, 39);
    boolean var10 = var1.recordBlockDescription("NUMBER 10.0");
    boolean var11 = var1.recordNoAlias();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test114() {}
//   public void test114() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test114"); }
// 
// 
//     com.google.javascript.jscomp.CodingConvention var0 = null;
//     com.google.javascript.rhino.Node var2 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(var0, "goog.exportSymbol");
// 
//   }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test115"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.ErrorReporter var3 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var3, true);
    com.google.javascript.rhino.jstype.ObjectType var6 = var5.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var7 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7, true);
    com.google.javascript.rhino.jstype.ObjectType var10 = var9.createAnonymousObjectType();
    boolean var11 = var10.isUnknownType();
    boolean var12 = var6.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var10);
    boolean var13 = var10.isFunctionPrototypeType();
    var10.clearCachedValues();
    com.google.javascript.rhino.jstype.ObjectType var15 = var10.dereference();
    com.google.javascript.rhino.jstype.JSType[] var16 = new com.google.javascript.rhino.jstype.JSType[] { var15};
    com.google.javascript.rhino.jstype.JSType var17 = var2.createUnionType(var16);
    com.google.javascript.rhino.ErrorReporter var18 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var18, true);
    com.google.javascript.rhino.jstype.JSType var21 = null;
    boolean var23 = var20.canPropertyBeDefined(var21, "hi!");
    boolean var25 = var20.hasNamespace("");
    com.google.javascript.rhino.jstype.FunctionBuilder var26 = new com.google.javascript.rhino.jstype.FunctionBuilder(var20);
    com.google.javascript.rhino.jstype.FunctionBuilder var28 = var26.withName("NUMBER 10.0\n");
    com.google.javascript.rhino.ErrorReporter var29 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var29, true);
    com.google.javascript.rhino.jstype.ObjectType var32 = var31.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var33 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var33, true);
    com.google.javascript.rhino.jstype.ObjectType var36 = var35.createAnonymousObjectType();
    boolean var37 = var36.isUnknownType();
    boolean var38 = var32.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var36);
    boolean var39 = var36.isFunctionPrototypeType();
    com.google.javascript.rhino.jstype.FunctionBuilder var41 = var28.withReturnType((com.google.javascript.rhino.jstype.JSType)var36, true);
    com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var46 = var43.useSourceInfoIfMissingFrom(var45);
    com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.eq(var45, var48);
    com.google.javascript.rhino.Node var50 = var45.cloneNode();
    boolean var51 = var50.isOr();
    com.google.javascript.rhino.jstype.StaticSourceFile var52 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var50);
    boolean var53 = var50.isDec();
    boolean var54 = var50.isFor();
    boolean var55 = var50.isNoSideEffectsCall();
    com.google.javascript.rhino.jstype.FunctionType var56 = var2.createFunctionType((com.google.javascript.rhino.jstype.JSType)var36, var50);
    int var57 = var56.getExtendedInterfacesCount();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.jstype.FunctionType var58 = var56.getSuperClassConstructor();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
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
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0);

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test116"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var3 = null;
    boolean var5 = var2.canPropertyBeDefined(var3, "hi!");
    boolean var7 = var2.hasNamespace("");
    com.google.javascript.rhino.jstype.FunctionBuilder var8 = new com.google.javascript.rhino.jstype.FunctionBuilder(var2);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var14 = var11.useSourceInfoIfMissingFrom(var13);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.eq(var13, var16);
    com.google.javascript.rhino.Node var18 = var13.cloneNode();
    boolean var19 = var18.isOr();
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var24 = var21.useSourceInfoIfMissingFrom(var23);
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.eq(var23, var26);
    com.google.javascript.rhino.Node var28 = var23.cloneNode();
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.or(var18, var28);
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.voidNode(var29);
    com.google.javascript.rhino.Node var31 = var30.getFirstChild();
    com.google.javascript.rhino.Node var32 = var31.getLastSibling();
    com.google.javascript.rhino.ErrorReporter var33 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var33, true);
    com.google.javascript.rhino.jstype.ObjectType var36 = var35.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var37 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var37, true);
    com.google.javascript.rhino.jstype.ObjectType var40 = var39.createAnonymousObjectType();
    boolean var41 = var40.isUnknownType();
    boolean var42 = var36.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var40);
    boolean var43 = var40.isFunctionPrototypeType();
    var40.clearCachedValues();
    com.google.javascript.rhino.jstype.ObjectType var45 = var40.dereference();
    boolean var46 = var40.isFunctionPrototypeType();
    com.google.javascript.rhino.jstype.ObjectType var47 = var2.createObjectType("null(null)", var32, var40);
    boolean var48 = var47.isInstanceType();
    com.google.javascript.rhino.Node var49 = var47.getRootNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
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
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test117"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithNodeAnnotations();
    java.util.List var1 = var0.getGraphvizNodes();
    com.google.javascript.rhino.ErrorReporter var2 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2, true);
    com.google.javascript.rhino.jstype.JSType var5 = null;
    boolean var7 = var4.canPropertyBeDefined(var5, "hi!");
    boolean var9 = var4.hasNamespace("");
    com.google.javascript.rhino.jstype.FunctionBuilder var10 = new com.google.javascript.rhino.jstype.FunctionBuilder(var4);
    com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode var11 = null;
    var4.setResolveMode(var11);
    com.google.javascript.rhino.ErrorReporter var13 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var13, true);
    com.google.javascript.rhino.jstype.ObjectType var16 = var15.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var17 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var17, true);
    com.google.javascript.rhino.jstype.ObjectType var20 = var19.createAnonymousObjectType();
    boolean var21 = var20.isUnknownType();
    boolean var22 = var16.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var20);
    boolean var23 = var16.isBooleanValueType();
    com.google.javascript.rhino.ErrorReporter var24 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var24, true);
    com.google.javascript.rhino.ErrorReporter var27 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var27, true);
    com.google.javascript.rhino.jstype.ObjectType var30 = var29.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var31 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var31, true);
    com.google.javascript.rhino.jstype.ObjectType var34 = var33.createAnonymousObjectType();
    boolean var35 = var34.isUnknownType();
    boolean var36 = var30.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var34);
    boolean var37 = var34.isFunctionPrototypeType();
    var34.clearCachedValues();
    com.google.javascript.rhino.jstype.ObjectType var39 = var34.dereference();
    com.google.javascript.rhino.jstype.JSType[] var40 = new com.google.javascript.rhino.jstype.JSType[] { var39};
    com.google.javascript.rhino.jstype.JSType var41 = var26.createUnionType(var40);
    com.google.javascript.rhino.ErrorReporter var42 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var42, true);
    com.google.javascript.rhino.jstype.JSType var45 = null;
    boolean var47 = var44.canPropertyBeDefined(var45, "hi!");
    boolean var49 = var44.hasNamespace("");
    com.google.javascript.rhino.jstype.FunctionBuilder var50 = new com.google.javascript.rhino.jstype.FunctionBuilder(var44);
    com.google.javascript.rhino.jstype.FunctionBuilder var52 = var50.withName("NUMBER 10.0\n");
    com.google.javascript.rhino.ErrorReporter var53 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var53, true);
    com.google.javascript.rhino.jstype.ObjectType var56 = var55.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var57 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var57, true);
    com.google.javascript.rhino.jstype.ObjectType var60 = var59.createAnonymousObjectType();
    boolean var61 = var60.isUnknownType();
    boolean var62 = var56.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var60);
    boolean var63 = var60.isFunctionPrototypeType();
    com.google.javascript.rhino.jstype.FunctionBuilder var65 = var52.withReturnType((com.google.javascript.rhino.jstype.JSType)var60, true);
    com.google.javascript.rhino.Node var67 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var69 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var70 = var67.useSourceInfoIfMissingFrom(var69);
    com.google.javascript.rhino.Node var72 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var73 = com.google.javascript.rhino.IR.eq(var69, var72);
    com.google.javascript.rhino.Node var74 = var69.cloneNode();
    boolean var75 = var74.isOr();
    com.google.javascript.rhino.jstype.StaticSourceFile var76 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var74);
    boolean var77 = var74.isDec();
    boolean var78 = var74.isFor();
    boolean var79 = var74.isNoSideEffectsCall();
    com.google.javascript.rhino.jstype.FunctionType var80 = var26.createFunctionType((com.google.javascript.rhino.jstype.JSType)var60, var74);
    boolean var81 = var16.differsFrom((com.google.javascript.rhino.jstype.JSType)var60);
    com.google.javascript.rhino.Node var83 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var85 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var86 = var83.useSourceInfoIfMissingFrom(var85);
    com.google.javascript.rhino.Node var88 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var90 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var91 = var88.useSourceInfoIfMissingFrom(var90);
    com.google.javascript.rhino.Node var92 = com.google.javascript.rhino.IR.exprResult(var91);
    java.lang.String var93 = var85.checkTreeEquals(var91);
    com.google.javascript.rhino.jstype.FunctionType var94 = var4.createFunctionType((com.google.javascript.rhino.jstype.JSType)var60, var91);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var95 = var0.getDirectedSuccNodes((java.lang.Object)var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
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
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);

  }

  public void test118() {}
//   public void test118() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test118"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.rhino.InputId var1 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, var1, true);
//     com.google.javascript.jscomp.SourceAst var4 = var3.getAst();
//     boolean var5 = var3.isExtern();
//     com.google.javascript.jscomp.JSModule var6 = var3.getModule();
//     com.google.javascript.jscomp.SourceAst var7 = var3.getAst();
//     com.google.javascript.jscomp.AbstractCompiler var8 = null;
//     com.google.javascript.rhino.Node var9 = var3.getAstRoot(var8);
// 
//   }

  public void test119() {}
//   public void test119() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test119"); }
// 
// 
//     com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
//     var0.setTweakToNumberLiteral("", 1);
//     var0.setInlineVariables(false);
//     var0.setOptimizeParameters(true);
//     var0.setReportPath("");
//     com.google.javascript.jscomp.DependencyOptions var10 = null;
//     var0.setDependencyOptions(var10);
// 
//   }

  public void test120() {}
//   public void test120() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test120"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     double var2 = var1.getProgress();
//     java.lang.String var5 = var1.getSourceLine("module$Node tree inequality:\\nTree1:\\nNUMBER 10.0\\n\\n\\nTree2:\\nEQ\\n    NUMBER 10.0\\n    NUMBER 10.0\\n\\n\\nSubtree1: NUMBER 10.0\\n\\n\\nSubtree2: EQ\\n    NUMBER 10.0\\n    NUMBER 10.0\\n", (-1));
//     var1.rebuildInputsFromModules();
// 
//   }

  public void test121() {}
//   public void test121() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test121"); }
// 
// 
//     com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
//     var0.setTweakToNumberLiteral("", 1);
//     java.util.Set var4 = null;
//     var0.setStripTypePrefixes(var4);
//     com.google.javascript.jscomp.DiagnosticGroup var6 = null;
//     com.google.javascript.jscomp.CheckLevel var7 = null;
//     com.google.javascript.jscomp.DiagnosticGroupWarningsGuard var8 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(var6, var7);
//     var0.addWarningsGuard((com.google.javascript.jscomp.WarningsGuard)var8);
//     com.google.javascript.jscomp.CheckLevel var13 = null;
//     com.google.javascript.jscomp.DiagnosticType var16 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
//     com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.empty();
//     com.google.javascript.jscomp.DiagnosticType var24 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
//     java.lang.String[] var26 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var27 = com.google.javascript.jscomp.JSError.make("", 1, 39, var24, var26);
//     com.google.javascript.jscomp.CheckLevel var31 = null;
//     com.google.javascript.jscomp.DiagnosticType var34 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
//     com.google.javascript.jscomp.DiagnosticType var40 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
//     java.lang.String[] var42 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var43 = com.google.javascript.jscomp.JSError.make("", 1, 39, var40, var42);
//     com.google.javascript.jscomp.JSError var44 = com.google.javascript.jscomp.JSError.make("hi!", 100, 100, var31, var34, var42);
//     com.google.javascript.jscomp.JSError var45 = com.google.javascript.jscomp.JSError.make("NUMBER 10.0\n", var18, var24, var42);
//     com.google.javascript.jscomp.JSError var46 = com.google.javascript.jscomp.JSError.make("NUMBER 10.0\n", 0, 0, var13, var16, var42);
//     com.google.javascript.jscomp.CheckLevel var47 = var8.level(var46);
// 
//   }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test122"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CompilationLevel var1 = com.google.javascript.jscomp.CompilationLevel.valueOf("function (): {14479148}");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test123"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var4 = var1.useSourceInfoIfMissingFrom(var3);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.eq(var3, var6);
    com.google.javascript.rhino.Node var8 = var3.cloneNode();
    boolean var9 = var8.isOr();
    com.google.javascript.rhino.jstype.StaticSourceFile var10 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var8);
    boolean var11 = var8.isDec();
    boolean var12 = var8.isFor();
    boolean var13 = var8.isNoSideEffectsCall();
    boolean var14 = var8.isOptionalArg();
    boolean var15 = var8.isAdd();
    com.google.javascript.rhino.JSDocInfoBuilder var17 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    boolean var18 = var17.recordOverride();
    java.util.Set var19 = null;
    boolean var20 = var17.recordModifies(var19);
    java.util.Set var21 = null;
    boolean var22 = var17.recordModifies(var21);
    boolean var23 = var17.recordHiddenness();
    boolean var24 = var17.recordConstructor();
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var29 = var26.useSourceInfoIfMissingFrom(var28);
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.IR.eq(var28, var31);
    com.google.javascript.rhino.Node var33 = var28.cloneNode();
    boolean var34 = var33.isOr();
    com.google.javascript.rhino.jstype.StaticSourceFile var35 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var33);
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.returnNode(var33);
    var17.markTypeNode(var33, (-1), 100, 0, (-1), false);
    com.google.javascript.jscomp.CodingConvention var43 = null;
    com.google.javascript.jscomp.ClosureCodingConvention var44 = new com.google.javascript.jscomp.ClosureCodingConvention(var43);
    com.google.javascript.rhino.jstype.JSTypeRegistry var45 = null;
    com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter var46 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter((com.google.javascript.jscomp.CodingConvention)var44, var45);
    com.google.javascript.jscomp.ClosureCodingConvention var47 = new com.google.javascript.jscomp.ClosureCodingConvention((com.google.javascript.jscomp.CodingConvention)var44);
    com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var52 = var49.useSourceInfoIfMissingFrom(var51);
    com.google.javascript.rhino.Node var54 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var55 = com.google.javascript.rhino.IR.eq(var51, var54);
    com.google.javascript.rhino.Node var56 = var51.cloneNode();
    boolean var57 = var56.isOr();
    com.google.javascript.rhino.jstype.StaticSourceFile var58 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var56);
    boolean var59 = var56.isDec();
    boolean var60 = var56.isFor();
    boolean var61 = var44.isVarArgsParameter(var56);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.addChildBefore(var33, var56);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test124"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setSourceMapOutputPath("hi!");
    var0.setIdeMode(false);
    java.util.Set var5 = null;
    var0.setReplaceStringsReservedStrings(var5);
    var0.resetWarningsGuard();
    com.google.javascript.jscomp.CompilerOptions var8 = new com.google.javascript.jscomp.CompilerOptions();
    var8.setTweakToNumberLiteral("", 1);
    var8.setInlineVariables(false);
    com.google.javascript.jscomp.CompilerOptions.TracerMode var14 = var8.getTracerMode();
    var0.setTracerMode(var14);
    java.lang.String var16 = var14.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "OFF"+ "'", var16.equals("OFF"));

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test125"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var4 = var1.useSourceInfoIfMissingFrom(var3);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.eq(var3, var6);
    com.google.javascript.rhino.Node var8 = var3.cloneNode();
    boolean var9 = var8.isOr();
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var14 = var11.useSourceInfoIfMissingFrom(var13);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.eq(var13, var16);
    com.google.javascript.rhino.Node var18 = var13.cloneNode();
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.or(var8, var18);
    boolean var20 = var19.isDelProp();
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.empty();
    com.google.javascript.jscomp.DiagnosticType var28 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
    java.lang.String[] var30 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var31 = com.google.javascript.jscomp.JSError.make("", 1, 39, var28, var30);
    com.google.javascript.jscomp.CheckLevel var35 = null;
    com.google.javascript.jscomp.DiagnosticType var38 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
    com.google.javascript.jscomp.DiagnosticType var44 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
    java.lang.String[] var46 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var47 = com.google.javascript.jscomp.JSError.make("", 1, 39, var44, var46);
    com.google.javascript.jscomp.JSError var48 = com.google.javascript.jscomp.JSError.make("hi!", 100, 100, var35, var38, var46);
    com.google.javascript.jscomp.JSError var49 = com.google.javascript.jscomp.JSError.make("NUMBER 10.0\n", var22, var28, var46);
    com.google.javascript.rhino.Node var50 = null;
    var19.addChildAfter(var22, var50);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var52 = com.google.javascript.rhino.IR.continueNode(var19);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
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

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test126"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var4 = var1.useSourceInfoIfMissingFrom(var3);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.eq(var3, var6);
    com.google.javascript.rhino.Node var8 = var3.cloneNode();
    boolean var9 = var8.isOr();
    com.google.javascript.rhino.jstype.StaticSourceFile var10 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var8);
    boolean var11 = var8.isDec();
    boolean var12 = var8.isBlock();
    boolean var13 = var8.isReturn();
    boolean var14 = var8.isParamList();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test127() {}
//   public void test127() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test127"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
//     com.google.javascript.rhino.jstype.ObjectType var3 = var2.createAnonymousObjectType();
//     com.google.javascript.rhino.ErrorReporter var4 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var4, true);
//     com.google.javascript.rhino.jstype.ObjectType var7 = var6.createAnonymousObjectType();
//     com.google.javascript.rhino.ErrorReporter var8 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var8, true);
//     com.google.javascript.rhino.jstype.ObjectType var11 = var10.createAnonymousObjectType();
//     boolean var12 = var11.isUnknownType();
//     boolean var13 = var7.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var11);
//     com.google.javascript.rhino.jstype.JSType var14 = var2.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType)var7);
//     boolean var15 = var7.isBooleanValueType();
//     java.lang.String var16 = var7.toDebugHashCodeString();
//     com.google.javascript.rhino.ErrorReporter var17 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var17, true);
//     com.google.javascript.rhino.jstype.ObjectType var20 = var19.createAnonymousObjectType();
//     com.google.javascript.rhino.ErrorReporter var21 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var21, true);
//     com.google.javascript.rhino.jstype.ObjectType var24 = var23.createAnonymousObjectType();
//     boolean var25 = var24.isUnknownType();
//     boolean var26 = var20.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var24);
//     boolean var27 = var24.isFunctionPrototypeType();
//     com.google.javascript.rhino.jstype.ObjectType var28 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType)var24);
//     boolean var30 = var28.hasOwnProperty("");
//     boolean var31 = var28.isEnumElementType();
//     com.google.javascript.rhino.jstype.JSType.TypePair var32 = var7.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType)var28);
//     boolean var33 = var28.isInterface();
//     java.lang.String var34 = var28.getDisplayName();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var3);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var11);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var14);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var16 + "' != '" + "{1967379894}"+ "'", var16.equals("{1967379894}"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var20);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var24);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var25 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var26 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var27 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var28);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var30 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var31 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var32);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var33 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var34);
// 
//   }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test128"); }


    com.google.javascript.rhino.JSDocInfoBuilder var1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
    java.nio.charset.Charset var4 = null;
    com.google.javascript.jscomp.SourceFile var5 = com.google.javascript.jscomp.SourceFile.fromFile("NUMBER 10.0", var4);
    var1.markName("{1459695149}", (com.google.javascript.rhino.jstype.StaticSourceFile)var5, 10, 39);
    boolean var9 = var1.isPopulatedWithFileOverview();
    boolean var11 = var1.addAuthor("");
    boolean var13 = var1.recordMeaning("module$null(null)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test129() {}
//   public void test129() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test129"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var4 = var1.useSourceInfoIfMissingFrom(var3);
//     com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.exprResult(var4);
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.block(var5);
//     boolean var7 = var5.isNew();
//     com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var12 = var9.useSourceInfoIfMissingFrom(var11);
//     com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var15 = var12.copyInformationFrom(var14);
//     com.google.javascript.rhino.Node var16 = var5.copyInformationFromForTree(var15);
//     boolean var17 = var15.isTry();
//     com.google.javascript.rhino.Node var18 = null;
//     com.google.javascript.rhino.Node var19 = var15.srcref(var18);
// 
//   }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test130"); }


    com.google.javascript.jscomp.ShowByPathWarningsGuard var1 = new com.google.javascript.jscomp.ShowByPathWarningsGuard("{505847021}");
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.empty();
    com.google.javascript.jscomp.DiagnosticType var9 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
    java.lang.String[] var11 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var12 = com.google.javascript.jscomp.JSError.make("", 1, 39, var9, var11);
    com.google.javascript.jscomp.CheckLevel var16 = null;
    com.google.javascript.jscomp.DiagnosticType var19 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
    com.google.javascript.jscomp.DiagnosticType var25 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
    java.lang.String[] var27 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var28 = com.google.javascript.jscomp.JSError.make("", 1, 39, var25, var27);
    com.google.javascript.jscomp.JSError var29 = com.google.javascript.jscomp.JSError.make("hi!", 100, 100, var16, var19, var27);
    com.google.javascript.jscomp.JSError var30 = com.google.javascript.jscomp.JSError.make("NUMBER 10.0\n", var3, var9, var27);
    com.google.javascript.jscomp.CheckLevel var31 = var1.level(var30);
    int var32 = var30.getNodeSourceOffset();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
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
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == (-1));

  }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test131"); }


    java.nio.charset.Charset var1 = null;
    com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromFile("NUMBER 10.0", var1);
    com.google.javascript.jscomp.Region var4 = var2.getRegion(100);
    var2.setOriginalPath("NUMBER 10.0\n");
    java.lang.String var7 = var2.getOriginalPath();
    com.google.javascript.jscomp.JsAst var8 = new com.google.javascript.jscomp.JsAst(var2);
    com.google.javascript.rhino.InputId var9 = var8.getInputId();
    com.google.javascript.jscomp.CompilerInput var11 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var8, true);
    com.google.javascript.jscomp.SourceFile var13 = new com.google.javascript.jscomp.SourceFile("hi!");
    java.lang.String var14 = var13.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.setSourceFile(var13);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "NUMBER 10.0\n"+ "'", var7.equals("NUMBER 10.0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test132() {}
//   public void test132() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test132"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.empty();
//     com.google.javascript.jscomp.DiagnosticType var7 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
//     java.lang.String[] var9 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var10 = com.google.javascript.jscomp.JSError.make("", 1, 39, var7, var9);
//     com.google.javascript.jscomp.CheckLevel var14 = null;
//     com.google.javascript.jscomp.DiagnosticType var17 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
//     com.google.javascript.jscomp.DiagnosticType var23 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
//     java.lang.String[] var25 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var26 = com.google.javascript.jscomp.JSError.make("", 1, 39, var23, var25);
//     com.google.javascript.jscomp.JSError var27 = com.google.javascript.jscomp.JSError.make("hi!", 100, 100, var14, var17, var25);
//     com.google.javascript.jscomp.JSError var28 = com.google.javascript.jscomp.JSError.make("NUMBER 10.0\n", var1, var7, var25);
//     com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.Node.newString(39, "EMPTY\n");
//     com.google.javascript.rhino.Node var32 = null;
//     var1.replaceChild(var31, var32);
// 
//   }

  public void test133() {}
//   public void test133() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test133"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
//     com.google.javascript.rhino.jstype.ObjectType var3 = var2.createAnonymousObjectType();
//     com.google.javascript.rhino.jstype.JSTypeNative var4 = null;
//     com.google.javascript.rhino.jstype.JSType var5 = var2.getNativeType(var4);
// 
//   }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test134"); }


    com.google.javascript.rhino.JSDocInfoBuilder var1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    com.google.javascript.rhino.JSDocInfo.Visibility var2 = null;
    boolean var3 = var1.recordVisibility(var2);
    boolean var4 = var1.recordOverride();
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var9 = var6.useSourceInfoIfMissingFrom(var8);
    boolean var10 = var8.isSetterDef();
    boolean var11 = var8.isNoSideEffectsCall();
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var16 = var13.useSourceInfoIfMissingFrom(var15);
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.eq(var15, var18);
    com.google.javascript.rhino.Node var20 = var15.cloneNode();
    boolean var21 = var20.isOr();
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var26 = var23.useSourceInfoIfMissingFrom(var25);
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.eq(var25, var28);
    com.google.javascript.rhino.Node var30 = var25.cloneNode();
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.or(var20, var30);
    com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.IR.voidNode(var31);
    com.google.javascript.rhino.Node var33 = var8.srcref(var31);
    com.google.javascript.rhino.Node var34 = var33.getParent();
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var39 = var36.useSourceInfoIfMissingFrom(var38);
    com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var42 = com.google.javascript.rhino.IR.eq(var38, var41);
    var42.setSourceEncodedPosition(100);
    com.google.javascript.rhino.Node var46 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var49 = var46.useSourceInfoIfMissingFrom(var48);
    com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var52 = com.google.javascript.rhino.IR.eq(var48, var51);
    com.google.javascript.rhino.Node var53 = var48.cloneNode();
    boolean var54 = var53.isOr();
    com.google.javascript.rhino.Node var56 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var58 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var59 = var56.useSourceInfoIfMissingFrom(var58);
    com.google.javascript.rhino.Node var61 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var62 = com.google.javascript.rhino.IR.eq(var58, var61);
    com.google.javascript.rhino.Node var63 = var58.cloneNode();
    com.google.javascript.rhino.Node var64 = com.google.javascript.rhino.IR.or(var53, var63);
    com.google.javascript.rhino.Node var65 = var42.useSourceInfoFromForTree(var53);
    boolean var66 = var65.isScript();
    com.google.javascript.rhino.Node var68 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var70 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var71 = var68.useSourceInfoIfMissingFrom(var70);
    com.google.javascript.rhino.Node var73 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var74 = com.google.javascript.rhino.IR.eq(var70, var73);
    com.google.javascript.rhino.Node var75 = var70.cloneNode();
    java.lang.String var76 = var65.checkTreeEquals(var75);
    com.google.javascript.rhino.Node var77 = var33.copyInformationFromForTree(var65);
    com.google.javascript.rhino.JSTypeExpression var79 = new com.google.javascript.rhino.JSTypeExpression(var33, "{}");
    boolean var80 = var1.recordEnumParameterType(var79);
    com.google.javascript.jscomp.CompilerOptions var81 = new com.google.javascript.jscomp.CompilerOptions();
    var81.setSourceMapOutputPath("hi!");
    var81.setIdeMode(false);
    java.util.Set var86 = null;
    var81.setReplaceStringsReservedStrings(var86);
    var81.resetWarningsGuard();
    var81.setInputDelimiter("");
    com.google.javascript.jscomp.CompilerOptions.LanguageMode var91 = var81.getLanguageOut();
    var81.setLabelRenaming(true);
    var81.setCommonJSModulePathPrefix("module$");
    boolean var96 = var81.assumeClosuresOnlyCaptureReferences();
    boolean var97 = var79.equals((java.lang.Object)var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
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
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
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
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "Node tree inequality:\nTree1:\nEQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nTree2:\nNUMBER 10.0\n\n\nSubtree1: EQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nSubtree2: NUMBER 10.0\n"+ "'", var76.equals("Node tree inequality:\nTree1:\nEQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nTree2:\nNUMBER 10.0\n\n\nSubtree1: EQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nSubtree2: NUMBER 10.0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var96 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var97 == false);

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test135"); }


    com.google.javascript.jscomp.CheckLevel var3 = null;
    com.google.javascript.jscomp.DiagnosticType var6 = com.google.javascript.jscomp.DiagnosticType.warning("{505847021}", "{505847021}");
    com.google.javascript.jscomp.DiagnosticType var12 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
    java.lang.String[] var14 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var15 = com.google.javascript.jscomp.JSError.make("", 1, 39, var12, var14);
    com.google.javascript.jscomp.ShowByPathWarningsGuard var16 = new com.google.javascript.jscomp.ShowByPathWarningsGuard(var14);
    com.google.javascript.jscomp.JSError var17 = com.google.javascript.jscomp.JSError.make("Node tree inequality:\nTree1:\nNUMBER 10.0\n\n\nTree2:\nEQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nSubtree1: NUMBER 10.0\n\n\nSubtree2: EQ\n    NUMBER 10.0\n    NUMBER 10.0\n", (-1), 10, var3, var6, var14);
    com.google.javascript.rhino.ErrorReporter var18 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var18, true);
    com.google.javascript.rhino.jstype.ObjectType var21 = var20.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var22 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var22, true);
    com.google.javascript.rhino.jstype.ObjectType var25 = var24.createAnonymousObjectType();
    boolean var26 = var25.isUnknownType();
    boolean var27 = var21.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var25);
    boolean var28 = var25.isFunctionPrototypeType();
    var25.clearCachedValues();
    com.google.javascript.rhino.Node var31 = var25.getPropertyNode("NUMBER 10.0\n");
    boolean var32 = var17.equals((java.lang.Object)var25);
    int var33 = var17.getNodeLength();
    int var34 = var17.getNodeSourceOffset();
    java.lang.String var35 = var17.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "{505847021}. {505847021} at Node tree inequality:\nTree1:\nNUMBER 10.0\n\n\nTree2:\nEQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nSubtree1: NUMBER 10.0\n\n\nSubtree2: EQ\n    NUMBER 10.0\n    NUMBER 10.0\n line (unknown line) : 10"+ "'", var35.equals("{505847021}. {505847021} at Node tree inequality:\nTree1:\nNUMBER 10.0\n\n\nTree2:\nEQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nSubtree1: NUMBER 10.0\n\n\nSubtree2: EQ\n    NUMBER 10.0\n    NUMBER 10.0\n line (unknown line) : 10"));

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test136"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.ObjectType var3 = var2.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var4 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var4, true);
    com.google.javascript.rhino.jstype.ObjectType var7 = var6.createAnonymousObjectType();
    boolean var8 = var7.isUnknownType();
    boolean var9 = var3.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var7);
    boolean var10 = var3.isBooleanValueType();
    com.google.javascript.rhino.ErrorReporter var11 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var11, true);
    com.google.javascript.rhino.ErrorReporter var14 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var14, true);
    com.google.javascript.rhino.jstype.ObjectType var17 = var16.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var18 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var18, true);
    com.google.javascript.rhino.jstype.ObjectType var21 = var20.createAnonymousObjectType();
    boolean var22 = var21.isUnknownType();
    boolean var23 = var17.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var21);
    boolean var24 = var21.isFunctionPrototypeType();
    var21.clearCachedValues();
    com.google.javascript.rhino.jstype.ObjectType var26 = var21.dereference();
    com.google.javascript.rhino.jstype.JSType[] var27 = new com.google.javascript.rhino.jstype.JSType[] { var26};
    com.google.javascript.rhino.jstype.JSType var28 = var13.createUnionType(var27);
    com.google.javascript.rhino.ErrorReporter var29 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var29, true);
    com.google.javascript.rhino.jstype.JSType var32 = null;
    boolean var34 = var31.canPropertyBeDefined(var32, "hi!");
    boolean var36 = var31.hasNamespace("");
    com.google.javascript.rhino.jstype.FunctionBuilder var37 = new com.google.javascript.rhino.jstype.FunctionBuilder(var31);
    com.google.javascript.rhino.jstype.FunctionBuilder var39 = var37.withName("NUMBER 10.0\n");
    com.google.javascript.rhino.ErrorReporter var40 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var40, true);
    com.google.javascript.rhino.jstype.ObjectType var43 = var42.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var44 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var44, true);
    com.google.javascript.rhino.jstype.ObjectType var47 = var46.createAnonymousObjectType();
    boolean var48 = var47.isUnknownType();
    boolean var49 = var43.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var47);
    boolean var50 = var47.isFunctionPrototypeType();
    com.google.javascript.rhino.jstype.FunctionBuilder var52 = var39.withReturnType((com.google.javascript.rhino.jstype.JSType)var47, true);
    com.google.javascript.rhino.Node var54 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var56 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var57 = var54.useSourceInfoIfMissingFrom(var56);
    com.google.javascript.rhino.Node var59 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var60 = com.google.javascript.rhino.IR.eq(var56, var59);
    com.google.javascript.rhino.Node var61 = var56.cloneNode();
    boolean var62 = var61.isOr();
    com.google.javascript.rhino.jstype.StaticSourceFile var63 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var61);
    boolean var64 = var61.isDec();
    boolean var65 = var61.isFor();
    boolean var66 = var61.isNoSideEffectsCall();
    com.google.javascript.rhino.jstype.FunctionType var67 = var13.createFunctionType((com.google.javascript.rhino.jstype.JSType)var47, var61);
    boolean var68 = var3.differsFrom((com.google.javascript.rhino.jstype.JSType)var47);
    com.google.javascript.rhino.jstype.JSType var70 = var3.getRestrictedTypeGivenToBooleanOutcome(false);
    com.google.javascript.rhino.jstype.ObjectType var71 = var3.getParentScope();
    boolean var72 = var71.isTemplateType();
    com.google.javascript.rhino.jstype.EnumElementType var73 = var71.toMaybeEnumElementType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);

  }

  public void test137() {}
//   public void test137() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test137"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
//     com.google.javascript.rhino.jstype.JSType var3 = null;
//     boolean var5 = var2.canPropertyBeDefined(var3, "hi!");
//     boolean var7 = var2.hasNamespace("");
//     com.google.javascript.rhino.ErrorReporter var9 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var9, true);
//     com.google.javascript.rhino.jstype.ObjectType var12 = var11.createAnonymousObjectType();
//     com.google.javascript.rhino.ErrorReporter var13 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var13, true);
//     com.google.javascript.rhino.jstype.ObjectType var16 = var15.createAnonymousObjectType();
//     com.google.javascript.rhino.ErrorReporter var17 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var17, true);
//     com.google.javascript.rhino.jstype.ObjectType var20 = var19.createAnonymousObjectType();
//     boolean var21 = var20.isUnknownType();
//     boolean var22 = var16.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var20);
//     com.google.javascript.rhino.jstype.JSType var23 = var11.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType)var16);
//     var2.registerPropertyOnType("goog.exportSymbol", var23);
//     com.google.javascript.rhino.jstype.JSTypeNative var25 = null;
//     com.google.javascript.rhino.jstype.JSTypeNative[] var26 = new com.google.javascript.rhino.jstype.JSTypeNative[] { var25};
//     com.google.javascript.rhino.jstype.JSType var27 = var2.createUnionType(var26);
// 
//   }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test138"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var4 = var1.useSourceInfoIfMissingFrom(var3);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.eq(var3, var6);
    com.google.javascript.rhino.Node var8 = var3.cloneNode();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var9 = var8.detachFromParent();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test139"); }


    com.google.javascript.jscomp.CodingConvention var0 = null;
    com.google.javascript.jscomp.ClosureCodingConvention var1 = new com.google.javascript.jscomp.ClosureCodingConvention(var0);
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = null;
    com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter var3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter((com.google.javascript.jscomp.CodingConvention)var1, var2);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var8 = var5.useSourceInfoIfMissingFrom(var7);
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.eq(var7, var10);
    var11.setSourceEncodedPosition(100);
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var18 = var15.useSourceInfoIfMissingFrom(var17);
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.eq(var17, var20);
    com.google.javascript.rhino.Node var22 = var17.cloneNode();
    boolean var23 = var22.isOr();
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var28 = var25.useSourceInfoIfMissingFrom(var27);
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.eq(var27, var30);
    com.google.javascript.rhino.Node var32 = var27.cloneNode();
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.or(var22, var32);
    com.google.javascript.rhino.Node var34 = var11.useSourceInfoFromForTree(var22);
    com.google.javascript.rhino.Node var35 = var11.removeFirstChild();
    com.google.javascript.jscomp.CodingConvention var36 = null;
    com.google.javascript.jscomp.ClosureCodingConvention var37 = new com.google.javascript.jscomp.ClosureCodingConvention(var36);
    com.google.javascript.rhino.jstype.JSTypeRegistry var38 = null;
    com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter var39 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter((com.google.javascript.jscomp.CodingConvention)var37, var38);
    com.google.javascript.jscomp.ClosureCodingConvention var40 = new com.google.javascript.jscomp.ClosureCodingConvention((com.google.javascript.jscomp.CodingConvention)var37);
    com.google.javascript.rhino.Node var42 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var44 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var45 = var42.useSourceInfoIfMissingFrom(var44);
    com.google.javascript.rhino.Node var47 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.IR.eq(var44, var47);
    com.google.javascript.rhino.Node var49 = var44.cloneNode();
    boolean var50 = var49.isOr();
    com.google.javascript.rhino.jstype.StaticSourceFile var51 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var49);
    boolean var52 = var49.isDec();
    boolean var53 = var49.isFor();
    boolean var54 = var37.isVarArgsParameter(var49);
    boolean var55 = var49.isEmpty();
    boolean var56 = var35.hasChild(var49);
    com.google.javascript.rhino.Node var58 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var60 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var61 = var58.useSourceInfoIfMissingFrom(var60);
    com.google.javascript.rhino.Node var63 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var64 = com.google.javascript.rhino.IR.eq(var60, var63);
    com.google.javascript.rhino.Node var65 = var60.cloneNode();
    boolean var66 = var65.isOr();
    com.google.javascript.rhino.Node var68 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var70 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var71 = var68.useSourceInfoIfMissingFrom(var70);
    com.google.javascript.rhino.Node var73 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var74 = com.google.javascript.rhino.IR.eq(var70, var73);
    com.google.javascript.rhino.Node var75 = var70.cloneNode();
    com.google.javascript.rhino.Node var76 = com.google.javascript.rhino.IR.or(var65, var75);
    int var77 = var65.getCharno();
    java.lang.String var78 = var1.extractClassNameIfRequire(var35, var65);
    com.google.javascript.rhino.Node var80 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var82 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var83 = var80.useSourceInfoIfMissingFrom(var82);
    com.google.javascript.rhino.Node var85 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var86 = com.google.javascript.rhino.IR.eq(var82, var85);
    var86.setSourceEncodedPosition(100);
    var35.addChildrenToFront(var86);
    var35.setCharno(1);
    var35.setDouble(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
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
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
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
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
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
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
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
    assertTrue(var77 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);

  }

  public void test140() {}
//   public void test140() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test140"); }
// 
// 
//     com.google.javascript.jscomp.CodingConvention var0 = null;
//     com.google.javascript.jscomp.ClosureCodingConvention var1 = new com.google.javascript.jscomp.ClosureCodingConvention(var0);
//     com.google.javascript.rhino.ErrorReporter var2 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2);
//     com.google.javascript.rhino.ErrorReporter var4 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var4, true);
//     com.google.javascript.rhino.jstype.JSType var7 = null;
//     boolean var9 = var6.canPropertyBeDefined(var7, "hi!");
//     boolean var11 = var6.hasNamespace("");
//     com.google.javascript.rhino.jstype.FunctionBuilder var12 = new com.google.javascript.rhino.jstype.FunctionBuilder(var6);
//     com.google.javascript.rhino.ErrorReporter var13 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var13, true);
//     com.google.javascript.rhino.ErrorReporter var16 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var16, true);
//     com.google.javascript.rhino.jstype.ObjectType var19 = var18.createAnonymousObjectType();
//     com.google.javascript.rhino.ErrorReporter var20 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var20, true);
//     com.google.javascript.rhino.jstype.ObjectType var23 = var22.createAnonymousObjectType();
//     boolean var24 = var23.isUnknownType();
//     boolean var25 = var19.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var23);
//     boolean var26 = var23.isFunctionPrototypeType();
//     var23.clearCachedValues();
//     com.google.javascript.rhino.jstype.ObjectType var28 = var23.dereference();
//     com.google.javascript.rhino.jstype.JSType[] var29 = new com.google.javascript.rhino.jstype.JSType[] { var28};
//     com.google.javascript.rhino.jstype.JSType var30 = var15.createUnionType(var29);
//     com.google.javascript.rhino.ErrorReporter var31 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var31, true);
//     com.google.javascript.rhino.ErrorReporter var34 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var34, true);
//     com.google.javascript.rhino.jstype.ObjectType var37 = var36.createAnonymousObjectType();
//     com.google.javascript.rhino.ErrorReporter var38 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var38, true);
//     com.google.javascript.rhino.jstype.ObjectType var41 = var40.createAnonymousObjectType();
//     boolean var42 = var41.isUnknownType();
//     boolean var43 = var37.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var41);
//     boolean var44 = var41.isFunctionPrototypeType();
//     var41.clearCachedValues();
//     com.google.javascript.rhino.jstype.ObjectType var46 = var41.dereference();
//     com.google.javascript.rhino.jstype.JSType[] var47 = new com.google.javascript.rhino.jstype.JSType[] { var46};
//     com.google.javascript.rhino.jstype.JSType var48 = var33.createUnionType(var47);
//     com.google.javascript.rhino.jstype.FunctionType var49 = var6.createFunctionTypeWithVarArgs(var30, var47);
//     com.google.javascript.rhino.jstype.JSType[] var50 = new com.google.javascript.rhino.jstype.JSType[] { var30};
//     com.google.javascript.rhino.Node var51 = var3.createParameters(var50);
//     com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter var52 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter((com.google.javascript.jscomp.CodingConvention)var1, var3);
//     java.lang.String var53 = var1.getDelegateSuperclassName();
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
//     com.google.javascript.jscomp.LightweightMessageFormatter var2 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
//     java.io.PrintStream var3 = null;
//     com.google.javascript.jscomp.PrintStreamErrorManager var4 = new com.google.javascript.jscomp.PrintStreamErrorManager((com.google.javascript.jscomp.MessageFormatter)var2, var3);
//     double var5 = var4.getTypedPercent();
//     var4.printSummary();
//     com.google.javascript.jscomp.CompilerOptions var7 = new com.google.javascript.jscomp.CompilerOptions();
//     var7.setCrossModuleCodeMotion(false);
//     com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var10 = null;
//     var7.setAnonymousFunctionNaming(var10);
//     java.util.List var12 = null;
//     var7.setSourceMapLocationMappings(var12);
//     var7.setShadowVariables(true);
//     com.google.javascript.jscomp.ShowByPathWarningsGuard var17 = new com.google.javascript.jscomp.ShowByPathWarningsGuard("{505847021}");
//     com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.empty();
//     com.google.javascript.jscomp.DiagnosticType var25 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
//     java.lang.String[] var27 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var28 = com.google.javascript.jscomp.JSError.make("", 1, 39, var25, var27);
//     com.google.javascript.jscomp.CheckLevel var32 = null;
//     com.google.javascript.jscomp.DiagnosticType var35 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
//     com.google.javascript.jscomp.DiagnosticType var41 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
//     java.lang.String[] var43 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var44 = com.google.javascript.jscomp.JSError.make("", 1, 39, var41, var43);
//     com.google.javascript.jscomp.JSError var45 = com.google.javascript.jscomp.JSError.make("hi!", 100, 100, var32, var35, var43);
//     com.google.javascript.jscomp.JSError var46 = com.google.javascript.jscomp.JSError.make("NUMBER 10.0\n", var19, var25, var43);
//     com.google.javascript.jscomp.CheckLevel var47 = var17.level(var46);
//     var7.setCheckGlobalThisLevel(var47);
//     com.google.javascript.jscomp.JSError var49 = null;
//     var4.println(var47, var49);
// 
//   }

  public void test142() {}
//   public void test142() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test142"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = null;
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var6 = var3.useSourceInfoIfMissingFrom(var5);
//     boolean var7 = var5.isSetterDef();
//     com.google.javascript.rhino.Node[] var8 = new com.google.javascript.rhino.Node[] { var5};
//     com.google.javascript.rhino.Node var9 = new com.google.javascript.rhino.Node(100, var8);
//     com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.newNode(var0, var8);
// 
//   }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test143"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.ObjectType var3 = var2.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var4 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var4, true);
    com.google.javascript.rhino.jstype.ObjectType var7 = var6.createAnonymousObjectType();
    boolean var8 = var7.isUnknownType();
    boolean var9 = var3.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var7);
    boolean var10 = var7.isFunctionPrototypeType();
    var7.clearCachedValues();
    com.google.javascript.rhino.jstype.ObjectType var12 = var7.dereference();
    com.google.javascript.rhino.JSDocInfo var14 = null;
    var7.setPropertyJSDocInfo("NUMBER 10.0", var14);
    boolean var17 = var7.isPropertyInExterns("");
    com.google.javascript.rhino.ErrorReporter var19 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var19, true);
    com.google.javascript.rhino.jstype.ObjectType var22 = var21.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var23 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var23, true);
    com.google.javascript.rhino.jstype.ObjectType var26 = var25.createAnonymousObjectType();
    boolean var27 = var26.isUnknownType();
    boolean var28 = var22.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var26);
    boolean var29 = var22.isBooleanValueType();
    boolean var30 = var22.isNoType();
    java.lang.String var31 = var22.getNormalizedReferenceName();
    com.google.javascript.rhino.JSDocInfo var32 = null;
    var22.setJSDocInfo(var32);
    boolean var34 = var22.isNumber();
    com.google.javascript.rhino.jstype.ObjectType var35 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType)var22);
    com.google.javascript.rhino.Node var36 = null;
    boolean var37 = var7.defineDeclaredProperty("module$null(null)", (com.google.javascript.rhino.jstype.JSType)var35, var36);
    boolean var38 = var7.isNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test144"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setSourceMapOutputPath("hi!");
    var0.setIdeMode(false);
    com.google.javascript.jscomp.CompilerOptions.LanguageMode var5 = var0.getLanguageIn();
    var0.setRemoveUnusedLocalVars(true);
    var0.setManageClosureDependencies(false);
    var0.setTightenTypes(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test145"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var4 = var1.useSourceInfoIfMissingFrom(var3);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.eq(var3, var6);
    com.google.javascript.rhino.Node var8 = var3.cloneNode();
    boolean var9 = var3.isDelProp();
    boolean var10 = var3.isIf();
    java.lang.String var11 = var3.toString();
    boolean var12 = var3.isArrayLit();
    com.google.javascript.rhino.ErrorReporter var13 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var13, true);
    com.google.javascript.rhino.jstype.JSType var16 = null;
    boolean var18 = var15.canPropertyBeDefined(var16, "hi!");
    boolean var20 = var15.hasNamespace("");
    com.google.javascript.rhino.jstype.FunctionBuilder var21 = new com.google.javascript.rhino.jstype.FunctionBuilder(var15);
    com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.ErrorReporter var25 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var25, true);
    com.google.javascript.rhino.jstype.ObjectType var28 = var27.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var29 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var29, true);
    com.google.javascript.rhino.jstype.ObjectType var32 = var31.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var33 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var33, true);
    com.google.javascript.rhino.jstype.ObjectType var36 = var35.createAnonymousObjectType();
    boolean var37 = var36.isUnknownType();
    boolean var38 = var32.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var36);
    com.google.javascript.rhino.jstype.JSType var39 = var27.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType)var32);
    com.google.javascript.rhino.jstype.EnumType var40 = var15.createEnumType("Node tree inequality:\nTree1:\nNUMBER 10.0\n\n\nTree2:\nEQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nSubtree1: NUMBER 10.0\n\n\nSubtree2: EQ\n    NUMBER 10.0\n    NUMBER 10.0\n", var24, var39);
    com.google.javascript.rhino.Node var41 = var3.copyInformationFrom(var24);
    var41.setIsSyntheticBlock(false);
    com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var47 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var48 = var45.useSourceInfoIfMissingFrom(var47);
    com.google.javascript.rhino.Node var50 = com.google.javascript.rhino.IR.string("NUMBER 10.0");
    com.google.javascript.rhino.Node var51 = var47.copyInformationFrom(var50);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var52 = com.google.javascript.rhino.IR.sub(var41, var47);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "NUMBER 10.0"+ "'", var11.equals("NUMBER 10.0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
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
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test146"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var3 = null;
    boolean var5 = var2.canPropertyBeDefined(var3, "hi!");
    boolean var7 = var2.hasNamespace("");
    com.google.javascript.rhino.jstype.FunctionBuilder var8 = new com.google.javascript.rhino.jstype.FunctionBuilder(var2);
    com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode var9 = null;
    var2.setResolveMode(var9);
    com.google.javascript.rhino.ErrorReporter var11 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var11, true);
    com.google.javascript.rhino.jstype.ObjectType var14 = var13.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var15 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var15, true);
    com.google.javascript.rhino.jstype.ObjectType var18 = var17.createAnonymousObjectType();
    boolean var19 = var18.isUnknownType();
    boolean var20 = var14.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var18);
    boolean var21 = var14.isBooleanValueType();
    com.google.javascript.rhino.ErrorReporter var22 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var22, true);
    com.google.javascript.rhino.ErrorReporter var25 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var25, true);
    com.google.javascript.rhino.jstype.ObjectType var28 = var27.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var29 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var29, true);
    com.google.javascript.rhino.jstype.ObjectType var32 = var31.createAnonymousObjectType();
    boolean var33 = var32.isUnknownType();
    boolean var34 = var28.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var32);
    boolean var35 = var32.isFunctionPrototypeType();
    var32.clearCachedValues();
    com.google.javascript.rhino.jstype.ObjectType var37 = var32.dereference();
    com.google.javascript.rhino.jstype.JSType[] var38 = new com.google.javascript.rhino.jstype.JSType[] { var37};
    com.google.javascript.rhino.jstype.JSType var39 = var24.createUnionType(var38);
    com.google.javascript.rhino.ErrorReporter var40 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var40, true);
    com.google.javascript.rhino.jstype.JSType var43 = null;
    boolean var45 = var42.canPropertyBeDefined(var43, "hi!");
    boolean var47 = var42.hasNamespace("");
    com.google.javascript.rhino.jstype.FunctionBuilder var48 = new com.google.javascript.rhino.jstype.FunctionBuilder(var42);
    com.google.javascript.rhino.jstype.FunctionBuilder var50 = var48.withName("NUMBER 10.0\n");
    com.google.javascript.rhino.ErrorReporter var51 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var51, true);
    com.google.javascript.rhino.jstype.ObjectType var54 = var53.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var55 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var55, true);
    com.google.javascript.rhino.jstype.ObjectType var58 = var57.createAnonymousObjectType();
    boolean var59 = var58.isUnknownType();
    boolean var60 = var54.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var58);
    boolean var61 = var58.isFunctionPrototypeType();
    com.google.javascript.rhino.jstype.FunctionBuilder var63 = var50.withReturnType((com.google.javascript.rhino.jstype.JSType)var58, true);
    com.google.javascript.rhino.Node var65 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var67 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var68 = var65.useSourceInfoIfMissingFrom(var67);
    com.google.javascript.rhino.Node var70 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var71 = com.google.javascript.rhino.IR.eq(var67, var70);
    com.google.javascript.rhino.Node var72 = var67.cloneNode();
    boolean var73 = var72.isOr();
    com.google.javascript.rhino.jstype.StaticSourceFile var74 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var72);
    boolean var75 = var72.isDec();
    boolean var76 = var72.isFor();
    boolean var77 = var72.isNoSideEffectsCall();
    com.google.javascript.rhino.jstype.FunctionType var78 = var24.createFunctionType((com.google.javascript.rhino.jstype.JSType)var58, var72);
    boolean var79 = var14.differsFrom((com.google.javascript.rhino.jstype.JSType)var58);
    com.google.javascript.rhino.Node var81 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var83 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var84 = var81.useSourceInfoIfMissingFrom(var83);
    com.google.javascript.rhino.Node var86 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var88 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var89 = var86.useSourceInfoIfMissingFrom(var88);
    com.google.javascript.rhino.Node var90 = com.google.javascript.rhino.IR.exprResult(var89);
    java.lang.String var91 = var83.checkTreeEquals(var89);
    com.google.javascript.rhino.jstype.FunctionType var92 = var2.createFunctionType((com.google.javascript.rhino.jstype.JSType)var58, var89);
    boolean var93 = var89.isRegExp();
    var89.putIntProp(10, 1);
    boolean var97 = var89.isQuotedString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var97 == false);

  }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test147"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithNodeAnnotations();
    java.util.List var1 = var0.getGraphvizNodes();
    java.util.Collection var2 = var0.getNodes();
    boolean var3 = var0.isDirected();
    com.google.javascript.jscomp.graph.SubGraph var4 = var0.newSubGraph();
    java.lang.Object var5 = null;
    com.google.javascript.jscomp.CompilerOptions var6 = new com.google.javascript.jscomp.CompilerOptions();
    var6.setTweakToNumberLiteral("", 1);
    var6.setInlineVariables(false);
    com.google.javascript.jscomp.CompilerOptions.TracerMode var12 = var6.getTracerMode();
    var6.setPrintInputDelimiter(false);
    var6.setCheckMissingGetCssNameBlacklist("");
    var6.setCollapseObjectLiterals(false);
    var6.setLooseTypes(true);
    var6.setCollapsePropertiesOnExternTypes(false);
    var6.setCheckTypes(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var25 = var0.isConnectedInDirection(var5, (java.lang.Object)var6);
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
    assertNotNull(var12);

  }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test148"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var4 = var1.useSourceInfoIfMissingFrom(var3);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.exprResult(var4);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.block(var5);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var11 = var8.useSourceInfoIfMissingFrom(var10);
    boolean var12 = var10.isOr();
    int var13 = var10.getChildCount();
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var18 = var15.useSourceInfoIfMissingFrom(var17);
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.eq(var17, var20);
    com.google.javascript.rhino.Node var22 = var17.cloneNode();
    boolean var23 = var22.isOr();
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var28 = var25.useSourceInfoIfMissingFrom(var27);
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.eq(var27, var30);
    com.google.javascript.rhino.Node var32 = var27.cloneNode();
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.or(var22, var32);
    com.google.javascript.rhino.Node var34 = var10.srcrefTree(var33);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.IR.regexp(var6, var10);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
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
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
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
    assertNotNull(var34);

  }

  public void test149() {}
//   public void test149() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test149"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
//     com.google.javascript.rhino.ErrorReporter var3 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var3, true);
//     com.google.javascript.rhino.jstype.ObjectType var6 = var5.createAnonymousObjectType();
//     com.google.javascript.rhino.ErrorReporter var7 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7, true);
//     com.google.javascript.rhino.jstype.ObjectType var10 = var9.createAnonymousObjectType();
//     boolean var11 = var10.isUnknownType();
//     boolean var12 = var6.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var10);
//     boolean var13 = var10.isFunctionPrototypeType();
//     var10.clearCachedValues();
//     com.google.javascript.rhino.jstype.ObjectType var15 = var10.dereference();
//     com.google.javascript.rhino.jstype.JSType[] var16 = new com.google.javascript.rhino.jstype.JSType[] { var15};
//     com.google.javascript.rhino.jstype.JSType var17 = var2.createUnionType(var16);
//     com.google.javascript.rhino.ErrorReporter var18 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var18, true);
//     com.google.javascript.rhino.jstype.JSType var21 = null;
//     boolean var23 = var20.canPropertyBeDefined(var21, "hi!");
//     boolean var25 = var20.hasNamespace("");
//     com.google.javascript.rhino.jstype.FunctionBuilder var26 = new com.google.javascript.rhino.jstype.FunctionBuilder(var20);
//     com.google.javascript.rhino.jstype.FunctionBuilder var28 = var26.withName("NUMBER 10.0\n");
//     com.google.javascript.rhino.ErrorReporter var29 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var29, true);
//     com.google.javascript.rhino.jstype.ObjectType var32 = var31.createAnonymousObjectType();
//     com.google.javascript.rhino.ErrorReporter var33 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var33, true);
//     com.google.javascript.rhino.jstype.ObjectType var36 = var35.createAnonymousObjectType();
//     boolean var37 = var36.isUnknownType();
//     boolean var38 = var32.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var36);
//     boolean var39 = var36.isFunctionPrototypeType();
//     com.google.javascript.rhino.jstype.FunctionBuilder var41 = var28.withReturnType((com.google.javascript.rhino.jstype.JSType)var36, true);
//     com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var46 = var43.useSourceInfoIfMissingFrom(var45);
//     com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.eq(var45, var48);
//     com.google.javascript.rhino.Node var50 = var45.cloneNode();
//     boolean var51 = var50.isOr();
//     com.google.javascript.rhino.jstype.StaticSourceFile var52 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var50);
//     boolean var53 = var50.isDec();
//     boolean var54 = var50.isFor();
//     boolean var55 = var50.isNoSideEffectsCall();
//     com.google.javascript.rhino.jstype.FunctionType var56 = var2.createFunctionType((com.google.javascript.rhino.jstype.JSType)var36, var50);
//     com.google.javascript.rhino.jstype.ObjectType var57 = var56.getTypeOfThis();
//     java.lang.String var58 = var56.toDebugHashCodeString();
//     java.util.List var59 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       var56.setExtendedInterfaces(var59);
//       fail("Expected exception of type java.lang.UnsupportedOperationException");
//     } catch (java.lang.UnsupportedOperationException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var6);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var10);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var15);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var16);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var17);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var23 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var25 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var28);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var32);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var36);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var37 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var38 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var39 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var41);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var43);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var45);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var46);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var48);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var49);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var50);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var51 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var52);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var53 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var54 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var55 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var56);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var57);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var58 + "' != '" + "function (): {1773046004}"+ "'", var58.equals("function (): {1773046004}"));
// 
//   }

  public void test150() {}
//   public void test150() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test150"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.CompilerOptions var2 = new com.google.javascript.jscomp.CompilerOptions();
//     var2.setCrossModuleCodeMotion(false);
//     var2.setLabelRenaming(true);
//     java.util.Set var7 = null;
//     var2.setStripTypePrefixes(var7);
//     var1.initOptions(var2);
//     java.nio.charset.Charset var11 = null;
//     com.google.javascript.jscomp.SourceFile var12 = com.google.javascript.jscomp.SourceFile.fromFile("NUMBER 10.0", var11);
//     com.google.javascript.jscomp.Region var14 = var12.getRegion(100);
//     java.lang.String var15 = var12.toString();
//     com.google.javascript.rhino.Node var16 = var1.parse(var12);
//     com.google.javascript.jscomp.CompilerOptions.LanguageMode var17 = var1.languageMode();
//     boolean var18 = var1.isTypeCheckingEnabled();
//     com.google.javascript.jscomp.JSSourceFile var19 = null;
//     com.google.javascript.jscomp.JSSourceFile[] var20 = new com.google.javascript.jscomp.JSSourceFile[] { var19};
//     com.google.javascript.jscomp.JSModule var21 = null;
//     com.google.javascript.jscomp.JSModule[] var22 = new com.google.javascript.jscomp.JSModule[] { var21};
//     com.google.javascript.jscomp.CompilerOptions var23 = new com.google.javascript.jscomp.CompilerOptions();
//     var23.setCrossModuleCodeMotion(false);
//     com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var26 = null;
//     var23.setAnonymousFunctionNaming(var26);
//     var23.setExtractPrototypeMemberDeclarations(true);
//     var23.setRemoveTryCatchFinally(true);
//     var23.setFoldConstants(false);
//     var23.setAssumeClosuresOnlyCaptureReferences(false);
//     var1.init(var20, var22, var23);
// 
//   }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test151"); }


    com.google.javascript.rhino.JSDocInfoBuilder var1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    boolean var2 = var1.recordOverride();
    java.util.Set var3 = null;
    boolean var4 = var1.recordModifies(var3);
    java.util.Set var5 = null;
    boolean var6 = var1.recordModifies(var5);
    boolean var7 = var1.recordHiddenness();
    boolean var8 = var1.recordConstructor();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.markAnnotation("", 0, 0);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test152"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var4 = var1.useSourceInfoIfMissingFrom(var3);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var7 = var4.copyInformationFrom(var6);
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var12 = var9.useSourceInfoIfMissingFrom(var11);
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.eq(var11, var14);
    com.google.javascript.rhino.Node var16 = var11.cloneNode();
    boolean var17 = var16.isOr();
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var22 = var19.useSourceInfoIfMissingFrom(var21);
    com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.eq(var21, var24);
    com.google.javascript.rhino.Node var26 = var21.cloneNode();
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.or(var16, var26);
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var32 = var29.useSourceInfoIfMissingFrom(var31);
    com.google.javascript.rhino.Node var34 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var35 = var32.copyInformationFrom(var34);
    com.google.javascript.rhino.Node var36 = var16.srcrefTree(var34);
    com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var41 = var38.useSourceInfoIfMissingFrom(var40);
    com.google.javascript.rhino.Node var42 = com.google.javascript.rhino.IR.exprResult(var41);
    com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.IR.block(var42);
    com.google.javascript.rhino.Node var44 = var36.clonePropsFrom(var43);
    java.lang.String var45 = var6.checkTreeEquals(var43);
    com.google.javascript.rhino.Node var46 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var47 = com.google.javascript.rhino.IR.ifNode(var43, var46);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
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
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
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
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
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
    assertTrue("'" + var45 + "' != '" + "Node tree inequality:\nTree1:\nNUMBER 10.0\n\n\nTree2:\nBLOCK\n    EXPR_RESULT\n        NUMBER 10.0\n\n\nSubtree1: NUMBER 10.0\n\n\nSubtree2: BLOCK\n    EXPR_RESULT\n        NUMBER 10.0\n"+ "'", var45.equals("Node tree inequality:\nTree1:\nNUMBER 10.0\n\n\nTree2:\nBLOCK\n    EXPR_RESULT\n        NUMBER 10.0\n\n\nSubtree1: NUMBER 10.0\n\n\nSubtree2: BLOCK\n    EXPR_RESULT\n        NUMBER 10.0\n"));

  }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test153"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var4 = var1.useSourceInfoIfMissingFrom(var3);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.eq(var3, var6);
    var7.setSourceEncodedPosition(100);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var14 = var11.useSourceInfoIfMissingFrom(var13);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.eq(var13, var16);
    com.google.javascript.rhino.Node var18 = var13.cloneNode();
    boolean var19 = var18.isOr();
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var24 = var21.useSourceInfoIfMissingFrom(var23);
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.eq(var23, var26);
    com.google.javascript.rhino.Node var28 = var23.cloneNode();
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.or(var18, var28);
    com.google.javascript.rhino.Node var30 = var7.useSourceInfoFromForTree(var18);
    com.google.javascript.rhino.Node.AncestorIterable var31 = var30.getAncestors();
    com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.IR.voidNode(var30);
    int var34 = var32.getIntProp((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);

  }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test154"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var3 = null;
    boolean var5 = var2.canPropertyBeDefined(var3, "hi!");
    boolean var7 = var2.hasNamespace("");
    com.google.javascript.rhino.ErrorReporter var8 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var8, true);
    com.google.javascript.rhino.jstype.ObjectType var11 = var10.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var12 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var12, true);
    com.google.javascript.rhino.jstype.ObjectType var15 = var14.createAnonymousObjectType();
    boolean var16 = var15.isUnknownType();
    boolean var17 = var11.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var15);
    boolean var18 = var15.isFunctionPrototypeType();
    var2.resolveTypesInScope((com.google.javascript.rhino.jstype.StaticScope)var15);
    com.google.javascript.rhino.ErrorReporter var20 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var20, true);
    com.google.javascript.rhino.jstype.ObjectType var23 = var22.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var24 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var24, true);
    com.google.javascript.rhino.jstype.ObjectType var27 = var26.createAnonymousObjectType();
    boolean var28 = var27.isUnknownType();
    boolean var29 = var23.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var27);
    boolean var30 = var27.isFunctionPrototypeType();
    var27.clearCachedValues();
    com.google.javascript.rhino.jstype.ObjectType var32 = var27.dereference();
    com.google.javascript.rhino.ErrorReporter var33 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var33, true);
    com.google.javascript.rhino.ErrorReporter var36 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var36, true);
    com.google.javascript.rhino.jstype.ObjectType var39 = var38.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var40 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var40, true);
    com.google.javascript.rhino.jstype.ObjectType var43 = var42.createAnonymousObjectType();
    boolean var44 = var43.isUnknownType();
    boolean var45 = var39.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var43);
    boolean var46 = var43.isFunctionPrototypeType();
    var43.clearCachedValues();
    com.google.javascript.rhino.jstype.ObjectType var48 = var43.dereference();
    com.google.javascript.rhino.jstype.JSType[] var49 = new com.google.javascript.rhino.jstype.JSType[] { var48};
    com.google.javascript.rhino.jstype.JSType var50 = var35.createUnionType(var49);
    com.google.javascript.rhino.jstype.FunctionType var51 = var2.createConstructorType((com.google.javascript.rhino.jstype.JSType)var27, var49);
    com.google.javascript.rhino.jstype.FunctionType var52 = var51.toMaybeFunctionType();
    boolean var53 = var51.isBooleanValueType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
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
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
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
    assertTrue(var53 == false);

  }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test155"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var4 = var1.useSourceInfoIfMissingFrom(var3);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.eq(var3, var6);
    com.google.javascript.rhino.Node var8 = var3.cloneNode();
    boolean var9 = var8.isOr();
    com.google.javascript.rhino.jstype.StaticSourceFile var10 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var8);
    boolean var11 = var8.isDec();
    boolean var12 = var8.isFor();
    boolean var13 = var8.isNoSideEffectsCall();
    boolean var14 = var8.isOptionalArg();
    boolean var15 = var8.isAdd();
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var20 = var17.useSourceInfoIfMissingFrom(var19);
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.eq(var19, var22);
    var22.setSourceEncodedPositionForTree(100);
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var30 = var27.useSourceInfoIfMissingFrom(var29);
    boolean var31 = var29.isOr();
    com.google.javascript.rhino.JSDocInfo var32 = var29.getJSDocInfo();
    var22.addChildToBack(var29);
    boolean var34 = var8.isEquivalentToTyped(var29);
    boolean var35 = var8.isUnscopedQualifiedName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test156() {}
//   public void test156() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test156"); }
// 
// 
//     com.google.javascript.jscomp.CodingConvention var0 = null;
//     com.google.javascript.jscomp.ClosureCodingConvention var1 = new com.google.javascript.jscomp.ClosureCodingConvention(var0);
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = null;
//     com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter var3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter((com.google.javascript.jscomp.CodingConvention)var1, var2);
//     com.google.javascript.jscomp.ClosureCodingConvention var4 = new com.google.javascript.jscomp.ClosureCodingConvention((com.google.javascript.jscomp.CodingConvention)var1);
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var9 = var6.useSourceInfoIfMissingFrom(var8);
//     com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.eq(var8, var11);
//     com.google.javascript.rhino.Node var13 = var8.cloneNode();
//     boolean var14 = var13.isOr();
//     com.google.javascript.rhino.jstype.StaticSourceFile var15 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var13);
//     boolean var16 = var13.isDec();
//     boolean var17 = var13.isFor();
//     boolean var18 = var1.isVarArgsParameter(var13);
//     java.lang.String var19 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(var13);
// 
//   }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test157"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setCrossModuleCodeMotion(false);
    com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var3 = null;
    var0.setAnonymousFunctionNaming(var3);
    var0.setExtractPrototypeMemberDeclarations(true);
    var0.setRemoveClosureAsserts(false);
    var0.setPreferLineBreakAtEndOfFile(false);
    var0.setAliasExternals(false);
    com.google.javascript.jscomp.VariableRenamingPolicy var13 = null;
    com.google.javascript.jscomp.PropertyRenamingPolicy var14 = null;
    var0.setRenamingPolicy(var13, var14);
    var0.setConvertToDottedProperties(false);

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test158"); }


    com.google.javascript.jscomp.CodingConvention var0 = null;
    com.google.javascript.jscomp.ClosureCodingConvention var1 = new com.google.javascript.jscomp.ClosureCodingConvention(var0);
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = null;
    com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter var3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter((com.google.javascript.jscomp.CodingConvention)var1, var2);
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var8 = var5.useSourceInfoIfMissingFrom(var7);
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.eq(var7, var10);
    var11.setSourceEncodedPosition(100);
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var18 = var15.useSourceInfoIfMissingFrom(var17);
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.eq(var17, var20);
    com.google.javascript.rhino.Node var22 = var17.cloneNode();
    boolean var23 = var22.isOr();
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var28 = var25.useSourceInfoIfMissingFrom(var27);
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.eq(var27, var30);
    com.google.javascript.rhino.Node var32 = var27.cloneNode();
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.or(var22, var32);
    com.google.javascript.rhino.Node var34 = var11.useSourceInfoFromForTree(var22);
    com.google.javascript.rhino.Node var35 = var11.removeFirstChild();
    com.google.javascript.jscomp.CodingConvention var36 = null;
    com.google.javascript.jscomp.ClosureCodingConvention var37 = new com.google.javascript.jscomp.ClosureCodingConvention(var36);
    com.google.javascript.rhino.jstype.JSTypeRegistry var38 = null;
    com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter var39 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter((com.google.javascript.jscomp.CodingConvention)var37, var38);
    com.google.javascript.jscomp.ClosureCodingConvention var40 = new com.google.javascript.jscomp.ClosureCodingConvention((com.google.javascript.jscomp.CodingConvention)var37);
    com.google.javascript.rhino.Node var42 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var44 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var45 = var42.useSourceInfoIfMissingFrom(var44);
    com.google.javascript.rhino.Node var47 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.IR.eq(var44, var47);
    com.google.javascript.rhino.Node var49 = var44.cloneNode();
    boolean var50 = var49.isOr();
    com.google.javascript.rhino.jstype.StaticSourceFile var51 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var49);
    boolean var52 = var49.isDec();
    boolean var53 = var49.isFor();
    boolean var54 = var37.isVarArgsParameter(var49);
    boolean var55 = var49.isEmpty();
    boolean var56 = var35.hasChild(var49);
    com.google.javascript.rhino.Node var58 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var60 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var61 = var58.useSourceInfoIfMissingFrom(var60);
    com.google.javascript.rhino.Node var63 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var64 = com.google.javascript.rhino.IR.eq(var60, var63);
    com.google.javascript.rhino.Node var65 = var60.cloneNode();
    boolean var66 = var65.isOr();
    com.google.javascript.rhino.Node var68 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var70 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var71 = var68.useSourceInfoIfMissingFrom(var70);
    com.google.javascript.rhino.Node var73 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var74 = com.google.javascript.rhino.IR.eq(var70, var73);
    com.google.javascript.rhino.Node var75 = var70.cloneNode();
    com.google.javascript.rhino.Node var76 = com.google.javascript.rhino.IR.or(var65, var75);
    int var77 = var65.getCharno();
    java.lang.String var78 = var1.extractClassNameIfRequire(var35, var65);
    com.google.javascript.rhino.Node var80 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var82 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var83 = var80.useSourceInfoIfMissingFrom(var82);
    com.google.javascript.rhino.Node var85 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var86 = com.google.javascript.rhino.IR.eq(var82, var85);
    var86.setSourceEncodedPosition(100);
    var35.addChildrenToFront(var86);
    var35.setLength(45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
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
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
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
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
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
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
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
    assertTrue(var77 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test159"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.ObjectType var3 = var2.createAnonymousObjectType();
    com.google.javascript.rhino.jstype.JSType var5 = var2.getType("null");
    boolean var6 = var5.isNoResolvedType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test160() {}
//   public void test160() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test160"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticGroup var0 = null;
//     com.google.javascript.jscomp.CheckLevel var1 = null;
//     com.google.javascript.jscomp.DiagnosticGroupWarningsGuard var2 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(var0, var1);
//     java.lang.String var3 = var2.toString();
//     java.lang.String var4 = var2.toString();
//     com.google.javascript.jscomp.CheckLevel var8 = null;
//     com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0\n", "NUMBER 10.0\n");
//     com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var16 = var13.useSourceInfoIfMissingFrom(var15);
//     boolean var17 = var15.isSetterDef();
//     boolean var18 = var15.isNoSideEffectsCall();
//     com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var23 = var20.useSourceInfoIfMissingFrom(var22);
//     com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.eq(var22, var25);
//     com.google.javascript.rhino.Node var27 = var22.cloneNode();
//     boolean var28 = var27.isOr();
//     com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var33 = var30.useSourceInfoIfMissingFrom(var32);
//     com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.eq(var32, var35);
//     com.google.javascript.rhino.Node var37 = var32.cloneNode();
//     com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.IR.or(var27, var37);
//     com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.IR.voidNode(var38);
//     com.google.javascript.rhino.Node var40 = var15.srcref(var38);
//     boolean var41 = var11.equals((java.lang.Object)var38);
//     com.google.javascript.jscomp.DiagnosticType var47 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
//     java.lang.String[] var49 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var50 = com.google.javascript.jscomp.JSError.make("", 1, 39, var47, var49);
//     com.google.javascript.jscomp.JSError var51 = com.google.javascript.jscomp.JSError.make("Node tree inequality:\nTree1:\nEQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nTree2:\nNUMBER 10.0\n\n\nSubtree1: EQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nSubtree2: NUMBER 10.0\n", 100, (-1), var8, var11, var49);
//     com.google.javascript.jscomp.CheckLevel var52 = var2.level(var51);
// 
//   }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test161"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithNodeAnnotations();
    com.google.javascript.rhino.ErrorReporter var1 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var1, true);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    boolean var6 = var3.canPropertyBeDefined(var4, "hi!");
    boolean var8 = var3.hasNamespace("");
    com.google.javascript.rhino.ErrorReporter var10 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var10, true);
    com.google.javascript.rhino.ErrorReporter var13 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var13, true);
    com.google.javascript.rhino.jstype.ObjectType var16 = var15.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var17 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var17, true);
    com.google.javascript.rhino.jstype.ObjectType var20 = var19.createAnonymousObjectType();
    boolean var21 = var20.isUnknownType();
    boolean var22 = var16.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var20);
    boolean var23 = var20.isFunctionPrototypeType();
    var20.clearCachedValues();
    com.google.javascript.rhino.jstype.ObjectType var25 = var20.dereference();
    com.google.javascript.rhino.jstype.JSType[] var26 = new com.google.javascript.rhino.jstype.JSType[] { var25};
    com.google.javascript.rhino.jstype.JSType var27 = var12.createUnionType(var26);
    com.google.javascript.rhino.ErrorReporter var28 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var28, true);
    com.google.javascript.rhino.jstype.JSType var31 = null;
    boolean var33 = var30.canPropertyBeDefined(var31, "hi!");
    boolean var35 = var30.hasNamespace("");
    com.google.javascript.rhino.jstype.FunctionBuilder var36 = new com.google.javascript.rhino.jstype.FunctionBuilder(var30);
    com.google.javascript.rhino.jstype.FunctionBuilder var38 = var36.withName("NUMBER 10.0\n");
    com.google.javascript.rhino.ErrorReporter var39 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var39, true);
    com.google.javascript.rhino.jstype.ObjectType var42 = var41.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var43 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var43, true);
    com.google.javascript.rhino.jstype.ObjectType var46 = var45.createAnonymousObjectType();
    boolean var47 = var46.isUnknownType();
    boolean var48 = var42.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var46);
    boolean var49 = var46.isFunctionPrototypeType();
    com.google.javascript.rhino.jstype.FunctionBuilder var51 = var38.withReturnType((com.google.javascript.rhino.jstype.JSType)var46, true);
    com.google.javascript.rhino.Node var53 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var55 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var56 = var53.useSourceInfoIfMissingFrom(var55);
    com.google.javascript.rhino.Node var58 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var59 = com.google.javascript.rhino.IR.eq(var55, var58);
    com.google.javascript.rhino.Node var60 = var55.cloneNode();
    boolean var61 = var60.isOr();
    com.google.javascript.rhino.jstype.StaticSourceFile var62 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var60);
    boolean var63 = var60.isDec();
    boolean var64 = var60.isFor();
    boolean var65 = var60.isNoSideEffectsCall();
    com.google.javascript.rhino.jstype.FunctionType var66 = var12.createFunctionType((com.google.javascript.rhino.jstype.JSType)var46, var60);
    var3.registerPropertyOnType("ECMASCRIPT3", (com.google.javascript.rhino.jstype.JSType)var66);
    com.google.javascript.jscomp.graph.GraphNode var68 = var0.createNode((java.lang.Object)var66);
    com.google.javascript.rhino.jstype.ObjectType var70 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface((com.google.javascript.rhino.jstype.ObjectType)var66, "{1101839915}");
    boolean var71 = var66.hasImplementedInterfaces();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
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
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);

  }

  public void test162() {}
//   public void test162() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test162"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.rhino.InputId var1 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, var1, true);
//     com.google.javascript.jscomp.JSModule var4 = var3.getModule();
//     com.google.javascript.jscomp.JSModule var5 = null;
//     var3.setModule(var5);
//     int var7 = var3.getNumLines();
// 
//   }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test163"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var4 = var1.useSourceInfoIfMissingFrom(var3);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.eq(var3, var6);
    var7.setSourceEncodedPosition(100);
    java.lang.String var10 = var7.toString();
    var7.setLineno(39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "EQ 0"+ "'", var10.equals("EQ 0"));

  }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test164"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var2 = com.google.javascript.rhino.ScriptRuntime.escapeString("goog.exportSymbol", '4');
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test165"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var3 = null;
    boolean var5 = var2.canPropertyBeDefined(var3, "hi!");
    boolean var7 = var2.hasNamespace("");
    com.google.javascript.rhino.jstype.ObjectType var8 = var2.createAnonymousObjectType();
    boolean var9 = var8.isFunctionPrototypeType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test166"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithNodeAnnotations();
    com.google.javascript.rhino.JSDocInfoBuilder var2 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
    java.nio.charset.Charset var5 = null;
    com.google.javascript.jscomp.SourceFile var6 = com.google.javascript.jscomp.SourceFile.fromFile("NUMBER 10.0", var5);
    var2.markName("{1459695149}", (com.google.javascript.rhino.jstype.StaticSourceFile)var6, 10, 39);
    com.google.javascript.jscomp.CompilerOptions var10 = new com.google.javascript.jscomp.CompilerOptions();
    var10.setCrossModuleCodeMotion(false);
    com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var13 = null;
    var10.setAnonymousFunctionNaming(var13);
    com.google.javascript.jscomp.CompilerOptions var15 = new com.google.javascript.jscomp.CompilerOptions();
    var15.setCrossModuleCodeMotion(false);
    boolean var18 = var15.isExternExportsEnabled();
    var15.setCheckTypes(false);
    var15.setPreferLineBreakAtEndOfFile(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.connectIfNotFound((java.lang.Object)var2, (java.lang.Object)var10, (java.lang.Object)false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test167"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.paramList();
    java.lang.String var1 = var0.getSourceFileName();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.nullNode();
    com.google.javascript.rhino.Node var3 = var0.copyInformationFrom(var2);
    int var4 = var3.getCharno();
    com.google.javascript.jscomp.CodingConvention var5 = null;
    com.google.javascript.jscomp.ClosureCodingConvention var6 = new com.google.javascript.jscomp.ClosureCodingConvention(var5);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.number(10.0d);
    boolean var9 = var8.isLabel();
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var14 = var11.useSourceInfoIfMissingFrom(var13);
    boolean var15 = var13.isFalse();
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.sheq(var8, var13);
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.Node.newString(0, "hi!");
    java.lang.String var20 = var6.extractClassNameIfRequire(var8, var19);
    boolean var21 = var19.isAssign();
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var26 = var23.useSourceInfoIfMissingFrom(var25);
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.eq(var25, var28);
    com.google.javascript.rhino.Node var30 = var28.cloneNode();
    var30.setCharno(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.forIn(var3, var19, var30);
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
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test168() {}
//   public void test168() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test168"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = null;
//     java.util.Collection var1 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(var0);
// 
//   }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test169"); }


    java.util.List var2 = null;
    java.util.List var3 = null;
    com.google.javascript.jscomp.deps.SimpleDependencyInfo var4 = new com.google.javascript.jscomp.deps.SimpleDependencyInfo("", "hi!", var2, var3);
    com.google.javascript.jscomp.CompilerOptions var5 = new com.google.javascript.jscomp.CompilerOptions();
    var5.setSourceMapOutputPath("hi!");
    var5.setReplaceStringsPlaceholderToken("hi!");
    var5.setCheckCaja(true);
    boolean var12 = var4.equals((java.lang.Object)var5);
    var5.setLocale("DependencyInfo(relativePath='EMPTY\n', path='Node tree inequality:\nTree1:\nEQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nTree2:\nNUMBER 10.0\n\n\nSubtree1: EQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nSubtree2: NUMBER 10.0\n', provides=null, requires=null)");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test170"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setTweakToNumberLiteral("", 1);
    var0.setInlineVariables(false);
    com.google.javascript.jscomp.CompilerOptions.TracerMode var6 = var0.getTracerMode();
    var0.setPrintInputDelimiter(false);
    var0.setCheckMissingGetCssNameBlacklist("");
    var0.setCollapseObjectLiterals(false);
    var0.setLooseTypes(true);
    com.google.javascript.jscomp.CodingConvention var15 = null;
    com.google.javascript.jscomp.ClosureCodingConvention var16 = new com.google.javascript.jscomp.ClosureCodingConvention(var15);
    com.google.javascript.rhino.jstype.JSTypeRegistry var17 = null;
    com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter var18 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter((com.google.javascript.jscomp.CodingConvention)var16, var17);
    com.google.javascript.jscomp.ClosureCodingConvention var19 = new com.google.javascript.jscomp.ClosureCodingConvention((com.google.javascript.jscomp.CodingConvention)var16);
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var24 = var21.useSourceInfoIfMissingFrom(var23);
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.eq(var23, var26);
    com.google.javascript.rhino.Node var28 = var23.cloneNode();
    boolean var29 = var28.isOr();
    com.google.javascript.rhino.jstype.StaticSourceFile var30 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var28);
    boolean var31 = var28.isDec();
    boolean var32 = var28.isFor();
    boolean var33 = var16.isVarArgsParameter(var28);
    var0.setCodingConvention((com.google.javascript.jscomp.CodingConvention)var16);
    com.google.javascript.jscomp.CheckLevel var35 = null;
    var0.setCheckGlobalThisLevel(var35);
    com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var37 = null;
    var0.setAnonymousFunctionNaming(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test171"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.nullNode();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var5 = var2.useSourceInfoIfMissingFrom(var4);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.exprResult(var5);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var11 = var8.useSourceInfoIfMissingFrom(var10);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.eq(var10, var13);
    com.google.javascript.rhino.Node var15 = var10.cloneNode();
    boolean var16 = var15.isOr();
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var21 = var18.useSourceInfoIfMissingFrom(var20);
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.IR.eq(var20, var23);
    com.google.javascript.rhino.Node var25 = var20.cloneNode();
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.or(var15, var25);
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var31 = var28.useSourceInfoIfMissingFrom(var30);
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var34 = com.google.javascript.rhino.IR.eq(var30, var33);
    var34.setSourceEncodedPosition(100);
    com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var41 = var38.useSourceInfoIfMissingFrom(var40);
    com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var44 = com.google.javascript.rhino.IR.eq(var40, var43);
    com.google.javascript.rhino.Node var45 = var40.cloneNode();
    boolean var46 = var45.isOr();
    com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var50 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var51 = var48.useSourceInfoIfMissingFrom(var50);
    com.google.javascript.rhino.Node var53 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var54 = com.google.javascript.rhino.IR.eq(var50, var53);
    com.google.javascript.rhino.Node var55 = var50.cloneNode();
    com.google.javascript.rhino.Node var56 = com.google.javascript.rhino.IR.or(var45, var55);
    com.google.javascript.rhino.Node var57 = var34.useSourceInfoFromForTree(var45);
    com.google.javascript.rhino.Node.AncestorIterable var58 = var57.getAncestors();
    java.lang.String var59 = var15.checkTreeEquals(var57);
    com.google.javascript.rhino.Node var61 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var63 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var64 = var61.useSourceInfoIfMissingFrom(var63);
    com.google.javascript.rhino.Node var66 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var67 = com.google.javascript.rhino.IR.eq(var63, var66);
    com.google.javascript.rhino.Node var68 = var63.cloneNode();
    boolean var69 = var68.isOr();
    com.google.javascript.rhino.Node var71 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var73 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var74 = var71.useSourceInfoIfMissingFrom(var73);
    com.google.javascript.rhino.Node var76 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var77 = com.google.javascript.rhino.IR.eq(var73, var76);
    com.google.javascript.rhino.Node var78 = var73.cloneNode();
    com.google.javascript.rhino.Node var79 = com.google.javascript.rhino.IR.or(var68, var78);
    com.google.javascript.rhino.Node[] var80 = new com.google.javascript.rhino.Node[] { var79};
    com.google.javascript.rhino.Node var81 = com.google.javascript.rhino.IR.call(var57, var80);
    java.lang.String var82 = var6.checkTreeEquals(var81);
    boolean var83 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(var6);
    boolean var84 = var6.hasChildren();
    boolean var85 = var6.isThrow();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var86 = var0.removeChildAfter(var6);
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
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
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
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
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
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "Node tree inequality:\nTree1:\nNUMBER 10.0\n\n\nTree2:\nEQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nSubtree1: NUMBER 10.0\n\n\nSubtree2: EQ\n    NUMBER 10.0\n    NUMBER 10.0\n"+ "'", var59.equals("Node tree inequality:\nTree1:\nNUMBER 10.0\n\n\nTree2:\nEQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nSubtree1: NUMBER 10.0\n\n\nSubtree2: EQ\n    NUMBER 10.0\n    NUMBER 10.0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
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
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var82 + "' != '" + "Node tree inequality:\nTree1:\nEXPR_RESULT\n    NUMBER 10.0\n\n\nTree2:\nCALL\n    EQ\n        NUMBER 10.0\n        NUMBER 10.0\n    OR\n        NUMBER 10.0\n        NUMBER 10.0\n\n\nSubtree1: EXPR_RESULT\n    NUMBER 10.0\n\n\nSubtree2: CALL\n    EQ\n        NUMBER 10.0\n        NUMBER 10.0\n    OR\n        NUMBER 10.0\n        NUMBER 10.0\n"+ "'", var82.equals("Node tree inequality:\nTree1:\nEXPR_RESULT\n    NUMBER 10.0\n\n\nTree2:\nCALL\n    EQ\n        NUMBER 10.0\n        NUMBER 10.0\n    OR\n        NUMBER 10.0\n        NUMBER 10.0\n\n\nSubtree1: EXPR_RESULT\n    NUMBER 10.0\n\n\nSubtree2: CALL\n    EQ\n        NUMBER 10.0\n        NUMBER 10.0\n    OR\n        NUMBER 10.0\n        NUMBER 10.0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);

  }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test172"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var4 = var1.useSourceInfoIfMissingFrom(var3);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.eq(var3, var6);
    com.google.javascript.rhino.Node var8 = var3.cloneNode();
    boolean var9 = var3.isDelProp();
    boolean var10 = var3.isIf();
    java.lang.String var11 = var3.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.regexp(var3);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "NUMBER 10.0"+ "'", var11.equals("NUMBER 10.0"));

  }

  public void test173() {}
//   public void test173() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test173"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var2 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
//     com.google.javascript.jscomp.Compiler.IntermediateState var3 = var1.getState();
//     com.google.javascript.jscomp.JSError[] var4 = var1.getMessages();
// 
//   }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test174"); }


    boolean var1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("function ({1420308627}): {1846357584}");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test175"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var4 = var1.useSourceInfoIfMissingFrom(var3);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.eq(var3, var6);
    com.google.javascript.rhino.Node var8 = var3.cloneNode();
    boolean var9 = var3.isDelProp();
    boolean var10 = var3.isIf();
    java.lang.String var11 = var3.toString();
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.nullNode();
    var3.addChildToBack(var12);
    boolean var14 = var12.isOr();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "NUMBER 10.0"+ "'", var11.equals("NUMBER 10.0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test176"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setCrossModuleCodeMotion(false);
    com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var3 = null;
    var0.setAnonymousFunctionNaming(var3);
    com.google.javascript.jscomp.CompilerOptions.TweakProcessing var5 = var0.getTweakProcessing();
    com.google.javascript.jscomp.VariableRenamingPolicy var6 = null;
    com.google.javascript.jscomp.PropertyRenamingPolicy var7 = null;
    var0.setRenamingPolicy(var6, var7);
    com.google.javascript.jscomp.ErrorFormat var9 = null;
    var0.setErrorFormat(var9);
    var0.resetWarningsGuard();
    var0.setCrossModuleMethodMotion(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test177"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var4 = var1.useSourceInfoIfMissingFrom(var3);
    boolean var5 = var3.isSetterDef();
    boolean var6 = var3.isNoSideEffectsCall();
    int var7 = var3.getType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var8 = var3.getString();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 39);

  }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test178"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.ObjectType var3 = var2.createAnonymousObjectType();
    com.google.javascript.rhino.jstype.FunctionParamBuilder var4 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(var2);
    java.lang.Iterable var6 = var2.getTypesWithProperty("{1125981799}");
    com.google.javascript.rhino.ErrorReporter var7 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7, true);
    com.google.javascript.rhino.jstype.ObjectType var10 = var9.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var11 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var11, true);
    com.google.javascript.rhino.jstype.ObjectType var14 = var13.createAnonymousObjectType();
    boolean var15 = var14.isUnknownType();
    boolean var16 = var10.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var14);
    boolean var17 = var10.isBooleanValueType();
    com.google.javascript.rhino.jstype.JSType var18 = var2.createNullableType((com.google.javascript.rhino.jstype.JSType)var10);
    boolean var19 = var18.isNominalConstructor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test179"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var4 = var1.useSourceInfoIfMissingFrom(var3);
    boolean var5 = var3.isSetterDef();
    boolean var6 = var3.isNoSideEffectsCall();
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var11 = var8.useSourceInfoIfMissingFrom(var10);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.eq(var10, var13);
    com.google.javascript.rhino.Node var15 = var10.cloneNode();
    boolean var16 = var15.isOr();
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var21 = var18.useSourceInfoIfMissingFrom(var20);
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.IR.eq(var20, var23);
    com.google.javascript.rhino.Node var25 = var20.cloneNode();
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.or(var15, var25);
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.voidNode(var26);
    com.google.javascript.rhino.Node var28 = var3.srcref(var26);
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var33 = var30.useSourceInfoIfMissingFrom(var32);
    com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.eq(var32, var35);
    com.google.javascript.rhino.Node var37 = var32.cloneNode();
    boolean var38 = var32.isDelProp();
    boolean var39 = var32.isIf();
    java.lang.String var40 = var32.toString();
    com.google.javascript.rhino.Node var41 = var26.useSourceInfoIfMissingFromForTree(var32);
    com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var46 = var43.useSourceInfoIfMissingFrom(var45);
    boolean var47 = var45.isOr();
    int var48 = var45.getChildCount();
    int var49 = var45.getType();
    boolean var50 = var45.isLabelName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.IR.ifNode(var41, var45);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
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
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "NUMBER 10.0"+ "'", var40.equals("NUMBER 10.0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);

  }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test180"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var4 = var1.useSourceInfoIfMissingFrom(var3);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.eq(var3, var6);
    com.google.javascript.rhino.Node var8 = var3.cloneNode();
    boolean var9 = var8.isOr();
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var14 = var11.useSourceInfoIfMissingFrom(var13);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.eq(var13, var16);
    com.google.javascript.rhino.Node var18 = var13.cloneNode();
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.or(var8, var18);
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var24 = var21.useSourceInfoIfMissingFrom(var23);
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var27 = var24.copyInformationFrom(var26);
    com.google.javascript.rhino.Node var28 = var8.srcrefTree(var26);
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var33 = var30.useSourceInfoIfMissingFrom(var32);
    com.google.javascript.rhino.Node var34 = com.google.javascript.rhino.IR.exprResult(var33);
    com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.IR.block(var34);
    com.google.javascript.rhino.Node var36 = var28.clonePropsFrom(var35);
    boolean var37 = var35.isQuotedString();
    boolean var38 = var35.isLocalResultCall();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.IR.continueNode(var35);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
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
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test181() {}
//   public void test181() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test181"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.CompilerOptions var2 = new com.google.javascript.jscomp.CompilerOptions();
//     var2.setCrossModuleCodeMotion(false);
//     var2.setLabelRenaming(true);
//     java.util.Set var7 = null;
//     var2.setStripTypePrefixes(var7);
//     var1.initOptions(var2);
//     java.nio.charset.Charset var11 = null;
//     com.google.javascript.jscomp.SourceFile var12 = com.google.javascript.jscomp.SourceFile.fromFile("NUMBER 10.0", var11);
//     com.google.javascript.jscomp.Region var14 = var12.getRegion(100);
//     java.lang.String var15 = var12.toString();
//     com.google.javascript.rhino.Node var16 = var1.parse(var12);
//     com.google.javascript.jscomp.CodingConvention var17 = var1.getCodingConvention();
//     var1.parse();
// 
//   }

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test182"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setCrossModuleCodeMotion(false);
    boolean var3 = var0.isExternExportsEnabled();
    var0.setRemoveClosureAsserts(true);
    java.io.PrintStream var6 = null;
    com.google.javascript.jscomp.Compiler var7 = new com.google.javascript.jscomp.Compiler(var6);
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.number(10.0d);
    boolean var10 = var9.isLabel();
    java.nio.charset.Charset var12 = null;
    com.google.javascript.jscomp.SourceFile var13 = com.google.javascript.jscomp.SourceFile.fromFile("NUMBER 10.0", var12);
    var9.setStaticSourceFile((com.google.javascript.rhino.jstype.StaticSourceFile)var13);
    java.nio.charset.Charset var16 = null;
    com.google.javascript.jscomp.SourceFile var17 = com.google.javascript.jscomp.SourceFile.fromFile("NUMBER 10.0", var16);
    com.google.javascript.jscomp.Region var19 = var17.getRegion(100);
    java.lang.String var20 = var17.toString();
    com.google.javascript.jscomp.CompilerOptions var21 = new com.google.javascript.jscomp.CompilerOptions();
    var21.setCrossModuleCodeMotion(false);
    com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var24 = null;
    var21.setAnonymousFunctionNaming(var24);
    var21.setExtractPrototypeMemberDeclarations(true);
    var21.setRemoveTryCatchFinally(true);
    var21.setFoldConstants(false);
    var21.setInlineGetters(false);
    com.google.javascript.jscomp.Result var34 = var7.compile(var13, var17, var21);
    java.util.Map var35 = var7.getInputsById();
    var0.setPropertyInvalidationErrors(var35);
    var0.setLocale("NUMBER 10.0. NUMBER 10.0 at hi! line 100 : 100");
    var0.setGenerateExports(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "NUMBER 10.0"+ "'", var20.equals("NUMBER 10.0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test183() {}
//   public void test183() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test183"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var4 = var1.useSourceInfoIfMissingFrom(var3);
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var9 = var6.useSourceInfoIfMissingFrom(var8);
//     com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.exprResult(var9);
//     java.lang.String var11 = var3.checkTreeEquals(var9);
//     boolean var12 = var3.hasMoreThanOneChild();
//     java.lang.String var13 = var3.getQualifiedName();
//     com.google.javascript.rhino.ErrorReporter var14 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var14, true);
//     com.google.javascript.rhino.ErrorReporter var17 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var17, true);
//     com.google.javascript.rhino.jstype.ObjectType var20 = var19.createAnonymousObjectType();
//     com.google.javascript.rhino.ErrorReporter var21 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var21, true);
//     com.google.javascript.rhino.jstype.ObjectType var24 = var23.createAnonymousObjectType();
//     boolean var25 = var24.isUnknownType();
//     boolean var26 = var20.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var24);
//     boolean var27 = var24.isFunctionPrototypeType();
//     var24.clearCachedValues();
//     com.google.javascript.rhino.jstype.ObjectType var29 = var24.dereference();
//     com.google.javascript.rhino.jstype.JSType[] var30 = new com.google.javascript.rhino.jstype.JSType[] { var29};
//     com.google.javascript.rhino.jstype.JSType var31 = var16.createUnionType(var30);
//     com.google.javascript.rhino.ErrorReporter var32 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var32, true);
//     com.google.javascript.rhino.jstype.JSType var35 = null;
//     boolean var37 = var34.canPropertyBeDefined(var35, "hi!");
//     boolean var39 = var34.hasNamespace("");
//     com.google.javascript.rhino.ErrorReporter var40 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var40, true);
//     com.google.javascript.rhino.jstype.ObjectType var43 = var42.createAnonymousObjectType();
//     com.google.javascript.rhino.ErrorReporter var44 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var44, true);
//     com.google.javascript.rhino.jstype.ObjectType var47 = var46.createAnonymousObjectType();
//     boolean var48 = var47.isUnknownType();
//     boolean var49 = var43.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var47);
//     boolean var50 = var47.isFunctionPrototypeType();
//     var34.resolveTypesInScope((com.google.javascript.rhino.jstype.StaticScope)var47);
//     com.google.javascript.rhino.ErrorReporter var52 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var52, true);
//     com.google.javascript.rhino.jstype.ObjectType var55 = var54.createAnonymousObjectType();
//     com.google.javascript.rhino.ErrorReporter var56 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var56, true);
//     com.google.javascript.rhino.jstype.ObjectType var59 = var58.createAnonymousObjectType();
//     boolean var60 = var59.isUnknownType();
//     boolean var61 = var55.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var59);
//     boolean var62 = var59.isFunctionPrototypeType();
//     var59.clearCachedValues();
//     com.google.javascript.rhino.jstype.ObjectType var64 = var59.dereference();
//     com.google.javascript.rhino.ErrorReporter var65 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var65, true);
//     com.google.javascript.rhino.ErrorReporter var68 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var68, true);
//     com.google.javascript.rhino.jstype.ObjectType var71 = var70.createAnonymousObjectType();
//     com.google.javascript.rhino.ErrorReporter var72 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var74 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var72, true);
//     com.google.javascript.rhino.jstype.ObjectType var75 = var74.createAnonymousObjectType();
//     boolean var76 = var75.isUnknownType();
//     boolean var77 = var71.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var75);
//     boolean var78 = var75.isFunctionPrototypeType();
//     var75.clearCachedValues();
//     com.google.javascript.rhino.jstype.ObjectType var80 = var75.dereference();
//     com.google.javascript.rhino.jstype.JSType[] var81 = new com.google.javascript.rhino.jstype.JSType[] { var80};
//     com.google.javascript.rhino.jstype.JSType var82 = var67.createUnionType(var81);
//     com.google.javascript.rhino.jstype.FunctionType var83 = var34.createConstructorType((com.google.javascript.rhino.jstype.JSType)var59, var81);
//     com.google.javascript.rhino.Node var84 = var16.createParametersWithVarArgs(var81);
//     boolean var85 = var84.isGetProp();
//     com.google.javascript.rhino.Node var86 = var3.copyInformationFromForTree(var84);
//     boolean var87 = var86.wasEmptyNode();
//     com.google.javascript.rhino.Node var88 = null;
//     com.google.javascript.rhino.Node var89 = var86.clonePropsFrom(var88);
// 
//   }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test184"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var3 = null;
    boolean var5 = var2.canPropertyBeDefined(var3, "hi!");
    boolean var7 = var2.hasNamespace("");
    com.google.javascript.rhino.ErrorReporter var9 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var9, true);
    com.google.javascript.rhino.jstype.ObjectType var12 = var11.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var13 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var13, true);
    com.google.javascript.rhino.jstype.ObjectType var16 = var15.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var17 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var17, true);
    com.google.javascript.rhino.jstype.ObjectType var20 = var19.createAnonymousObjectType();
    boolean var21 = var20.isUnknownType();
    boolean var22 = var16.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var20);
    com.google.javascript.rhino.jstype.JSType var23 = var11.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType)var16);
    var2.registerPropertyOnType("goog.exportSymbol", var23);
    com.google.javascript.rhino.jstype.JSType var26 = var2.getType("EMPTY\n");
    com.google.javascript.rhino.ErrorReporter var28 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var28, true);
    com.google.javascript.rhino.ErrorReporter var31 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var31, true);
    com.google.javascript.rhino.jstype.ObjectType var34 = var33.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var35 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var35, true);
    com.google.javascript.rhino.jstype.ObjectType var38 = var37.createAnonymousObjectType();
    boolean var39 = var38.isUnknownType();
    boolean var40 = var34.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var38);
    boolean var41 = var38.isFunctionPrototypeType();
    var38.clearCachedValues();
    com.google.javascript.rhino.jstype.ObjectType var43 = var38.dereference();
    com.google.javascript.rhino.jstype.JSType[] var44 = new com.google.javascript.rhino.jstype.JSType[] { var43};
    com.google.javascript.rhino.jstype.JSType var45 = var30.createUnionType(var44);
    com.google.javascript.rhino.ErrorReporter var46 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var46, true);
    com.google.javascript.rhino.jstype.JSType var49 = null;
    boolean var51 = var48.canPropertyBeDefined(var49, "hi!");
    boolean var53 = var48.hasNamespace("");
    com.google.javascript.rhino.jstype.FunctionBuilder var54 = new com.google.javascript.rhino.jstype.FunctionBuilder(var48);
    com.google.javascript.rhino.jstype.FunctionBuilder var56 = var54.withName("NUMBER 10.0\n");
    com.google.javascript.rhino.ErrorReporter var57 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var57, true);
    com.google.javascript.rhino.jstype.ObjectType var60 = var59.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var61 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var61, true);
    com.google.javascript.rhino.jstype.ObjectType var64 = var63.createAnonymousObjectType();
    boolean var65 = var64.isUnknownType();
    boolean var66 = var60.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var64);
    boolean var67 = var64.isFunctionPrototypeType();
    com.google.javascript.rhino.jstype.FunctionBuilder var69 = var56.withReturnType((com.google.javascript.rhino.jstype.JSType)var64, true);
    com.google.javascript.rhino.Node var71 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var73 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var74 = var71.useSourceInfoIfMissingFrom(var73);
    com.google.javascript.rhino.Node var76 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var77 = com.google.javascript.rhino.IR.eq(var73, var76);
    com.google.javascript.rhino.Node var78 = var73.cloneNode();
    boolean var79 = var78.isOr();
    com.google.javascript.rhino.jstype.StaticSourceFile var80 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var78);
    boolean var81 = var78.isDec();
    boolean var82 = var78.isFor();
    boolean var83 = var78.isNoSideEffectsCall();
    com.google.javascript.rhino.jstype.FunctionType var84 = var30.createFunctionType((com.google.javascript.rhino.jstype.JSType)var64, var78);
    com.google.javascript.rhino.jstype.ObjectType var85 = var84.getTypeOfThis();
    java.lang.Iterable var86 = var84.getAllImplementedInterfaces();
    java.lang.String var87 = var84.getTemplateTypeName();
    com.google.javascript.rhino.jstype.ObjectType.Property var89 = var84.getSlot("null(null)");
    boolean var90 = var2.declareType("null(null)", (com.google.javascript.rhino.jstype.JSType)var84);
    com.google.javascript.rhino.jstype.JSType var91 = var84.getIndexType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var91);

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test185"); }


    boolean var1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName("{2028411030}");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test186"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.ObjectType var3 = var2.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var4 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var4, true);
    com.google.javascript.rhino.jstype.ObjectType var7 = var6.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var8 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var8, true);
    com.google.javascript.rhino.jstype.ObjectType var11 = var10.createAnonymousObjectType();
    boolean var12 = var11.isUnknownType();
    boolean var13 = var7.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var11);
    com.google.javascript.rhino.jstype.JSType var14 = var2.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType)var7);
    java.lang.Iterable var16 = var2.getTypesWithProperty("Node tree inequality:\nTree1:\nEQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nTree2:\nNUMBER 10.0\n\n\nSubtree1: EQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nSubtree2: NUMBER 10.0\n");
    com.google.javascript.rhino.jstype.JSType var18 = null;
    var2.unregisterPropertyOnType("function (): {552562541}", var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
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

  }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test187"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var4 = var1.useSourceInfoIfMissingFrom(var3);
    boolean var5 = var3.isFromExterns();
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var10 = var7.useSourceInfoIfMissingFrom(var9);
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.eq(var9, var12);
    var13.setSourceEncodedPosition(100);
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var20 = var17.useSourceInfoIfMissingFrom(var19);
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.eq(var19, var22);
    com.google.javascript.rhino.Node var24 = var19.cloneNode();
    boolean var25 = var24.isOr();
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var30 = var27.useSourceInfoIfMissingFrom(var29);
    com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.eq(var29, var32);
    com.google.javascript.rhino.Node var34 = var29.cloneNode();
    com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.IR.or(var24, var34);
    com.google.javascript.rhino.Node var36 = var13.useSourceInfoFromForTree(var24);
    com.google.javascript.rhino.Node var37 = var13.removeFirstChild();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.IR.tryCatch(var3, var37);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test188"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations();
    com.google.javascript.jscomp.CompilerOptions var2 = new com.google.javascript.jscomp.CompilerOptions();
    var2.setCrossModuleCodeMotion(false);
    com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var5 = null;
    var2.setAnonymousFunctionNaming(var5);
    com.google.javascript.jscomp.CompilerOptions.TweakProcessing var7 = var2.getTweakProcessing();
    var2.setExternExportsPath("");
    var2.setIgnoreCajaProperties(false);
    com.google.javascript.jscomp.DiagnosticType var14 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
    com.google.javascript.jscomp.DiagnosticType[] var15 = new com.google.javascript.jscomp.DiagnosticType[] { var14};
    com.google.javascript.jscomp.DiagnosticGroup var16 = new com.google.javascript.jscomp.DiagnosticGroup(var15);
    com.google.javascript.jscomp.DiagnosticGroup var17 = new com.google.javascript.jscomp.DiagnosticGroup(var15);
    com.google.javascript.jscomp.CompilerOptions var19 = new com.google.javascript.jscomp.CompilerOptions();
    var19.setCrossModuleCodeMotion(false);
    com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var22 = null;
    var19.setAnonymousFunctionNaming(var22);
    var19.setExtractPrototypeMemberDeclarations(true);
    var19.setPropertyAffinity(false);
    com.google.javascript.jscomp.DiagnosticType var33 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
    com.google.javascript.jscomp.DiagnosticType var39 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
    java.lang.String[] var41 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var42 = com.google.javascript.jscomp.JSError.make("", 1, 39, var39, var41);
    com.google.javascript.jscomp.ShowByPathWarningsGuard var43 = new com.google.javascript.jscomp.ShowByPathWarningsGuard(var41);
    boolean var44 = var33.equals((java.lang.Object)var41);
    com.google.javascript.rhino.Node var47 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var50 = var47.useSourceInfoIfMissingFrom(var49);
    com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.IR.exprResult(var50);
    var51.setLength(10);
    com.google.javascript.jscomp.CheckLevel var54 = null;
    com.google.javascript.jscomp.CheckLevel var58 = null;
    com.google.javascript.jscomp.DiagnosticType var61 = com.google.javascript.jscomp.DiagnosticType.warning("{505847021}", "{505847021}");
    com.google.javascript.jscomp.DiagnosticType var67 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
    java.lang.String[] var69 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var70 = com.google.javascript.jscomp.JSError.make("", 1, 39, var67, var69);
    com.google.javascript.jscomp.ShowByPathWarningsGuard var71 = new com.google.javascript.jscomp.ShowByPathWarningsGuard(var69);
    com.google.javascript.jscomp.JSError var72 = com.google.javascript.jscomp.JSError.make("Node tree inequality:\nTree1:\nNUMBER 10.0\n\n\nTree2:\nEQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nSubtree1: NUMBER 10.0\n\n\nSubtree2: EQ\n    NUMBER 10.0\n    NUMBER 10.0\n", (-1), 10, var58, var61, var69);
    java.lang.String[] var74 = new java.lang.String[] { "null(null)"};
    com.google.javascript.jscomp.JSError var75 = com.google.javascript.jscomp.JSError.make("hi!", var51, var54, var61, var74);
    com.google.javascript.jscomp.JSError var76 = com.google.javascript.jscomp.JSError.make("module$null(null)", 100, 39, var33, var74);
    com.google.javascript.jscomp.CheckLevel var77 = var76.getDefaultLevel();
    var19.setCheckGlobalNamesLevel(var77);
    com.google.javascript.jscomp.DiagnosticType var80 = com.google.javascript.jscomp.DiagnosticType.make("module$null(null)", var77, "null(null)");
    var2.setWarningLevel(var17, var77);
    com.google.javascript.jscomp.DiagnosticGroup[] var82 = new com.google.javascript.jscomp.DiagnosticGroup[] { var17};
    com.google.javascript.jscomp.DiagnosticGroup var83 = new com.google.javascript.jscomp.DiagnosticGroup("Node tree inequality:\nTree1:\nEQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nTree2:\nNUMBER 10.0\n\n\nSubtree1: EQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nSubtree2: NUMBER 10.0\n", var82);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var84 = var0.getOutEdges((java.lang.Object)var82);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
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
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);

  }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test189"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setSourceMapOutputPath("hi!");
    var0.setReplaceStringsPlaceholderToken("hi!");
    var0.setCheckCaja(true);
    var0.setSummaryDetailLevel((-1));
    var0.setSpecializeInitialModule(false);
    var0.setDeadAssignmentElimination(false);
    com.google.javascript.jscomp.CompilerOptions.TracerMode var13 = var0.getTracerMode();
    var0.skipAllCompilerPasses();
    var0.setProtectHiddenSideEffects(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test190"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithNodeAnnotations();
    var0.clearNodeAnnotations();
    com.google.javascript.rhino.ErrorReporter var2 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2, true);
    com.google.javascript.rhino.jstype.JSType var5 = null;
    boolean var7 = var4.canPropertyBeDefined(var5, "hi!");
    boolean var9 = var4.hasNamespace("");
    com.google.javascript.rhino.ErrorReporter var11 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var11, true);
    com.google.javascript.rhino.jstype.ObjectType var14 = var13.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var15 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var15, true);
    com.google.javascript.rhino.jstype.ObjectType var18 = var17.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var19 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var19, true);
    com.google.javascript.rhino.jstype.ObjectType var22 = var21.createAnonymousObjectType();
    boolean var23 = var22.isUnknownType();
    boolean var24 = var18.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var22);
    com.google.javascript.rhino.jstype.JSType var25 = var13.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType)var18);
    var4.registerPropertyOnType("goog.exportSymbol", var25);
    com.google.javascript.rhino.jstype.JSType var28 = var4.getType("EMPTY\n");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var29 = var0.getOutEdges((java.lang.Object)var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test191"); }


    com.google.javascript.jscomp.SourceAst var0 = null;
    com.google.javascript.rhino.InputId var1 = null;
    com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, var1, false);
    com.google.javascript.jscomp.JSModule var4 = var3.getModule();
    com.google.javascript.jscomp.JSModule var5 = var3.getModule();
    com.google.javascript.jscomp.JSModule var6 = var3.getModule();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test192"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setTweakToNumberLiteral("", 1);
    com.google.javascript.jscomp.SourceMap.DetailLevel var4 = null;
    var0.setSourceMapDetailLevel(var4);
    var0.setRemoveTryCatchFinally(true);
    var0.setAliasExternals(true);
    var0.setUnaliasableGlobals("");
    var0.setCrossModuleCodeMotion(false);

  }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test193"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setCrossModuleCodeMotion(false);
    com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var3 = null;
    var0.setAnonymousFunctionNaming(var3);
    var0.setExtractPrototypeMemberDeclarations(true);
    var0.setRemoveTryCatchFinally(true);
    var0.setFoldConstants(false);
    var0.setReportPath("NUMBER 10.0\n");
    com.google.javascript.jscomp.CompilerOptions var13 = new com.google.javascript.jscomp.CompilerOptions();
    var13.setTweakToNumberLiteral("", 1);
    var13.setInlineVariables(false);
    com.google.javascript.jscomp.CompilerOptions.TracerMode var19 = var13.getTracerMode();
    var0.setTracer(var19);
    var0.setReserveRawExports(false);
    var0.setCheckCaja(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test194() {}
//   public void test194() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test194"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var4 = var1.useSourceInfoIfMissingFrom(var3);
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var9 = var6.useSourceInfoIfMissingFrom(var8);
//     com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.exprResult(var9);
//     java.lang.String var11 = var3.checkTreeEquals(var9);
//     boolean var12 = var3.hasMoreThanOneChild();
//     java.lang.String var13 = var3.getQualifiedName();
//     com.google.javascript.rhino.Node.SideEffectFlags var14 = null;
//     var3.setSideEffectFlags(var14);
// 
//   }

  public void test195() {}
//   public void test195() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test195"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.rhino.InputId var1 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, var1, true);
//     com.google.javascript.jscomp.SourceAst var4 = var3.getAst();
//     com.google.javascript.jscomp.CompilerInput var6 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var3, false);
// 
//   }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test196"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.ObjectType var3 = var2.createAnonymousObjectType();
    com.google.javascript.rhino.jstype.FunctionParamBuilder var4 = new com.google.javascript.rhino.jstype.FunctionParamBuilder(var2);
    com.google.javascript.rhino.ErrorReporter var5 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var5, true);
    com.google.javascript.rhino.ErrorReporter var8 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var8, true);
    com.google.javascript.rhino.jstype.ObjectType var11 = var10.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var12 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var12, true);
    com.google.javascript.rhino.jstype.ObjectType var15 = var14.createAnonymousObjectType();
    boolean var16 = var15.isUnknownType();
    boolean var17 = var11.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var15);
    boolean var18 = var15.isFunctionPrototypeType();
    var15.clearCachedValues();
    com.google.javascript.rhino.jstype.ObjectType var20 = var15.dereference();
    com.google.javascript.rhino.jstype.JSType[] var21 = new com.google.javascript.rhino.jstype.JSType[] { var20};
    com.google.javascript.rhino.jstype.JSType var22 = var7.createUnionType(var21);
    com.google.javascript.rhino.ErrorReporter var23 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var23, true);
    com.google.javascript.rhino.jstype.JSType var26 = null;
    boolean var28 = var25.canPropertyBeDefined(var26, "hi!");
    boolean var30 = var25.hasNamespace("");
    com.google.javascript.rhino.ErrorReporter var31 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var31, true);
    com.google.javascript.rhino.jstype.ObjectType var34 = var33.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var35 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var35, true);
    com.google.javascript.rhino.jstype.ObjectType var38 = var37.createAnonymousObjectType();
    boolean var39 = var38.isUnknownType();
    boolean var40 = var34.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var38);
    boolean var41 = var38.isFunctionPrototypeType();
    var25.resolveTypesInScope((com.google.javascript.rhino.jstype.StaticScope)var38);
    com.google.javascript.rhino.ErrorReporter var43 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var43, true);
    com.google.javascript.rhino.jstype.ObjectType var46 = var45.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var47 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var47, true);
    com.google.javascript.rhino.jstype.ObjectType var50 = var49.createAnonymousObjectType();
    boolean var51 = var50.isUnknownType();
    boolean var52 = var46.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var50);
    boolean var53 = var50.isFunctionPrototypeType();
    var50.clearCachedValues();
    com.google.javascript.rhino.jstype.ObjectType var55 = var50.dereference();
    com.google.javascript.rhino.ErrorReporter var56 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var56, true);
    com.google.javascript.rhino.ErrorReporter var59 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var59, true);
    com.google.javascript.rhino.jstype.ObjectType var62 = var61.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var63 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var63, true);
    com.google.javascript.rhino.jstype.ObjectType var66 = var65.createAnonymousObjectType();
    boolean var67 = var66.isUnknownType();
    boolean var68 = var62.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var66);
    boolean var69 = var66.isFunctionPrototypeType();
    var66.clearCachedValues();
    com.google.javascript.rhino.jstype.ObjectType var71 = var66.dereference();
    com.google.javascript.rhino.jstype.JSType[] var72 = new com.google.javascript.rhino.jstype.JSType[] { var71};
    com.google.javascript.rhino.jstype.JSType var73 = var58.createUnionType(var72);
    com.google.javascript.rhino.jstype.FunctionType var74 = var25.createConstructorType((com.google.javascript.rhino.jstype.JSType)var50, var72);
    com.google.javascript.rhino.Node var75 = var7.createParametersWithVarArgs(var72);
    boolean var76 = var4.addRequiredParams(var72);
    com.google.javascript.rhino.ErrorReporter var77 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var79 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var77, true);
    com.google.javascript.rhino.jstype.ObjectType var80 = var79.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var81 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var83 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var81, true);
    com.google.javascript.rhino.jstype.ObjectType var84 = var83.createAnonymousObjectType();
    boolean var85 = var84.isUnknownType();
    boolean var86 = var80.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var84);
    boolean var87 = var80.isBooleanValueType();
    boolean var88 = var80.isNoType();
    boolean var89 = var80.isGlobalThisType();
    boolean var90 = var4.addVarArgs((com.google.javascript.rhino.jstype.JSType)var80);
    boolean var91 = var4.hasVarArgs();
    com.google.javascript.rhino.Node var92 = com.google.javascript.rhino.IR.nullNode();
    com.google.javascript.rhino.Node var93 = var4.newOptionalParameterFromNode(var92);
    com.google.javascript.rhino.Node var94 = var4.build();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
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
    assertTrue(var76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test197"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithNodeAnnotations();
    java.util.List var1 = var0.getGraphvizNodes();
    java.util.Collection var2 = var0.getNodes();
    boolean var3 = var0.isDirected();
    com.google.javascript.jscomp.graph.SubGraph var4 = var0.newSubGraph();
    java.util.Collection var5 = var0.getNodes();
    boolean var6 = var0.isDirected();
    java.io.PrintStream var7 = null;
    com.google.javascript.jscomp.Compiler var8 = new com.google.javascript.jscomp.Compiler(var7);
    com.google.javascript.jscomp.CompilerOptions var9 = new com.google.javascript.jscomp.CompilerOptions();
    var9.setCrossModuleCodeMotion(false);
    var9.setLabelRenaming(true);
    java.util.Set var14 = null;
    var9.setStripTypePrefixes(var14);
    var8.initOptions(var9);
    boolean var17 = var8.acceptConstKeyword();
    com.google.javascript.jscomp.CodingConvention var18 = var8.getCodingConvention();
    java.util.List var21 = null;
    java.util.List var22 = null;
    com.google.javascript.jscomp.deps.SimpleDependencyInfo var23 = new com.google.javascript.jscomp.deps.SimpleDependencyInfo("", "hi!", var21, var22);
    java.lang.String var24 = var23.getPathRelativeToClosureBase();
    com.google.javascript.jscomp.DiagnosticGroups var25 = new com.google.javascript.jscomp.DiagnosticGroups();
    com.google.javascript.jscomp.DiagnosticGroup var27 = var25.forName("Node tree inequality:\nTree1:\nEXPR_RESULT\n    NUMBER 10.0\n\n\nTree2:\nCALL\n    EQ\n        NUMBER 10.0\n        NUMBER 10.0\n    OR\n        NUMBER 10.0\n        NUMBER 10.0\n\n\nSubtree1: EXPR_RESULT\n    NUMBER 10.0\n\n\nSubtree2: CALL\n    EQ\n        NUMBER 10.0\n        NUMBER 10.0\n    OR\n        NUMBER 10.0\n        NUMBER 10.0\n");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.connect((java.lang.Object)var8, (java.lang.Object)var24, (java.lang.Object)"Node tree inequality:\nTree1:\nEXPR_RESULT\n    NUMBER 10.0\n\n\nTree2:\nCALL\n    EQ\n        NUMBER 10.0\n        NUMBER 10.0\n    OR\n        NUMBER 10.0\n        NUMBER 10.0\n\n\nSubtree1: EXPR_RESULT\n    NUMBER 10.0\n\n\nSubtree2: CALL\n    EQ\n        NUMBER 10.0\n        NUMBER 10.0\n    OR\n        NUMBER 10.0\n        NUMBER 10.0\n");
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
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test198"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.ObjectType var3 = var2.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var4 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var4, true);
    com.google.javascript.rhino.jstype.ObjectType var7 = var6.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var8 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var8, true);
    com.google.javascript.rhino.jstype.ObjectType var11 = var10.createAnonymousObjectType();
    boolean var12 = var11.isUnknownType();
    boolean var13 = var7.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var11);
    com.google.javascript.rhino.jstype.JSType var14 = var2.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType)var7);
    java.lang.Iterable var16 = var2.getTypesWithProperty("Node tree inequality:\nTree1:\nEQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nTree2:\nNUMBER 10.0\n\n\nSubtree1: EQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nSubtree2: NUMBER 10.0\n");
    com.google.javascript.rhino.jstype.ObjectType var17 = var2.createAnonymousObjectType();
    boolean var18 = var17.isArrayType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test199"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setCrossModuleCodeMotion(false);
    com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var3 = null;
    var0.setAnonymousFunctionNaming(var3);
    var0.setExtractPrototypeMemberDeclarations(true);
    var0.setRemoveTryCatchFinally(true);
    var0.setFoldConstants(false);
    var0.setAssumeClosuresOnlyCaptureReferences(false);
    com.google.javascript.jscomp.CompilerOptions var14 = new com.google.javascript.jscomp.CompilerOptions();
    var14.setCrossModuleCodeMotion(false);
    com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var17 = null;
    var14.setAnonymousFunctionNaming(var17);
    var14.setExtractPrototypeMemberDeclarations(true);
    var14.setPropertyAffinity(false);
    com.google.javascript.jscomp.DiagnosticType var28 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
    com.google.javascript.jscomp.DiagnosticType var34 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
    java.lang.String[] var36 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var37 = com.google.javascript.jscomp.JSError.make("", 1, 39, var34, var36);
    com.google.javascript.jscomp.ShowByPathWarningsGuard var38 = new com.google.javascript.jscomp.ShowByPathWarningsGuard(var36);
    boolean var39 = var28.equals((java.lang.Object)var36);
    com.google.javascript.rhino.Node var42 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var44 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var45 = var42.useSourceInfoIfMissingFrom(var44);
    com.google.javascript.rhino.Node var46 = com.google.javascript.rhino.IR.exprResult(var45);
    var46.setLength(10);
    com.google.javascript.jscomp.CheckLevel var49 = null;
    com.google.javascript.jscomp.CheckLevel var53 = null;
    com.google.javascript.jscomp.DiagnosticType var56 = com.google.javascript.jscomp.DiagnosticType.warning("{505847021}", "{505847021}");
    com.google.javascript.jscomp.DiagnosticType var62 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
    java.lang.String[] var64 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var65 = com.google.javascript.jscomp.JSError.make("", 1, 39, var62, var64);
    com.google.javascript.jscomp.ShowByPathWarningsGuard var66 = new com.google.javascript.jscomp.ShowByPathWarningsGuard(var64);
    com.google.javascript.jscomp.JSError var67 = com.google.javascript.jscomp.JSError.make("Node tree inequality:\nTree1:\nNUMBER 10.0\n\n\nTree2:\nEQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nSubtree1: NUMBER 10.0\n\n\nSubtree2: EQ\n    NUMBER 10.0\n    NUMBER 10.0\n", (-1), 10, var53, var56, var64);
    java.lang.String[] var69 = new java.lang.String[] { "null(null)"};
    com.google.javascript.jscomp.JSError var70 = com.google.javascript.jscomp.JSError.make("hi!", var46, var49, var56, var69);
    com.google.javascript.jscomp.JSError var71 = com.google.javascript.jscomp.JSError.make("module$null(null)", 100, 39, var28, var69);
    com.google.javascript.jscomp.CheckLevel var72 = var71.getDefaultLevel();
    var14.setCheckGlobalNamesLevel(var72);
    com.google.javascript.jscomp.DiagnosticType var75 = com.google.javascript.jscomp.DiagnosticType.make("module$null(null)", var72, "null(null)");
    var0.setReportUnknownTypes(var72);
    var0.setOutputJsStringUsage(true);
    com.google.javascript.jscomp.CompilerOptions.LanguageMode var79 = var0.getLanguageIn();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
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
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);

  }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test200"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.number(10.0d);
    boolean var2 = var1.isLabel();
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.Node.newString("{1459695149}", 0, 10);
    boolean var7 = var6.isAssign();
    com.google.javascript.rhino.Node var8 = var1.useSourceInfoIfMissingFrom(var6);
    boolean var9 = var6.isFromExterns();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var11 = var6.getExistingIntProp(0);
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
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test201"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setSourceMapOutputPath("hi!");
    var0.setIdeMode(false);
    java.util.Set var5 = null;
    var0.setReplaceStringsReservedStrings(var5);
    var0.resetWarningsGuard();
    var0.setInputDelimiter("");
    var0.resetWarningsGuard();
    var0.setAliasExternals(false);
    var0.setLocale("{1125981799}");

  }

  public void test202() {}
//   public void test202() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test202"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.CompilerOptions var2 = new com.google.javascript.jscomp.CompilerOptions();
//     var2.setCrossModuleCodeMotion(false);
//     var2.setLabelRenaming(true);
//     java.util.Set var7 = null;
//     var2.setStripTypePrefixes(var7);
//     var1.initOptions(var2);
//     boolean var10 = var1.acceptConstKeyword();
//     com.google.javascript.jscomp.Region var13 = var1.getSourceRegion("goog.exportSymbol", (-1));
//     com.google.javascript.jscomp.CheckLevel var17 = null;
//     com.google.javascript.jscomp.DiagnosticType var20 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
//     com.google.javascript.jscomp.DiagnosticType var26 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
//     java.lang.String[] var28 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var29 = com.google.javascript.jscomp.JSError.make("", 1, 39, var26, var28);
//     com.google.javascript.jscomp.JSError var30 = com.google.javascript.jscomp.JSError.make("hi!", 100, 100, var17, var20, var28);
//     int var31 = var30.getNodeLength();
//     int var32 = var30.getCharno();
//     var1.report(var30);
//     boolean var34 = var1.acceptEcmaScript5();
//     com.google.javascript.jscomp.NodeTraversal.Callback var35 = null;
//     com.google.javascript.jscomp.NodeTraversal var36 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var1, var35);
//     int var37 = var36.getLineNumber();
//     com.google.javascript.jscomp.CompilerInput var38 = var36.getInput();
// 
//   }

  public void test203() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test203"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var4 = var1.useSourceInfoIfMissingFrom(var3);
    boolean var5 = var3.isSetterDef();
    boolean var6 = var3.isNoSideEffectsCall();
    int var7 = var3.getType();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.number(10.0d);
    boolean var11 = var10.isLabel();
    com.google.javascript.rhino.Node var14 = new com.google.javascript.rhino.Node(31, var10, 10, 31);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.propdef(var3, var14);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test204"); }


    com.google.javascript.rhino.JSDocInfoBuilder var1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    boolean var2 = var1.recordOverride();
    java.util.Set var3 = null;
    boolean var4 = var1.recordModifies(var3);
    java.util.Set var5 = null;
    boolean var6 = var1.recordModifies(var5);
    boolean var8 = var1.recordLends("EQ 0");
    boolean var9 = var1.recordInterface();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test205"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.io.PrintStream var1 = null;
    com.google.javascript.jscomp.Compiler var2 = new com.google.javascript.jscomp.Compiler(var1);
    com.google.javascript.jscomp.LightweightMessageFormatter var3 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var2);
    java.io.PrintStream var4 = null;
    com.google.javascript.jscomp.PrintStreamErrorManager var5 = new com.google.javascript.jscomp.PrintStreamErrorManager((com.google.javascript.jscomp.MessageFormatter)var3, var4);
    int var6 = var5.getWarningCount();
    var5.setSummaryDetailLevel(1);
    com.google.javascript.jscomp.JSError[] var9 = var5.getWarnings();
    java.io.PrintStream var10 = null;
    com.google.javascript.jscomp.Compiler var11 = new com.google.javascript.jscomp.Compiler(var10);
    com.google.javascript.jscomp.CompilerOptions var12 = new com.google.javascript.jscomp.CompilerOptions();
    var12.setCrossModuleCodeMotion(false);
    var12.setLabelRenaming(true);
    java.util.Set var17 = null;
    var12.setStripTypePrefixes(var17);
    var11.initOptions(var12);
    java.nio.charset.Charset var21 = null;
    com.google.javascript.jscomp.SourceFile var22 = com.google.javascript.jscomp.SourceFile.fromFile("NUMBER 10.0", var21);
    com.google.javascript.jscomp.Region var24 = var22.getRegion(100);
    java.lang.String var25 = var22.toString();
    com.google.javascript.rhino.Node var26 = var11.parse(var22);
    java.lang.String var27 = var11.getAstDotGraph();
    java.io.PrintStream var28 = null;
    com.google.javascript.jscomp.Compiler var29 = new com.google.javascript.jscomp.Compiler(var28);
    com.google.javascript.jscomp.LightweightMessageFormatter var30 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var29);
    com.google.javascript.jscomp.Compiler.IntermediateState var31 = var29.getState();
    var11.setState(var31);
    java.lang.Object var33 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var34 = var0.isConnected((java.lang.Object)var5, (java.lang.Object)var31, var33);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "NUMBER 10.0"+ "'", var25.equals("NUMBER 10.0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test206() {}
//   public void test206() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test206"); }
// 
// 
//     com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
//     var0.setCrossModuleCodeMotion(false);
//     com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var3 = null;
//     var0.setAnonymousFunctionNaming(var3);
//     var0.setExtractPrototypeMemberDeclarations(true);
//     var0.setRemoveTryCatchFinally(true);
//     var0.setSyntheticBlockStartMarker("hi!");
//     boolean var11 = var0.isExternExportsEnabled();
//     var0.setDebugFunctionSideEffectsPath("{2018015076}");
//     var0.setAcceptConstKeyword(false);
//     var0.setCheckMissingGetCssNameBlacklist("{1358476415}");
//     com.google.javascript.jscomp.DependencyOptions var18 = null;
//     var0.setDependencyOptions(var18);
// 
//   }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test207"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setSourceMapOutputPath("hi!");
    var0.setReplaceStringsPlaceholderToken("hi!");
    var0.setIdeMode(false);
    var0.setColorizeErrorOutput(false);
    com.google.javascript.jscomp.CompilerOptions var9 = new com.google.javascript.jscomp.CompilerOptions();
    var9.setSourceMapOutputPath("hi!");
    var9.setIdeMode(false);
    com.google.javascript.jscomp.CompilerOptions.LanguageMode var14 = var9.getLanguageIn();
    var0.setLanguageOut(var14);
    com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler var16 = var0.getAliasTransformationHandler();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test208() {}
//   public void test208() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test208"); }
// 
// 
//     java.io.InputStream var1 = null;
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromInputStream("Node tree inequality:\nTree1:\nNUMBER 10.0\n\n\nTree2:\nEQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nSubtree1: NUMBER 10.0\n\n\nSubtree2: EQ\n    NUMBER 10.0\n    NUMBER 10.0\n", var1);
// 
//   }

  public void test209() {}
//   public void test209() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test209"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.CompilerOptions var2 = new com.google.javascript.jscomp.CompilerOptions();
//     var2.setCrossModuleCodeMotion(false);
//     var2.setLabelRenaming(true);
//     java.util.Set var7 = null;
//     var2.setStripTypePrefixes(var7);
//     var1.initOptions(var2);
//     java.nio.charset.Charset var11 = null;
//     com.google.javascript.jscomp.SourceFile var12 = com.google.javascript.jscomp.SourceFile.fromFile("NUMBER 10.0", var11);
//     com.google.javascript.jscomp.Region var14 = var12.getRegion(100);
//     java.lang.String var15 = var12.toString();
//     com.google.javascript.rhino.Node var16 = var1.parse(var12);
//     com.google.javascript.jscomp.CompilerOptions.LanguageMode var17 = var1.languageMode();
//     boolean var18 = var1.isTypeCheckingEnabled();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var19 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithNodeAnnotations();
//     java.util.List var20 = var19.getGraphvizNodes();
//     java.io.PrintStream var21 = null;
//     com.google.javascript.jscomp.Compiler var22 = new com.google.javascript.jscomp.Compiler(var21);
//     com.google.javascript.jscomp.CompilerOptions var23 = new com.google.javascript.jscomp.CompilerOptions();
//     var23.setCrossModuleCodeMotion(false);
//     var23.setLabelRenaming(true);
//     java.util.Set var28 = null;
//     var23.setStripTypePrefixes(var28);
//     var22.initOptions(var23);
//     boolean var31 = var22.acceptConstKeyword();
//     com.google.javascript.jscomp.CodingConvention var32 = var22.getCodingConvention();
//     boolean var33 = var22.acceptConstKeyword();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var34 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithNodeAnnotations();
//     java.util.List var35 = var34.getGraphvizNodes();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var36 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithNodeAnnotations();
//     java.util.List var37 = var36.getGraphvizNodes();
//     com.google.javascript.jscomp.CompilerOptions var38 = new com.google.javascript.jscomp.CompilerOptions();
//     var38.setCrossModuleCodeMotion(false);
//     boolean var41 = var38.isExternExportsEnabled();
//     var38.setCheckTypes(false);
//     var38.setPreferLineBreakAtEndOfFile(false);
//     var38.setNameReferenceGraphPath("{1125981799}");
//     var22.<com.google.javascript.jscomp.SourceFile,com.google.javascript.jscomp.SourceFile>init(var35, var37, var38);
//     com.google.javascript.jscomp.CompilerOptions var49 = new com.google.javascript.jscomp.CompilerOptions();
//     var49.setCrossModuleCodeMotion(false);
//     com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var52 = null;
//     var49.setAnonymousFunctionNaming(var52);
//     var49.setExtractPrototypeMemberDeclarations(true);
//     var49.setPropertyAffinity(false);
//     var49.setRemoveUnusedPrototypePropertiesInExterns(false);
//     var1.<com.google.javascript.jscomp.SourceFile,com.google.javascript.jscomp.SourceFile>init(var20, var35, var49);
//     com.google.javascript.jscomp.CompilerInput var62 = var1.newExternInput("null(null)");
// 
//   }

  public void test210() {}
//   public void test210() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test210"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithNodeAnnotations();
//     com.google.javascript.rhino.ErrorReporter var1 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var1, true);
//     com.google.javascript.rhino.jstype.JSType var4 = null;
//     boolean var6 = var3.canPropertyBeDefined(var4, "hi!");
//     boolean var8 = var3.hasNamespace("");
//     com.google.javascript.rhino.ErrorReporter var9 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var9, true);
//     com.google.javascript.rhino.jstype.ObjectType var12 = var11.createAnonymousObjectType();
//     com.google.javascript.rhino.ErrorReporter var13 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var13, true);
//     com.google.javascript.rhino.jstype.ObjectType var16 = var15.createAnonymousObjectType();
//     boolean var17 = var16.isUnknownType();
//     boolean var18 = var12.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var16);
//     boolean var19 = var16.isFunctionPrototypeType();
//     var3.resolveTypesInScope((com.google.javascript.rhino.jstype.StaticScope)var16);
//     com.google.javascript.rhino.ErrorReporter var21 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var21, true);
//     com.google.javascript.rhino.jstype.ObjectType var24 = var23.createAnonymousObjectType();
//     com.google.javascript.rhino.ErrorReporter var25 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var25, true);
//     com.google.javascript.rhino.jstype.ObjectType var28 = var27.createAnonymousObjectType();
//     boolean var29 = var28.isUnknownType();
//     boolean var30 = var24.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var28);
//     boolean var31 = var28.isFunctionPrototypeType();
//     var28.clearCachedValues();
//     com.google.javascript.rhino.jstype.ObjectType var33 = var28.dereference();
//     com.google.javascript.rhino.ErrorReporter var34 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var34, true);
//     com.google.javascript.rhino.ErrorReporter var37 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var37, true);
//     com.google.javascript.rhino.jstype.ObjectType var40 = var39.createAnonymousObjectType();
//     com.google.javascript.rhino.ErrorReporter var41 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var41, true);
//     com.google.javascript.rhino.jstype.ObjectType var44 = var43.createAnonymousObjectType();
//     boolean var45 = var44.isUnknownType();
//     boolean var46 = var40.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var44);
//     boolean var47 = var44.isFunctionPrototypeType();
//     var44.clearCachedValues();
//     com.google.javascript.rhino.jstype.ObjectType var49 = var44.dereference();
//     com.google.javascript.rhino.jstype.JSType[] var50 = new com.google.javascript.rhino.jstype.JSType[] { var49};
//     com.google.javascript.rhino.jstype.JSType var51 = var36.createUnionType(var50);
//     com.google.javascript.rhino.jstype.FunctionType var52 = var3.createConstructorType((com.google.javascript.rhino.jstype.JSType)var28, var50);
//     com.google.javascript.rhino.jstype.FunctionType var53 = var52.toMaybeFunctionType();
//     com.google.javascript.rhino.jstype.ObjectType var55 = var52.getTopMostDefiningType("module$");
//     boolean var56 = var52.isInterface();
//     java.util.Iterator var57 = var0.getNeighborNodesIterator((java.lang.Object)var52);
// 
//   }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test211"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var4 = var1.useSourceInfoIfMissingFrom(var3);
    boolean var5 = var3.isSetterDef();
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var10 = var7.useSourceInfoIfMissingFrom(var9);
    var3.addChildrenToFront(var9);
    boolean var12 = var3.isObjectLit();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test212"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithNodeAnnotations();
    java.util.List var1 = var0.getGraphvizNodes();
    java.util.Collection var2 = var0.getNodes();
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.empty();
    com.google.javascript.jscomp.DiagnosticType var10 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
    java.lang.String[] var12 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var13 = com.google.javascript.jscomp.JSError.make("", 1, 39, var10, var12);
    com.google.javascript.jscomp.CheckLevel var17 = null;
    com.google.javascript.jscomp.DiagnosticType var20 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
    com.google.javascript.jscomp.DiagnosticType var26 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
    java.lang.String[] var28 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var29 = com.google.javascript.jscomp.JSError.make("", 1, 39, var26, var28);
    com.google.javascript.jscomp.JSError var30 = com.google.javascript.jscomp.JSError.make("hi!", 100, 100, var17, var20, var28);
    com.google.javascript.jscomp.JSError var31 = com.google.javascript.jscomp.JSError.make("NUMBER 10.0\n", var4, var10, var28);
    java.lang.String var32 = var4.toStringTree();
    boolean var33 = var4.isThis();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var34 = var0.getInEdges((java.lang.Object)var4);
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "EMPTY\n"+ "'", var32.equals("EMPTY\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test213() {}
//   public void test213() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test213"); }
// 
// 
//     com.google.javascript.jscomp.CodingConvention var0 = null;
//     com.google.javascript.jscomp.ClosureCodingConvention var1 = new com.google.javascript.jscomp.ClosureCodingConvention(var0);
//     com.google.javascript.rhino.jstype.JSTypeRegistry var2 = null;
//     com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter var3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter((com.google.javascript.jscomp.CodingConvention)var1, var2);
//     com.google.javascript.jscomp.ClosureCodingConvention var4 = new com.google.javascript.jscomp.ClosureCodingConvention((com.google.javascript.jscomp.CodingConvention)var1);
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var9 = var6.useSourceInfoIfMissingFrom(var8);
//     com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.eq(var8, var11);
//     com.google.javascript.rhino.Node var13 = var8.cloneNode();
//     boolean var14 = var13.isOr();
//     com.google.javascript.rhino.jstype.StaticSourceFile var15 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var13);
//     boolean var16 = var13.isDec();
//     boolean var17 = var13.isFor();
//     boolean var18 = var1.isVarArgsParameter(var13);
//     boolean var20 = var1.isConstant("Node tree inequality:\nTree1:\nNUMBER 10.0\n\n\nTree2:\nBLOCK\n    EXPR_RESULT\n        NUMBER 10.0\n\n\nSubtree1: NUMBER 10.0\n\n\nSubtree2: BLOCK\n    EXPR_RESULT\n        NUMBER 10.0\n");
// 
//   }

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test214"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.ErrorReporter var3 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var3, true);
    com.google.javascript.rhino.jstype.ObjectType var6 = var5.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var7 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7, true);
    com.google.javascript.rhino.jstype.ObjectType var10 = var9.createAnonymousObjectType();
    boolean var11 = var10.isUnknownType();
    boolean var12 = var6.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var10);
    boolean var13 = var10.isFunctionPrototypeType();
    var10.clearCachedValues();
    com.google.javascript.rhino.jstype.ObjectType var15 = var10.dereference();
    com.google.javascript.rhino.jstype.JSType[] var16 = new com.google.javascript.rhino.jstype.JSType[] { var15};
    com.google.javascript.rhino.jstype.JSType var17 = var2.createUnionType(var16);
    com.google.javascript.rhino.ErrorReporter var18 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var18, true);
    com.google.javascript.rhino.jstype.JSType var21 = null;
    boolean var23 = var20.canPropertyBeDefined(var21, "hi!");
    boolean var25 = var20.hasNamespace("");
    com.google.javascript.rhino.jstype.FunctionBuilder var26 = new com.google.javascript.rhino.jstype.FunctionBuilder(var20);
    com.google.javascript.rhino.jstype.FunctionBuilder var28 = var26.withName("NUMBER 10.0\n");
    com.google.javascript.rhino.ErrorReporter var29 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var29, true);
    com.google.javascript.rhino.jstype.ObjectType var32 = var31.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var33 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var33, true);
    com.google.javascript.rhino.jstype.ObjectType var36 = var35.createAnonymousObjectType();
    boolean var37 = var36.isUnknownType();
    boolean var38 = var32.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var36);
    boolean var39 = var36.isFunctionPrototypeType();
    com.google.javascript.rhino.jstype.FunctionBuilder var41 = var28.withReturnType((com.google.javascript.rhino.jstype.JSType)var36, true);
    com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var46 = var43.useSourceInfoIfMissingFrom(var45);
    com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.eq(var45, var48);
    com.google.javascript.rhino.Node var50 = var45.cloneNode();
    boolean var51 = var50.isOr();
    com.google.javascript.rhino.jstype.StaticSourceFile var52 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var50);
    boolean var53 = var50.isDec();
    boolean var54 = var50.isFor();
    boolean var55 = var50.isNoSideEffectsCall();
    com.google.javascript.rhino.jstype.FunctionType var56 = var2.createFunctionType((com.google.javascript.rhino.jstype.JSType)var36, var50);
    int var57 = var56.getExtendedInterfacesCount();
    com.google.javascript.rhino.ErrorReporter var58 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var58, true);
    com.google.javascript.rhino.jstype.ObjectType var61 = var60.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var62 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var62, true);
    com.google.javascript.rhino.jstype.ObjectType var65 = var64.createAnonymousObjectType();
    boolean var66 = var65.isUnknownType();
    boolean var67 = var61.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var65);
    boolean var68 = var61.isStringValueType();
    com.google.javascript.rhino.jstype.ObjectType var69 = var61.dereference();
    var56.setPrototypeBasedOn(var69);
    com.google.javascript.rhino.Node var72 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var74 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var75 = var72.useSourceInfoIfMissingFrom(var74);
    com.google.javascript.rhino.Node var77 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var78 = com.google.javascript.rhino.IR.eq(var74, var77);
    com.google.javascript.rhino.Node var79 = var74.cloneNode();
    com.google.javascript.rhino.Node var81 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var83 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var84 = var81.useSourceInfoIfMissingFrom(var83);
    com.google.javascript.rhino.Node var86 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var88 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var89 = var86.useSourceInfoIfMissingFrom(var88);
    com.google.javascript.rhino.Node var90 = com.google.javascript.rhino.IR.exprResult(var89);
    java.lang.String var91 = var83.checkTreeEquals(var89);
    com.google.javascript.rhino.Node var92 = var74.srcref(var83);
    var56.setSource(var92);
    java.lang.Object var95 = null;
    var92.putProp(0, var95);
    com.google.javascript.rhino.Node var97 = var92.cloneTree();
    com.google.javascript.rhino.jstype.StaticSourceFile var98 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
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
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var98);

  }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test215"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.empty();
    com.google.javascript.jscomp.DiagnosticType var7 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
    java.lang.String[] var9 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var10 = com.google.javascript.jscomp.JSError.make("", 1, 39, var7, var9);
    com.google.javascript.jscomp.CheckLevel var14 = null;
    com.google.javascript.jscomp.DiagnosticType var17 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
    com.google.javascript.jscomp.DiagnosticType var23 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
    java.lang.String[] var25 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var26 = com.google.javascript.jscomp.JSError.make("", 1, 39, var23, var25);
    com.google.javascript.jscomp.JSError var27 = com.google.javascript.jscomp.JSError.make("hi!", 100, 100, var14, var17, var25);
    com.google.javascript.jscomp.JSError var28 = com.google.javascript.jscomp.JSError.make("NUMBER 10.0\n", var1, var7, var25);
    boolean var29 = var1.isThis();
    boolean var30 = var1.isLocalResultCall();
    boolean var31 = var1.isNot();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
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
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test216"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setCrossModuleCodeMotion(false);
    com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var3 = null;
    var0.setAnonymousFunctionNaming(var3);
    var0.setExtractPrototypeMemberDeclarations(true);
    var0.setRemoveClosureAsserts(false);
    var0.setPreferLineBreakAtEndOfFile(false);
    com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var11 = null;
    var0.setAnonymousFunctionNaming(var11);
    var0.setAliasExternals(false);
    var0.setLocale("function (): {478318594}");

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test217"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.number(10.0d);
    boolean var2 = var1.isLabel();
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.Node.newString("{1459695149}", 0, 10);
    boolean var7 = var6.isAssign();
    com.google.javascript.rhino.Node var8 = var1.useSourceInfoIfMissingFrom(var6);
    com.google.javascript.rhino.ErrorReporter var9 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var9, true);
    com.google.javascript.rhino.jstype.ObjectType var12 = var11.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var13 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var13, true);
    com.google.javascript.rhino.jstype.ObjectType var16 = var15.createAnonymousObjectType();
    boolean var17 = var16.isUnknownType();
    boolean var18 = var12.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var16);
    boolean var19 = var12.isBooleanValueType();
    com.google.javascript.rhino.ErrorReporter var20 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var20, true);
    com.google.javascript.rhino.ErrorReporter var23 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var23, true);
    com.google.javascript.rhino.jstype.ObjectType var26 = var25.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var27 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var27, true);
    com.google.javascript.rhino.jstype.ObjectType var30 = var29.createAnonymousObjectType();
    boolean var31 = var30.isUnknownType();
    boolean var32 = var26.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var30);
    boolean var33 = var30.isFunctionPrototypeType();
    var30.clearCachedValues();
    com.google.javascript.rhino.jstype.ObjectType var35 = var30.dereference();
    com.google.javascript.rhino.jstype.JSType[] var36 = new com.google.javascript.rhino.jstype.JSType[] { var35};
    com.google.javascript.rhino.jstype.JSType var37 = var22.createUnionType(var36);
    com.google.javascript.rhino.ErrorReporter var38 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var38, true);
    com.google.javascript.rhino.jstype.JSType var41 = null;
    boolean var43 = var40.canPropertyBeDefined(var41, "hi!");
    boolean var45 = var40.hasNamespace("");
    com.google.javascript.rhino.jstype.FunctionBuilder var46 = new com.google.javascript.rhino.jstype.FunctionBuilder(var40);
    com.google.javascript.rhino.jstype.FunctionBuilder var48 = var46.withName("NUMBER 10.0\n");
    com.google.javascript.rhino.ErrorReporter var49 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var49, true);
    com.google.javascript.rhino.jstype.ObjectType var52 = var51.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var53 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var53, true);
    com.google.javascript.rhino.jstype.ObjectType var56 = var55.createAnonymousObjectType();
    boolean var57 = var56.isUnknownType();
    boolean var58 = var52.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var56);
    boolean var59 = var56.isFunctionPrototypeType();
    com.google.javascript.rhino.jstype.FunctionBuilder var61 = var48.withReturnType((com.google.javascript.rhino.jstype.JSType)var56, true);
    com.google.javascript.rhino.Node var63 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var65 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var66 = var63.useSourceInfoIfMissingFrom(var65);
    com.google.javascript.rhino.Node var68 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var69 = com.google.javascript.rhino.IR.eq(var65, var68);
    com.google.javascript.rhino.Node var70 = var65.cloneNode();
    boolean var71 = var70.isOr();
    com.google.javascript.rhino.jstype.StaticSourceFile var72 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var70);
    boolean var73 = var70.isDec();
    boolean var74 = var70.isFor();
    boolean var75 = var70.isNoSideEffectsCall();
    com.google.javascript.rhino.jstype.FunctionType var76 = var22.createFunctionType((com.google.javascript.rhino.jstype.JSType)var56, var70);
    boolean var77 = var12.differsFrom((com.google.javascript.rhino.jstype.JSType)var56);
    com.google.javascript.rhino.jstype.JSType var79 = var12.getRestrictedTypeGivenToBooleanOutcome(false);
    com.google.javascript.rhino.jstype.ObjectType var80 = var12.getParentScope();
    boolean var81 = var80.isTemplateType();
    var8.setJSType((com.google.javascript.rhino.jstype.JSType)var80);
    com.google.javascript.rhino.jstype.ObjectType var83 = var80.getParentScope();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);

  }

  public void test218() {}
//   public void test218() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test218"); }
// 
// 
//     com.google.javascript.jscomp.CodingConvention var0 = null;
//     com.google.javascript.jscomp.ClosureCodingConvention var1 = new com.google.javascript.jscomp.ClosureCodingConvention(var0);
//     boolean var3 = var1.isSuperClassReference("hi!");
//     com.google.javascript.jscomp.ClosureCodingConvention var4 = new com.google.javascript.jscomp.ClosureCodingConvention((com.google.javascript.jscomp.CodingConvention)var1);
//     boolean var6 = var1.isValidEnumKey("DependencyInfo(relativePath='EMPTY\n', path='Node tree inequality:\nTree1:\nEQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nTree2:\nNUMBER 10.0\n\n\nSubtree1: EQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nSubtree2: NUMBER 10.0\n', provides=null, requires=null)");
// 
//   }

  public void test219() {}
//   public void test219() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test219"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.rhino.InputId var1 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, var1, false);
//     boolean var4 = var3.isExtern();
//     java.util.Collection var5 = var3.getRequires();
// 
//   }

  public void test220() {}
//   public void test220() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test220"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticGroup var0 = null;
//     com.google.javascript.jscomp.CheckLevel var1 = null;
//     com.google.javascript.jscomp.DiagnosticGroupWarningsGuard var2 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(var0, var1);
//     java.lang.String var3 = var2.toString();
//     java.lang.String var4 = var2.toString();
//     com.google.javascript.jscomp.CompilerOptions var5 = new com.google.javascript.jscomp.CompilerOptions();
//     var5.setCrossModuleCodeMotion(false);
//     com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var8 = null;
//     var5.setAnonymousFunctionNaming(var8);
//     var5.setExtractPrototypeMemberDeclarations(true);
//     var5.setRemoveTryCatchFinally(true);
//     var5.setFoldConstants(false);
//     var5.setSourceMapOutputPath("NUMBER 10.0");
//     var5.setCoalesceVariableNames(true);
//     java.util.Set var20 = null;
//     var5.setStripTypePrefixes(var20);
//     com.google.javascript.jscomp.DiagnosticType var24 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
//     com.google.javascript.jscomp.DiagnosticType[] var25 = new com.google.javascript.jscomp.DiagnosticType[] { var24};
//     com.google.javascript.jscomp.DiagnosticGroup var26 = new com.google.javascript.jscomp.DiagnosticGroup(var25);
//     java.lang.Iterable var27 = var26.getTypes();
//     java.lang.String var28 = var26.toString();
//     com.google.javascript.jscomp.CompilerOptions var29 = new com.google.javascript.jscomp.CompilerOptions();
//     var29.setCrossModuleCodeMotion(false);
//     com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var32 = null;
//     var29.setAnonymousFunctionNaming(var32);
//     var29.setExtractPrototypeMemberDeclarations(true);
//     var29.setPropertyAffinity(false);
//     com.google.javascript.jscomp.DiagnosticType var43 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
//     com.google.javascript.jscomp.DiagnosticType var49 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
//     java.lang.String[] var51 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var52 = com.google.javascript.jscomp.JSError.make("", 1, 39, var49, var51);
//     com.google.javascript.jscomp.ShowByPathWarningsGuard var53 = new com.google.javascript.jscomp.ShowByPathWarningsGuard(var51);
//     boolean var54 = var43.equals((java.lang.Object)var51);
//     com.google.javascript.rhino.Node var57 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var59 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var60 = var57.useSourceInfoIfMissingFrom(var59);
//     com.google.javascript.rhino.Node var61 = com.google.javascript.rhino.IR.exprResult(var60);
//     var61.setLength(10);
//     com.google.javascript.jscomp.CheckLevel var64 = null;
//     com.google.javascript.jscomp.CheckLevel var68 = null;
//     com.google.javascript.jscomp.DiagnosticType var71 = com.google.javascript.jscomp.DiagnosticType.warning("{505847021}", "{505847021}");
//     com.google.javascript.jscomp.DiagnosticType var77 = com.google.javascript.jscomp.DiagnosticType.disabled("NUMBER 10.0", "NUMBER 10.0");
//     java.lang.String[] var79 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var80 = com.google.javascript.jscomp.JSError.make("", 1, 39, var77, var79);
//     com.google.javascript.jscomp.ShowByPathWarningsGuard var81 = new com.google.javascript.jscomp.ShowByPathWarningsGuard(var79);
//     com.google.javascript.jscomp.JSError var82 = com.google.javascript.jscomp.JSError.make("Node tree inequality:\nTree1:\nNUMBER 10.0\n\n\nTree2:\nEQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nSubtree1: NUMBER 10.0\n\n\nSubtree2: EQ\n    NUMBER 10.0\n    NUMBER 10.0\n", (-1), 10, var68, var71, var79);
//     java.lang.String[] var84 = new java.lang.String[] { "null(null)"};
//     com.google.javascript.jscomp.JSError var85 = com.google.javascript.jscomp.JSError.make("hi!", var61, var64, var71, var84);
//     com.google.javascript.jscomp.JSError var86 = com.google.javascript.jscomp.JSError.make("module$null(null)", 100, 39, var43, var84);
//     com.google.javascript.jscomp.CheckLevel var87 = var86.getDefaultLevel();
//     var29.setCheckGlobalNamesLevel(var87);
//     var5.setWarningLevel(var26, var87);
//     boolean var90 = var2.disables(var26);
// 
//   }

  public void test221() {}
//   public void test221() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test221"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var2 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
//     com.google.javascript.jscomp.SourceMap var3 = var1.getSourceMap();
//     com.google.javascript.jscomp.CodingConvention var4 = var1.getCodingConvention();
// 
//   }

  public void test222() {}
//   public void test222() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test222"); }
// 
// 
//     com.google.javascript.jscomp.CodingConvention var0 = null;
//     com.google.javascript.jscomp.ClosureCodingConvention var1 = new com.google.javascript.jscomp.ClosureCodingConvention(var0);
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.number(10.0d);
//     boolean var4 = var3.isLabel();
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var9 = var6.useSourceInfoIfMissingFrom(var8);
//     boolean var10 = var8.isFalse();
//     com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.sheq(var3, var8);
//     com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.Node.newString(0, "hi!");
//     java.lang.String var15 = var1.extractClassNameIfRequire(var3, var14);
//     boolean var18 = var1.isExported("null", true);
// 
//   }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test223"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setSourceMapOutputPath("hi!");
    var0.setIdeMode(false);
    java.util.Set var5 = null;
    var0.setReplaceStringsReservedStrings(var5);
    var0.setDebugFunctionSideEffectsPath("hi!");
    var0.setCollapseObjectLiterals(true);
    var0.setOptimizeReturns(false);
    com.google.javascript.jscomp.CheckLevel var13 = null;
    var0.setCheckRequires(var13);
    var0.setTransformAMDToCJSModules(false);
    var0.setRenamePrefix("module$");

  }

  public void test224() {}
//   public void test224() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test224"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var4 = var1.useSourceInfoIfMissingFrom(var3);
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.eq(var3, var6);
//     com.google.javascript.rhino.Node var8 = var3.cloneNode();
//     com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var13 = var10.useSourceInfoIfMissingFrom(var12);
//     com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var18 = var15.useSourceInfoIfMissingFrom(var17);
//     com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.exprResult(var18);
//     java.lang.String var20 = var12.checkTreeEquals(var18);
//     com.google.javascript.rhino.Node var21 = var3.srcref(var12);
//     boolean var22 = var21.isRegExp();
//     com.google.javascript.rhino.ErrorReporter var24 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var24, true);
//     com.google.javascript.rhino.jstype.ObjectType var27 = var26.createAnonymousObjectType();
//     com.google.javascript.rhino.ErrorReporter var28 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var28, true);
//     com.google.javascript.rhino.jstype.ObjectType var31 = var30.createAnonymousObjectType();
//     com.google.javascript.rhino.ErrorReporter var32 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var32, true);
//     com.google.javascript.rhino.jstype.ObjectType var35 = var34.createAnonymousObjectType();
//     boolean var36 = var35.isUnknownType();
//     boolean var37 = var31.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var35);
//     com.google.javascript.rhino.jstype.JSType var38 = var26.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType)var31);
//     boolean var39 = var31.isBooleanValueType();
//     java.lang.String var40 = var31.toDebugHashCodeString();
//     com.google.javascript.rhino.ErrorReporter var41 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var41, true);
//     com.google.javascript.rhino.jstype.ObjectType var44 = var43.createAnonymousObjectType();
//     com.google.javascript.rhino.ErrorReporter var45 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var45, true);
//     com.google.javascript.rhino.jstype.ObjectType var48 = var47.createAnonymousObjectType();
//     boolean var49 = var48.isUnknownType();
//     boolean var50 = var44.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var48);
//     boolean var51 = var48.isFunctionPrototypeType();
//     com.google.javascript.rhino.jstype.ObjectType var52 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType)var48);
//     boolean var54 = var52.hasOwnProperty("");
//     boolean var55 = var52.isEnumElementType();
//     com.google.javascript.rhino.jstype.JSType.TypePair var56 = var31.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType)var52);
//     var21.putProp(31, (java.lang.Object)var56);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       java.lang.String var58 = var21.getString();
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
//     assertNotNull(var3);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var4);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var6);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var8);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var10);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var12);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var13);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var15);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var17);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var18);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var19);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var20);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var21);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var22 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var27);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var31);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var35);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var36 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var37 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var38);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var39 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var40 + "' != '" + "{1771288074}"+ "'", var40.equals("{1771288074}"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var44);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var48);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var49 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var50 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var51 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var52);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var54 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var55 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var56);
// 
//   }

  public void test225() {}
//   public void test225() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test225"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var4 = var1.useSourceInfoIfMissingFrom(var3);
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.eq(var3, var6);
//     com.google.javascript.rhino.Node var8 = var3.cloneNode();
//     boolean var9 = var8.isOr();
//     com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var14 = var11.useSourceInfoIfMissingFrom(var13);
//     com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.eq(var13, var16);
//     com.google.javascript.rhino.Node var18 = var13.cloneNode();
//     com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.or(var8, var18);
//     com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var24 = var21.useSourceInfoIfMissingFrom(var23);
//     com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var27 = var24.copyInformationFrom(var26);
//     com.google.javascript.rhino.Node var28 = var8.srcrefTree(var26);
//     boolean var29 = var26.isNoSideEffectsCall();
//     com.google.javascript.rhino.Node var30 = null;
//     com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var34 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var35 = var32.useSourceInfoIfMissingFrom(var34);
//     com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.IR.eq(var34, var37);
//     com.google.javascript.rhino.Node var39 = var34.cloneNode();
//     boolean var40 = var39.isOr();
//     com.google.javascript.rhino.Node var42 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var44 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var45 = var42.useSourceInfoIfMissingFrom(var44);
//     com.google.javascript.rhino.Node var47 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.IR.eq(var44, var47);
//     com.google.javascript.rhino.Node var49 = var44.cloneNode();
//     com.google.javascript.rhino.Node var50 = com.google.javascript.rhino.IR.or(var39, var49);
//     com.google.javascript.rhino.Node var52 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var54 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var55 = var52.useSourceInfoIfMissingFrom(var54);
//     com.google.javascript.rhino.Node var57 = com.google.javascript.rhino.IR.number(10.0d);
//     com.google.javascript.rhino.Node var58 = var55.copyInformationFrom(var57);
//     com.google.javascript.rhino.Node var59 = var39.srcrefTree(var57);
//     var26.addChildAfter(var30, var57);
// 
//   }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test226"); }


    java.util.List var2 = null;
    java.util.List var3 = null;
    com.google.javascript.jscomp.deps.SimpleDependencyInfo var4 = new com.google.javascript.jscomp.deps.SimpleDependencyInfo("", "hi!", var2, var3);
    com.google.javascript.jscomp.CompilerOptions var5 = new com.google.javascript.jscomp.CompilerOptions();
    var5.setSourceMapOutputPath("hi!");
    var5.setReplaceStringsPlaceholderToken("hi!");
    var5.setCheckCaja(true);
    boolean var12 = var4.equals((java.lang.Object)var5);
    var5.setMarkAsCompiled(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test227"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setTweakToNumberLiteral("", 1);
    com.google.javascript.jscomp.SourceMap.DetailLevel var4 = null;
    var0.setSourceMapDetailLevel(var4);
    var0.setRemoveTryCatchFinally(true);
    var0.setOutputCharset("module$Node tree inequality:\nTree1:\nNUMBER 10.0\n\n\nTree2:\nEQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nSubtree1: NUMBER 10.0\n\n\nSubtree2: EQ\n    NUMBER 10.0\n    NUMBER 10.0\n");
    var0.setInlineLocalFunctions(false);
    var0.setNameReferenceGraphPath("function (): {992738826}");

  }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test228"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.ErrorReporter var3 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var3, true);
    com.google.javascript.rhino.jstype.ObjectType var6 = var5.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var7 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7, true);
    com.google.javascript.rhino.jstype.ObjectType var10 = var9.createAnonymousObjectType();
    boolean var11 = var10.isUnknownType();
    boolean var12 = var6.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var10);
    boolean var13 = var10.isFunctionPrototypeType();
    var10.clearCachedValues();
    com.google.javascript.rhino.jstype.ObjectType var15 = var10.dereference();
    com.google.javascript.rhino.jstype.JSType[] var16 = new com.google.javascript.rhino.jstype.JSType[] { var15};
    com.google.javascript.rhino.jstype.JSType var17 = var2.createUnionType(var16);
    com.google.javascript.rhino.ErrorReporter var18 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var18, true);
    com.google.javascript.rhino.jstype.JSType var21 = null;
    boolean var23 = var20.canPropertyBeDefined(var21, "hi!");
    boolean var25 = var20.hasNamespace("");
    com.google.javascript.rhino.jstype.FunctionBuilder var26 = new com.google.javascript.rhino.jstype.FunctionBuilder(var20);
    com.google.javascript.rhino.jstype.FunctionBuilder var28 = var26.withName("NUMBER 10.0\n");
    com.google.javascript.rhino.ErrorReporter var29 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var29, true);
    com.google.javascript.rhino.jstype.ObjectType var32 = var31.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var33 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var33, true);
    com.google.javascript.rhino.jstype.ObjectType var36 = var35.createAnonymousObjectType();
    boolean var37 = var36.isUnknownType();
    boolean var38 = var32.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var36);
    boolean var39 = var36.isFunctionPrototypeType();
    com.google.javascript.rhino.jstype.FunctionBuilder var41 = var28.withReturnType((com.google.javascript.rhino.jstype.JSType)var36, true);
    com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var46 = var43.useSourceInfoIfMissingFrom(var45);
    com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.eq(var45, var48);
    com.google.javascript.rhino.Node var50 = var45.cloneNode();
    boolean var51 = var50.isOr();
    com.google.javascript.rhino.jstype.StaticSourceFile var52 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var50);
    boolean var53 = var50.isDec();
    boolean var54 = var50.isFor();
    boolean var55 = var50.isNoSideEffectsCall();
    com.google.javascript.rhino.jstype.FunctionType var56 = var2.createFunctionType((com.google.javascript.rhino.jstype.JSType)var36, var50);
    com.google.javascript.rhino.jstype.ObjectType var57 = var56.getTypeOfThis();
    java.lang.Iterable var58 = var56.getAllImplementedInterfaces();
    java.lang.String var59 = var56.getTemplateTypeName();
    com.google.javascript.rhino.jstype.ObjectType.Property var61 = var56.getSlot("null(null)");
    com.google.javascript.jscomp.CompilerOptions var62 = new com.google.javascript.jscomp.CompilerOptions();
    var62.setCrossModuleCodeMotion(false);
    var62.setLabelRenaming(true);
    var62.setCollapseProperties(false);
    com.google.javascript.jscomp.PropertyRenamingPolicy var69 = null;
    var62.setPropertyRenaming(var69);
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var72 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithNodeAnnotations();
    java.util.List var73 = var72.getGraphvizNodes();
    java.util.Collection var74 = var72.getNodes();
    boolean var75 = var72.isDirected();
    com.google.javascript.jscomp.graph.SubGraph var76 = var72.newSubGraph();
    var72.clearNodeAnnotations();
    java.util.List var78 = var72.getEdges();
    var62.setReplaceStringsConfiguration("TRUE\n", var78);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var56.setExtendedInterfaces(var78);
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
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
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);

  }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test229"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithNodeAnnotations();
    java.util.List var1 = var0.getGraphvizNodes();
    java.util.Collection var2 = var0.getNodes();
    com.google.javascript.rhino.ErrorReporter var3 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var3, true);
    com.google.javascript.rhino.jstype.JSType var6 = null;
    boolean var8 = var5.canPropertyBeDefined(var6, "hi!");
    boolean var10 = var5.hasNamespace("");
    com.google.javascript.rhino.jstype.FunctionBuilder var11 = new com.google.javascript.rhino.jstype.FunctionBuilder(var5);
    com.google.javascript.rhino.jstype.FunctionType var12 = var11.build();
    com.google.javascript.rhino.ErrorReporter var13 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var13, true);
    com.google.javascript.rhino.jstype.ObjectType var16 = var15.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var17 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var17, true);
    com.google.javascript.rhino.jstype.ObjectType var20 = var19.createAnonymousObjectType();
    boolean var21 = var20.isUnknownType();
    boolean var22 = var16.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var20);
    boolean var23 = var16.isBooleanValueType();
    boolean var24 = var16.isNoType();
    java.lang.String var25 = var16.getNormalizedReferenceName();
    com.google.javascript.rhino.JSDocInfo var26 = null;
    var16.setJSDocInfo(var26);
    boolean var28 = var16.isNumber();
    com.google.javascript.rhino.jstype.ObjectType var29 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType)var16);
    com.google.javascript.rhino.jstype.FunctionBuilder var30 = var11.withReturnType((com.google.javascript.rhino.jstype.JSType)var16);
    java.nio.charset.Charset var32 = null;
    com.google.javascript.jscomp.SourceFile var33 = com.google.javascript.jscomp.SourceFile.fromFile("NUMBER 10.0", var32);
    com.google.javascript.jscomp.Region var35 = var33.getRegion(100);
    java.lang.String var36 = var33.toString();
    java.lang.String var38 = var33.getLine(10);
    com.google.javascript.jscomp.JsAst var39 = new com.google.javascript.jscomp.JsAst(var33);
    com.google.javascript.rhino.ErrorReporter var40 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var40, true);
    com.google.javascript.rhino.ErrorReporter var43 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var43, true);
    com.google.javascript.rhino.jstype.ObjectType var46 = var45.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var47 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var47, true);
    com.google.javascript.rhino.jstype.ObjectType var50 = var49.createAnonymousObjectType();
    boolean var51 = var50.isUnknownType();
    boolean var52 = var46.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var50);
    boolean var53 = var50.isFunctionPrototypeType();
    var50.clearCachedValues();
    com.google.javascript.rhino.jstype.ObjectType var55 = var50.dereference();
    com.google.javascript.rhino.jstype.JSType[] var56 = new com.google.javascript.rhino.jstype.JSType[] { var55};
    com.google.javascript.rhino.jstype.JSType var57 = var42.createUnionType(var56);
    boolean var58 = var57.isConstructor();
    com.google.javascript.rhino.jstype.ObjectType var59 = com.google.javascript.rhino.jstype.ObjectType.cast(var57);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var60 = var0.isConnected((java.lang.Object)var11, (java.lang.Object)var33, (java.lang.Object)var57);
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "NUMBER 10.0"+ "'", var36.equals("NUMBER 10.0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test230"); }


    com.google.javascript.jscomp.CodingConvention var0 = null;
    com.google.javascript.jscomp.ClosureCodingConvention var1 = new com.google.javascript.jscomp.ClosureCodingConvention(var0);
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = null;
    com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter var3 = new com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter((com.google.javascript.jscomp.CodingConvention)var1, var2);
    com.google.javascript.jscomp.ClosureCodingConvention var4 = new com.google.javascript.jscomp.ClosureCodingConvention((com.google.javascript.jscomp.CodingConvention)var1);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var9 = var6.useSourceInfoIfMissingFrom(var8);
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.eq(var8, var11);
    com.google.javascript.rhino.Node var13 = var8.cloneNode();
    boolean var14 = var13.isOr();
    com.google.javascript.rhino.jstype.StaticSourceFile var15 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var13);
    boolean var16 = var13.isDec();
    boolean var17 = var13.isFor();
    boolean var18 = var1.isVarArgsParameter(var13);
    boolean var19 = var13.isEmpty();
    boolean var20 = var13.isIf();
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test231"); }


    com.google.javascript.rhino.JSDocInfoBuilder var1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
    boolean var2 = var1.recordOverride();
    java.util.Set var3 = null;
    boolean var4 = var1.recordModifies(var3);
    java.util.Set var5 = null;
    boolean var6 = var1.recordModifies(var5);
    boolean var7 = var1.recordHiddenness();
    boolean var8 = var1.recordConstructor();
    boolean var9 = var1.recordHiddenness();
    boolean var10 = var1.recordIdGenerator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test232"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.string("NUMBER 10.0");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var2 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test233"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var3 = null;
    boolean var5 = var2.canPropertyBeDefined(var3, "hi!");
    boolean var7 = var2.hasNamespace("");
    boolean var9 = var2.hasNamespace("");
    com.google.javascript.rhino.ErrorReporter var11 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var11, true);
    com.google.javascript.rhino.ErrorReporter var14 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var14, true);
    com.google.javascript.rhino.jstype.ObjectType var17 = var16.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var18 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var18, true);
    com.google.javascript.rhino.jstype.ObjectType var21 = var20.createAnonymousObjectType();
    boolean var22 = var21.isUnknownType();
    boolean var23 = var17.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var21);
    boolean var24 = var21.isFunctionPrototypeType();
    var21.clearCachedValues();
    com.google.javascript.rhino.jstype.ObjectType var26 = var21.dereference();
    com.google.javascript.rhino.jstype.JSType[] var27 = new com.google.javascript.rhino.jstype.JSType[] { var26};
    com.google.javascript.rhino.jstype.JSType var28 = var13.createUnionType(var27);
    com.google.javascript.rhino.ErrorReporter var29 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var29, true);
    com.google.javascript.rhino.jstype.JSType var32 = null;
    boolean var34 = var31.canPropertyBeDefined(var32, "hi!");
    boolean var36 = var31.hasNamespace("");
    com.google.javascript.rhino.jstype.FunctionBuilder var37 = new com.google.javascript.rhino.jstype.FunctionBuilder(var31);
    com.google.javascript.rhino.jstype.FunctionBuilder var39 = var37.withName("NUMBER 10.0\n");
    com.google.javascript.rhino.ErrorReporter var40 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var40, true);
    com.google.javascript.rhino.jstype.ObjectType var43 = var42.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var44 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var44, true);
    com.google.javascript.rhino.jstype.ObjectType var47 = var46.createAnonymousObjectType();
    boolean var48 = var47.isUnknownType();
    boolean var49 = var43.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var47);
    boolean var50 = var47.isFunctionPrototypeType();
    com.google.javascript.rhino.jstype.FunctionBuilder var52 = var39.withReturnType((com.google.javascript.rhino.jstype.JSType)var47, true);
    com.google.javascript.rhino.Node var54 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var56 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var57 = var54.useSourceInfoIfMissingFrom(var56);
    com.google.javascript.rhino.Node var59 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var60 = com.google.javascript.rhino.IR.eq(var56, var59);
    com.google.javascript.rhino.Node var61 = var56.cloneNode();
    boolean var62 = var61.isOr();
    com.google.javascript.rhino.jstype.StaticSourceFile var63 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var61);
    boolean var64 = var61.isDec();
    boolean var65 = var61.isFor();
    boolean var66 = var61.isNoSideEffectsCall();
    com.google.javascript.rhino.jstype.FunctionType var67 = var13.createFunctionType((com.google.javascript.rhino.jstype.JSType)var47, var61);
    boolean var68 = var67.isReturnTypeInferred();
    boolean var69 = var67.hasInstanceType();
    com.google.javascript.rhino.jstype.FunctionType var70 = var67.toMaybeFunctionType();
    com.google.javascript.rhino.ErrorReporter var71 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var71, true);
    com.google.javascript.rhino.jstype.ObjectType var74 = var73.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var75 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var75, true);
    com.google.javascript.rhino.jstype.ObjectType var78 = var77.createAnonymousObjectType();
    boolean var79 = var78.isUnknownType();
    boolean var80 = var74.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var78);
    boolean var81 = var78.isFunctionPrototypeType();
    com.google.javascript.rhino.jstype.JSType var82 = var70.getLeastSupertype((com.google.javascript.rhino.jstype.JSType)var78);
    boolean var83 = var78.isFunctionPrototypeType();
    var2.registerPropertyOnType("{1125981799}", (com.google.javascript.rhino.jstype.JSType)var78);
    com.google.javascript.rhino.JSDocInfo var85 = null;
    var78.setJSDocInfo(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);

  }

  public void test234() {}
//   public void test234() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test234"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.LightweightMessageFormatter var2 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var1);
//     com.google.javascript.jscomp.SymbolTable var3 = var1.buildKnownSymbolTable();
// 
//   }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test235"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setCrossModuleCodeMotion(false);
    com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var3 = null;
    var0.setAnonymousFunctionNaming(var3);
    var0.setExtractPrototypeMemberDeclarations(true);
    var0.setRemoveTryCatchFinally(true);
    var0.setFoldConstants(false);
    var0.setPreferLineBreakAtEndOfFile(false);
    var0.setProtectHiddenSideEffects(true);

  }

  public void test236() {}
//   public void test236() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test236"); }
// 
// 
//     java.io.PrintStream var0 = null;
//     com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
//     com.google.javascript.jscomp.SourceMap var2 = var1.getSourceMap();
//     var1.disableThreads();
//     com.google.javascript.jscomp.Compiler.CodeBuilder var4 = null;
//     com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.number(10.0d);
//     boolean var8 = var7.isLabel();
//     com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.Node.newString("{1459695149}", 0, 10);
//     boolean var13 = var12.isAssign();
//     com.google.javascript.rhino.Node var14 = var7.useSourceInfoIfMissingFrom(var12);
//     var1.toSource(var4, 10, var14);
// 
//   }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test237"); }


    java.io.PrintStream var0 = null;
    com.google.javascript.jscomp.Compiler var1 = new com.google.javascript.jscomp.Compiler(var0);
    com.google.javascript.jscomp.CompilerOptions var2 = new com.google.javascript.jscomp.CompilerOptions();
    var2.setCrossModuleCodeMotion(false);
    var2.setLabelRenaming(true);
    java.util.Set var7 = null;
    var2.setStripTypePrefixes(var7);
    var1.initOptions(var2);
    boolean var10 = var1.acceptConstKeyword();
    com.google.javascript.jscomp.CodingConvention var11 = var1.getCodingConvention();
    com.google.javascript.jscomp.NodeTraversal.Callback var12 = null;
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var17 = var14.useSourceInfoIfMissingFrom(var16);
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.eq(var16, var19);
    com.google.javascript.rhino.Node var21 = var16.cloneNode();
    boolean var22 = var21.isOr();
    com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var27 = var24.useSourceInfoIfMissingFrom(var26);
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.eq(var26, var29);
    com.google.javascript.rhino.Node var31 = var26.cloneNode();
    com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.IR.or(var21, var31);
    com.google.javascript.rhino.Node var34 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var37 = var34.useSourceInfoIfMissingFrom(var36);
    com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.IR.eq(var36, var39);
    var40.setSourceEncodedPosition(100);
    com.google.javascript.rhino.Node var44 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var46 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var47 = var44.useSourceInfoIfMissingFrom(var46);
    com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var50 = com.google.javascript.rhino.IR.eq(var46, var49);
    com.google.javascript.rhino.Node var51 = var46.cloneNode();
    boolean var52 = var51.isOr();
    com.google.javascript.rhino.Node var54 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var56 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var57 = var54.useSourceInfoIfMissingFrom(var56);
    com.google.javascript.rhino.Node var59 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var60 = com.google.javascript.rhino.IR.eq(var56, var59);
    com.google.javascript.rhino.Node var61 = var56.cloneNode();
    com.google.javascript.rhino.Node var62 = com.google.javascript.rhino.IR.or(var51, var61);
    com.google.javascript.rhino.Node var63 = var40.useSourceInfoFromForTree(var51);
    com.google.javascript.rhino.Node.AncestorIterable var64 = var63.getAncestors();
    java.lang.String var65 = var21.checkTreeEquals(var63);
    com.google.javascript.rhino.Node var67 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var69 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var70 = var67.useSourceInfoIfMissingFrom(var69);
    com.google.javascript.rhino.Node var72 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var73 = com.google.javascript.rhino.IR.eq(var69, var72);
    com.google.javascript.rhino.Node var74 = var69.cloneNode();
    boolean var75 = var74.isOr();
    com.google.javascript.rhino.Node var77 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var79 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var80 = var77.useSourceInfoIfMissingFrom(var79);
    com.google.javascript.rhino.Node var82 = com.google.javascript.rhino.IR.number(10.0d);
    com.google.javascript.rhino.Node var83 = com.google.javascript.rhino.IR.eq(var79, var82);
    com.google.javascript.rhino.Node var84 = var79.cloneNode();
    com.google.javascript.rhino.Node var85 = com.google.javascript.rhino.IR.or(var74, var84);
    com.google.javascript.rhino.Node[] var86 = new com.google.javascript.rhino.Node[] { var85};
    com.google.javascript.rhino.Node var87 = com.google.javascript.rhino.IR.call(var63, var86);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var1, var12, var86);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
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
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
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
    assertTrue("'" + var65 + "' != '" + "Node tree inequality:\nTree1:\nNUMBER 10.0\n\n\nTree2:\nEQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nSubtree1: NUMBER 10.0\n\n\nSubtree2: EQ\n    NUMBER 10.0\n    NUMBER 10.0\n"+ "'", var65.equals("Node tree inequality:\nTree1:\nNUMBER 10.0\n\n\nTree2:\nEQ\n    NUMBER 10.0\n    NUMBER 10.0\n\n\nSubtree1: NUMBER 10.0\n\n\nSubtree2: EQ\n    NUMBER 10.0\n    NUMBER 10.0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
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

  }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test238"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0, true);
    com.google.javascript.rhino.jstype.JSType var3 = null;
    boolean var5 = var2.canPropertyBeDefined(var3, "hi!");
    boolean var7 = var2.hasNamespace("");
    boolean var9 = var2.hasNamespace("");
    com.google.javascript.rhino.ErrorReporter var11 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var11, true);
    com.google.javascript.rhino.ErrorReporter var14 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var14, true);
    com.google.javascript.rhino.jstype.ObjectType var17 = var16.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var18 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var18, true);
    com.google.javascript.rhino.jstype.ObjectType var21 = var20.createAnonymousObjectType();
    boolean var22 = var21.isUnknownType();
    boolean var23 = var17.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType)var21);
    boolean var24 = var21.isFunctionPrototypeType();
    var21.clearCachedValues();
    com.google.javascript.rhino.jstype.ObjectType var26 = var21.dereference();
    com.google.javascript.rhino.jstype.JSType[] var27 = new com.google.javascript.rhino.jstype.JSType[] { var26};
    com.google.javascript.rhino.jstype.JSType var28 = var13.createUnionType(var27);
    com.google.javascript.rhino.ErrorReporter var29 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var29, true);
    com.google.javascript.rhino.jstype.JSType var32 = null;
    boolean var34 = var31.canPropertyBeDefined(var32, "hi!");
    boolean var36 = var31.hasNamespace("");
    com.google.javascript.rhino.jstype.FunctionBuilder var37 = new com.google.javascript.rhino.jstype.FunctionBuilder(var31);
    com.google.javascript.rhino.jstype.FunctionBuilder var39 = var37.withName("NUMBER 10.0\n");
    com.google.javascript.rhino.ErrorReporter var40 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var40, true);
    com.google.javascript.rhino.jstype.ObjectType var43 = var42.createAnonymousObjectType();
    com.google.javascript.rhino.ErrorReporter var44 

import junit.framework.*;

public class RandoopTest1 extends TestCase {

  public static boolean debug = false;

  public void test1() {}
//   public void test1() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test1"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.rhino.InputId var1 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, var1, false);
//     com.google.javascript.jscomp.SourceAst var4 = var3.getSourceAst();
//     com.google.javascript.jscomp.JSModule var5 = null;
//     var3.setModule(var5);
//     boolean var7 = var3.isExtern();
//     java.util.Collection var8 = var3.getProvides();
// 
//   }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test2"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var2 = null;
    var1.setJSDocInfo(var2);
    boolean var4 = var1.isNE();
    boolean var5 = var1.isSyntheticBlock();
    boolean var6 = var1.isFalse();
    int var7 = var1.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test3"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    java.util.Collection var1 = var0.getTypeNodes();
    boolean var2 = var0.isInterface();
    boolean var3 = var0.isInterface();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test4() {}
//   public void test4() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test4"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile var1 = new com.google.javascript.jscomp.SourceFile("module$hi!");
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var1, true);
//     var3.clearAst();
//     com.google.javascript.jscomp.SourceFile var6 = new com.google.javascript.jscomp.SourceFile("module$hi!");
//     com.google.javascript.jscomp.CompilerInput var8 = new com.google.javascript.jscomp.CompilerInput(var6, true);
//     com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var11 = null;
//     var10.setJSDocInfo(var11);
//     boolean var13 = var10.isAssignAdd();
//     com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var16 = null;
//     var15.setJSDocInfo(var16);
//     boolean var18 = var15.isAssignAdd();
//     com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.throwNode(var15);
//     com.google.javascript.rhino.Node var20 = var10.srcrefTree(var19);
//     boolean var21 = var20.isLocalResultCall();
//     int var22 = var20.getSideEffectFlags();
//     com.google.javascript.rhino.InputId var24 = new com.google.javascript.rhino.InputId("");
//     var20.setInputId(var24);
//     com.google.javascript.jscomp.CompilerInput var27 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var8, var24, false);
//     java.lang.String var28 = var24.toString();
//     com.google.javascript.jscomp.CompilerInput var30 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var3, var24, true);
//     int var32 = var3.getLineOffset(1);
// 
//   }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var1 = com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.valueOf("goog.global");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test6"); }


    com.google.javascript.rhino.Node var1 = new com.google.javascript.rhino.Node(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.defaultCase(var1);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test7"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var2 = null;
    var1.setJSDocInfo(var2);
    boolean var4 = var1.isAssignAdd();
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var7 = null;
    var6.setJSDocInfo(var7);
    boolean var9 = var6.isAssignAdd();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.throwNode(var6);
    com.google.javascript.rhino.Node var11 = var1.srcrefTree(var10);
    boolean var12 = var11.isLocalResultCall();
    int var13 = var11.getSideEffectFlags();
    com.google.javascript.rhino.InputId var15 = new com.google.javascript.rhino.InputId("");
    var11.setInputId(var15);
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var21 = null;
    var20.setJSDocInfo(var21);
    boolean var23 = var20.isAssignAdd();
    boolean var24 = var20.isGetElem();
    boolean var25 = var20.isNumber();
    com.google.javascript.jscomp.CheckLevel var26 = null;
    com.google.javascript.jscomp.DiagnosticType var29 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "hi!");
    java.lang.String[] var31 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var32 = com.google.javascript.jscomp.JSError.make("hi!", var20, var26, var29, var31);
    com.google.javascript.rhino.Node var34 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var35 = null;
    var34.setJSDocInfo(var35);
    boolean var37 = var34.isNE();
    boolean var38 = var34.isAdd();
    boolean var39 = var34.isLabel();
    com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var42 = null;
    var41.setJSDocInfo(var42);
    boolean var44 = var41.isAssignAdd();
    com.google.javascript.rhino.Node var46 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var47 = null;
    var46.setJSDocInfo(var47);
    boolean var49 = var46.isAssignAdd();
    com.google.javascript.rhino.Node var50 = com.google.javascript.rhino.IR.throwNode(var46);
    com.google.javascript.rhino.Node var51 = var41.srcrefTree(var50);
    com.google.javascript.rhino.Node var53 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var54 = null;
    var53.setJSDocInfo(var54);
    boolean var56 = var53.isAssignAdd();
    com.google.javascript.rhino.Node var58 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var59 = null;
    var58.setJSDocInfo(var59);
    boolean var61 = var58.isAssignAdd();
    com.google.javascript.rhino.Node var62 = com.google.javascript.rhino.IR.throwNode(var58);
    com.google.javascript.rhino.Node var63 = var53.srcrefTree(var62);
    com.google.javascript.rhino.Node var65 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var66 = null;
    var65.setJSDocInfo(var66);
    boolean var68 = var65.isAssignAdd();
    com.google.javascript.rhino.Node var70 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var71 = null;
    var70.setJSDocInfo(var71);
    boolean var73 = var70.isAssignAdd();
    com.google.javascript.rhino.Node var74 = com.google.javascript.rhino.IR.throwNode(var70);
    com.google.javascript.rhino.Node var75 = var65.srcrefTree(var74);
    var53.addChildrenToFront(var65);
    boolean var77 = var51.hasChild(var53);
    com.google.javascript.rhino.Node var79 = com.google.javascript.rhino.Node.newNumber(0.0d);
    com.google.javascript.rhino.Node var80 = new com.google.javascript.rhino.Node(100, var20, var34, var51, var79);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var81 = com.google.javascript.rhino.IR.or(var11, var51);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test8"); }


    com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "LinkedGraph", "hi!");
    java.lang.String var5 = var3.getLine((-1));
    com.google.javascript.jscomp.parsing.Config.LanguageMode var8 = null;
    com.google.javascript.rhino.ErrorReporter var10 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var10);
    com.google.javascript.rhino.jstype.JSType var12 = null;
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var15 = null;
    var14.setJSDocInfo(var15);
    com.google.javascript.rhino.jstype.FunctionType var17 = var11.createFunctionType(var12, var14);
    com.google.javascript.rhino.jstype.JSType var19 = null;
    var11.unregisterPropertyOnType("hi!", var19);
    java.lang.Iterable var22 = var11.getTypesWithProperty("hi!");
    java.lang.Iterable var24 = var11.getTypesWithProperty("hi!");
    com.google.javascript.rhino.ErrorReporter var25 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var25);
    com.google.javascript.rhino.jstype.JSType var27 = null;
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var30 = null;
    var29.setJSDocInfo(var30);
    com.google.javascript.rhino.jstype.FunctionType var32 = var26.createFunctionType(var27, var29);
    com.google.javascript.rhino.jstype.ObjectType var33 = var32.getParentScope();
    com.google.javascript.rhino.ErrorReporter var34 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var34);
    com.google.javascript.rhino.jstype.JSType var36 = null;
    com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var39 = null;
    var38.setJSDocInfo(var39);
    com.google.javascript.rhino.jstype.FunctionType var41 = var35.createFunctionType(var36, var38);
    boolean var42 = var41.matchesInt32Context();
    com.google.javascript.rhino.jstype.ObjectType var43 = var41.toObjectType();
    com.google.javascript.rhino.jstype.FunctionType var44 = var11.createFunctionTypeWithNewThisType(var32, (com.google.javascript.rhino.jstype.ObjectType)var41);
    java.lang.String var45 = var41.getTemplateTypeName();
    var41.clearCachedValues();
    java.util.Set var47 = var41.getPropertyNames();
    com.google.javascript.jscomp.parsing.Config var48 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig(false, var8, false, var47);
    com.google.javascript.rhino.head.ErrorReporter var49 = null;
    java.util.logging.Logger var50 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var51 = com.google.javascript.jscomp.parsing.ParserRunner.parse((com.google.javascript.rhino.jstype.StaticSourceFile)var3, "", var48, var49, var50);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test9"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.DiagnosticGroup var1 = null;
    com.google.javascript.jscomp.CheckLevel var2 = null;
    var0.setWarningLevel(var1, var2);
    var0.setLocale("hi!");
    com.google.javascript.jscomp.CheckLevel var6 = null;
    var0.setCheckUnreachableCode(var6);
    com.google.javascript.jscomp.CompilerOptions.TracerMode var8 = var0.getTracerMode();
    boolean var9 = var0.assumeStrictThis();
    var0.setDefineToStringLiteral("module$hi!", "");
    com.google.javascript.jscomp.CheckLevel var13 = null;
    var0.setCheckUnreachableCode(var13);
    var0.setRecordFunctionInformation(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test10() {}
//   public void test10() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test10"); }
// 
// 
//     com.google.javascript.rhino.JSDocInfoBuilder var1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
//     boolean var2 = var1.recordInterface();
//     boolean var3 = var1.isPopulated();
//     com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var6 = null;
//     var5.setJSDocInfo(var6);
//     boolean var8 = var5.isNE();
//     boolean var9 = var5.isFor();
//     com.google.javascript.rhino.JSDocInfo var10 = var1.build(var5);
//     var5.setCharno(10);
//     com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var15 = null;
//     var14.setJSDocInfo(var15);
//     boolean var17 = var14.isAssignAdd();
//     com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var20 = null;
//     var19.setJSDocInfo(var20);
//     boolean var22 = var19.isAssignAdd();
//     com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.throwNode(var19);
//     com.google.javascript.rhino.Node var24 = var14.srcrefTree(var23);
//     com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var27 = null;
//     var26.setJSDocInfo(var27);
//     boolean var29 = var26.isAssignAdd();
//     com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var32 = null;
//     var31.setJSDocInfo(var32);
//     boolean var34 = var31.isAssignAdd();
//     com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.IR.throwNode(var31);
//     com.google.javascript.rhino.Node var36 = var26.srcrefTree(var35);
//     com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var39 = null;
//     var38.setJSDocInfo(var39);
//     boolean var41 = var38.isAssignAdd();
//     com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var44 = null;
//     var43.setJSDocInfo(var44);
//     boolean var46 = var43.isAssignAdd();
//     com.google.javascript.rhino.Node var47 = com.google.javascript.rhino.IR.throwNode(var43);
//     com.google.javascript.rhino.Node var48 = var38.srcrefTree(var47);
//     var26.addChildrenToFront(var38);
//     boolean var50 = var24.hasChild(var26);
//     com.google.javascript.rhino.Node var52 = com.google.javascript.rhino.IR.name("");
//     boolean var53 = var52.isGetElem();
//     boolean var54 = var52.isNull();
//     com.google.javascript.rhino.Node var55 = com.google.javascript.rhino.IR.returnNode();
//     com.google.javascript.rhino.Node var56 = var52.srcref(var55);
//     com.google.javascript.rhino.Node var58 = com.google.javascript.rhino.IR.name("");
//     boolean var59 = var58.isGetElem();
//     boolean var60 = var58.isNull();
//     com.google.javascript.rhino.Node var61 = com.google.javascript.rhino.IR.returnNode();
//     com.google.javascript.rhino.Node var62 = var58.srcref(var61);
//     com.google.javascript.rhino.Node var63 = var56.useSourceInfoFromForTree(var62);
//     boolean var64 = var56.hasMoreThanOneChild();
//     var24.addChildrenToBack(var56);
//     boolean var66 = var56.isGetElem();
//     var5.removeChild(var56);
// 
//   }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test11"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.JSType var2 = null;
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var5 = null;
    var4.setJSDocInfo(var5);
    com.google.javascript.rhino.jstype.FunctionType var7 = var1.createFunctionType(var2, var4);
    com.google.javascript.rhino.jstype.JSType var9 = null;
    var1.unregisterPropertyOnType("hi!", var9);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.name("");
    boolean var14 = var13.isGetElem();
    boolean var15 = var13.isNull();
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var17 = var13.srcref(var16);
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.name("");
    boolean var20 = var19.isGetElem();
    boolean var21 = var19.isNull();
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var23 = var19.srcref(var22);
    com.google.javascript.rhino.Node var24 = var17.useSourceInfoFromForTree(var23);
    com.google.javascript.rhino.ErrorReporter var25 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var25);
    com.google.javascript.rhino.jstype.JSType var27 = null;
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var30 = null;
    var29.setJSDocInfo(var30);
    com.google.javascript.rhino.jstype.FunctionType var32 = var26.createFunctionType(var27, var29);
    com.google.javascript.rhino.jstype.ObjectType var33 = var1.createObjectType("goog.abstractMethod", var24, (com.google.javascript.rhino.jstype.ObjectType)var32);
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var37 = null;
    var36.setJSDocInfo(var37);
    boolean var39 = var36.isAssignAdd();
    com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var42 = null;
    var41.setJSDocInfo(var42);
    boolean var44 = var41.isAssignAdd();
    com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.IR.throwNode(var41);
    com.google.javascript.rhino.Node var46 = var36.srcrefTree(var45);
    com.google.javascript.rhino.ErrorReporter var47 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var47);
    com.google.javascript.rhino.jstype.JSType var49 = null;
    com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var52 = null;
    var51.setJSDocInfo(var52);
    com.google.javascript.rhino.jstype.FunctionType var54 = var48.createFunctionType(var49, var51);
    com.google.javascript.rhino.jstype.ObjectType var55 = var54.getParentScope();
    com.google.javascript.rhino.jstype.EnumType var56 = var1.createEnumType("hi!. hi! at hi! line (unknown line) : (unknown column)", var36, (com.google.javascript.rhino.jstype.JSType)var55);
    com.google.javascript.rhino.jstype.EnumType var57 = var56.toMaybeEnumType();
    com.google.javascript.rhino.jstype.EnumElementType var58 = var56.getElementsType();
    boolean var60 = var58.isPropertyTypeDeclared("module$hi!");
    com.google.javascript.rhino.ErrorReporter var61 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var61);
    com.google.javascript.rhino.jstype.JSType var63 = null;
    com.google.javascript.rhino.Node var65 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var66 = null;
    var65.setJSDocInfo(var66);
    com.google.javascript.rhino.jstype.FunctionType var68 = var62.createFunctionType(var63, var65);
    com.google.javascript.rhino.jstype.JSType var70 = null;
    var62.unregisterPropertyOnType("hi!", var70);
    java.lang.Iterable var73 = var62.getTypesWithProperty("hi!");
    java.lang.Iterable var75 = var62.getTypesWithProperty("hi!");
    com.google.javascript.rhino.ErrorReporter var76 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var76);
    com.google.javascript.rhino.jstype.JSType var78 = null;
    com.google.javascript.rhino.Node var80 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var81 = null;
    var80.setJSDocInfo(var81);
    com.google.javascript.rhino.jstype.FunctionType var83 = var77.createFunctionType(var78, var80);
    com.google.javascript.rhino.jstype.ObjectType var84 = var83.getParentScope();
    com.google.javascript.rhino.ErrorReporter var85 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var86 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var85);
    com.google.javascript.rhino.jstype.JSType var87 = null;
    com.google.javascript.rhino.Node var89 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var90 = null;
    var89.setJSDocInfo(var90);
    com.google.javascript.rhino.jstype.FunctionType var92 = var86.createFunctionType(var87, var89);
    boolean var93 = var92.matchesInt32Context();
    com.google.javascript.rhino.jstype.ObjectType var94 = var92.toObjectType();
    com.google.javascript.rhino.jstype.FunctionType var95 = var62.createFunctionTypeWithNewThisType(var83, (com.google.javascript.rhino.jstype.ObjectType)var92);
    com.google.javascript.rhino.jstype.JSType.TypePair var96 = var58.getTypesUnderInequality((com.google.javascript.rhino.jstype.JSType)var95);
    com.google.javascript.rhino.jstype.BooleanLiteralSet var97 = var58.getPossibleToBooleanOutcomes();
    java.lang.String var98 = var97.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
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
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
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
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var98 + "' != '" + "TRUE"+ "'", var98.equals("TRUE"));

  }

  public void test12() {}
//   public void test12() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test12"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var2 = null;
//     var1.setJSDocInfo(var2);
//     boolean var4 = var1.isAssignAdd();
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var7 = null;
//     var6.setJSDocInfo(var7);
//     boolean var9 = var6.isAssignAdd();
//     com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.throwNode(var6);
//     com.google.javascript.rhino.Node var11 = var1.srcrefTree(var10);
//     com.google.javascript.rhino.Node.AncestorIterable var12 = var10.getAncestors();
//     com.google.javascript.rhino.Node var13 = var10.getLastChild();
//     boolean var14 = var13.isObjectLit();
//     com.google.javascript.rhino.Node var15 = null;
//     com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.and(var13, var15);
// 
//   }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test13"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var2 = null;
    var1.setJSDocInfo(var2);
    boolean var4 = var1.isNE();
    boolean var5 = var1.isAdd();
    boolean var6 = var1.isLabel();
    var1.setSourceFileForTesting("module$hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.defaultCase(var1);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test14"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    var1.identifyNonNullableName("");
    boolean var5 = var1.hasNamespace("");
    com.google.javascript.rhino.jstype.FunctionBuilder var6 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
    com.google.javascript.rhino.ErrorReporter var8 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var8);
    com.google.javascript.rhino.jstype.JSType var10 = null;
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var13 = null;
    var12.setJSDocInfo(var13);
    com.google.javascript.rhino.jstype.FunctionType var15 = var9.createFunctionType(var10, var12);
    com.google.javascript.rhino.jstype.JSType var17 = null;
    var9.unregisterPropertyOnType("hi!", var17);
    java.lang.Iterable var20 = var9.getTypesWithProperty("hi!");
    java.lang.Iterable var22 = var9.getTypesWithProperty("hi!");
    com.google.javascript.rhino.ErrorReporter var23 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var23);
    com.google.javascript.rhino.jstype.JSType var25 = null;
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var28 = null;
    var27.setJSDocInfo(var28);
    com.google.javascript.rhino.jstype.FunctionType var30 = var24.createFunctionType(var25, var27);
    com.google.javascript.rhino.jstype.ObjectType var31 = var30.getParentScope();
    com.google.javascript.rhino.ErrorReporter var32 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var32);
    com.google.javascript.rhino.jstype.JSType var34 = null;
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var37 = null;
    var36.setJSDocInfo(var37);
    com.google.javascript.rhino.jstype.FunctionType var39 = var33.createFunctionType(var34, var36);
    boolean var40 = var39.matchesInt32Context();
    com.google.javascript.rhino.jstype.ObjectType var41 = var39.toObjectType();
    com.google.javascript.rhino.jstype.FunctionType var42 = var9.createFunctionTypeWithNewThisType(var30, (com.google.javascript.rhino.jstype.ObjectType)var39);
    com.google.javascript.rhino.jstype.JSType var43 = var30.autobox();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.overwriteDeclaredType("(NAME \n    NAME \n)", var43);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test15"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    boolean var2 = var1.isGetElem();
    boolean var3 = var1.isNull();
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var5 = var1.srcref(var4);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.throwNode(var5);
    com.google.javascript.rhino.Node[] var7 = new com.google.javascript.rhino.Node[] { var6};
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.block(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.block(var7);
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
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test16() {}
//   public void test16() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test16"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var2 = null;
//     var1.setJSDocInfo(var2);
//     boolean var4 = var1.isAssignAdd();
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var7 = null;
//     var6.setJSDocInfo(var7);
//     boolean var9 = var6.isAssignAdd();
//     com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.throwNode(var6);
//     com.google.javascript.rhino.Node var11 = var1.srcrefTree(var10);
//     com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var14 = null;
//     var13.setJSDocInfo(var14);
//     boolean var16 = var13.isAssignAdd();
//     com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var19 = null;
//     var18.setJSDocInfo(var19);
//     boolean var21 = var18.isAssignAdd();
//     com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.throwNode(var18);
//     com.google.javascript.rhino.Node var23 = var13.srcrefTree(var22);
//     var1.addChildrenToFront(var13);
//     boolean var25 = var1.isContinue();
//     com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.name("");
//     boolean var28 = var27.isGetElem();
//     boolean var29 = var27.isNull();
//     com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.returnNode();
//     com.google.javascript.rhino.Node var31 = var27.srcref(var30);
//     com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.name("");
//     var31.addChildrenToFront(var33);
//     boolean var35 = var1.isEquivalentToTyped(var31);
//     java.lang.Iterable var36 = var31.siblings();
//     boolean var37 = var31.isCase();
//     com.google.javascript.rhino.Node var38 = null;
//     com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.IR.add(var31, var38);
// 
//   }

  public void test17() {}
//   public void test17() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test17"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.rhino.InputId var1 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, var1, false);
//     java.util.logging.Logger var4 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var5 = new com.google.javascript.jscomp.LoggerErrorManager(var4);
//     com.google.javascript.jscomp.Compiler var6 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var5);
//     com.google.javascript.jscomp.JSError[] var7 = var6.getErrors();
//     var3.setCompiler((com.google.javascript.jscomp.AbstractCompiler)var6);
//     int var9 = var6.getWarningCount();
//     boolean var10 = var6.acceptConstKeyword();
// 
//   }

  public void test18() {}
//   public void test18() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test18"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     var1.identifyNonNullableName("");
//     boolean var5 = var1.hasNamespace("");
//     com.google.javascript.rhino.jstype.FunctionBuilder var6 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
//     com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var9 = null;
//     var8.setJSDocInfo(var9);
//     boolean var11 = var8.isAssignAdd();
//     com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.throwNode(var8);
//     com.google.javascript.rhino.jstype.FunctionBuilder var13 = var6.withSourceNode(var8);
//     boolean var14 = var8.isAssignAdd();
//     com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.name("");
//     boolean var17 = var16.isGetElem();
//     boolean var18 = var16.isNull();
//     com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.returnNode();
//     com.google.javascript.rhino.Node var20 = var16.srcref(var19);
//     com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.name("");
//     var20.addChildrenToFront(var22);
//     com.google.javascript.rhino.ErrorReporter var25 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var25);
//     com.google.javascript.rhino.jstype.JSType var27 = null;
//     com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var30 = null;
//     var29.setJSDocInfo(var30);
//     com.google.javascript.rhino.jstype.FunctionType var32 = var26.createFunctionType(var27, var29);
//     boolean var33 = var32.isGlobalThisType();
//     boolean var34 = var32.isConstructor();
//     var20.putProp(0, (java.lang.Object)var32);
//     boolean var36 = var20.isString();
//     boolean var37 = var20.hasMoreThanOneChild();
//     var20.setCharno(10);
//     com.google.javascript.rhino.Node var40 = null;
//     com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.IR.hook(var8, var20, var40);
// 
//   }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test19"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    var1.identifyNonNullableName("");
    boolean var5 = var1.hasNamespace("");
    com.google.javascript.rhino.jstype.FunctionBuilder var6 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var9 = null;
    var8.setJSDocInfo(var9);
    boolean var11 = var8.isAssignAdd();
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.throwNode(var8);
    com.google.javascript.rhino.jstype.FunctionBuilder var13 = var6.withSourceNode(var8);
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var16 = null;
    var15.setJSDocInfo(var16);
    boolean var18 = var15.isAssignAdd();
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var21 = null;
    var20.setJSDocInfo(var21);
    boolean var23 = var20.isAssignAdd();
    com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.IR.throwNode(var20);
    com.google.javascript.rhino.Node var25 = var15.srcrefTree(var24);
    com.google.javascript.rhino.Node.AncestorIterable var26 = var24.getAncestors();
    com.google.javascript.rhino.Node var27 = var24.getLastChild();
    boolean var28 = var27.isObjectLit();
    com.google.javascript.rhino.jstype.FunctionBuilder var29 = var13.withParamsNode(var27);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.jstype.FunctionType var30 = var29.build();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
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

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test20"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.JSType var2 = null;
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var5 = null;
    var4.setJSDocInfo(var5);
    com.google.javascript.rhino.jstype.FunctionType var7 = var1.createFunctionType(var2, var4);
    com.google.javascript.rhino.ErrorReporter var8 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var8);
    com.google.javascript.rhino.jstype.JSType var10 = null;
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var13 = null;
    var12.setJSDocInfo(var13);
    com.google.javascript.rhino.jstype.FunctionType var15 = var9.createFunctionType(var10, var12);
    boolean var16 = var15.matchesInt32Context();
    com.google.javascript.rhino.ErrorReporter var17 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var17);
    com.google.javascript.rhino.jstype.JSType var19 = null;
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var22 = null;
    var21.setJSDocInfo(var22);
    com.google.javascript.rhino.jstype.FunctionType var24 = var18.createFunctionType(var19, var21);
    com.google.javascript.rhino.jstype.JSType[] var25 = new com.google.javascript.rhino.jstype.JSType[] { var19};
    com.google.javascript.rhino.jstype.FunctionType var26 = var1.createConstructorType((com.google.javascript.rhino.jstype.JSType)var15, var25);
    com.google.javascript.rhino.jstype.FunctionType var27 = com.google.javascript.rhino.jstype.JSType.toMaybeFunctionType((com.google.javascript.rhino.jstype.JSType)var26);
    java.lang.Iterable var28 = var27.getExtendedInterfaces();
    boolean var29 = var27.isEnumType();
    java.util.Set var30 = var27.getPropertyNames();
    java.lang.String var31 = var27.getTemplateTypeName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
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
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test21"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    java.lang.Object var1 = null;
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var2 = var0.getDirectedGraphNode(var1);
    com.google.javascript.rhino.JSDocInfo var3 = new com.google.javascript.rhino.JSDocInfo();
    java.util.Collection var4 = var3.getTypeNodes();
    boolean var5 = var3.isInterface();
    java.lang.String var6 = var3.getLicense();
    var3.setLicense("hi!. hi! at hi! line (unknown line) : (unknown column)");
    boolean var9 = var3.hasThisType();
    com.google.javascript.jscomp.MessageFormatter var10 = null;
    java.util.logging.Logger var11 = null;
    com.google.javascript.jscomp.LoggerErrorManager var12 = new com.google.javascript.jscomp.LoggerErrorManager(var10, var11);
    int var13 = var12.getErrorCount();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var14 = var0.getDirectedGraphEdges((java.lang.Object)var9, (java.lang.Object)var12);
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
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test22() {}
//   public void test22() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test22"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     com.google.javascript.rhino.jstype.JSType var2 = null;
//     com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var5 = null;
//     var4.setJSDocInfo(var5);
//     com.google.javascript.rhino.jstype.FunctionType var7 = var1.createFunctionType(var2, var4);
//     com.google.javascript.rhino.jstype.JSType var9 = null;
//     var1.unregisterPropertyOnType("hi!", var9);
//     java.lang.Iterable var12 = var1.getTypesWithProperty("hi!");
//     java.lang.Iterable var14 = var1.getTypesWithProperty("hi!");
//     com.google.javascript.rhino.ErrorReporter var15 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var15);
//     com.google.javascript.rhino.jstype.JSType var17 = null;
//     com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var20 = null;
//     var19.setJSDocInfo(var20);
//     com.google.javascript.rhino.jstype.FunctionType var22 = var16.createFunctionType(var17, var19);
//     com.google.javascript.rhino.jstype.ObjectType var23 = var22.getParentScope();
//     com.google.javascript.rhino.ErrorReporter var24 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var24);
//     com.google.javascript.rhino.jstype.JSType var26 = null;
//     com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var29 = null;
//     var28.setJSDocInfo(var29);
//     com.google.javascript.rhino.jstype.FunctionType var31 = var25.createFunctionType(var26, var28);
//     boolean var32 = var31.matchesInt32Context();
//     com.google.javascript.rhino.jstype.ObjectType var33 = var31.toObjectType();
//     com.google.javascript.rhino.jstype.FunctionType var34 = var1.createFunctionTypeWithNewThisType(var22, (com.google.javascript.rhino.jstype.ObjectType)var31);
//     java.lang.String var35 = var31.getTemplateTypeName();
//     var31.clearCachedValues();
//     java.util.Set var37 = var31.getPropertyNames();
//     com.google.javascript.rhino.jstype.JSType var38 = null;
//     com.google.javascript.rhino.jstype.JSType.TypePair var39 = var31.getTypesUnderShallowInequality(var38);
// 
//   }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test23"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    java.util.Collection var1 = var0.getTypeNodes();
    boolean var2 = var0.isNoShadow();
    java.lang.String var3 = var0.getMeaning();
    java.util.Collection var4 = var0.getAuthors();
    java.lang.String var5 = var0.getMeaning();
    boolean var6 = var0.hasThisType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test24() {}
//   public void test24() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test24"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     com.google.javascript.rhino.jstype.JSType var2 = null;
//     com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var5 = null;
//     var4.setJSDocInfo(var5);
//     com.google.javascript.rhino.jstype.FunctionType var7 = var1.createFunctionType(var2, var4);
//     com.google.javascript.rhino.ErrorReporter var8 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var8);
//     com.google.javascript.rhino.jstype.JSType var10 = null;
//     com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var13 = null;
//     var12.setJSDocInfo(var13);
//     com.google.javascript.rhino.jstype.FunctionType var15 = var9.createFunctionType(var10, var12);
//     boolean var16 = var15.matchesInt32Context();
//     com.google.javascript.rhino.ErrorReporter var17 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var17);
//     com.google.javascript.rhino.jstype.JSType var19 = null;
//     com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var22 = null;
//     var21.setJSDocInfo(var22);
//     com.google.javascript.rhino.jstype.FunctionType var24 = var18.createFunctionType(var19, var21);
//     com.google.javascript.rhino.jstype.JSType[] var25 = new com.google.javascript.rhino.jstype.JSType[] { var19};
//     com.google.javascript.rhino.jstype.FunctionType var26 = var1.createConstructorType((com.google.javascript.rhino.jstype.JSType)var15, var25);
//     com.google.javascript.rhino.jstype.BooleanLiteralSet var27 = var26.getPossibleToBooleanOutcomes();
//     boolean var29 = var26.removeProperty("hi!");
//     com.google.javascript.rhino.Node var30 = var26.getRootNode();
//     java.lang.String var31 = var26.toString();
// 
//   }

  public void test25() {}
//   public void test25() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test25"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var3 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "hi!");
//     com.google.javascript.jscomp.DiagnosticGroup var4 = com.google.javascript.jscomp.DiagnosticGroup.forType(var3);
//     com.google.javascript.jscomp.DiagnosticGroup[] var5 = new com.google.javascript.jscomp.DiagnosticGroup[] { var4};
//     com.google.javascript.jscomp.DiagnosticGroup var6 = new com.google.javascript.jscomp.DiagnosticGroup("module$hi!", var5);
//     com.google.javascript.jscomp.CheckLevel var7 = null;
//     com.google.javascript.jscomp.DiagnosticGroupWarningsGuard var8 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(var6, var7);
//     com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var12 = null;
//     var11.setJSDocInfo(var12);
//     boolean var14 = var11.isAssignAdd();
//     boolean var15 = var11.isGetElem();
//     boolean var16 = var11.isNumber();
//     com.google.javascript.jscomp.CheckLevel var17 = null;
//     com.google.javascript.jscomp.DiagnosticType var20 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "hi!");
//     java.lang.String[] var22 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var23 = com.google.javascript.jscomp.JSError.make("hi!", var11, var17, var20, var22);
//     com.google.javascript.jscomp.DiagnosticType var24 = var23.getType();
//     java.lang.String var25 = var23.toString();
//     int var26 = var23.getCharno();
//     com.google.javascript.jscomp.CheckLevel var27 = var8.level(var23);
//     com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var31 = null;
//     var30.setJSDocInfo(var31);
//     boolean var33 = var30.isAssignAdd();
//     boolean var34 = var30.isGetElem();
//     boolean var35 = var30.isNumber();
//     com.google.javascript.jscomp.CheckLevel var36 = null;
//     com.google.javascript.jscomp.DiagnosticType var39 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "hi!");
//     java.lang.String[] var41 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var42 = com.google.javascript.jscomp.JSError.make("hi!", var30, var36, var39, var41);
//     com.google.javascript.jscomp.DiagnosticType var43 = var42.getType();
//     java.lang.String var44 = var42.toString();
//     int var45 = var42.getCharno();
//     com.google.javascript.jscomp.CheckLevel var46 = var8.level(var42);
//     com.google.javascript.jscomp.CompilerOptions var47 = new com.google.javascript.jscomp.CompilerOptions();
//     com.google.javascript.jscomp.DiagnosticType var50 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "hi!");
//     com.google.javascript.jscomp.DiagnosticGroup var51 = com.google.javascript.jscomp.DiagnosticGroup.forType(var50);
//     com.google.javascript.jscomp.CheckLevel var52 = null;
//     var47.setWarningLevel(var51, var52);
//     boolean var54 = var8.enables(var51);
// 
//   }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test26"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    boolean var2 = var1.isGetElem();
    boolean var3 = var1.isNull();
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var5 = var1.srcref(var4);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
    boolean var8 = var7.isGetElem();
    boolean var9 = var7.isNull();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var11 = var7.srcref(var10);
    com.google.javascript.rhino.Node var12 = var5.useSourceInfoFromForTree(var11);
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.name("");
    boolean var15 = var14.isGetElem();
    boolean var16 = var14.isNull();
    boolean var17 = var14.isDebugger();
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.or(var12, var14);
    boolean var19 = var18.isFor();
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.name("");
    boolean var24 = var23.isGetElem();
    boolean var25 = var23.isNull();
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var27 = var23.srcref(var26);
    com.google.javascript.rhino.Node var30 = new com.google.javascript.rhino.Node(100, var21, var26, 0, 0);
    boolean var31 = var18.isEquivalentToTyped(var30);
    com.google.javascript.rhino.jstype.StaticSourceFile var32 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
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
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test27"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.name("");
    boolean var3 = var2.isGetElem();
    boolean var4 = var2.isNull();
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var6 = var2.srcref(var5);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.throwNode(var6);
    com.google.javascript.rhino.Node[] var8 = new com.google.javascript.rhino.Node[] { var7};
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.block(var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var10 = new com.google.javascript.rhino.Node(26, var8);
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
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test28() {}
//   public void test28() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test28"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var2 = null;
//     var1.setJSDocInfo(var2);
//     boolean var4 = var1.isAssignAdd();
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var7 = null;
//     var6.setJSDocInfo(var7);
//     boolean var9 = var6.isAssignAdd();
//     com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.throwNode(var6);
//     com.google.javascript.rhino.Node var11 = var1.srcrefTree(var10);
//     com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var14 = null;
//     var13.setJSDocInfo(var14);
//     boolean var16 = var13.isAssignAdd();
//     com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var19 = null;
//     var18.setJSDocInfo(var19);
//     boolean var21 = var18.isAssignAdd();
//     com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.throwNode(var18);
//     com.google.javascript.rhino.Node var23 = var13.srcrefTree(var22);
//     var1.addChildrenToFront(var13);
//     boolean var25 = var1.isContinue();
//     com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.name("");
//     boolean var28 = var27.isGetElem();
//     boolean var29 = var27.isNull();
//     com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.returnNode();
//     com.google.javascript.rhino.Node var31 = var27.srcref(var30);
//     com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.name("");
//     var31.addChildrenToFront(var33);
//     boolean var35 = var1.isEquivalentToTyped(var31);
//     com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var38 = null;
//     var37.setJSDocInfo(var38);
//     boolean var40 = var37.isAssignAdd();
//     com.google.javascript.rhino.Node var42 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var43 = null;
//     var42.setJSDocInfo(var43);
//     boolean var45 = var42.isAssignAdd();
//     com.google.javascript.rhino.Node var46 = com.google.javascript.rhino.IR.throwNode(var42);
//     com.google.javascript.rhino.Node var47 = var37.srcrefTree(var46);
//     java.lang.Iterable var48 = var37.children();
//     boolean var49 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(var37);
//     var31.addChildToFront(var37);
//     com.google.javascript.rhino.Node var52 = var37.getChildAtIndex(26);
// 
//   }

  public void test29() {}
//   public void test29() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test29"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
//     boolean var2 = var1.isGetElem();
//     boolean var3 = var1.isNull();
//     com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.returnNode();
//     com.google.javascript.rhino.Node var5 = var1.srcref(var4);
//     com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
//     boolean var8 = var7.isGetElem();
//     boolean var9 = var7.isNull();
//     com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.returnNode();
//     com.google.javascript.rhino.Node var11 = var7.srcref(var10);
//     com.google.javascript.rhino.Node var12 = var5.useSourceInfoFromForTree(var11);
//     com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.name("");
//     boolean var15 = var14.isGetElem();
//     boolean var16 = var14.isNull();
//     boolean var17 = var14.isDebugger();
//     com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.or(var12, var14);
//     boolean var19 = var12.isInc();
//     com.google.javascript.rhino.Node var20 = null;
//     com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var23 = null;
//     var22.setJSDocInfo(var23);
//     boolean var25 = var22.isAssignAdd();
//     com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var28 = null;
//     var27.setJSDocInfo(var28);
//     boolean var30 = var27.isAssignAdd();
//     com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.throwNode(var27);
//     com.google.javascript.rhino.Node var32 = var22.srcrefTree(var31);
//     com.google.javascript.rhino.Node var34 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var35 = null;
//     var34.setJSDocInfo(var35);
//     boolean var37 = var34.isAssignAdd();
//     com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var40 = null;
//     var39.setJSDocInfo(var40);
//     boolean var42 = var39.isAssignAdd();
//     com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.IR.throwNode(var39);
//     com.google.javascript.rhino.Node var44 = var34.srcrefTree(var43);
//     com.google.javascript.rhino.Node var46 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var47 = null;
//     var46.setJSDocInfo(var47);
//     boolean var49 = var46.isAssignAdd();
//     com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var52 = null;
//     var51.setJSDocInfo(var52);
//     boolean var54 = var51.isAssignAdd();
//     com.google.javascript.rhino.Node var55 = com.google.javascript.rhino.IR.throwNode(var51);
//     com.google.javascript.rhino.Node var56 = var46.srcrefTree(var55);
//     var34.addChildrenToFront(var46);
//     boolean var58 = var32.hasChild(var34);
//     com.google.javascript.rhino.Node var59 = com.google.javascript.rhino.IR.ifNode(var12, var20, var34);
// 
//   }

  public void test30() {}
//   public void test30() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test30"); }
// 
// 
//     java.util.logging.Logger var0 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var1 = new com.google.javascript.jscomp.LoggerErrorManager(var0);
//     com.google.javascript.jscomp.Compiler var2 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var1);
//     com.google.javascript.jscomp.PassConfig var3 = null;
//     var2.setPassConfig(var3);
// 
//   }

  public void test31() {}
//   public void test31() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test31"); }
// 
// 
//     com.google.javascript.rhino.Node var0 = null;
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.throwNode(var0);
// 
//   }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test32"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.JSType var2 = null;
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var5 = null;
    var4.setJSDocInfo(var5);
    com.google.javascript.rhino.jstype.FunctionType var7 = var1.createFunctionType(var2, var4);
    com.google.javascript.rhino.jstype.JSType var9 = null;
    var1.unregisterPropertyOnType("hi!", var9);
    java.lang.Iterable var12 = var1.getTypesWithProperty("hi!");
    java.lang.Iterable var14 = var1.getTypesWithProperty("hi!");
    com.google.javascript.rhino.ErrorReporter var15 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var15);
    com.google.javascript.rhino.jstype.JSType var17 = null;
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var20 = null;
    var19.setJSDocInfo(var20);
    com.google.javascript.rhino.jstype.FunctionType var22 = var16.createFunctionType(var17, var19);
    com.google.javascript.rhino.jstype.ObjectType var23 = var22.getParentScope();
    com.google.javascript.rhino.ErrorReporter var24 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var24);
    com.google.javascript.rhino.jstype.JSType var26 = null;
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var29 = null;
    var28.setJSDocInfo(var29);
    com.google.javascript.rhino.jstype.FunctionType var31 = var25.createFunctionType(var26, var28);
    boolean var32 = var31.matchesInt32Context();
    com.google.javascript.rhino.jstype.ObjectType var33 = var31.toObjectType();
    com.google.javascript.rhino.jstype.FunctionType var34 = var1.createFunctionTypeWithNewThisType(var22, (com.google.javascript.rhino.jstype.ObjectType)var31);
    com.google.javascript.rhino.ErrorReporter var35 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var35);
    com.google.javascript.rhino.jstype.JSType var37 = null;
    com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var40 = null;
    var39.setJSDocInfo(var40);
    com.google.javascript.rhino.jstype.FunctionType var42 = var36.createFunctionType(var37, var39);
    com.google.javascript.rhino.jstype.JSType var44 = null;
    var36.unregisterPropertyOnType("hi!", var44);
    com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.IR.name("");
    boolean var49 = var48.isGetElem();
    boolean var50 = var48.isNull();
    com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var52 = var48.srcref(var51);
    com.google.javascript.rhino.Node var54 = com.google.javascript.rhino.IR.name("");
    boolean var55 = var54.isGetElem();
    boolean var56 = var54.isNull();
    com.google.javascript.rhino.Node var57 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var58 = var54.srcref(var57);
    com.google.javascript.rhino.Node var59 = var52.useSourceInfoFromForTree(var58);
    com.google.javascript.rhino.ErrorReporter var60 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var60);
    com.google.javascript.rhino.jstype.JSType var62 = null;
    com.google.javascript.rhino.Node var64 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var65 = null;
    var64.setJSDocInfo(var65);
    com.google.javascript.rhino.jstype.FunctionType var67 = var61.createFunctionType(var62, var64);
    com.google.javascript.rhino.jstype.ObjectType var68 = var36.createObjectType("goog.abstractMethod", var59, (com.google.javascript.rhino.jstype.ObjectType)var67);
    com.google.javascript.rhino.Node var71 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var72 = null;
    var71.setJSDocInfo(var72);
    boolean var74 = var71.isAssignAdd();
    com.google.javascript.rhino.Node var76 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var77 = null;
    var76.setJSDocInfo(var77);
    boolean var79 = var76.isAssignAdd();
    com.google.javascript.rhino.Node var80 = com.google.javascript.rhino.IR.throwNode(var76);
    com.google.javascript.rhino.Node var81 = var71.srcrefTree(var80);
    com.google.javascript.rhino.ErrorReporter var82 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var83 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var82);
    com.google.javascript.rhino.jstype.JSType var84 = null;
    com.google.javascript.rhino.Node var86 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var87 = null;
    var86.setJSDocInfo(var87);
    com.google.javascript.rhino.jstype.FunctionType var89 = var83.createFunctionType(var84, var86);
    com.google.javascript.rhino.jstype.ObjectType var90 = var89.getParentScope();
    com.google.javascript.rhino.jstype.EnumType var91 = var36.createEnumType("hi!. hi! at hi! line (unknown line) : (unknown column)", var71, (com.google.javascript.rhino.jstype.JSType)var90);
    com.google.javascript.rhino.jstype.EnumType var92 = var91.toMaybeEnumType();
    com.google.javascript.rhino.jstype.EnumElementType var93 = var91.getElementsType();
    boolean var95 = var93.hasProperty("LinkedGraph");
    boolean var97 = var93.hasProperty("function (): ?");
    com.google.javascript.rhino.jstype.JSType var98 = var1.createOptionalType((com.google.javascript.rhino.jstype.JSType)var93);
    boolean var99 = var93.matchesNumberContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var97 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var98);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var99 == false);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test33"); }


    com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "LinkedGraph", "hi!");
    java.lang.String var4 = var3.getOriginalPath();
    com.google.javascript.jscomp.CompilerInput var6 = new com.google.javascript.jscomp.CompilerInput(var3, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var8 = var3.getLineOffset((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "LinkedGraph"+ "'", var4.equals("LinkedGraph"));

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test34"); }


    com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var3 = null;
    var2.setJSDocInfo(var3);
    boolean var5 = var2.isAssignAdd();
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var8 = null;
    var7.setJSDocInfo(var8);
    boolean var10 = var7.isAssignAdd();
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.throwNode(var7);
    com.google.javascript.rhino.Node var12 = var2.srcrefTree(var11);
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var15 = null;
    var14.setJSDocInfo(var15);
    boolean var17 = var14.isAssignAdd();
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var20 = null;
    var19.setJSDocInfo(var20);
    boolean var22 = var19.isAssignAdd();
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.throwNode(var19);
    com.google.javascript.rhino.Node var24 = var14.srcrefTree(var23);
    var2.addChildrenToFront(var14);
    java.util.List var26 = var0.identifyTypeDeclarationCall(var2);
    boolean var27 = var2.isInc();
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.Node.newString(26, "module$hi!");
    com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var33 = null;
    var32.setJSDocInfo(var33);
    boolean var35 = var32.isAssignAdd();
    com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var38 = null;
    var37.setJSDocInfo(var38);
    boolean var40 = var37.isAssignAdd();
    com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.IR.throwNode(var37);
    com.google.javascript.rhino.Node var42 = var32.srcrefTree(var41);
    com.google.javascript.rhino.Node var44 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var45 = null;
    var44.setJSDocInfo(var45);
    boolean var47 = var44.isAssignAdd();
    com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var50 = null;
    var49.setJSDocInfo(var50);
    boolean var52 = var49.isAssignAdd();
    com.google.javascript.rhino.Node var53 = com.google.javascript.rhino.IR.throwNode(var49);
    com.google.javascript.rhino.Node var54 = var44.srcrefTree(var53);
    var32.addChildrenToFront(var44);
    boolean var56 = var32.isContinue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.addChildBefore(var30, var32);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test35"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var3 = null;
    var2.setJSDocInfo(var3);
    boolean var5 = var2.isNE();
    boolean var6 = var2.isOnlyModifiesThisCall();
    boolean var7 = var2.isContinue();
    boolean var8 = var2.isAnd();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var9 = com.google.javascript.rhino.ScriptRuntime.getMessage1("NAME \n    NAME \n", (java.lang.Object)var2);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test36"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.name("");
    boolean var4 = var3.isGetElem();
    boolean var5 = var3.isNull();
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var7 = var3.srcref(var6);
    com.google.javascript.rhino.Node var10 = new com.google.javascript.rhino.Node(100, var1, var6, 0, 0);
    com.google.javascript.rhino.JSDocInfo var11 = var6.getJSDocInfo();
    com.google.javascript.rhino.Node[] var12 = new com.google.javascript.rhino.Node[] { var6};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.paramList(var12);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
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
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test37() {}
//   public void test37() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test37"); }
// 
// 
//     java.util.logging.Logger var0 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var1 = new com.google.javascript.jscomp.LoggerErrorManager(var0);
//     com.google.javascript.jscomp.Compiler var2 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var1);
//     int var3 = var1.getErrorCount();
//     int var4 = var1.getErrorCount();
//     com.google.javascript.jscomp.CheckLevel var5 = null;
//     com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var9 = null;
//     var8.setJSDocInfo(var9);
//     boolean var11 = var8.isAssignAdd();
//     boolean var12 = var8.isGetElem();
//     boolean var13 = var8.isNumber();
//     com.google.javascript.jscomp.CheckLevel var14 = null;
//     com.google.javascript.jscomp.DiagnosticType var17 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "hi!");
//     java.lang.String[] var19 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var20 = com.google.javascript.jscomp.JSError.make("hi!", var8, var14, var17, var19);
//     java.util.logging.Logger var21 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var22 = new com.google.javascript.jscomp.LoggerErrorManager(var21);
//     com.google.javascript.jscomp.JSError[] var23 = var22.getWarnings();
//     boolean var24 = var20.equals((java.lang.Object)var22);
//     com.google.javascript.jscomp.CheckLevel var25 = var20.getDefaultLevel();
//     var1.println(var5, var20);
// 
//   }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test38"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.JSType var2 = null;
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var5 = null;
    var4.setJSDocInfo(var5);
    com.google.javascript.rhino.jstype.FunctionType var7 = var1.createFunctionType(var2, var4);
    com.google.javascript.rhino.jstype.JSType var9 = null;
    var1.unregisterPropertyOnType("hi!", var9);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.name("");
    boolean var14 = var13.isGetElem();
    boolean var15 = var13.isNull();
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var17 = var13.srcref(var16);
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.name("");
    boolean var20 = var19.isGetElem();
    boolean var21 = var19.isNull();
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var23 = var19.srcref(var22);
    com.google.javascript.rhino.Node var24 = var17.useSourceInfoFromForTree(var23);
    com.google.javascript.rhino.ErrorReporter var25 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var25);
    com.google.javascript.rhino.jstype.JSType var27 = null;
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var30 = null;
    var29.setJSDocInfo(var30);
    com.google.javascript.rhino.jstype.FunctionType var32 = var26.createFunctionType(var27, var29);
    com.google.javascript.rhino.jstype.ObjectType var33 = var1.createObjectType("goog.abstractMethod", var24, (com.google.javascript.rhino.jstype.ObjectType)var32);
    com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode var34 = null;
    var1.setResolveMode(var34);
    var1.clearNamedTypes();
    com.google.javascript.jscomp.CompilerOptions var37 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.DiagnosticGroup var38 = null;
    com.google.javascript.jscomp.CheckLevel var39 = null;
    var37.setWarningLevel(var38, var39);
    var37.setLocale("hi!");
    com.google.javascript.jscomp.CheckLevel var43 = null;
    var37.setCheckUnreachableCode(var43);
    com.google.javascript.jscomp.CompilerOptions.TracerMode var45 = var37.getTracerMode();
    boolean var46 = var37.assumeStrictThis();
    var37.setCheckSuspiciousCode(false);
    com.google.javascript.rhino.JSDocInfo var49 = new com.google.javascript.rhino.JSDocInfo();
    java.util.Collection var50 = var49.getTypeNodes();
    boolean var51 = var49.isInterface();
    var49.addSuppression("");
    boolean var54 = var49.isNoCompile();
    java.util.Set var55 = var49.getParameterNames();
    boolean var56 = var49.isExterns();
    boolean var57 = var49.shouldPreserveTry();
    int var58 = var49.getParameterCount();
    boolean var59 = var49.isDeprecated();
    java.util.List var60 = var49.getThrownTypes();
    var37.setSourceMapLocationMappings(var60);
    com.google.javascript.rhino.Node var62 = com.google.javascript.rhino.IR.paramList(var60);
    com.google.javascript.jscomp.deps.SortedDependencies var63 = new com.google.javascript.jscomp.deps.SortedDependencies(var60);
    com.google.javascript.jscomp.JSModule var65 = new com.google.javascript.jscomp.JSModule("TRUE");
    java.util.Set var66 = var65.getThisAndAllDependencies();
    com.google.javascript.jscomp.SourceFile var69 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
    var65.addFirst(var69);
    var65.setDepth(100);
    java.util.List var73 = var65.getRequires();
    java.util.List var75 = var63.getDependenciesOf(var73, false);
    com.google.javascript.rhino.Node var76 = var1.createParameters(var75);
    com.google.javascript.rhino.jstype.JSType var81 = var1.createNamedType("BLOCK", "module$hi!", 100, 38);
    boolean var82 = var81.isConstructor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
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
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test39"); }


    int var1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test40"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    var1.identifyNonNullableName("");
    boolean var5 = var1.hasNamespace("");
    com.google.javascript.rhino.ErrorReporter var7 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var7);
    com.google.javascript.rhino.jstype.JSType var9 = null;
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var12 = null;
    var11.setJSDocInfo(var12);
    com.google.javascript.rhino.jstype.FunctionType var14 = var8.createFunctionType(var9, var11);
    com.google.javascript.rhino.jstype.SimpleSlot var16 = new com.google.javascript.rhino.jstype.SimpleSlot("module$hi!", (com.google.javascript.rhino.jstype.JSType)var14, false);
    com.google.javascript.rhino.ErrorReporter var17 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var17);
    com.google.javascript.rhino.jstype.JSType var19 = null;
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var22 = null;
    var21.setJSDocInfo(var22);
    com.google.javascript.rhino.jstype.FunctionType var24 = var18.createFunctionType(var19, var21);
    com.google.javascript.rhino.jstype.JSType var26 = null;
    var18.unregisterPropertyOnType("hi!", var26);
    java.lang.Iterable var29 = var18.getTypesWithProperty("hi!");
    java.lang.Iterable var31 = var18.getTypesWithProperty("hi!");
    com.google.javascript.rhino.ErrorReporter var32 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var32);
    com.google.javascript.rhino.jstype.JSType var34 = null;
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var37 = null;
    var36.setJSDocInfo(var37);
    com.google.javascript.rhino.jstype.FunctionType var39 = var33.createFunctionType(var34, var36);
    com.google.javascript.rhino.jstype.ObjectType var40 = var39.getParentScope();
    com.google.javascript.rhino.ErrorReporter var41 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var41);
    com.google.javascript.rhino.jstype.JSType var43 = null;
    com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var46 = null;
    var45.setJSDocInfo(var46);
    com.google.javascript.rhino.jstype.FunctionType var48 = var42.createFunctionType(var43, var45);
    boolean var49 = var48.matchesInt32Context();
    com.google.javascript.rhino.jstype.ObjectType var50 = var48.toObjectType();
    com.google.javascript.rhino.jstype.FunctionType var51 = var18.createFunctionTypeWithNewThisType(var39, (com.google.javascript.rhino.jstype.ObjectType)var48);
    java.lang.String var52 = var48.getTemplateTypeName();
    var48.clearCachedValues();
    com.google.javascript.rhino.jstype.FunctionType var54 = var48.toMaybeFunctionType();
    com.google.javascript.rhino.jstype.FunctionType var55 = var1.createFunctionTypeWithNewReturnType(var14, (com.google.javascript.rhino.jstype.JSType)var48);
    com.google.javascript.rhino.jstype.ObjectType var56 = var1.createAnonymousObjectType();
    boolean var57 = var56.isNominalType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test41"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithNodeAnnotations();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.name("");
    boolean var3 = var0.hasNode((java.lang.Object)"");
    com.google.javascript.jscomp.graph.SubGraph var4 = var0.newSubGraph();
    var0.clearNodeAnnotations();
    var0.clearNodeAnnotations();
    boolean var7 = var0.isDirected();
    java.lang.Iterable var8 = var0.getDirectedGraphNodes();
    var0.pushEdgeAnnotations();
    com.google.javascript.jscomp.JSModule var11 = new com.google.javascript.jscomp.JSModule("TRUE");
    java.util.List var12 = var11.getInputs();
    java.util.Set var13 = var11.getAllDependencies();
    com.google.javascript.jscomp.CompilerOptions var14 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.DiagnosticGroup var15 = null;
    com.google.javascript.jscomp.CheckLevel var16 = null;
    var14.setWarningLevel(var15, var16);
    var14.setLocale("hi!");
    com.google.javascript.jscomp.CheckLevel var20 = null;
    var14.setCheckUnreachableCode(var20);
    var14.setCollapseProperties(false);
    com.google.javascript.jscomp.SourceMap.Format var24 = null;
    var14.setSourceMapFormat(var24);
    var14.setCheckMissingGetCssNameBlacklist("module$hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var28 = var0.getEdges((java.lang.Object)var11, (java.lang.Object)"module$hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test42() {}
//   public void test42() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test42"); }
// 
// 
//     com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
//     com.google.javascript.jscomp.DiagnosticGroup var1 = null;
//     com.google.javascript.jscomp.CheckLevel var2 = null;
//     var0.setWarningLevel(var1, var2);
//     var0.setLocale("hi!");
//     com.google.javascript.jscomp.CheckLevel var6 = null;
//     var0.setCheckUnreachableCode(var6);
//     com.google.javascript.jscomp.CompilerOptions.TracerMode var8 = var0.getTracerMode();
//     boolean var9 = var0.assumeStrictThis();
//     var0.setCheckSuspiciousCode(false);
//     com.google.javascript.rhino.JSDocInfo var12 = new com.google.javascript.rhino.JSDocInfo();
//     java.util.Collection var13 = var12.getTypeNodes();
//     boolean var14 = var12.isInterface();
//     var12.addSuppression("");
//     boolean var17 = var12.isNoCompile();
//     java.util.Set var18 = var12.getParameterNames();
//     boolean var19 = var12.isExterns();
//     boolean var20 = var12.shouldPreserveTry();
//     int var21 = var12.getParameterCount();
//     boolean var22 = var12.isDeprecated();
//     java.util.List var23 = var12.getThrownTypes();
//     var0.setSourceMapLocationMappings(var23);
//     com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.paramList(var23);
//     com.google.javascript.jscomp.deps.SortedDependencies var26 = new com.google.javascript.jscomp.deps.SortedDependencies(var23);
//     com.google.javascript.jscomp.JSModule var28 = new com.google.javascript.jscomp.JSModule("TRUE");
//     java.util.Set var29 = var28.getThisAndAllDependencies();
//     com.google.javascript.jscomp.SourceFile var32 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
//     var28.addFirst(var32);
//     var28.setDepth(100);
//     java.util.List var36 = var28.getRequires();
//     java.util.List var38 = var26.getDependenciesOf(var36, false);
//     java.util.List var39 = null;
//     java.util.List var40 = var26.getSortedDependenciesOf(var39);
// 
//   }

  public void test43() {}
//   public void test43() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test43"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     com.google.javascript.rhino.jstype.JSType var2 = null;
//     com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var5 = null;
//     var4.setJSDocInfo(var5);
//     com.google.javascript.rhino.jstype.FunctionType var7 = var1.createFunctionType(var2, var4);
//     com.google.javascript.rhino.ErrorReporter var8 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var8);
//     com.google.javascript.rhino.jstype.JSType var10 = null;
//     com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var13 = null;
//     var12.setJSDocInfo(var13);
//     com.google.javascript.rhino.jstype.FunctionType var15 = var9.createFunctionType(var10, var12);
//     boolean var16 = var15.matchesInt32Context();
//     com.google.javascript.rhino.ErrorReporter var17 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var17);
//     com.google.javascript.rhino.jstype.JSType var19 = null;
//     com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var22 = null;
//     var21.setJSDocInfo(var22);
//     com.google.javascript.rhino.jstype.FunctionType var24 = var18.createFunctionType(var19, var21);
//     com.google.javascript.rhino.jstype.JSType[] var25 = new com.google.javascript.rhino.jstype.JSType[] { var19};
//     com.google.javascript.rhino.jstype.FunctionType var26 = var1.createConstructorType((com.google.javascript.rhino.jstype.JSType)var15, var25);
//     com.google.javascript.rhino.jstype.FunctionType var27 = com.google.javascript.rhino.jstype.JSType.toMaybeFunctionType((com.google.javascript.rhino.jstype.JSType)var26);
//     com.google.javascript.rhino.JSDocInfo var28 = new com.google.javascript.rhino.JSDocInfo();
//     java.util.Collection var29 = var28.getTypeNodes();
//     boolean var30 = var28.isInterface();
//     boolean var31 = var28.isHidden();
//     com.google.javascript.rhino.Node var32 = var28.getAssociatedNode();
//     var27.setJSDocInfo(var28);
//     com.google.javascript.rhino.jstype.JSType var35 = var27.getPropertyType("function (): {1260910291}");
//     com.google.javascript.rhino.jstype.FunctionType var36 = null;
//     boolean var37 = var27.hasEqualCallType(var36);
// 
//   }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test44"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    boolean var1 = var0.isDirected();
    java.lang.Object var2 = null;
    com.google.javascript.jscomp.graph.GraphNode var3 = var0.getNode(var2);
    var0.clearEdgeAnnotations();
    var0.pushNodeAnnotations();
    com.google.javascript.rhino.ErrorReporter var6 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var6);
    var7.identifyNonNullableName("");
    boolean var11 = var7.hasNamespace("");
    com.google.javascript.rhino.ErrorReporter var13 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var13);
    com.google.javascript.rhino.jstype.JSType var15 = null;
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var18 = null;
    var17.setJSDocInfo(var18);
    com.google.javascript.rhino.jstype.FunctionType var20 = var14.createFunctionType(var15, var17);
    com.google.javascript.rhino.jstype.SimpleSlot var22 = new com.google.javascript.rhino.jstype.SimpleSlot("module$hi!", (com.google.javascript.rhino.jstype.JSType)var20, false);
    com.google.javascript.rhino.ErrorReporter var23 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var23);
    com.google.javascript.rhino.jstype.JSType var25 = null;
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var28 = null;
    var27.setJSDocInfo(var28);
    com.google.javascript.rhino.jstype.FunctionType var30 = var24.createFunctionType(var25, var27);
    com.google.javascript.rhino.jstype.JSType var32 = null;
    var24.unregisterPropertyOnType("hi!", var32);
    java.lang.Iterable var35 = var24.getTypesWithProperty("hi!");
    java.lang.Iterable var37 = var24.getTypesWithProperty("hi!");
    com.google.javascript.rhino.ErrorReporter var38 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var38);
    com.google.javascript.rhino.jstype.JSType var40 = null;
    com.google.javascript.rhino.Node var42 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var43 = null;
    var42.setJSDocInfo(var43);
    com.google.javascript.rhino.jstype.FunctionType var45 = var39.createFunctionType(var40, var42);
    com.google.javascript.rhino.jstype.ObjectType var46 = var45.getParentScope();
    com.google.javascript.rhino.ErrorReporter var47 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var47);
    com.google.javascript.rhino.jstype.JSType var49 = null;
    com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var52 = null;
    var51.setJSDocInfo(var52);
    com.google.javascript.rhino.jstype.FunctionType var54 = var48.createFunctionType(var49, var51);
    boolean var55 = var54.matchesInt32Context();
    com.google.javascript.rhino.jstype.ObjectType var56 = var54.toObjectType();
    com.google.javascript.rhino.jstype.FunctionType var57 = var24.createFunctionTypeWithNewThisType(var45, (com.google.javascript.rhino.jstype.ObjectType)var54);
    java.lang.String var58 = var54.getTemplateTypeName();
    var54.clearCachedValues();
    com.google.javascript.rhino.jstype.FunctionType var60 = var54.toMaybeFunctionType();
    com.google.javascript.rhino.jstype.FunctionType var61 = var7.createFunctionTypeWithNewReturnType(var20, (com.google.javascript.rhino.jstype.JSType)var54);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var62 = var0.getWeight((java.lang.Object)var20);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test45"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var2 = null;
    var1.setJSDocInfo(var2);
    boolean var4 = var1.isNE();
    boolean var5 = var1.isAdd();
    boolean var7 = var1.getBooleanProp(100);
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.name("");
    boolean var10 = var9.isGetElem();
    boolean var11 = var9.isNull();
    boolean var12 = var9.isDebugger();
    boolean var13 = var9.isArrayLit();
    var1.addChildToBack(var9);
    var9.setSourceEncodedPositionForTree(0);
    boolean var17 = var9.isReturn();
    boolean var18 = var9.isVoid();
    var9.setSourceEncodedPositionForTree(26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test46"); }


    com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var1 = null;
    java.util.Map var2 = null;
    var0.checkForCallingConventionDefiningCalls(var1, var2);
    boolean var5 = var0.isConstant("LinkedGraph");
    com.google.javascript.jscomp.SourceAst var6 = null;
    com.google.javascript.rhino.InputId var7 = null;
    com.google.javascript.jscomp.CompilerInput var9 = new com.google.javascript.jscomp.CompilerInput(var6, var7, false);
    java.util.logging.Logger var10 = null;
    com.google.javascript.jscomp.LoggerErrorManager var11 = new com.google.javascript.jscomp.LoggerErrorManager(var10);
    com.google.javascript.jscomp.Compiler var12 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var11);
    com.google.javascript.jscomp.JSError[] var13 = var12.getErrors();
    var9.setCompiler((com.google.javascript.jscomp.AbstractCompiler)var12);
    com.google.javascript.jscomp.JSError[] var15 = var12.getErrors();
    com.google.javascript.jscomp.NodeTraversal.Callback var16 = null;
    com.google.javascript.jscomp.NodeTraversal var17 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var12, var16);
    com.google.javascript.rhino.Node var18 = var17.getCurrentNode();
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var21 = null;
    var20.setJSDocInfo(var21);
    boolean var23 = var20.isNE();
    boolean var24 = var20.isSyntheticBlock();
    boolean var25 = var20.isFalse();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast var26 = var0.getObjectLiteralCast(var17, var20);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test47"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setManageClosureDependencies(false);
    var0.setAssumeStrictThis(false);

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test48"); }


    com.google.javascript.jscomp.GoogleCodingConvention var0 = new com.google.javascript.jscomp.GoogleCodingConvention();
    java.util.logging.Logger var1 = null;
    com.google.javascript.jscomp.LoggerErrorManager var2 = new com.google.javascript.jscomp.LoggerErrorManager(var1);
    com.google.javascript.jscomp.Compiler var3 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var2);
    com.google.javascript.jscomp.Compiler.IntermediateState var4 = var3.getState();
    com.google.javascript.jscomp.NodeTraversal.Callback var5 = null;
    com.google.javascript.jscomp.NodeTraversal var6 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var3, var5);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var9 = null;
    var8.setJSDocInfo(var9);
    boolean var11 = var8.isAssignAdd();
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var14 = null;
    var13.setJSDocInfo(var14);
    boolean var16 = var13.isAssignAdd();
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.throwNode(var13);
    com.google.javascript.rhino.Node var18 = var8.srcrefTree(var17);
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var21 = null;
    var20.setJSDocInfo(var21);
    boolean var23 = var20.isAssignAdd();
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var26 = null;
    var25.setJSDocInfo(var26);
    boolean var28 = var25.isAssignAdd();
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.throwNode(var25);
    com.google.javascript.rhino.Node var30 = var20.srcrefTree(var29);
    var8.addChildrenToFront(var20);
    boolean var32 = var8.isContinue();
    com.google.javascript.rhino.Node var34 = com.google.javascript.rhino.IR.name("");
    boolean var35 = var34.isGetElem();
    boolean var36 = var34.isNull();
    com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var38 = var34.srcref(var37);
    com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.IR.name("");
    var38.addChildrenToFront(var40);
    boolean var42 = var8.isEquivalentToTyped(var38);
    com.google.javascript.rhino.Node var44 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var45 = null;
    var44.setJSDocInfo(var45);
    boolean var47 = var44.isAssignAdd();
    com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var50 = null;
    var49.setJSDocInfo(var50);
    boolean var52 = var49.isAssignAdd();
    com.google.javascript.rhino.Node var53 = com.google.javascript.rhino.IR.throwNode(var49);
    com.google.javascript.rhino.Node var54 = var44.srcrefTree(var53);
    com.google.javascript.rhino.Node var56 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var57 = null;
    var56.setJSDocInfo(var57);
    boolean var59 = var56.isAssignAdd();
    com.google.javascript.rhino.Node var61 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var62 = null;
    var61.setJSDocInfo(var62);
    boolean var64 = var61.isAssignAdd();
    com.google.javascript.rhino.Node var65 = com.google.javascript.rhino.IR.throwNode(var61);
    com.google.javascript.rhino.Node var66 = var56.srcrefTree(var65);
    var44.addChildrenToFront(var56);
    boolean var68 = var44.isContinue();
    com.google.javascript.rhino.Node var70 = com.google.javascript.rhino.IR.name("");
    boolean var71 = var70.isGetElem();
    boolean var72 = var70.isNull();
    com.google.javascript.rhino.Node var73 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var74 = var70.srcref(var73);
    com.google.javascript.rhino.Node var76 = com.google.javascript.rhino.IR.name("");
    var74.addChildrenToFront(var76);
    boolean var78 = var44.isEquivalentToTyped(var74);
    com.google.javascript.rhino.Node var80 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var81 = null;
    var80.setJSDocInfo(var81);
    boolean var83 = var80.isAssignAdd();
    com.google.javascript.rhino.Node var85 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var86 = null;
    var85.setJSDocInfo(var86);
    boolean var88 = var85.isAssignAdd();
    com.google.javascript.rhino.Node var89 = com.google.javascript.rhino.IR.throwNode(var85);
    com.google.javascript.rhino.Node var90 = var80.srcrefTree(var89);
    java.lang.Iterable var91 = var80.children();
    boolean var92 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(var80);
    var74.addChildToFront(var80);
    java.util.Collection var94 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(var80);
    boolean var95 = var80.isInc();
    boolean var96 = var8.hasChild(var80);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast var97 = var0.getObjectLiteralCast(var6, var80);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var96 == false);

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test49"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithNodeAnnotations();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.name("");
    boolean var3 = var0.hasNode((java.lang.Object)"");
    com.google.javascript.jscomp.graph.SubGraph var4 = var0.newSubGraph();
    boolean var5 = var0.isDirected();
    java.lang.Object var6 = null;
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.continueNode();
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var10 = null;
    var9.setJSDocInfo(var10);
    boolean var12 = var9.isAssignAdd();
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var15 = null;
    var14.setJSDocInfo(var15);
    boolean var17 = var14.isAssignAdd();
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.throwNode(var14);
    com.google.javascript.rhino.Node var19 = var9.srcrefTree(var18);
    com.google.javascript.rhino.Node.AncestorIterable var20 = var18.getAncestors();
    boolean var21 = var7.isEquivalentTo(var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.disconnectInDirection(var6, (java.lang.Object)var21);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test50"); }


    com.google.javascript.jscomp.SourceFile.Generator var1 = null;
    com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromGenerator("InputId: ", var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test51() {}
//   public void test51() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test51"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.rhino.InputId var1 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, var1, false);
//     java.util.logging.Logger var4 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var5 = new com.google.javascript.jscomp.LoggerErrorManager(var4);
//     com.google.javascript.jscomp.Compiler var6 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var5);
//     com.google.javascript.jscomp.JSError[] var7 = var6.getErrors();
//     var3.setCompiler((com.google.javascript.jscomp.AbstractCompiler)var6);
//     com.google.javascript.jscomp.JSError[] var9 = var6.getErrors();
//     com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
//     com.google.javascript.jscomp.NodeTraversal var11 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var6, var10);
//     int var12 = var11.getLineNumber();
//     com.google.javascript.jscomp.JSModule var13 = var11.getModule();
// 
//   }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test52"); }


    com.google.javascript.rhino.JSDocInfoBuilder var1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
    boolean var2 = var1.recordInterface();
    boolean var3 = var1.isPopulated();
    boolean var5 = var1.recordDeprecationReason("");
    com.google.javascript.rhino.JSTypeExpression var6 = null;
    boolean var7 = var1.recordDefineType(var6);
    boolean var8 = var1.recordPreserveTry();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.number(0.0d);
    var1.markTypeNode(var10, 100, 100, (-1), 10, false);
    boolean var17 = var1.isInterfaceRecorded();
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var21 = null;
    var20.setJSDocInfo(var21);
    boolean var23 = var20.isAssignAdd();
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var26 = null;
    var25.setJSDocInfo(var26);
    boolean var28 = var25.isAssignAdd();
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.throwNode(var25);
    com.google.javascript.rhino.Node var30 = var20.srcrefTree(var29);
    com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var33 = null;
    var32.setJSDocInfo(var33);
    boolean var35 = var32.isAssignAdd();
    com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var38 = null;
    var37.setJSDocInfo(var38);
    boolean var40 = var37.isAssignAdd();
    com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.IR.throwNode(var37);
    com.google.javascript.rhino.Node var42 = var32.srcrefTree(var41);
    var20.addChildrenToFront(var32);
    boolean var44 = var20.isContinue();
    com.google.javascript.rhino.Node var46 = com.google.javascript.rhino.IR.name("");
    boolean var47 = var46.isGetElem();
    boolean var48 = var46.isNull();
    com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var50 = var46.srcref(var49);
    com.google.javascript.rhino.Node var52 = com.google.javascript.rhino.IR.name("");
    var50.addChildrenToFront(var52);
    boolean var54 = var20.isEquivalentToTyped(var50);
    com.google.javascript.rhino.Node var56 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var57 = null;
    var56.setJSDocInfo(var57);
    boolean var59 = var56.isAssignAdd();
    com.google.javascript.rhino.Node var61 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var62 = null;
    var61.setJSDocInfo(var62);
    boolean var64 = var61.isAssignAdd();
    com.google.javascript.rhino.Node var65 = com.google.javascript.rhino.IR.throwNode(var61);
    com.google.javascript.rhino.Node var66 = var56.srcrefTree(var65);
    java.lang.Iterable var67 = var56.children();
    boolean var68 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(var56);
    var50.addChildToFront(var56);
    com.google.javascript.jscomp.SourceFile var72 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
    com.google.javascript.jscomp.JsAst var73 = new com.google.javascript.jscomp.JsAst(var72);
    var50.setStaticSourceFile((com.google.javascript.rhino.jstype.StaticSourceFile)var72);
    var1.markName("module$NAME ", (com.google.javascript.rhino.jstype.StaticSourceFile)var72, 100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test53"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var1 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithNodeAnnotations();
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.name("");
    boolean var4 = var1.hasNode((java.lang.Object)"");
    com.google.javascript.jscomp.graph.SubGraph var5 = var1.newSubGraph();
    var1.clearNodeAnnotations();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var7 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var8 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var9 = var7.createDirectedGraphNode((java.lang.Object)var8);
    java.util.List var10 = var1.getNeighborNodes(var9);
    java.util.List var11 = var0.getNeighborNodes(var9);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.name("");
    boolean var16 = var15.isGetElem();
    boolean var17 = var15.isNull();
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var19 = var15.srcref(var18);
    com.google.javascript.rhino.Node var22 = new com.google.javascript.rhino.Node(100, var13, var18, 0, 0);
    java.lang.Object var23 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var24 = var0.getDirectedGraphEdges((java.lang.Object)var13, var23);
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test54() {}
//   public void test54() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test54"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.rhino.InputId var1 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, var1, true);
//     com.google.javascript.jscomp.JSModule var4 = var3.getModule();
//     int var6 = var3.getLineOffset(0);
// 
//   }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test55"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.JSType var2 = null;
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var5 = null;
    var4.setJSDocInfo(var5);
    com.google.javascript.rhino.jstype.FunctionType var7 = var1.createFunctionType(var2, var4);
    com.google.javascript.rhino.jstype.JSType var9 = null;
    var1.unregisterPropertyOnType("hi!", var9);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.name("");
    boolean var14 = var13.isGetElem();
    boolean var15 = var13.isNull();
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var17 = var13.srcref(var16);
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.name("");
    boolean var20 = var19.isGetElem();
    boolean var21 = var19.isNull();
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var23 = var19.srcref(var22);
    com.google.javascript.rhino.Node var24 = var17.useSourceInfoFromForTree(var23);
    com.google.javascript.rhino.ErrorReporter var25 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var25);
    com.google.javascript.rhino.jstype.JSType var27 = null;
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var30 = null;
    var29.setJSDocInfo(var30);
    com.google.javascript.rhino.jstype.FunctionType var32 = var26.createFunctionType(var27, var29);
    com.google.javascript.rhino.ErrorReporter var33 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var33);
    com.google.javascript.rhino.jstype.JSType var35 = null;
    com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var38 = null;
    var37.setJSDocInfo(var38);
    com.google.javascript.rhino.jstype.FunctionType var40 = var34.createFunctionType(var35, var37);
    boolean var41 = var40.matchesInt32Context();
    com.google.javascript.rhino.ErrorReporter var42 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var42);
    com.google.javascript.rhino.jstype.JSType var44 = null;
    com.google.javascript.rhino.Node var46 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var47 = null;
    var46.setJSDocInfo(var47);
    com.google.javascript.rhino.jstype.FunctionType var49 = var43.createFunctionType(var44, var46);
    com.google.javascript.rhino.jstype.JSType[] var50 = new com.google.javascript.rhino.jstype.JSType[] { var44};
    com.google.javascript.rhino.jstype.FunctionType var51 = var26.createConstructorType((com.google.javascript.rhino.jstype.JSType)var40, var50);
    com.google.javascript.rhino.jstype.FunctionType var52 = com.google.javascript.rhino.jstype.JSType.toMaybeFunctionType((com.google.javascript.rhino.jstype.JSType)var51);
    com.google.javascript.rhino.jstype.FunctionType var54 = var51.getBindReturnType(0);
    com.google.javascript.rhino.jstype.EnumType var55 = var1.createEnumType("", var17, (com.google.javascript.rhino.jstype.JSType)var51);
    boolean var56 = var55.isCheckedUnknownType();
    boolean var57 = var55.hasDisplayName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
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
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test56"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.continueNode();
    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.breakNode();
    int var2 = var1.getLength();
    var0.addChildrenToBack(var1);
    com.google.javascript.rhino.Node[] var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.switchNode(var1, var4);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test57"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    java.util.Collection var1 = var0.getTypeNodes();
    boolean var2 = var0.isInterface();
    boolean var3 = var0.isHidden();
    com.google.javascript.rhino.Node var4 = var0.getAssociatedNode();
    boolean var5 = var0.containsDeclaration();
    java.lang.String var7 = var0.getDescriptionForParameter("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test58"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    com.google.javascript.jscomp.graph.LinkedDirectedGraph var1 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var2 = var0.createDirectedGraphNode((java.lang.Object)var1);
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var5 = null;
    var4.setJSDocInfo(var5);
    boolean var7 = var4.isAssignAdd();
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var10 = null;
    var9.setJSDocInfo(var10);
    boolean var12 = var9.isAssignAdd();
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.throwNode(var9);
    com.google.javascript.rhino.Node var14 = var4.srcrefTree(var13);
    boolean var15 = var14.isLocalResultCall();
    int var16 = var14.getSideEffectFlags();
    com.google.javascript.rhino.ErrorReporter var17 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var17);
    com.google.javascript.rhino.jstype.JSType var19 = null;
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var22 = null;
    var21.setJSDocInfo(var22);
    com.google.javascript.rhino.jstype.FunctionType var24 = var18.createFunctionType(var19, var21);
    com.google.javascript.rhino.jstype.JSType var26 = null;
    var18.unregisterPropertyOnType("hi!", var26);
    java.lang.Iterable var29 = var18.getTypesWithProperty("hi!");
    java.lang.Iterable var31 = var18.getTypesWithProperty("hi!");
    com.google.javascript.rhino.ErrorReporter var32 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var32);
    com.google.javascript.rhino.jstype.JSType var34 = null;
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var37 = null;
    var36.setJSDocInfo(var37);
    com.google.javascript.rhino.jstype.FunctionType var39 = var33.createFunctionType(var34, var36);
    com.google.javascript.rhino.jstype.ObjectType var40 = var39.getParentScope();
    com.google.javascript.rhino.ErrorReporter var41 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var41);
    com.google.javascript.rhino.jstype.JSType var43 = null;
    com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var46 = null;
    var45.setJSDocInfo(var46);
    com.google.javascript.rhino.jstype.FunctionType var48 = var42.createFunctionType(var43, var45);
    boolean var49 = var48.matchesInt32Context();
    com.google.javascript.rhino.jstype.ObjectType var50 = var48.toObjectType();
    com.google.javascript.rhino.jstype.FunctionType var51 = var18.createFunctionTypeWithNewThisType(var39, (com.google.javascript.rhino.jstype.ObjectType)var48);
    java.lang.String var52 = var48.getTemplateTypeName();
    var48.clearCachedValues();
    com.google.javascript.rhino.jstype.FunctionType var54 = var48.toMaybeFunctionType();
    java.lang.String var55 = var48.toString();
    java.util.logging.Logger var56 = null;
    com.google.javascript.jscomp.LoggerErrorManager var57 = new com.google.javascript.jscomp.LoggerErrorManager(var56);
    com.google.javascript.jscomp.Compiler var58 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var57);
    int var59 = var57.getErrorCount();
    int var60 = var57.getErrorCount();
    com.google.javascript.jscomp.Compiler var61 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var57);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.connectIfNotFound((java.lang.Object)var14, (java.lang.Object)var55, (java.lang.Object)var57);
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
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "function (): ?"+ "'", var55.equals("function (): ?"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0);

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test59"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var2 = null;
    var1.setJSDocInfo(var2);
    boolean var4 = var1.isAssignAdd();
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var7 = null;
    var6.setJSDocInfo(var7);
    boolean var9 = var6.isAssignAdd();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.throwNode(var6);
    com.google.javascript.rhino.Node var11 = var1.srcrefTree(var10);
    boolean var12 = var11.isLocalResultCall();
    int var13 = var11.getSideEffectFlags();
    int var14 = var11.getLineno();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));

  }

  public void test60() {}
//   public void test60() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test60"); }
// 
// 
//     java.util.logging.Logger var0 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var1 = new com.google.javascript.jscomp.LoggerErrorManager(var0);
//     com.google.javascript.jscomp.Compiler var2 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var1);
//     com.google.javascript.jscomp.JSError[] var3 = var2.getErrors();
//     com.google.javascript.rhino.JSDocInfo var4 = new com.google.javascript.rhino.JSDocInfo();
//     java.util.Collection var5 = var4.getTypeNodes();
//     boolean var6 = var4.isInterface();
//     var4.addSuppression("");
//     boolean var9 = var4.isNoCompile();
//     java.util.Set var10 = var4.getParameterNames();
//     boolean var11 = var4.isExterns();
//     boolean var12 = var4.shouldPreserveTry();
//     int var13 = var4.getParameterCount();
//     boolean var14 = var4.isDeprecated();
//     java.util.List var15 = var4.getThrownTypes();
//     com.google.javascript.rhino.ErrorReporter var16 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var16);
//     com.google.javascript.rhino.jstype.JSType var18 = null;
//     com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var21 = null;
//     var20.setJSDocInfo(var21);
//     com.google.javascript.rhino.jstype.FunctionType var23 = var17.createFunctionType(var18, var20);
//     com.google.javascript.rhino.jstype.JSType var25 = null;
//     var17.unregisterPropertyOnType("hi!", var25);
//     java.lang.Iterable var28 = var17.getTypesWithProperty("hi!");
//     com.google.javascript.rhino.ErrorReporter var29 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var29);
//     com.google.javascript.rhino.jstype.JSType var31 = null;
//     com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var34 = null;
//     var33.setJSDocInfo(var34);
//     com.google.javascript.rhino.jstype.FunctionType var36 = var30.createFunctionType(var31, var33);
//     com.google.javascript.rhino.jstype.JSType var38 = null;
//     var30.unregisterPropertyOnType("hi!", var38);
//     java.lang.Iterable var41 = var30.getTypesWithProperty("hi!");
//     java.lang.Iterable var43 = var30.getTypesWithProperty("hi!");
//     com.google.javascript.rhino.ErrorReporter var44 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var44);
//     com.google.javascript.rhino.jstype.JSType var46 = null;
//     com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var49 = null;
//     var48.setJSDocInfo(var49);
//     com.google.javascript.rhino.jstype.FunctionType var51 = var45.createFunctionType(var46, var48);
//     com.google.javascript.rhino.jstype.ObjectType var52 = var51.getParentScope();
//     com.google.javascript.rhino.ErrorReporter var53 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var53);
//     com.google.javascript.rhino.jstype.JSType var55 = null;
//     com.google.javascript.rhino.Node var57 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var58 = null;
//     var57.setJSDocInfo(var58);
//     com.google.javascript.rhino.jstype.FunctionType var60 = var54.createFunctionType(var55, var57);
//     boolean var61 = var60.matchesInt32Context();
//     com.google.javascript.rhino.jstype.ObjectType var62 = var60.toObjectType();
//     com.google.javascript.rhino.jstype.FunctionType var63 = var30.createFunctionTypeWithNewThisType(var51, (com.google.javascript.rhino.jstype.ObjectType)var60);
//     java.lang.String var64 = var60.getTemplateTypeName();
//     var60.clearCachedValues();
//     com.google.javascript.rhino.jstype.FunctionType var66 = var60.toMaybeFunctionType();
//     var17.resolveTypesInScope((com.google.javascript.rhino.jstype.StaticScope)var60);
//     var17.setTemplateTypeName("");
//     com.google.javascript.rhino.JSDocInfo var70 = new com.google.javascript.rhino.JSDocInfo();
//     java.util.Collection var71 = var70.getTypeNodes();
//     boolean var72 = var70.isInterface();
//     var70.addSuppression("");
//     boolean var75 = var70.isNoCompile();
//     com.google.javascript.rhino.JSTypeExpression var76 = var70.getTypedefType();
//     com.google.javascript.rhino.JSDocInfo.Visibility var77 = var70.getVisibility();
//     java.util.List var78 = var70.getThrownTypes();
//     com.google.javascript.rhino.Node var79 = var17.createParametersWithVarArgs(var78);
//     com.google.javascript.jscomp.CompilerOptions var80 = new com.google.javascript.jscomp.CompilerOptions();
//     com.google.javascript.jscomp.DiagnosticGroup var81 = null;
//     com.google.javascript.jscomp.CheckLevel var82 = null;
//     var80.setWarningLevel(var81, var82);
//     var80.setLocale("hi!");
//     var80.setExportTestFunctions(false);
//     var80.setRenamePrefixNamespace("hi!");
//     var2.<com.google.javascript.jscomp.SourceFile>initModules(var15, var78, var80);
// 
//   }

  public void test61() {}
//   public void test61() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test61"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.jscomp.CompilerInput var2 = new com.google.javascript.jscomp.CompilerInput(var0, false);
// 
//   }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test62"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    java.util.Collection var1 = var0.getTypeNodes();
    boolean var2 = var0.isInterface();
    boolean var3 = var0.isHidden();
    com.google.javascript.rhino.JSTypeExpression var4 = var0.getThisType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test63"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.DiagnosticGroup var1 = null;
    com.google.javascript.jscomp.CheckLevel var2 = null;
    var0.setWarningLevel(var1, var2);
    var0.setLocale("hi!");
    com.google.javascript.jscomp.CheckLevel var6 = null;
    var0.setCheckUnreachableCode(var6);
    var0.setCollapseProperties(false);
    com.google.javascript.rhino.JSDocInfo var10 = new com.google.javascript.rhino.JSDocInfo();
    java.util.Collection var11 = var10.getTypeNodes();
    boolean var12 = var10.isInterface();
    var10.addSuppression("");
    boolean var15 = var10.isNoCompile();
    java.util.Set var16 = var10.getParameterNames();
    var0.setStripTypePrefixes(var16);
    var0.setOptimizeParameters(true);
    var0.setDefineToDoubleLiteral("module$hi!", 0.0d);
    com.google.javascript.rhino.JSDocInfo var23 = new com.google.javascript.rhino.JSDocInfo();
    java.util.Collection var24 = var23.getTypeNodes();
    boolean var25 = var23.isInterface();
    boolean var26 = var23.isHidden();
    java.util.List var27 = var23.getImplementedInterfaces();
    com.google.javascript.jscomp.JSModuleGraph var28 = new com.google.javascript.jscomp.JSModuleGraph(var27);
    com.google.javascript.rhino.ErrorReporter var29 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var29);
    com.google.javascript.rhino.jstype.JSType var31 = null;
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var34 = null;
    var33.setJSDocInfo(var34);
    com.google.javascript.rhino.jstype.FunctionType var36 = var30.createFunctionType(var31, var33);
    com.google.javascript.rhino.ErrorReporter var37 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var37);
    com.google.javascript.rhino.jstype.JSType var39 = null;
    com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var42 = null;
    var41.setJSDocInfo(var42);
    com.google.javascript.rhino.jstype.FunctionType var44 = var38.createFunctionType(var39, var41);
    boolean var45 = var44.matchesInt32Context();
    com.google.javascript.rhino.ErrorReporter var46 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var46);
    com.google.javascript.rhino.jstype.JSType var48 = null;
    com.google.javascript.rhino.Node var50 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var51 = null;
    var50.setJSDocInfo(var51);
    com.google.javascript.rhino.jstype.FunctionType var53 = var47.createFunctionType(var48, var50);
    com.google.javascript.rhino.jstype.JSType[] var54 = new com.google.javascript.rhino.jstype.JSType[] { var48};
    com.google.javascript.rhino.jstype.FunctionType var55 = var30.createConstructorType((com.google.javascript.rhino.jstype.JSType)var44, var54);
    com.google.javascript.rhino.ErrorReporter var56 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var56);
    com.google.javascript.rhino.jstype.JSType var58 = null;
    com.google.javascript.rhino.Node var60 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var61 = null;
    var60.setJSDocInfo(var61);
    com.google.javascript.rhino.jstype.FunctionType var63 = var57.createFunctionType(var58, var60);
    com.google.javascript.rhino.jstype.JSType var65 = null;
    var57.unregisterPropertyOnType("hi!", var65);
    com.google.javascript.rhino.jstype.JSType var67 = null;
    com.google.javascript.rhino.JSDocInfo var68 = new com.google.javascript.rhino.JSDocInfo();
    java.util.Collection var69 = var68.getTypeNodes();
    boolean var70 = var68.isInterface();
    var68.addSuppression("");
    boolean var73 = var68.isNoCompile();
    com.google.javascript.rhino.JSTypeExpression var74 = var68.getTypedefType();
    com.google.javascript.rhino.JSDocInfo.Visibility var75 = var68.getVisibility();
    java.util.List var76 = var68.getThrownTypes();
    com.google.javascript.rhino.jstype.FunctionType var77 = var57.createFunctionType(var67, var76);
    var55.setImplementedInterfaces(var76);
    com.google.javascript.rhino.JSDocInfo var79 = new com.google.javascript.rhino.JSDocInfo();
    java.util.Collection var80 = var79.getTypeNodes();
    boolean var81 = var79.isInterface();
    var79.addSuppression("");
    boolean var84 = var79.isNoCompile();
    java.util.Set var85 = var79.getParameterNames();
    boolean var86 = var79.isExterns();
    boolean var87 = var79.shouldPreserveTry();
    int var88 = var79.getParameterCount();
    boolean var89 = var79.isDeprecated();
    java.util.List var90 = var79.getThrownTypes();
    java.util.List var91 = var28.manageDependencies(var76, var90);
    com.google.javascript.jscomp.JSModuleGraph var92 = new com.google.javascript.jscomp.JSModuleGraph(var76);
    var0.setSourceMapLocationMappings(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test64"); }


    com.google.javascript.jscomp.GoogleCodingConvention var0 = new com.google.javascript.jscomp.GoogleCodingConvention();
    boolean var2 = var0.isConstantKey("function (): ?");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test65"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.JSType var2 = null;
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var5 = null;
    var4.setJSDocInfo(var5);
    com.google.javascript.rhino.jstype.FunctionType var7 = var1.createFunctionType(var2, var4);
    com.google.javascript.rhino.jstype.JSType var9 = null;
    var1.unregisterPropertyOnType("hi!", var9);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.name("");
    boolean var14 = var13.isGetElem();
    boolean var15 = var13.isNull();
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var17 = var13.srcref(var16);
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.name("");
    boolean var20 = var19.isGetElem();
    boolean var21 = var19.isNull();
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var23 = var19.srcref(var22);
    com.google.javascript.rhino.Node var24 = var17.useSourceInfoFromForTree(var23);
    com.google.javascript.rhino.ErrorReporter var25 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var25);
    com.google.javascript.rhino.jstype.JSType var27 = null;
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var30 = null;
    var29.setJSDocInfo(var30);
    com.google.javascript.rhino.jstype.FunctionType var32 = var26.createFunctionType(var27, var29);
    com.google.javascript.rhino.jstype.ObjectType var33 = var1.createObjectType("goog.abstractMethod", var24, (com.google.javascript.rhino.jstype.ObjectType)var32);
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var37 = null;
    var36.setJSDocInfo(var37);
    boolean var39 = var36.isAssignAdd();
    com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var42 = null;
    var41.setJSDocInfo(var42);
    boolean var44 = var41.isAssignAdd();
    com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.IR.throwNode(var41);
    com.google.javascript.rhino.Node var46 = var36.srcrefTree(var45);
    com.google.javascript.rhino.ErrorReporter var47 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var47);
    com.google.javascript.rhino.jstype.JSType var49 = null;
    com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var52 = null;
    var51.setJSDocInfo(var52);
    com.google.javascript.rhino.jstype.FunctionType var54 = var48.createFunctionType(var49, var51);
    com.google.javascript.rhino.jstype.ObjectType var55 = var54.getParentScope();
    com.google.javascript.rhino.jstype.EnumType var56 = var1.createEnumType("hi!. hi! at hi! line (unknown line) : (unknown column)", var36, (com.google.javascript.rhino.jstype.JSType)var55);
    com.google.javascript.rhino.jstype.EnumType var57 = var56.toMaybeEnumType();
    com.google.javascript.rhino.jstype.EnumElementType var58 = var56.getElementsType();
    boolean var60 = var58.hasProperty("LinkedGraph");
    com.google.javascript.rhino.jstype.FunctionType var61 = var58.getOwnerFunction();
    com.google.javascript.rhino.jstype.JSType var62 = var58.getPrimitiveType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
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
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
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
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test66"); }


    java.util.logging.Logger var0 = null;
    com.google.javascript.jscomp.LoggerErrorManager var1 = new com.google.javascript.jscomp.LoggerErrorManager(var0);
    com.google.javascript.jscomp.Compiler var2 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var1);
    com.google.javascript.rhino.Node var3 = var2.getRoot();
    com.google.javascript.jscomp.JSError[] var4 = var2.getWarnings();
    com.google.javascript.jscomp.ErrorManager var5 = var2.getErrorManager();
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.returnNode();
    boolean var7 = var6.isLabelName();
    boolean var8 = var6.isDec();
    com.google.javascript.jscomp.NodeTraversal.Callback var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.NodeTraversal.traverse((com.google.javascript.jscomp.AbstractCompiler)var2, var6, var9);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test67"); }


    boolean var1 = com.google.javascript.rhino.ScriptRuntime.isJSLineTerminator(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test68() {}
//   public void test68() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test68"); }
// 
// 
//     java.util.logging.Logger var0 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var1 = new com.google.javascript.jscomp.LoggerErrorManager(var0);
//     com.google.javascript.jscomp.Compiler var2 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var1);
//     com.google.javascript.jscomp.JSError[] var3 = var2.getErrors();
//     com.google.javascript.jscomp.Compiler.IntermediateState var4 = var2.getState();
//     com.google.javascript.rhino.ErrorReporter var5 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var5);
//     com.google.javascript.rhino.jstype.JSType var7 = null;
//     com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var10 = null;
//     var9.setJSDocInfo(var10);
//     com.google.javascript.rhino.jstype.FunctionType var12 = var6.createFunctionType(var7, var9);
//     com.google.javascript.rhino.jstype.JSType var14 = null;
//     var6.unregisterPropertyOnType("hi!", var14);
//     com.google.javascript.rhino.jstype.JSType var16 = null;
//     com.google.javascript.rhino.JSDocInfo var17 = new com.google.javascript.rhino.JSDocInfo();
//     java.util.Collection var18 = var17.getTypeNodes();
//     boolean var19 = var17.isInterface();
//     var17.addSuppression("");
//     boolean var22 = var17.isNoCompile();
//     com.google.javascript.rhino.JSTypeExpression var23 = var17.getTypedefType();
//     com.google.javascript.rhino.JSDocInfo.Visibility var24 = var17.getVisibility();
//     java.util.List var25 = var17.getThrownTypes();
//     com.google.javascript.rhino.jstype.FunctionType var26 = var6.createFunctionType(var16, var25);
//     com.google.javascript.jscomp.NodeTraversal.Callback var27 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var2, var25, var27);
//     com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt var29 = null;
//     com.google.javascript.jscomp.LightweightMessageFormatter var30 = new com.google.javascript.jscomp.LightweightMessageFormatter((com.google.javascript.jscomp.SourceExcerptProvider)var2, var29);
//     var2.optimize();
// 
//   }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test69"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var4 = null;
    var3.setJSDocInfo(var4);
    boolean var6 = var3.isAssignAdd();
    boolean var7 = var3.isGetElem();
    boolean var8 = var3.isNumber();
    com.google.javascript.jscomp.CheckLevel var9 = null;
    com.google.javascript.jscomp.DiagnosticType var12 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "hi!");
    java.lang.String[] var14 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var15 = com.google.javascript.jscomp.JSError.make("hi!", var3, var9, var12, var14);
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var18 = null;
    var17.setJSDocInfo(var18);
    boolean var20 = var17.isNE();
    boolean var21 = var17.isAdd();
    boolean var22 = var17.isLabel();
    com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var25 = null;
    var24.setJSDocInfo(var25);
    boolean var27 = var24.isAssignAdd();
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var30 = null;
    var29.setJSDocInfo(var30);
    boolean var32 = var29.isAssignAdd();
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.throwNode(var29);
    com.google.javascript.rhino.Node var34 = var24.srcrefTree(var33);
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var37 = null;
    var36.setJSDocInfo(var37);
    boolean var39 = var36.isAssignAdd();
    com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var42 = null;
    var41.setJSDocInfo(var42);
    boolean var44 = var41.isAssignAdd();
    com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.IR.throwNode(var41);
    com.google.javascript.rhino.Node var46 = var36.srcrefTree(var45);
    com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var49 = null;
    var48.setJSDocInfo(var49);
    boolean var51 = var48.isAssignAdd();
    com.google.javascript.rhino.Node var53 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var54 = null;
    var53.setJSDocInfo(var54);
    boolean var56 = var53.isAssignAdd();
    com.google.javascript.rhino.Node var57 = com.google.javascript.rhino.IR.throwNode(var53);
    com.google.javascript.rhino.Node var58 = var48.srcrefTree(var57);
    var36.addChildrenToFront(var48);
    boolean var60 = var34.hasChild(var36);
    com.google.javascript.rhino.Node var62 = com.google.javascript.rhino.Node.newNumber(0.0d);
    com.google.javascript.rhino.Node var63 = new com.google.javascript.rhino.Node(100, var3, var17, var34, var62);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var65 = var63.getExistingIntProp(0);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test70"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    boolean var2 = var1.isGetElem();
    boolean var3 = var1.isNull();
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var5 = var1.srcref(var4);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.throwNode(var5);
    var6.detachChildren();
    com.google.javascript.jscomp.CompilerOptions var8 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.DiagnosticGroup var9 = null;
    com.google.javascript.jscomp.CheckLevel var10 = null;
    var8.setWarningLevel(var9, var10);
    var8.setLocale("hi!");
    com.google.javascript.jscomp.CheckLevel var14 = null;
    var8.setCheckUnreachableCode(var14);
    var8.setCollapseProperties(false);
    var8.setInputDelimiter("hi!");
    com.google.javascript.jscomp.CompilerOptions var20 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.DiagnosticGroup var21 = null;
    com.google.javascript.jscomp.CheckLevel var22 = null;
    var20.setWarningLevel(var21, var22);
    var20.setLocale("hi!");
    com.google.javascript.jscomp.CheckLevel var26 = null;
    var20.setCheckUnreachableCode(var26);
    var20.setCollapseProperties(false);
    com.google.javascript.rhino.JSDocInfo var30 = new com.google.javascript.rhino.JSDocInfo();
    java.util.Collection var31 = var30.getTypeNodes();
    boolean var32 = var30.isInterface();
    var30.addSuppression("");
    boolean var35 = var30.isNoCompile();
    java.util.Set var36 = var30.getParameterNames();
    var20.setStripTypePrefixes(var36);
    var20.setOptimizeParameters(true);
    com.google.javascript.jscomp.CompilerOptions var40 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.DiagnosticGroup var41 = null;
    com.google.javascript.jscomp.CheckLevel var42 = null;
    var40.setWarningLevel(var41, var42);
    var40.setLocale("hi!");
    com.google.javascript.jscomp.CheckLevel var46 = null;
    var40.setCheckUnreachableCode(var46);
    var40.setCollapseProperties(false);
    com.google.javascript.rhino.JSDocInfo var50 = new com.google.javascript.rhino.JSDocInfo();
    java.util.Collection var51 = var50.getTypeNodes();
    boolean var52 = var50.isInterface();
    var50.addSuppression("");
    boolean var55 = var50.isNoCompile();
    java.util.Set var56 = var50.getParameterNames();
    var40.setStripTypePrefixes(var56);
    var20.setAliasableStrings(var56);
    var8.setReplaceStringsReservedStrings(var56);
    var6.setDirectives(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);

  }

  public void test71() {}
//   public void test71() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test71"); }
// 
// 
//     java.util.logging.Logger var0 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var1 = new com.google.javascript.jscomp.LoggerErrorManager(var0);
//     com.google.javascript.jscomp.Compiler var2 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var1);
//     com.google.javascript.jscomp.Compiler.IntermediateState var3 = var2.getState();
//     com.google.javascript.jscomp.NodeTraversal.Callback var4 = null;
//     com.google.javascript.jscomp.NodeTraversal var5 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var2, var4);
//     var2.optimize();
// 
//   }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test72"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var2 = null;
    var1.setJSDocInfo(var2);
    boolean var4 = var1.isSyntheticBlock();
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.name("");
    boolean var7 = var6.isGetElem();
    boolean var8 = var6.isNull();
    boolean var9 = var6.isNull();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.catchNode(var1, var6);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test73"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    boolean var2 = var1.isGetElem();
    boolean var3 = var1.isNull();
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var5 = var1.srcref(var4);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
    boolean var8 = var7.isGetElem();
    boolean var9 = var7.isNull();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var11 = var7.srcref(var10);
    com.google.javascript.rhino.Node var12 = var5.useSourceInfoFromForTree(var11);
    com.google.javascript.rhino.ErrorReporter var13 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var13);
    com.google.javascript.rhino.jstype.JSType var15 = null;
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var18 = null;
    var17.setJSDocInfo(var18);
    com.google.javascript.rhino.jstype.FunctionType var20 = var14.createFunctionType(var15, var17);
    com.google.javascript.rhino.jstype.JSType var22 = null;
    var14.unregisterPropertyOnType("hi!", var22);
    java.lang.Iterable var25 = var14.getTypesWithProperty("hi!");
    java.lang.Iterable var27 = var14.getTypesWithProperty("hi!");
    com.google.javascript.rhino.ErrorReporter var28 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var28);
    com.google.javascript.rhino.jstype.JSType var30 = null;
    com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var33 = null;
    var32.setJSDocInfo(var33);
    com.google.javascript.rhino.jstype.FunctionType var35 = var29.createFunctionType(var30, var32);
    com.google.javascript.rhino.jstype.ObjectType var36 = var35.getParentScope();
    com.google.javascript.rhino.ErrorReporter var37 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var37);
    com.google.javascript.rhino.jstype.JSType var39 = null;
    com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var42 = null;
    var41.setJSDocInfo(var42);
    com.google.javascript.rhino.jstype.FunctionType var44 = var38.createFunctionType(var39, var41);
    boolean var45 = var44.matchesInt32Context();
    com.google.javascript.rhino.jstype.ObjectType var46 = var44.toObjectType();
    com.google.javascript.rhino.jstype.FunctionType var47 = var14.createFunctionTypeWithNewThisType(var35, (com.google.javascript.rhino.jstype.ObjectType)var44);
    java.lang.String var48 = var44.getTemplateTypeName();
    var44.clearCachedValues();
    var12.setJSType((com.google.javascript.rhino.jstype.JSType)var44);
    com.google.javascript.rhino.jstype.UnionType var51 = var44.toMaybeUnionType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);

  }

  public void test74() {}
//   public void test74() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test74"); }
// 
// 
//     com.google.javascript.rhino.Node[] var0 = null;
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.paramList(var0);
// 
//   }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test75"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.DiagnosticGroup var1 = null;
    com.google.javascript.jscomp.CheckLevel var2 = null;
    var0.setWarningLevel(var1, var2);
    var0.setLocale("hi!");
    com.google.javascript.jscomp.CheckLevel var6 = null;
    var0.setCheckUnreachableCode(var6);
    com.google.javascript.jscomp.CompilerOptions.TracerMode var8 = var0.getTracerMode();
    boolean var9 = var0.assumeStrictThis();
    var0.setCheckSuspiciousCode(false);
    com.google.javascript.rhino.JSDocInfo var12 = new com.google.javascript.rhino.JSDocInfo();
    java.util.Collection var13 = var12.getTypeNodes();
    boolean var14 = var12.isInterface();
    var12.addSuppression("");
    boolean var17 = var12.isNoCompile();
    java.util.Set var18 = var12.getParameterNames();
    boolean var19 = var12.isExterns();
    boolean var20 = var12.shouldPreserveTry();
    int var21 = var12.getParameterCount();
    boolean var22 = var12.isDeprecated();
    java.util.List var23 = var12.getThrownTypes();
    var0.setSourceMapLocationMappings(var23);
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.paramList(var23);
    com.google.javascript.jscomp.deps.SortedDependencies var26 = new com.google.javascript.jscomp.deps.SortedDependencies(var23);
    java.util.List var27 = var26.getSortedList();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.deps.DependencyInfo var29 = var26.getInputProviding("goog.global");
      fail("Expected exception of type com.google.javascript.jscomp.deps.SortedDependencies.MissingProvideException");
    } catch (com.google.javascript.jscomp.deps.SortedDependencies.MissingProvideException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test76() {}
//   public void test76() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test76"); }
// 
// 
//     com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var3 = null;
//     var2.setJSDocInfo(var3);
//     boolean var5 = var2.isAssignAdd();
//     com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var8 = null;
//     var7.setJSDocInfo(var8);
//     boolean var10 = var7.isAssignAdd();
//     com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.throwNode(var7);
//     com.google.javascript.rhino.Node var12 = var2.srcrefTree(var11);
//     com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var15 = null;
//     var14.setJSDocInfo(var15);
//     boolean var17 = var14.isAssignAdd();
//     com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var20 = null;
//     var19.setJSDocInfo(var20);
//     boolean var22 = var19.isAssignAdd();
//     com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.throwNode(var19);
//     com.google.javascript.rhino.Node var24 = var14.srcrefTree(var23);
//     var2.addChildrenToFront(var14);
//     java.util.List var26 = var0.identifyTypeDeclarationCall(var2);
//     boolean var29 = var0.isExported("", true);
//     com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var32 = null;
//     var31.setJSDocInfo(var32);
//     boolean var34 = var31.isAssignAdd();
//     com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var37 = null;
//     var36.setJSDocInfo(var37);
//     boolean var39 = var36.isAssignAdd();
//     com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.IR.throwNode(var36);
//     com.google.javascript.rhino.Node var41 = var31.srcrefTree(var40);
//     com.google.javascript.rhino.Node.AncestorIterable var42 = var40.getAncestors();
//     com.google.javascript.rhino.Node var43 = var40.getLastChild();
//     com.google.javascript.jscomp.CodingConvention.DelegateRelationship var44 = var0.getDelegateRelationship(var40);
//     java.lang.String var45 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(var40);
// 
//   }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test77"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.DiagnosticGroup var1 = null;
    com.google.javascript.jscomp.CheckLevel var2 = null;
    var0.setWarningLevel(var1, var2);
    var0.enableRuntimeTypeCheck("hi!");
    com.google.javascript.jscomp.CheckLevel var6 = null;
    var0.setCheckMissingGetCssNameLevel(var6);
    var0.setProtectHiddenSideEffects(true);
    com.google.javascript.jscomp.CompilerOptions.LanguageMode var10 = var0.getLanguageOut();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test78"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
    com.google.javascript.jscomp.ClosureCodingConvention var1 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var4 = null;
    var3.setJSDocInfo(var4);
    boolean var6 = var3.isAssignAdd();
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var9 = null;
    var8.setJSDocInfo(var9);
    boolean var11 = var8.isAssignAdd();
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.throwNode(var8);
    com.google.javascript.rhino.Node var13 = var3.srcrefTree(var12);
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var16 = null;
    var15.setJSDocInfo(var16);
    boolean var18 = var15.isAssignAdd();
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var21 = null;
    var20.setJSDocInfo(var21);
    boolean var23 = var20.isAssignAdd();
    com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.IR.throwNode(var20);
    com.google.javascript.rhino.Node var25 = var15.srcrefTree(var24);
    var3.addChildrenToFront(var15);
    java.util.List var27 = var1.identifyTypeDeclarationCall(var3);
    boolean var30 = var1.isExported("", true);
    com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var33 = null;
    var32.setJSDocInfo(var33);
    boolean var35 = var32.isAssignAdd();
    com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var38 = null;
    var37.setJSDocInfo(var38);
    boolean var40 = var37.isAssignAdd();
    com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.IR.throwNode(var37);
    com.google.javascript.rhino.Node var42 = var32.srcrefTree(var41);
    com.google.javascript.rhino.Node.AncestorIterable var43 = var41.getAncestors();
    com.google.javascript.rhino.Node var44 = var41.getLastChild();
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var45 = var1.getDelegateRelationship(var41);
    com.google.javascript.jscomp.GoogleCodingConvention var46 = new com.google.javascript.jscomp.GoogleCodingConvention((com.google.javascript.jscomp.CodingConvention)var1);
    boolean var48 = var46.isPrivate("NAME \n    NAME \n");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var49 = var0.getDirectedSuccNodes((java.lang.Object)var48);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test79() {}
//   public void test79() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test79"); }
// 
// 
//     com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var3 = null;
//     var2.setJSDocInfo(var3);
//     boolean var5 = var2.isAssignAdd();
//     com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var8 = null;
//     var7.setJSDocInfo(var8);
//     boolean var10 = var7.isAssignAdd();
//     com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.throwNode(var7);
//     com.google.javascript.rhino.Node var12 = var2.srcrefTree(var11);
//     com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var15 = null;
//     var14.setJSDocInfo(var15);
//     boolean var17 = var14.isAssignAdd();
//     com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var20 = null;
//     var19.setJSDocInfo(var20);
//     boolean var22 = var19.isAssignAdd();
//     com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.throwNode(var19);
//     com.google.javascript.rhino.Node var24 = var14.srcrefTree(var23);
//     var2.addChildrenToFront(var14);
//     java.util.List var26 = var0.identifyTypeDeclarationCall(var2);
//     boolean var29 = var0.isExported("", true);
//     boolean var31 = var0.isConstantKey("goog.exportProperty");
//     boolean var33 = var0.isPrivate("NAME ");
//     com.google.javascript.rhino.Node var34 = null;
//     java.lang.String var35 = var0.getSingletonGetterClassName(var34);
// 
//   }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test80"); }


    com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var3 = null;
    var2.setJSDocInfo(var3);
    boolean var5 = var2.isAssignAdd();
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var8 = null;
    var7.setJSDocInfo(var8);
    boolean var10 = var7.isAssignAdd();
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.throwNode(var7);
    com.google.javascript.rhino.Node var12 = var2.srcrefTree(var11);
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var15 = null;
    var14.setJSDocInfo(var15);
    boolean var17 = var14.isAssignAdd();
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var20 = null;
    var19.setJSDocInfo(var20);
    boolean var22 = var19.isAssignAdd();
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.throwNode(var19);
    com.google.javascript.rhino.Node var24 = var14.srcrefTree(var23);
    var2.addChildrenToFront(var14);
    java.util.List var26 = var0.identifyTypeDeclarationCall(var2);
    boolean var29 = var0.isExported("", true);
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var32 = null;
    var31.setJSDocInfo(var32);
    boolean var34 = var31.isAssignAdd();
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var37 = null;
    var36.setJSDocInfo(var37);
    boolean var39 = var36.isAssignAdd();
    com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.IR.throwNode(var36);
    com.google.javascript.rhino.Node var41 = var31.srcrefTree(var40);
    com.google.javascript.rhino.Node.AncestorIterable var42 = var40.getAncestors();
    com.google.javascript.rhino.Node var43 = var40.getLastChild();
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var44 = var0.getDelegateRelationship(var40);
    com.google.javascript.jscomp.GoogleCodingConvention var45 = new com.google.javascript.jscomp.GoogleCodingConvention((com.google.javascript.jscomp.CodingConvention)var0);
    com.google.javascript.jscomp.GoogleCodingConvention var46 = new com.google.javascript.jscomp.GoogleCodingConvention((com.google.javascript.jscomp.CodingConvention)var45);
    boolean var49 = var45.isExported("TRUE", true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);

  }

  public void test81() {}
//   public void test81() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test81"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.rhino.InputId var1 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, var1, false);
//     java.util.logging.Logger var4 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var5 = new com.google.javascript.jscomp.LoggerErrorManager(var4);
//     com.google.javascript.jscomp.Compiler var6 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var5);
//     com.google.javascript.jscomp.JSError[] var7 = var6.getErrors();
//     var3.setCompiler((com.google.javascript.jscomp.AbstractCompiler)var6);
//     com.google.javascript.jscomp.JSError[] var9 = var6.getErrors();
//     com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
//     com.google.javascript.jscomp.NodeTraversal var11 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var6, var10);
//     int var12 = var11.getLineNumber();
//     com.google.javascript.jscomp.CompilerInput var13 = var11.getInput();
// 
//   }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test82"); }


    com.google.javascript.jscomp.SourceAst var0 = null;
    com.google.javascript.rhino.InputId var1 = null;
    com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, var1, false);
    java.util.logging.Logger var4 = null;
    com.google.javascript.jscomp.LoggerErrorManager var5 = new com.google.javascript.jscomp.LoggerErrorManager(var4);
    com.google.javascript.jscomp.Compiler var6 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var5);
    com.google.javascript.jscomp.JSError[] var7 = var6.getErrors();
    var3.setCompiler((com.google.javascript.jscomp.AbstractCompiler)var6);
    com.google.javascript.jscomp.JSError[] var9 = var6.getErrors();
    com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
    com.google.javascript.jscomp.NodeTraversal var11 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var6, var10);
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var15 = null;
    var14.setJSDocInfo(var15);
    boolean var17 = var14.isAssignAdd();
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var20 = null;
    var19.setJSDocInfo(var20);
    boolean var22 = var19.isAssignAdd();
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.throwNode(var19);
    com.google.javascript.rhino.Node var24 = var14.srcrefTree(var23);
    boolean var25 = var24.isLocalResultCall();
    com.google.javascript.jscomp.ClosureCodingConvention var26 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.name("");
    boolean var29 = var28.isGetElem();
    boolean var30 = var28.isNull();
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var32 = var28.srcref(var31);
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.throwNode(var32);
    java.lang.String var34 = var26.getSingletonGetterClassName(var33);
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.name("");
    boolean var37 = var36.isGetElem();
    boolean var38 = var36.isNull();
    com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var40 = var36.srcref(var39);
    com.google.javascript.rhino.Node var42 = com.google.javascript.rhino.IR.name("");
    var40.addChildrenToFront(var42);
    com.google.javascript.rhino.ErrorReporter var45 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var45);
    com.google.javascript.rhino.jstype.JSType var47 = null;
    com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var50 = null;
    var49.setJSDocInfo(var50);
    com.google.javascript.rhino.jstype.FunctionType var52 = var46.createFunctionType(var47, var49);
    boolean var53 = var52.isGlobalThisType();
    boolean var54 = var52.isConstructor();
    var40.putProp(0, (java.lang.Object)var52);
    com.google.javascript.rhino.Node var57 = com.google.javascript.rhino.IR.name("");
    boolean var58 = var57.isGetElem();
    boolean var59 = var57.isNull();
    com.google.javascript.rhino.Node var60 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var61 = var57.srcref(var60);
    com.google.javascript.rhino.Node var62 = new com.google.javascript.rhino.Node(0, var24, var33, var40, var61);
    com.google.javascript.rhino.Node var65 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var66 = null;
    var65.setJSDocInfo(var66);
    boolean var68 = var65.isAssignAdd();
    boolean var69 = var65.isGetElem();
    boolean var70 = var65.isNumber();
    com.google.javascript.jscomp.CheckLevel var71 = null;
    com.google.javascript.jscomp.DiagnosticType var74 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "hi!");
    java.lang.String[] var76 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var77 = com.google.javascript.jscomp.JSError.make("hi!", var65, var71, var74, var76);
    com.google.javascript.jscomp.CheckLevel var81 = null;
    com.google.javascript.jscomp.DiagnosticType var84 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "hi!");
    java.lang.String[] var86 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var87 = com.google.javascript.jscomp.JSError.make("hi!", 100, 0, var81, var84, var86);
    com.google.javascript.jscomp.JSError var88 = var11.makeError(var40, var74, var86);
    boolean var89 = var40.isName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
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
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == true);

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test83"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.JSType var2 = null;
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var5 = null;
    var4.setJSDocInfo(var5);
    com.google.javascript.rhino.jstype.FunctionType var7 = var1.createFunctionType(var2, var4);
    com.google.javascript.rhino.jstype.JSType var9 = null;
    var1.unregisterPropertyOnType("hi!", var9);
    java.lang.Iterable var12 = var1.getTypesWithProperty("hi!");
    java.lang.Iterable var14 = var1.getTypesWithProperty("hi!");
    com.google.javascript.rhino.ErrorReporter var15 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var15);
    com.google.javascript.rhino.jstype.JSType var17 = null;
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var20 = null;
    var19.setJSDocInfo(var20);
    com.google.javascript.rhino.jstype.FunctionType var22 = var16.createFunctionType(var17, var19);
    com.google.javascript.rhino.jstype.ObjectType var23 = var22.getParentScope();
    com.google.javascript.rhino.ErrorReporter var24 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var24);
    com.google.javascript.rhino.jstype.JSType var26 = null;
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var29 = null;
    var28.setJSDocInfo(var29);
    com.google.javascript.rhino.jstype.FunctionType var31 = var25.createFunctionType(var26, var28);
    boolean var32 = var31.matchesInt32Context();
    com.google.javascript.rhino.jstype.ObjectType var33 = var31.toObjectType();
    com.google.javascript.rhino.jstype.FunctionType var34 = var1.createFunctionTypeWithNewThisType(var22, (com.google.javascript.rhino.jstype.ObjectType)var31);
    com.google.javascript.rhino.ErrorReporter var35 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var35);
    com.google.javascript.rhino.jstype.JSType var37 = null;
    com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var40 = null;
    var39.setJSDocInfo(var40);
    com.google.javascript.rhino.jstype.FunctionType var42 = var36.createFunctionType(var37, var39);
    com.google.javascript.rhino.jstype.JSType var44 = null;
    var36.unregisterPropertyOnType("hi!", var44);
    com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.IR.name("");
    boolean var49 = var48.isGetElem();
    boolean var50 = var48.isNull();
    com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var52 = var48.srcref(var51);
    com.google.javascript.rhino.Node var54 = com.google.javascript.rhino.IR.name("");
    boolean var55 = var54.isGetElem();
    boolean var56 = var54.isNull();
    com.google.javascript.rhino.Node var57 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var58 = var54.srcref(var57);
    com.google.javascript.rhino.Node var59 = var52.useSourceInfoFromForTree(var58);
    com.google.javascript.rhino.ErrorReporter var60 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var60);
    com.google.javascript.rhino.jstype.JSType var62 = null;
    com.google.javascript.rhino.Node var64 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var65 = null;
    var64.setJSDocInfo(var65);
    com.google.javascript.rhino.jstype.FunctionType var67 = var61.createFunctionType(var62, var64);
    com.google.javascript.rhino.jstype.ObjectType var68 = var36.createObjectType("goog.abstractMethod", var59, (com.google.javascript.rhino.jstype.ObjectType)var67);
    com.google.javascript.rhino.Node var71 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var72 = null;
    var71.setJSDocInfo(var72);
    boolean var74 = var71.isAssignAdd();
    com.google.javascript.rhino.Node var76 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var77 = null;
    var76.setJSDocInfo(var77);
    boolean var79 = var76.isAssignAdd();
    com.google.javascript.rhino.Node var80 = com.google.javascript.rhino.IR.throwNode(var76);
    com.google.javascript.rhino.Node var81 = var71.srcrefTree(var80);
    com.google.javascript.rhino.ErrorReporter var82 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var83 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var82);
    com.google.javascript.rhino.jstype.JSType var84 = null;
    com.google.javascript.rhino.Node var86 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var87 = null;
    var86.setJSDocInfo(var87);
    com.google.javascript.rhino.jstype.FunctionType var89 = var83.createFunctionType(var84, var86);
    com.google.javascript.rhino.jstype.ObjectType var90 = var89.getParentScope();
    com.google.javascript.rhino.jstype.EnumType var91 = var36.createEnumType("hi!. hi! at hi! line (unknown line) : (unknown column)", var71, (com.google.javascript.rhino.jstype.JSType)var90);
    com.google.javascript.rhino.jstype.EnumType var92 = var91.toMaybeEnumType();
    com.google.javascript.rhino.jstype.EnumElementType var93 = var91.getElementsType();
    boolean var95 = var93.hasProperty("LinkedGraph");
    boolean var97 = var93.hasProperty("function (): ?");
    com.google.javascript.rhino.jstype.JSType var98 = var1.createOptionalType((com.google.javascript.rhino.jstype.JSType)var93);
    boolean var99 = var93.canBeCalled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var97 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var98);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var99 == true);

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test84"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var2 = null;
    var1.setJSDocInfo(var2);
    boolean var4 = var1.isNE();
    boolean var5 = var1.isAdd();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var7 = var1.getExistingIntProp(3);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test85"); }


    com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromCode("goog.abstractMethod", "module$hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test86"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setSourceMapOutputPath("module$hi!");
    var0.setRemoveUnusedPrototypeProperties(true);
    boolean var5 = var0.assumeStrictThis();
    var0.setInlineLocalVariables(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test87"); }


    com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var3 = null;
    var2.setJSDocInfo(var3);
    boolean var5 = var2.isAssignAdd();
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var8 = null;
    var7.setJSDocInfo(var8);
    boolean var10 = var7.isAssignAdd();
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.throwNode(var7);
    com.google.javascript.rhino.Node var12 = var2.srcrefTree(var11);
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var15 = null;
    var14.setJSDocInfo(var15);
    boolean var17 = var14.isAssignAdd();
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var20 = null;
    var19.setJSDocInfo(var20);
    boolean var22 = var19.isAssignAdd();
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.throwNode(var19);
    com.google.javascript.rhino.Node var24 = var14.srcrefTree(var23);
    var2.addChildrenToFront(var14);
    java.util.List var26 = var0.identifyTypeDeclarationCall(var2);
    boolean var29 = var0.isExported("", true);
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var32 = null;
    var31.setJSDocInfo(var32);
    boolean var34 = var31.isAssignAdd();
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var37 = null;
    var36.setJSDocInfo(var37);
    boolean var39 = var36.isAssignAdd();
    com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.IR.throwNode(var36);
    com.google.javascript.rhino.Node var41 = var31.srcrefTree(var40);
    com.google.javascript.rhino.Node.AncestorIterable var42 = var40.getAncestors();
    com.google.javascript.rhino.Node var43 = var40.getLastChild();
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var44 = var0.getDelegateRelationship(var40);
    com.google.javascript.jscomp.GoogleCodingConvention var45 = new com.google.javascript.jscomp.GoogleCodingConvention((com.google.javascript.jscomp.CodingConvention)var0);
    boolean var48 = var45.isExported("goog.abstractMethod", true);
    boolean var50 = var45.isConstant("function (): {1260910291}");
    com.google.javascript.rhino.Node var52 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode((com.google.javascript.jscomp.CodingConvention)var45, "function (): {1260910291}");
    com.google.javascript.jscomp.ClosureCodingConvention var53 = new com.google.javascript.jscomp.ClosureCodingConvention((com.google.javascript.jscomp.CodingConvention)var45);
    boolean var55 = var45.isPrivate("goog.global");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test88"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.JSType var2 = null;
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var5 = null;
    var4.setJSDocInfo(var5);
    com.google.javascript.rhino.jstype.FunctionType var7 = var1.createFunctionType(var2, var4);
    com.google.javascript.rhino.ErrorReporter var8 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var8);
    com.google.javascript.rhino.jstype.JSType var10 = null;
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var13 = null;
    var12.setJSDocInfo(var13);
    com.google.javascript.rhino.jstype.FunctionType var15 = var9.createFunctionType(var10, var12);
    boolean var16 = var15.matchesInt32Context();
    com.google.javascript.rhino.ErrorReporter var17 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var17);
    com.google.javascript.rhino.jstype.JSType var19 = null;
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var22 = null;
    var21.setJSDocInfo(var22);
    com.google.javascript.rhino.jstype.FunctionType var24 = var18.createFunctionType(var19, var21);
    com.google.javascript.rhino.jstype.JSType[] var25 = new com.google.javascript.rhino.jstype.JSType[] { var19};
    com.google.javascript.rhino.jstype.FunctionType var26 = var1.createConstructorType((com.google.javascript.rhino.jstype.JSType)var15, var25);
    boolean var27 = var26.isReturnTypeInferred();
    com.google.javascript.rhino.ErrorReporter var28 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var28);
    com.google.javascript.rhino.jstype.JSType var30 = null;
    com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var33 = null;
    var32.setJSDocInfo(var33);
    com.google.javascript.rhino.jstype.FunctionType var35 = var29.createFunctionType(var30, var32);
    boolean var36 = var35.isGlobalThisType();
    com.google.javascript.rhino.jstype.ObjectType var37 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType)var35);
    com.google.javascript.rhino.jstype.JSType var38 = var37.collapseUnion();
    boolean var39 = var26.isEquivalentTo((com.google.javascript.rhino.jstype.JSType)var37);
    com.google.javascript.rhino.ErrorReporter var41 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var41);
    com.google.javascript.rhino.jstype.JSType var43 = null;
    com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var46 = null;
    var45.setJSDocInfo(var46);
    com.google.javascript.rhino.jstype.FunctionType var48 = var42.createFunctionType(var43, var45);
    com.google.javascript.rhino.ErrorReporter var49 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var49);
    com.google.javascript.rhino.jstype.JSType var51 = null;
    com.google.javascript.rhino.Node var53 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var54 = null;
    var53.setJSDocInfo(var54);
    com.google.javascript.rhino.jstype.FunctionType var56 = var50.createFunctionType(var51, var53);
    boolean var57 = var56.matchesInt32Context();
    com.google.javascript.rhino.ErrorReporter var58 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var58);
    com.google.javascript.rhino.jstype.JSType var60 = null;
    com.google.javascript.rhino.Node var62 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var63 = null;
    var62.setJSDocInfo(var63);
    com.google.javascript.rhino.jstype.FunctionType var65 = var59.createFunctionType(var60, var62);
    com.google.javascript.rhino.jstype.JSType[] var66 = new com.google.javascript.rhino.jstype.JSType[] { var60};
    com.google.javascript.rhino.jstype.FunctionType var67 = var42.createConstructorType((com.google.javascript.rhino.jstype.JSType)var56, var66);
    com.google.javascript.rhino.Node var69 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var70 = null;
    var69.setJSDocInfo(var70);
    boolean var72 = var69.isNE();
    boolean var73 = var37.defineInferredProperty("hi!", (com.google.javascript.rhino.jstype.JSType)var67, var69);
    com.google.javascript.rhino.Node var75 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var76 = null;
    var75.setJSDocInfo(var76);
    boolean var78 = var75.isNE();
    boolean var79 = var75.isAdd();
    boolean var81 = var75.getBooleanProp(100);
    com.google.javascript.rhino.Node var83 = com.google.javascript.rhino.IR.name("");
    boolean var84 = var83.isGetElem();
    boolean var85 = var83.isNull();
    boolean var86 = var83.isDebugger();
    boolean var87 = var83.isArrayLit();
    var75.addChildToBack(var83);
    var83.setSourceEncodedPositionForTree(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var91 = com.google.javascript.rhino.IR.or(var69, var83);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test89"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.JSType var2 = null;
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var5 = null;
    var4.setJSDocInfo(var5);
    com.google.javascript.rhino.jstype.FunctionType var7 = var1.createFunctionType(var2, var4);
    com.google.javascript.rhino.jstype.JSType var9 = null;
    var1.unregisterPropertyOnType("hi!", var9);
    java.lang.Iterable var12 = var1.getTypesWithProperty("hi!");
    com.google.javascript.rhino.ErrorReporter var13 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var13);
    com.google.javascript.rhino.jstype.JSType var15 = null;
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var18 = null;
    var17.setJSDocInfo(var18);
    com.google.javascript.rhino.jstype.FunctionType var20 = var14.createFunctionType(var15, var17);
    com.google.javascript.rhino.jstype.JSType var22 = null;
    var14.unregisterPropertyOnType("hi!", var22);
    java.lang.Iterable var25 = var14.getTypesWithProperty("hi!");
    java.lang.Iterable var27 = var14.getTypesWithProperty("hi!");
    com.google.javascript.rhino.ErrorReporter var28 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var28);
    com.google.javascript.rhino.jstype.JSType var30 = null;
    com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var33 = null;
    var32.setJSDocInfo(var33);
    com.google.javascript.rhino.jstype.FunctionType var35 = var29.createFunctionType(var30, var32);
    com.google.javascript.rhino.jstype.ObjectType var36 = var35.getParentScope();
    com.google.javascript.rhino.ErrorReporter var37 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var37);
    com.google.javascript.rhino.jstype.JSType var39 = null;
    com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var42 = null;
    var41.setJSDocInfo(var42);
    com.google.javascript.rhino.jstype.FunctionType var44 = var38.createFunctionType(var39, var41);
    boolean var45 = var44.matchesInt32Context();
    com.google.javascript.rhino.jstype.ObjectType var46 = var44.toObjectType();
    com.google.javascript.rhino.jstype.FunctionType var47 = var14.createFunctionTypeWithNewThisType(var35, (com.google.javascript.rhino.jstype.ObjectType)var44);
    java.lang.String var48 = var44.getTemplateTypeName();
    var44.clearCachedValues();
    com.google.javascript.rhino.jstype.FunctionType var50 = var44.toMaybeFunctionType();
    var1.resolveTypesInScope((com.google.javascript.rhino.jstype.StaticScope)var44);
    java.lang.Iterable var53 = var1.getEachReferenceTypeWithProperty("module$hi!");
    boolean var54 = var1.shouldTolerateUndefinedValues();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test90"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    var0.setSourceMapOutputPath("module$hi!");
    com.google.javascript.jscomp.CheckLevel var3 = null;
    var0.setCheckMissingReturn(var3);
    var0.setCollapsePropertiesOnExternTypes(false);
    var0.setRemoveUnusedPrototypePropertiesInExterns(false);
    var0.setShadowVariables(false);
    var0.setInlineLocalVariables(true);

  }

  public void test91() {}
//   public void test91() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test91"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = null;
//     com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.name("");
//     boolean var4 = var3.isGetElem();
//     boolean var5 = var3.isNull();
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.returnNode();
//     com.google.javascript.rhino.Node var7 = var3.srcref(var6);
//     com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.name("");
//     var7.addChildrenToFront(var9);
//     com.google.javascript.rhino.JSTypeExpression var12 = new com.google.javascript.rhino.JSTypeExpression(var9, "hi!");
//     com.google.javascript.rhino.Node var13 = var12.getRoot();
//     boolean var14 = var13.isDec();
//     boolean var15 = var13.isCatch();
//     com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var18 = null;
//     var17.setJSDocInfo(var18);
//     boolean var20 = var17.isAssignAdd();
//     boolean var21 = var17.isGetElem();
//     boolean var22 = var17.isNumber();
//     boolean var23 = var17.isDelProp();
//     com.google.javascript.rhino.Node var24 = new com.google.javascript.rhino.Node(10, var1, var13, var17);
// 
//   }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test92"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    java.util.Collection var1 = var0.getTypeNodes();
    boolean var2 = var0.isInterface();
    var0.addSuppression("");
    boolean var5 = var0.isNoCompile();
    com.google.javascript.rhino.JSTypeExpression var6 = var0.getTypedefType();
    boolean var7 = var0.isJavaDispatch();
    java.lang.String var8 = var0.getReturnDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test93"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.JSType var2 = null;
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var5 = null;
    var4.setJSDocInfo(var5);
    com.google.javascript.rhino.jstype.FunctionType var7 = var1.createFunctionType(var2, var4);
    com.google.javascript.rhino.jstype.JSType var9 = null;
    var1.unregisterPropertyOnType("hi!", var9);
    java.lang.Iterable var12 = var1.getTypesWithProperty("hi!");
    java.lang.Iterable var14 = var1.getTypesWithProperty("hi!");
    com.google.javascript.rhino.ErrorReporter var15 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var15);
    com.google.javascript.rhino.jstype.JSType var17 = null;
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var20 = null;
    var19.setJSDocInfo(var20);
    com.google.javascript.rhino.jstype.FunctionType var22 = var16.createFunctionType(var17, var19);
    com.google.javascript.rhino.jstype.ObjectType var23 = var22.getParentScope();
    com.google.javascript.rhino.ErrorReporter var24 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var24);
    com.google.javascript.rhino.jstype.JSType var26 = null;
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var29 = null;
    var28.setJSDocInfo(var29);
    com.google.javascript.rhino.jstype.FunctionType var31 = var25.createFunctionType(var26, var28);
    boolean var32 = var31.matchesInt32Context();
    com.google.javascript.rhino.jstype.ObjectType var33 = var31.toObjectType();
    com.google.javascript.rhino.jstype.FunctionType var34 = var1.createFunctionTypeWithNewThisType(var22, (com.google.javascript.rhino.jstype.ObjectType)var31);
    com.google.javascript.rhino.ErrorReporter var35 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var35);
    com.google.javascript.rhino.jstype.JSType var37 = null;
    com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var40 = null;
    var39.setJSDocInfo(var40);
    com.google.javascript.rhino.jstype.FunctionType var42 = var36.createFunctionType(var37, var39);
    com.google.javascript.rhino.jstype.JSType var44 = null;
    var36.unregisterPropertyOnType("hi!", var44);
    com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.IR.name("");
    boolean var49 = var48.isGetElem();
    boolean var50 = var48.isNull();
    com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var52 = var48.srcref(var51);
    com.google.javascript.rhino.Node var54 = com.google.javascript.rhino.IR.name("");
    boolean var55 = var54.isGetElem();
    boolean var56 = var54.isNull();
    com.google.javascript.rhino.Node var57 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var58 = var54.srcref(var57);
    com.google.javascript.rhino.Node var59 = var52.useSourceInfoFromForTree(var58);
    com.google.javascript.rhino.ErrorReporter var60 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var60);
    com.google.javascript.rhino.jstype.JSType var62 = null;
    com.google.javascript.rhino.Node var64 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var65 = null;
    var64.setJSDocInfo(var65);
    com.google.javascript.rhino.jstype.FunctionType var67 = var61.createFunctionType(var62, var64);
    com.google.javascript.rhino.jstype.ObjectType var68 = var36.createObjectType("goog.abstractMethod", var59, (com.google.javascript.rhino.jstype.ObjectType)var67);
    com.google.javascript.rhino.Node var71 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var72 = null;
    var71.setJSDocInfo(var72);
    boolean var74 = var71.isAssignAdd();
    com.google.javascript.rhino.Node var76 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var77 = null;
    var76.setJSDocInfo(var77);
    boolean var79 = var76.isAssignAdd();
    com.google.javascript.rhino.Node var80 = com.google.javascript.rhino.IR.throwNode(var76);
    com.google.javascript.rhino.Node var81 = var71.srcrefTree(var80);
    com.google.javascript.rhino.ErrorReporter var82 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var83 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var82);
    com.google.javascript.rhino.jstype.JSType var84 = null;
    com.google.javascript.rhino.Node var86 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var87 = null;
    var86.setJSDocInfo(var87);
    com.google.javascript.rhino.jstype.FunctionType var89 = var83.createFunctionType(var84, var86);
    com.google.javascript.rhino.jstype.ObjectType var90 = var89.getParentScope();
    com.google.javascript.rhino.jstype.EnumType var91 = var36.createEnumType("hi!. hi! at hi! line (unknown line) : (unknown column)", var71, (com.google.javascript.rhino.jstype.JSType)var90);
    com.google.javascript.rhino.jstype.EnumType var92 = var91.toMaybeEnumType();
    com.google.javascript.rhino.jstype.EnumElementType var93 = var91.getElementsType();
    boolean var95 = var93.hasProperty("LinkedGraph");
    boolean var97 = var93.hasProperty("function (): ?");
    com.google.javascript.rhino.jstype.JSType var98 = var1.createOptionalType((com.google.javascript.rhino.jstype.JSType)var93);
    boolean var99 = var98.isEnumType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var97 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var98);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var99 == false);

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test94"); }


    com.google.javascript.rhino.Node var0 = com.google.javascript.rhino.IR.continueNode();
    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.breakNode();
    int var2 = var1.getLength();
    var0.addChildrenToBack(var1);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var8 = null;
    var7.setJSDocInfo(var8);
    boolean var10 = var7.isAssignAdd();
    boolean var11 = var7.isGetElem();
    boolean var12 = var7.isNumber();
    com.google.javascript.jscomp.CheckLevel var13 = null;
    com.google.javascript.jscomp.DiagnosticType var16 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "hi!");
    java.lang.String[] var18 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var19 = com.google.javascript.jscomp.JSError.make("hi!", var7, var13, var16, var18);
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var22 = null;
    var21.setJSDocInfo(var22);
    boolean var24 = var21.isNE();
    boolean var25 = var21.isAdd();
    boolean var26 = var21.isLabel();
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var29 = null;
    var28.setJSDocInfo(var29);
    boolean var31 = var28.isAssignAdd();
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var34 = null;
    var33.setJSDocInfo(var34);
    boolean var36 = var33.isAssignAdd();
    com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.IR.throwNode(var33);
    com.google.javascript.rhino.Node var38 = var28.srcrefTree(var37);
    com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var41 = null;
    var40.setJSDocInfo(var41);
    boolean var43 = var40.isAssignAdd();
    com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var46 = null;
    var45.setJSDocInfo(var46);
    boolean var48 = var45.isAssignAdd();
    com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.throwNode(var45);
    com.google.javascript.rhino.Node var50 = var40.srcrefTree(var49);
    com.google.javascript.rhino.Node var52 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var53 = null;
    var52.setJSDocInfo(var53);
    boolean var55 = var52.isAssignAdd();
    com.google.javascript.rhino.Node var57 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var58 = null;
    var57.setJSDocInfo(var58);
    boolean var60 = var57.isAssignAdd();
    com.google.javascript.rhino.Node var61 = com.google.javascript.rhino.IR.throwNode(var57);
    com.google.javascript.rhino.Node var62 = var52.srcrefTree(var61);
    var40.addChildrenToFront(var52);
    boolean var64 = var38.hasChild(var40);
    com.google.javascript.rhino.Node var66 = com.google.javascript.rhino.Node.newNumber(0.0d);
    com.google.javascript.rhino.Node var67 = new com.google.javascript.rhino.Node(100, var7, var21, var38, var66);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var68 = com.google.javascript.rhino.IR.catchNode(var1, var7);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);

  }

  public void test95() {}
//   public void test95() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test95"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var2 = null;
//     var1.setJSDocInfo(var2);
//     boolean var4 = var1.isAssignAdd();
//     com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var7 = null;
//     var6.setJSDocInfo(var7);
//     boolean var9 = var6.isAssignAdd();
//     com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.throwNode(var6);
//     com.google.javascript.rhino.Node var11 = var1.srcrefTree(var10);
//     boolean var12 = var11.isRegExp();
//     com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.name("");
//     boolean var15 = var14.isGetElem();
//     boolean var16 = var14.isNull();
//     com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.returnNode();
//     com.google.javascript.rhino.Node var18 = var14.srcref(var17);
//     com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.throwNode(var18);
//     com.google.javascript.rhino.Node[] var20 = new com.google.javascript.rhino.Node[] { var19};
//     com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.block(var20);
//     java.lang.Iterable var22 = var21.siblings();
//     com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var25 = null;
//     var24.setJSDocInfo(var25);
//     boolean var27 = var24.isNE();
//     boolean var28 = var24.isFor();
//     var21.addChildrenToBack(var24);
//     com.google.javascript.rhino.Node var30 = var11.getChildBefore(var24);
// 
//   }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test96"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.DiagnosticGroup var1 = null;
    com.google.javascript.jscomp.CheckLevel var2 = null;
    var0.setWarningLevel(var1, var2);
    var0.setLocale("hi!");
    com.google.javascript.jscomp.CheckLevel var6 = null;
    var0.setCheckUnreachableCode(var6);
    var0.setCollapseProperties(false);
    var0.setInstrumentationTemplate("function (): {1260910291}");
    com.google.javascript.jscomp.CodingConvention var12 = var0.getCodingConvention();
    com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var13 = null;
    var0.setAnonymousFunctionNaming(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test97() {}
//   public void test97() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test97"); }
// 
// 
//     java.util.logging.Logger var0 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var1 = new com.google.javascript.jscomp.LoggerErrorManager(var0);
//     com.google.javascript.jscomp.Compiler var2 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var1);
//     com.google.javascript.jscomp.Compiler.IntermediateState var3 = var2.getState();
//     com.google.javascript.jscomp.NodeTraversal.Callback var4 = null;
//     com.google.javascript.jscomp.NodeTraversal var5 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var2, var4);
//     java.lang.String var6 = var5.getSourceName();
//     com.google.javascript.jscomp.Compiler var7 = var5.getCompiler();
//     com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var10 = null;
//     var9.setJSDocInfo(var10);
//     boolean var12 = var9.isAssignAdd();
//     com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var15 = null;
//     var14.setJSDocInfo(var15);
//     boolean var17 = var14.isAssignAdd();
//     com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.throwNode(var14);
//     com.google.javascript.rhino.Node var19 = var9.srcrefTree(var18);
//     com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var22 = null;
//     var21.setJSDocInfo(var22);
//     boolean var24 = var21.isAssignAdd();
//     com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var27 = null;
//     var26.setJSDocInfo(var27);
//     boolean var29 = var26.isAssignAdd();
//     com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.throwNode(var26);
//     com.google.javascript.rhino.Node var31 = var21.srcrefTree(var30);
//     var9.addChildrenToFront(var21);
//     boolean var33 = var9.isContinue();
//     com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.IR.name("");
//     boolean var36 = var35.isGetElem();
//     boolean var37 = var35.isNull();
//     com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.IR.returnNode();
//     com.google.javascript.rhino.Node var39 = var35.srcref(var38);
//     com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.IR.name("");
//     var39.addChildrenToFront(var41);
//     boolean var43 = var9.isEquivalentToTyped(var39);
//     com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var46 = null;
//     var45.setJSDocInfo(var46);
//     boolean var48 = var45.isAssignAdd();
//     com.google.javascript.rhino.Node var50 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var51 = null;
//     var50.setJSDocInfo(var51);
//     boolean var53 = var50.isAssignAdd();
//     com.google.javascript.rhino.Node var54 = com.google.javascript.rhino.IR.throwNode(var50);
//     com.google.javascript.rhino.Node var55 = var45.srcrefTree(var54);
//     java.lang.Iterable var56 = var45.children();
//     boolean var57 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(var45);
//     var39.addChildToFront(var45);
//     com.google.javascript.jscomp.SourceFile var61 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
//     com.google.javascript.jscomp.JsAst var62 = new com.google.javascript.jscomp.JsAst(var61);
//     var39.setStaticSourceFile((com.google.javascript.rhino.jstype.StaticSourceFile)var61);
//     com.google.javascript.jscomp.JsAst var64 = new com.google.javascript.jscomp.JsAst(var61);
//     com.google.javascript.rhino.InputId var65 = var64.getInputId();
//     com.google.javascript.jscomp.SourceFile var66 = var64.getSourceFile();
//     var7.replaceScript(var64);
// 
//   }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test98"); }


    com.google.javascript.jscomp.SourceFile var1 = new com.google.javascript.jscomp.SourceFile("module$hi!");
    com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var1, true);
    java.lang.String var4 = var1.getCode();
    com.google.javascript.jscomp.parsing.Config.LanguageMode var7 = null;
    com.google.javascript.jscomp.parsing.Config var9 = com.google.javascript.jscomp.parsing.ParserRunner.createConfig(true, var7, false);
    com.google.javascript.rhino.head.ErrorReporter var10 = null;
    java.util.logging.Logger var11 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var12 = com.google.javascript.jscomp.parsing.ParserRunner.parse((com.google.javascript.rhino.jstype.StaticSourceFile)var1, "", var9, var10, var11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test99"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.JSType var2 = null;
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var5 = null;
    var4.setJSDocInfo(var5);
    com.google.javascript.rhino.jstype.FunctionType var7 = var1.createFunctionType(var2, var4);
    var1.setLastGeneration(true);
    java.lang.Iterable var11 = var1.getEachReferenceTypeWithProperty("goog.abstractMethod");
    com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode var12 = null;
    var1.setResolveMode(var12);
    com.google.javascript.rhino.ErrorReporter var14 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var14);
    com.google.javascript.rhino.jstype.JSType var16 = null;
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var19 = null;
    var18.setJSDocInfo(var19);
    com.google.javascript.rhino.jstype.FunctionType var21 = var15.createFunctionType(var16, var18);
    com.google.javascript.rhino.jstype.JSType var23 = null;
    var15.unregisterPropertyOnType("hi!", var23);
    java.lang.Iterable var26 = var15.getTypesWithProperty("hi!");
    java.lang.Iterable var28 = var15.getTypesWithProperty("hi!");
    com.google.javascript.rhino.ErrorReporter var29 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var29);
    com.google.javascript.rhino.jstype.JSType var31 = null;
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var34 = null;
    var33.setJSDocInfo(var34);
    com.google.javascript.rhino.jstype.FunctionType var36 = var30.createFunctionType(var31, var33);
    com.google.javascript.rhino.jstype.ObjectType var37 = var36.getParentScope();
    com.google.javascript.rhino.ErrorReporter var38 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var38);
    com.google.javascript.rhino.jstype.JSType var40 = null;
    com.google.javascript.rhino.Node var42 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var43 = null;
    var42.setJSDocInfo(var43);
    com.google.javascript.rhino.jstype.FunctionType var45 = var39.createFunctionType(var40, var42);
    boolean var46 = var45.matchesInt32Context();
    com.google.javascript.rhino.jstype.ObjectType var47 = var45.toObjectType();
    com.google.javascript.rhino.jstype.FunctionType var48 = var15.createFunctionTypeWithNewThisType(var36, (com.google.javascript.rhino.jstype.ObjectType)var45);
    java.lang.String var49 = var45.getTemplateTypeName();
    var45.clearCachedValues();
    com.google.javascript.rhino.jstype.FunctionType var51 = var45.toMaybeFunctionType();
    com.google.javascript.rhino.jstype.JSType var53 = var51.getPropertyType("hi!. hi! at hi! line (unknown line) : (unknown column)");
    com.google.javascript.rhino.jstype.JSType var54 = var1.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType)var51);
    com.google.javascript.rhino.Node var55 = var51.getParametersNode();
    com.google.javascript.rhino.Node var57 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var58 = null;
    var57.setJSDocInfo(var58);
    boolean var60 = var57.isAssignAdd();
    com.google.javascript.rhino.Node var62 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var63 = null;
    var62.setJSDocInfo(var63);
    boolean var65 = var62.isAssignAdd();
    com.google.javascript.rhino.Node var66 = com.google.javascript.rhino.IR.throwNode(var62);
    com.google.javascript.rhino.Node var67 = var57.srcrefTree(var66);
    boolean var68 = var67.isRegExp();
    java.lang.Iterable var69 = var67.children();
    com.google.javascript.rhino.Node var70 = com.google.javascript.rhino.IR.exprResult(var67);
    com.google.javascript.rhino.Node var72 = com.google.javascript.rhino.IR.name("");
    boolean var73 = var72.isGetElem();
    com.google.javascript.rhino.Node var74 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var75 = com.google.javascript.rhino.IR.forNode(var55, var70, var72, var74);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);

  }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test100"); }


    com.google.javascript.jscomp.SourceFile var1 = new com.google.javascript.jscomp.SourceFile("module$hi!");
    com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var1, true);
    java.lang.String var4 = var3.getCode();
    com.google.javascript.rhino.InputId var5 = var3.getInputId();
    com.google.javascript.rhino.InputId var6 = null;
    com.google.javascript.jscomp.CompilerInput var8 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var3, var6, false);
    boolean var9 = var3.isExtern();
    java.lang.String var10 = var3.getCode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test101"); }


    com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.error("", "hi!. hi! at hi! line (unknown line) : (unknown column)");
    com.google.javascript.jscomp.SourceFile var4 = com.google.javascript.jscomp.SourceFile.fromFile("module$hi!");
    boolean var5 = var4.isExtern();
    boolean var6 = var2.equals((java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test102"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    boolean var2 = var1.isGetElem();
    boolean var3 = var1.isNull();
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var5 = var1.srcref(var4);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
    boolean var8 = var7.isGetElem();
    boolean var9 = var7.isNull();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var11 = var7.srcref(var10);
    com.google.javascript.rhino.Node var12 = var5.useSourceInfoFromForTree(var11);
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.name("");
    boolean var15 = var14.isGetElem();
    boolean var16 = var14.isNull();
    boolean var17 = var14.isDebugger();
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.or(var12, var14);
    boolean var19 = var18.isFor();
    com.google.javascript.rhino.InputId var20 = var18.getInputId();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.continueNode(var18);
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
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
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
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test103"); }


    com.google.javascript.rhino.JSDocInfoBuilder var1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
    boolean var2 = var1.recordInterface();
    boolean var3 = var1.isPopulated();
    boolean var5 = var1.recordDeprecationReason("");
    com.google.javascript.rhino.JSTypeExpression var6 = null;
    boolean var7 = var1.recordDefineType(var6);
    boolean var8 = var1.recordHiddenness();
    com.google.javascript.rhino.JSTypeExpression var9 = null;
    boolean var10 = var1.recordExtendedInterface(var9);
    boolean var12 = var1.recordVersion("function (): {1260910291}");
    boolean var13 = var1.recordIdGenerator();
    boolean var15 = var1.recordBlockDescription("goog.exportProperty");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test104"); }


    com.google.javascript.jscomp.ClosureCodingConvention var0 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var3 = null;
    var2.setJSDocInfo(var3);
    boolean var5 = var2.isAssignAdd();
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var8 = null;
    var7.setJSDocInfo(var8);
    boolean var10 = var7.isAssignAdd();
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.throwNode(var7);
    com.google.javascript.rhino.Node var12 = var2.srcrefTree(var11);
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var15 = null;
    var14.setJSDocInfo(var15);
    boolean var17 = var14.isAssignAdd();
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var20 = null;
    var19.setJSDocInfo(var20);
    boolean var22 = var19.isAssignAdd();
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.throwNode(var19);
    com.google.javascript.rhino.Node var24 = var14.srcrefTree(var23);
    var2.addChildrenToFront(var14);
    java.util.List var26 = var0.identifyTypeDeclarationCall(var2);
    boolean var29 = var0.isExported("", true);
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var32 = null;
    var31.setJSDocInfo(var32);
    boolean var34 = var31.isAssignAdd();
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var37 = null;
    var36.setJSDocInfo(var37);
    boolean var39 = var36.isAssignAdd();
    com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.IR.throwNode(var36);
    com.google.javascript.rhino.Node var41 = var31.srcrefTree(var40);
    com.google.javascript.rhino.Node.AncestorIterable var42 = var40.getAncestors();
    com.google.javascript.rhino.Node var43 = var40.getLastChild();
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var44 = var0.getDelegateRelationship(var40);
    com.google.javascript.jscomp.GoogleCodingConvention var45 = new com.google.javascript.jscomp.GoogleCodingConvention((com.google.javascript.jscomp.CodingConvention)var0);
    com.google.javascript.jscomp.GoogleCodingConvention var46 = new com.google.javascript.jscomp.GoogleCodingConvention((com.google.javascript.jscomp.CodingConvention)var45);
    boolean var49 = var45.isExported("InputId: ", true);
    boolean var51 = var45.isExported("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test105"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.JSType var2 = null;
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var5 = null;
    var4.setJSDocInfo(var5);
    com.google.javascript.rhino.jstype.FunctionType var7 = var1.createFunctionType(var2, var4);
    var1.setLastGeneration(true);
    java.lang.Iterable var11 = var1.getEachReferenceTypeWithProperty("goog.abstractMethod");
    com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode var12 = null;
    var1.setResolveMode(var12);
    com.google.javascript.rhino.ErrorReporter var14 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var14);
    com.google.javascript.rhino.jstype.JSType var16 = null;
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var19 = null;
    var18.setJSDocInfo(var19);
    com.google.javascript.rhino.jstype.FunctionType var21 = var15.createFunctionType(var16, var18);
    com.google.javascript.rhino.jstype.JSType var23 = null;
    var15.unregisterPropertyOnType("hi!", var23);
    java.lang.Iterable var26 = var15.getTypesWithProperty("hi!");
    java.lang.Iterable var28 = var15.getTypesWithProperty("hi!");
    com.google.javascript.rhino.ErrorReporter var29 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var29);
    com.google.javascript.rhino.jstype.JSType var31 = null;
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var34 = null;
    var33.setJSDocInfo(var34);
    com.google.javascript.rhino.jstype.FunctionType var36 = var30.createFunctionType(var31, var33);
    com.google.javascript.rhino.jstype.ObjectType var37 = var36.getParentScope();
    com.google.javascript.rhino.ErrorReporter var38 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var38);
    com.google.javascript.rhino.jstype.JSType var40 = null;
    com.google.javascript.rhino.Node var42 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var43 = null;
    var42.setJSDocInfo(var43);
    com.google.javascript.rhino.jstype.FunctionType var45 = var39.createFunctionType(var40, var42);
    boolean var46 = var45.matchesInt32Context();
    com.google.javascript.rhino.jstype.ObjectType var47 = var45.toObjectType();
    com.google.javascript.rhino.jstype.FunctionType var48 = var15.createFunctionTypeWithNewThisType(var36, (com.google.javascript.rhino.jstype.ObjectType)var45);
    java.lang.String var49 = var45.getTemplateTypeName();
    var45.clearCachedValues();
    com.google.javascript.rhino.jstype.FunctionType var51 = var45.toMaybeFunctionType();
    com.google.javascript.rhino.jstype.JSType var53 = var51.getPropertyType("hi!. hi! at hi! line (unknown line) : (unknown column)");
    com.google.javascript.rhino.jstype.JSType var54 = var1.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType)var51);
    com.google.javascript.rhino.ErrorReporter var55 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var55);
    com.google.javascript.rhino.jstype.JSType var57 = null;
    com.google.javascript.rhino.Node var59 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var60 = null;
    var59.setJSDocInfo(var60);
    com.google.javascript.rhino.jstype.FunctionType var62 = var56.createFunctionType(var57, var59);
    com.google.javascript.rhino.ErrorReporter var63 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var63);
    com.google.javascript.rhino.jstype.JSType var65 = null;
    com.google.javascript.rhino.Node var67 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var68 = null;
    var67.setJSDocInfo(var68);
    com.google.javascript.rhino.jstype.FunctionType var70 = var64.createFunctionType(var65, var67);
    boolean var71 = var70.matchesInt32Context();
    com.google.javascript.rhino.ErrorReporter var72 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var72);
    com.google.javascript.rhino.jstype.JSType var74 = null;
    com.google.javascript.rhino.Node var76 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var77 = null;
    var76.setJSDocInfo(var77);
    com.google.javascript.rhino.jstype.FunctionType var79 = var73.createFunctionType(var74, var76);
    com.google.javascript.rhino.jstype.JSType[] var80 = new com.google.javascript.rhino.jstype.JSType[] { var74};
    com.google.javascript.rhino.jstype.FunctionType var81 = var56.createConstructorType((com.google.javascript.rhino.jstype.JSType)var70, var80);
    com.google.javascript.rhino.jstype.FunctionType var82 = com.google.javascript.rhino.jstype.JSType.toMaybeFunctionType((com.google.javascript.rhino.jstype.JSType)var81);
    java.lang.Iterable var83 = var82.getExtendedInterfaces();
    boolean var84 = var82.isEnumType();
    int var85 = var82.getMinArguments();
    com.google.javascript.rhino.jstype.JSType var87 = var1.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType)var82, "InputId: ");
    java.lang.Iterable var89 = var1.getEachReferenceTypeWithProperty("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
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
    assertTrue(var84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test106"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.ErrorReporter var2 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var2);
    com.google.javascript.rhino.jstype.JSType var4 = null;
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var7 = null;
    var6.setJSDocInfo(var7);
    com.google.javascript.rhino.jstype.FunctionType var9 = var3.createFunctionType(var4, var6);
    com.google.javascript.rhino.jstype.FunctionType var11 = var9.getBindReturnType(0);
    com.google.javascript.rhino.jstype.JSType var16 = var1.getType((com.google.javascript.rhino.jstype.StaticScope)var9, "NAME ", "module$hi!", 0, 100);
    boolean var17 = var9.isUnknownType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.jstype.FunctionType var18 = var9.getSuperClassConstructor();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test107"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.JSType var2 = null;
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var5 = null;
    var4.setJSDocInfo(var5);
    com.google.javascript.rhino.jstype.FunctionType var7 = var1.createFunctionType(var2, var4);
    boolean var8 = var7.matchesInt32Context();
    com.google.javascript.rhino.jstype.ObjectType var9 = var7.toObjectType();
    java.lang.String var10 = var7.getTemplateTypeName();
    java.lang.Iterable var11 = var7.getCtorImplementedInterfaces();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test108"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var2 = null;
    var1.setJSDocInfo(var2);
    boolean var4 = var1.isAssignAdd();
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var7 = null;
    var6.setJSDocInfo(var7);
    boolean var9 = var6.isAssignAdd();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.throwNode(var6);
    com.google.javascript.rhino.Node var11 = var1.srcrefTree(var10);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var14 = null;
    var13.setJSDocInfo(var14);
    boolean var16 = var13.isAssignAdd();
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var19 = null;
    var18.setJSDocInfo(var19);
    boolean var21 = var18.isAssignAdd();
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.throwNode(var18);
    com.google.javascript.rhino.Node var23 = var13.srcrefTree(var22);
    var1.addChildrenToFront(var13);
    boolean var25 = var1.isContinue();
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.name("");
    boolean var28 = var27.isGetElem();
    boolean var29 = var27.isNull();
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var31 = var27.srcref(var30);
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.name("");
    var31.addChildrenToFront(var33);
    boolean var35 = var1.isEquivalentToTyped(var31);
    boolean var36 = var31.hasMoreThanOneChild();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
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
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test109"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.JSType var2 = null;
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var5 = null;
    var4.setJSDocInfo(var5);
    com.google.javascript.rhino.jstype.FunctionType var7 = var1.createFunctionType(var2, var4);
    com.google.javascript.rhino.jstype.JSType var9 = null;
    var1.unregisterPropertyOnType("hi!", var9);
    java.lang.Iterable var12 = var1.getTypesWithProperty("hi!");
    java.lang.Iterable var14 = var1.getTypesWithProperty("hi!");
    com.google.javascript.rhino.ErrorReporter var15 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var15);
    com.google.javascript.rhino.jstype.JSType var17 = null;
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var20 = null;
    var19.setJSDocInfo(var20);
    com.google.javascript.rhino.jstype.FunctionType var22 = var16.createFunctionType(var17, var19);
    com.google.javascript.rhino.jstype.ObjectType var23 = var22.getParentScope();
    com.google.javascript.rhino.ErrorReporter var24 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var24);
    com.google.javascript.rhino.jstype.JSType var26 = null;
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var29 = null;
    var28.setJSDocInfo(var29);
    com.google.javascript.rhino.jstype.FunctionType var31 = var25.createFunctionType(var26, var28);
    boolean var32 = var31.matchesInt32Context();
    com.google.javascript.rhino.jstype.ObjectType var33 = var31.toObjectType();
    com.google.javascript.rhino.jstype.FunctionType var34 = var1.createFunctionTypeWithNewThisType(var22, (com.google.javascript.rhino.jstype.ObjectType)var31);
    com.google.javascript.rhino.ErrorReporter var35 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var35);
    com.google.javascript.rhino.jstype.JSType var37 = null;
    com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var40 = null;
    var39.setJSDocInfo(var40);
    com.google.javascript.rhino.jstype.FunctionType var42 = var36.createFunctionType(var37, var39);
    com.google.javascript.rhino.jstype.JSType var44 = null;
    var36.unregisterPropertyOnType("hi!", var44);
    com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.IR.name("");
    boolean var49 = var48.isGetElem();
    boolean var50 = var48.isNull();
    com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var52 = var48.srcref(var51);
    com.google.javascript.rhino.Node var54 = com.google.javascript.rhino.IR.name("");
    boolean var55 = var54.isGetElem();
    boolean var56 = var54.isNull();
    com.google.javascript.rhino.Node var57 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var58 = var54.srcref(var57);
    com.google.javascript.rhino.Node var59 = var52.useSourceInfoFromForTree(var58);
    com.google.javascript.rhino.ErrorReporter var60 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var60);
    com.google.javascript.rhino.jstype.JSType var62 = null;
    com.google.javascript.rhino.Node var64 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var65 = null;
    var64.setJSDocInfo(var65);
    com.google.javascript.rhino.jstype.FunctionType var67 = var61.createFunctionType(var62, var64);
    com.google.javascript.rhino.jstype.ObjectType var68 = var36.createObjectType("goog.abstractMethod", var59, (com.google.javascript.rhino.jstype.ObjectType)var67);
    com.google.javascript.rhino.Node var71 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var72 = null;
    var71.setJSDocInfo(var72);
    boolean var74 = var71.isAssignAdd();
    com.google.javascript.rhino.Node var76 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var77 = null;
    var76.setJSDocInfo(var77);
    boolean var79 = var76.isAssignAdd();
    com.google.javascript.rhino.Node var80 = com.google.javascript.rhino.IR.throwNode(var76);
    com.google.javascript.rhino.Node var81 = var71.srcrefTree(var80);
    com.google.javascript.rhino.ErrorReporter var82 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var83 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var82);
    com.google.javascript.rhino.jstype.JSType var84 = null;
    com.google.javascript.rhino.Node var86 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var87 = null;
    var86.setJSDocInfo(var87);
    com.google.javascript.rhino.jstype.FunctionType var89 = var83.createFunctionType(var84, var86);
    com.google.javascript.rhino.jstype.ObjectType var90 = var89.getParentScope();
    com.google.javascript.rhino.jstype.EnumType var91 = var36.createEnumType("hi!. hi! at hi! line (unknown line) : (unknown column)", var71, (com.google.javascript.rhino.jstype.JSType)var90);
    com.google.javascript.rhino.jstype.EnumType var92 = var91.toMaybeEnumType();
    com.google.javascript.rhino.jstype.EnumElementType var93 = var91.getElementsType();
    boolean var95 = var93.hasProperty("LinkedGraph");
    boolean var97 = var93.hasProperty("function (): ?");
    com.google.javascript.rhino.jstype.JSType var98 = var1.createOptionalType((com.google.javascript.rhino.jstype.JSType)var93);
    com.google.javascript.rhino.jstype.ObjectType var99 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType)var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var97 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var98);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var99);

  }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test110"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    var1.identifyNonNullableName("");
    boolean var5 = var1.hasNamespace("");
    com.google.javascript.rhino.jstype.FunctionBuilder var6 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var9 = null;
    var8.setJSDocInfo(var9);
    boolean var11 = var8.isAssignAdd();
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.throwNode(var8);
    com.google.javascript.rhino.jstype.FunctionBuilder var13 = var6.withSourceNode(var8);
    com.google.javascript.rhino.jstype.FunctionBuilder var14 = var6.forConstructor();
    com.google.javascript.rhino.ErrorReporter var15 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var15);
    com.google.javascript.rhino.jstype.JSType var17 = null;
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var20 = null;
    var19.setJSDocInfo(var20);
    com.google.javascript.rhino.jstype.FunctionType var22 = var16.createFunctionType(var17, var19);
    com.google.javascript.rhino.jstype.JSType var24 = null;
    var16.unregisterPropertyOnType("hi!", var24);
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.name("");
    boolean var29 = var28.isGetElem();
    boolean var30 = var28.isNull();
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var32 = var28.srcref(var31);
    com.google.javascript.rhino.Node var34 = com.google.javascript.rhino.IR.name("");
    boolean var35 = var34.isGetElem();
    boolean var36 = var34.isNull();
    com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var38 = var34.srcref(var37);
    com.google.javascript.rhino.Node var39 = var32.useSourceInfoFromForTree(var38);
    com.google.javascript.rhino.ErrorReporter var40 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var40);
    com.google.javascript.rhino.jstype.JSType var42 = null;
    com.google.javascript.rhino.Node var44 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var45 = null;
    var44.setJSDocInfo(var45);
    com.google.javascript.rhino.jstype.FunctionType var47 = var41.createFunctionType(var42, var44);
    com.google.javascript.rhino.jstype.ObjectType var48 = var16.createObjectType("goog.abstractMethod", var39, (com.google.javascript.rhino.jstype.ObjectType)var47);
    com.google.javascript.rhino.jstype.FunctionBuilder var49 = var6.withInferredReturnType((com.google.javascript.rhino.jstype.JSType)var47);
    com.google.javascript.rhino.jstype.FunctionBuilder var51 = var6.withName("BLOCK");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.jstype.FunctionType var52 = var51.build();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test111"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var2 = com.google.javascript.rhino.ScriptRuntime.escapeString("module$", 'a');
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test112"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithNodeAnnotations();
    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.name("");
    boolean var3 = var0.hasNode((java.lang.Object)"");
    com.google.javascript.jscomp.graph.SubGraph var4 = var0.newSubGraph();
    var0.clearNodeAnnotations();
    var0.clearNodeAnnotations();
    boolean var7 = var0.isDirected();
    com.google.javascript.jscomp.SourceFile var11 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "LinkedGraph", "hi!");
    var11.setOriginalPath("NAME \n");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var14 = var0.getInEdges((java.lang.Object)"NAME \n");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test113() {}
//   public void test113() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test113"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     com.google.javascript.rhino.jstype.JSType var2 = null;
//     com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var5 = null;
//     var4.setJSDocInfo(var5);
//     com.google.javascript.rhino.jstype.FunctionType var7 = var1.createFunctionType(var2, var4);
//     com.google.javascript.rhino.jstype.JSType var9 = null;
//     var1.unregisterPropertyOnType("hi!", var9);
//     com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.name("");
//     boolean var14 = var13.isGetElem();
//     boolean var15 = var13.isNull();
//     com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.returnNode();
//     com.google.javascript.rhino.Node var17 = var13.srcref(var16);
//     com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.name("");
//     boolean var20 = var19.isGetElem();
//     boolean var21 = var19.isNull();
//     com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.returnNode();
//     com.google.javascript.rhino.Node var23 = var19.srcref(var22);
//     com.google.javascript.rhino.Node var24 = var17.useSourceInfoFromForTree(var23);
//     com.google.javascript.rhino.ErrorReporter var25 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var25);
//     com.google.javascript.rhino.jstype.JSType var27 = null;
//     com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var30 = null;
//     var29.setJSDocInfo(var30);
//     com.google.javascript.rhino.jstype.FunctionType var32 = var26.createFunctionType(var27, var29);
//     com.google.javascript.rhino.jstype.ObjectType var33 = var1.createObjectType("goog.abstractMethod", var24, (com.google.javascript.rhino.jstype.ObjectType)var32);
//     com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var37 = null;
//     var36.setJSDocInfo(var37);
//     boolean var39 = var36.isAssignAdd();
//     com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var42 = null;
//     var41.setJSDocInfo(var42);
//     boolean var44 = var41.isAssignAdd();
//     com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.IR.throwNode(var41);
//     com.google.javascript.rhino.Node var46 = var36.srcrefTree(var45);
//     com.google.javascript.rhino.ErrorReporter var47 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var47);
//     com.google.javascript.rhino.jstype.JSType var49 = null;
//     com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var52 = null;
//     var51.setJSDocInfo(var52);
//     com.google.javascript.rhino.jstype.FunctionType var54 = var48.createFunctionType(var49, var51);
//     com.google.javascript.rhino.jstype.ObjectType var55 = var54.getParentScope();
//     com.google.javascript.rhino.jstype.EnumType var56 = var1.createEnumType("hi!. hi! at hi! line (unknown line) : (unknown column)", var36, (com.google.javascript.rhino.jstype.JSType)var55);
//     boolean var57 = var56.isEnumType();
//     com.google.common.base.Predicate var58 = null;
//     boolean var59 = var56.setValidator(var58);
// 
//   }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test114"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.JSType var2 = null;
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var5 = null;
    var4.setJSDocInfo(var5);
    com.google.javascript.rhino.jstype.FunctionType var7 = var1.createFunctionType(var2, var4);
    com.google.javascript.rhino.jstype.JSType var9 = null;
    var1.unregisterPropertyOnType("hi!", var9);
    com.google.javascript.rhino.ErrorReporter var11 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var11);
    com.google.javascript.rhino.jstype.JSType var13 = null;
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var16 = null;
    var15.setJSDocInfo(var16);
    com.google.javascript.rhino.jstype.FunctionType var18 = var12.createFunctionType(var13, var15);
    com.google.javascript.rhino.jstype.JSType var20 = null;
    var12.unregisterPropertyOnType("hi!", var20);
    java.lang.Iterable var23 = var12.getTypesWithProperty("hi!");
    com.google.javascript.rhino.ErrorReporter var24 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var24);
    com.google.javascript.rhino.jstype.JSType var26 = null;
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var29 = null;
    var28.setJSDocInfo(var29);
    com.google.javascript.rhino.jstype.FunctionType var31 = var25.createFunctionType(var26, var28);
    com.google.javascript.rhino.jstype.JSType var33 = null;
    var25.unregisterPropertyOnType("hi!", var33);
    java.lang.Iterable var36 = var25.getTypesWithProperty("hi!");
    java.lang.Iterable var38 = var25.getTypesWithProperty("hi!");
    com.google.javascript.rhino.ErrorReporter var39 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var39);
    com.google.javascript.rhino.jstype.JSType var41 = null;
    com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var44 = null;
    var43.setJSDocInfo(var44);
    com.google.javascript.rhino.jstype.FunctionType var46 = var40.createFunctionType(var41, var43);
    com.google.javascript.rhino.jstype.ObjectType var47 = var46.getParentScope();
    com.google.javascript.rhino.ErrorReporter var48 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var48);
    com.google.javascript.rhino.jstype.JSType var50 = null;
    com.google.javascript.rhino.Node var52 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var53 = null;
    var52.setJSDocInfo(var53);
    com.google.javascript.rhino.jstype.FunctionType var55 = var49.createFunctionType(var50, var52);
    boolean var56 = var55.matchesInt32Context();
    com.google.javascript.rhino.jstype.ObjectType var57 = var55.toObjectType();
    com.google.javascript.rhino.jstype.FunctionType var58 = var25.createFunctionTypeWithNewThisType(var46, (com.google.javascript.rhino.jstype.ObjectType)var55);
    java.lang.String var59 = var55.getTemplateTypeName();
    var55.clearCachedValues();
    com.google.javascript.rhino.jstype.FunctionType var61 = var55.toMaybeFunctionType();
    var12.resolveTypesInScope((com.google.javascript.rhino.jstype.StaticScope)var55);
    com.google.javascript.rhino.ErrorReporter var63 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var63);
    com.google.javascript.rhino.jstype.JSType var65 = null;
    com.google.javascript.rhino.Node var67 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var68 = null;
    var67.setJSDocInfo(var68);
    com.google.javascript.rhino.jstype.FunctionType var70 = var64.createFunctionType(var65, var67);
    com.google.javascript.rhino.ErrorReporter var71 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var71);
    com.google.javascript.rhino.jstype.JSType var73 = null;
    com.google.javascript.rhino.Node var75 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var76 = null;
    var75.setJSDocInfo(var76);
    com.google.javascript.rhino.jstype.FunctionType var78 = var72.createFunctionType(var73, var75);
    boolean var79 = var78.matchesInt32Context();
    com.google.javascript.rhino.ErrorReporter var80 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var81 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var80);
    com.google.javascript.rhino.jstype.JSType var82 = null;
    com.google.javascript.rhino.Node var84 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var85 = null;
    var84.setJSDocInfo(var85);
    com.google.javascript.rhino.jstype.FunctionType var87 = var81.createFunctionType(var82, var84);
    com.google.javascript.rhino.jstype.JSType[] var88 = new com.google.javascript.rhino.jstype.JSType[] { var82};
    com.google.javascript.rhino.jstype.FunctionType var89 = var64.createConstructorType((com.google.javascript.rhino.jstype.JSType)var78, var88);
    com.google.javascript.rhino.jstype.FunctionType var90 = var1.createFunctionType((com.google.javascript.rhino.jstype.JSType)var55, var88);
    com.google.javascript.rhino.JSDocInfo var92 = new com.google.javascript.rhino.JSDocInfo();
    java.util.Collection var93 = var92.getTypeNodes();
    boolean var94 = var92.isNoShadow();
    java.lang.String var95 = var92.getMeaning();
    boolean var96 = var92.hasTypedefType();
    boolean var97 = var92.hasTypedefType();
    java.lang.String var98 = var92.getBlockDescription();
    var55.setPropertyJSDocInfo("", var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var96 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var97 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var98);

  }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test115"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var3 = null;
    var2.setJSDocInfo(var3);
    boolean var5 = var2.isAssignAdd();
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var8 = null;
    var7.setJSDocInfo(var8);
    boolean var10 = var7.isAssignAdd();
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.throwNode(var7);
    com.google.javascript.rhino.Node var12 = var2.srcrefTree(var11);
    boolean var13 = var12.isLocalResultCall();
    com.google.javascript.jscomp.ClosureCodingConvention var14 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.name("");
    boolean var17 = var16.isGetElem();
    boolean var18 = var16.isNull();
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var20 = var16.srcref(var19);
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.throwNode(var20);
    java.lang.String var22 = var14.getSingletonGetterClassName(var21);
    com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.IR.name("");
    boolean var25 = var24.isGetElem();
    boolean var26 = var24.isNull();
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var28 = var24.srcref(var27);
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.name("");
    var28.addChildrenToFront(var30);
    com.google.javascript.rhino.ErrorReporter var33 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var33);
    com.google.javascript.rhino.jstype.JSType var35 = null;
    com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var38 = null;
    var37.setJSDocInfo(var38);
    com.google.javascript.rhino.jstype.FunctionType var40 = var34.createFunctionType(var35, var37);
    boolean var41 = var40.isGlobalThisType();
    boolean var42 = var40.isConstructor();
    var28.putProp(0, (java.lang.Object)var40);
    com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.IR.name("");
    boolean var46 = var45.isGetElem();
    boolean var47 = var45.isNull();
    com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var49 = var45.srcref(var48);
    com.google.javascript.rhino.Node var50 = new com.google.javascript.rhino.Node(0, var12, var21, var28, var49);
    com.google.javascript.rhino.Node var52 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var53 = null;
    var52.setJSDocInfo(var53);
    boolean var55 = var52.isNE();
    boolean var56 = var52.isAdd();
    boolean var58 = var52.getBooleanProp(100);
    boolean var59 = var52.isNull();
    boolean var60 = var52.isNull();
    com.google.javascript.rhino.Node var61 = com.google.javascript.rhino.IR.voidNode(var52);
    var52.setVarArgs(false);
    boolean var64 = var52.isObjectLit();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var65 = com.google.javascript.rhino.IR.sheq(var50, var52);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test116"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    var1.identifyNonNullableName("");
    boolean var5 = var1.hasNamespace("");
    com.google.javascript.rhino.jstype.FunctionBuilder var6 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var9 = null;
    var8.setJSDocInfo(var9);
    boolean var11 = var8.isAssignAdd();
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.throwNode(var8);
    com.google.javascript.rhino.jstype.FunctionBuilder var13 = var6.withSourceNode(var8);
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var16 = null;
    var15.setJSDocInfo(var16);
    boolean var18 = var15.isAssignAdd();
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var21 = null;
    var20.setJSDocInfo(var21);
    boolean var23 = var20.isAssignAdd();
    com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.IR.throwNode(var20);
    com.google.javascript.rhino.Node var25 = var15.srcrefTree(var24);
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var28 = null;
    var27.setJSDocInfo(var28);
    boolean var30 = var27.isAssignAdd();
    com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var33 = null;
    var32.setJSDocInfo(var33);
    boolean var35 = var32.isAssignAdd();
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.throwNode(var32);
    com.google.javascript.rhino.Node var37 = var27.srcrefTree(var36);
    var15.addChildrenToFront(var27);
    boolean var39 = var15.isContinue();
    com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.IR.name("");
    boolean var42 = var41.isGetElem();
    boolean var43 = var41.isNull();
    com.google.javascript.rhino.Node var44 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var45 = var41.srcref(var44);
    com.google.javascript.rhino.Node var47 = com.google.javascript.rhino.IR.name("");
    var45.addChildrenToFront(var47);
    boolean var49 = var15.isEquivalentToTyped(var45);
    com.google.javascript.rhino.jstype.FunctionBuilder var50 = var13.withSourceNode(var45);
    boolean var51 = var45.isCall();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var52 = var45.detachFromParent();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test117"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    boolean var2 = var1.isGetElem();
    boolean var3 = var1.isComma();
    com.google.javascript.rhino.ErrorReporter var5 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var5);
    com.google.javascript.rhino.jstype.JSType var7 = null;
    com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var10 = null;
    var9.setJSDocInfo(var10);
    com.google.javascript.rhino.jstype.FunctionType var12 = var6.createFunctionType(var7, var9);
    boolean var13 = var12.matchesInt32Context();
    com.google.javascript.rhino.jstype.ObjectType var14 = var12.getTypeOfThis();
    var1.putProp(0, (java.lang.Object)var14);
    boolean var16 = var1.isNull();
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.string("");
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.name("");
    boolean var21 = var20.isGetElem();
    boolean var22 = var20.isNull();
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var24 = var20.srcref(var23);
    com.google.javascript.rhino.Node var25 = com.google.javascript.rhino.IR.throwNode(var24);
    com.google.javascript.rhino.Node[] var26 = new com.google.javascript.rhino.Node[] { var25};
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.block(var26);
    java.lang.Iterable var28 = var27.siblings();
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var31 = null;
    var30.setJSDocInfo(var31);
    boolean var33 = var30.isNE();
    boolean var34 = var30.isFor();
    var27.addChildrenToBack(var30);
    com.google.javascript.rhino.Node var36 = var18.useSourceInfoIfMissingFrom(var30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.IR.catchNode(var1, var30);
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
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
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test118() {}
//   public void test118() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test118"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     com.google.javascript.rhino.jstype.JSType var2 = null;
//     com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var5 = null;
//     var4.setJSDocInfo(var5);
//     com.google.javascript.rhino.jstype.FunctionType var7 = var1.createFunctionType(var2, var4);
//     com.google.javascript.rhino.ErrorReporter var8 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var8);
//     com.google.javascript.rhino.jstype.JSType var10 = null;
//     com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var13 = null;
//     var12.setJSDocInfo(var13);
//     com.google.javascript.rhino.jstype.FunctionType var15 = var9.createFunctionType(var10, var12);
//     boolean var16 = var15.matchesInt32Context();
//     com.google.javascript.rhino.ErrorReporter var17 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var17);
//     com.google.javascript.rhino.jstype.JSType var19 = null;
//     com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var22 = null;
//     var21.setJSDocInfo(var22);
//     com.google.javascript.rhino.jstype.FunctionType var24 = var18.createFunctionType(var19, var21);
//     com.google.javascript.rhino.jstype.JSType[] var25 = new com.google.javascript.rhino.jstype.JSType[] { var19};
//     com.google.javascript.rhino.jstype.FunctionType var26 = var1.createConstructorType((com.google.javascript.rhino.jstype.JSType)var15, var25);
//     com.google.javascript.rhino.jstype.RecordTypeBuilder var27 = new com.google.javascript.rhino.jstype.RecordTypeBuilder(var1);
//     com.google.javascript.rhino.jstype.JSType var28 = null;
//     com.google.javascript.rhino.jstype.JSType var29 = var1.createDefaultObjectUnion(var28);
// 
//   }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test119"); }


    com.google.javascript.rhino.JSDocInfoBuilder var1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
    boolean var2 = var1.recordInterface();
    boolean var3 = var1.isPopulated();
    boolean var4 = var1.recordNoAlias();
    boolean var5 = var1.recordInterface();
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
    boolean var8 = var7.isGetElem();
    boolean var9 = var7.isNull();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var11 = var7.srcref(var10);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.name("");
    var11.addChildrenToFront(var13);
    com.google.javascript.rhino.JSTypeExpression var16 = new com.google.javascript.rhino.JSTypeExpression(var13, "hi!");
    boolean var17 = var1.recordImplementedInterface(var16);
    boolean var19 = var1.recordTemplateTypeName("BLOCK");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test120"); }


    com.google.javascript.rhino.Node var3 = new com.google.javascript.rhino.Node(1, 38, 1);
    com.google.javascript.jscomp.ClosureCodingConvention var4 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var7 = null;
    var6.setJSDocInfo(var7);
    boolean var9 = var6.isAssignAdd();
    com.google.javascript.rhino.Node var11 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var12 = null;
    var11.setJSDocInfo(var12);
    boolean var14 = var11.isAssignAdd();
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.throwNode(var11);
    com.google.javascript.rhino.Node var16 = var6.srcrefTree(var15);
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var19 = null;
    var18.setJSDocInfo(var19);
    boolean var21 = var18.isAssignAdd();
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var24 = null;
    var23.setJSDocInfo(var24);
    boolean var26 = var23.isAssignAdd();
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.throwNode(var23);
    com.google.javascript.rhino.Node var28 = var18.srcrefTree(var27);
    var6.addChildrenToFront(var18);
    java.util.List var30 = var4.identifyTypeDeclarationCall(var6);
    boolean var33 = var4.isExported("", true);
    com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var36 = null;
    var35.setJSDocInfo(var36);
    boolean var38 = var35.isAssignAdd();
    com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var41 = null;
    var40.setJSDocInfo(var41);
    boolean var43 = var40.isAssignAdd();
    com.google.javascript.rhino.Node var44 = com.google.javascript.rhino.IR.throwNode(var40);
    com.google.javascript.rhino.Node var45 = var35.srcrefTree(var44);
    com.google.javascript.rhino.Node.AncestorIterable var46 = var44.getAncestors();
    com.google.javascript.rhino.Node var47 = var44.getLastChild();
    com.google.javascript.jscomp.CodingConvention.DelegateRelationship var48 = var4.getDelegateRelationship(var44);
    com.google.javascript.jscomp.GoogleCodingConvention var49 = new com.google.javascript.jscomp.GoogleCodingConvention((com.google.javascript.jscomp.CodingConvention)var4);
    boolean var52 = var49.isExported("goog.abstractMethod", true);
    boolean var54 = var49.isConstant("function (): {1260910291}");
    com.google.javascript.rhino.Node var56 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode((com.google.javascript.jscomp.CodingConvention)var49, "function (): {1260910291}");
    com.google.javascript.rhino.Node var58 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var60 = com.google.javascript.rhino.IR.name("");
    boolean var61 = var60.isGetElem();
    boolean var62 = var60.isNull();
    com.google.javascript.rhino.Node var63 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var64 = var60.srcref(var63);
    com.google.javascript.rhino.Node var67 = new com.google.javascript.rhino.Node(100, var58, var63, 0, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.replaceChildAfter(var56, var67);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);

  }

  public void test121() {}
//   public void test121() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test121"); }
// 
// 
//     java.util.logging.Logger var0 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var1 = new com.google.javascript.jscomp.LoggerErrorManager(var0);
//     com.google.javascript.jscomp.Compiler var2 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var1);
//     com.google.javascript.jscomp.JSError[] var3 = var2.getErrors();
//     com.google.javascript.jscomp.Compiler.IntermediateState var4 = var2.getState();
//     com.google.javascript.rhino.ErrorReporter var5 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var5);
//     com.google.javascript.rhino.jstype.JSType var7 = null;
//     com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var10 = null;
//     var9.setJSDocInfo(var10);
//     com.google.javascript.rhino.jstype.FunctionType var12 = var6.createFunctionType(var7, var9);
//     com.google.javascript.rhino.jstype.JSType var14 = null;
//     var6.unregisterPropertyOnType("hi!", var14);
//     com.google.javascript.rhino.jstype.JSType var16 = null;
//     com.google.javascript.rhino.JSDocInfo var17 = new com.google.javascript.rhino.JSDocInfo();
//     java.util.Collection var18 = var17.getTypeNodes();
//     boolean var19 = var17.isInterface();
//     var17.addSuppression("");
//     boolean var22 = var17.isNoCompile();
//     com.google.javascript.rhino.JSTypeExpression var23 = var17.getTypedefType();
//     com.google.javascript.rhino.JSDocInfo.Visibility var24 = var17.getVisibility();
//     java.util.List var25 = var17.getThrownTypes();
//     com.google.javascript.rhino.jstype.FunctionType var26 = var6.createFunctionType(var16, var25);
//     com.google.javascript.jscomp.NodeTraversal.Callback var27 = null;
//     com.google.javascript.jscomp.NodeTraversal.traverseRoots((com.google.javascript.jscomp.AbstractCompiler)var2, var25, var27);
//     java.lang.String var29 = var2.getAstDotGraph();
//     com.google.javascript.jscomp.NodeTraversal.Callback var30 = null;
//     com.google.javascript.jscomp.NodeTraversal var31 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var2, var30);
//     com.google.javascript.jscomp.SourceFile.Generator var33 = null;
//     com.google.javascript.jscomp.SourceFile var34 = com.google.javascript.jscomp.SourceFile.fromGenerator("module$hi!", var33);
//     java.lang.String var35 = var34.getOriginalPath();
//     var34.setOriginalPath("goog.exportProperty");
//     com.google.javascript.jscomp.JsAst var38 = new com.google.javascript.jscomp.JsAst(var34);
//     var2.addNewScript(var38);
// 
//   }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test122"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    boolean var1 = var0.isDirected();
    java.lang.Object var2 = null;
    com.google.javascript.jscomp.graph.GraphNode var3 = var0.getNode(var2);
    var0.clearEdgeAnnotations();
    java.util.List var5 = var0.getGraphvizNodes();
    java.lang.Iterable var6 = var0.getDirectedGraphNodes();
    java.lang.Object var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var8 = var0.getDirectedPredNodes(var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test123"); }


    com.google.javascript.rhino.JSDocInfoBuilder var1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
    boolean var2 = var1.recordInterface();
    java.util.Set var3 = null;
    boolean var4 = var1.recordModifies(var3);
    boolean var5 = var1.recordInterface();
    boolean var7 = var1.addAuthor("goog.exportProperty");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test124"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    var1.identifyNonNullableName("");
    boolean var5 = var1.hasNamespace("");
    com.google.javascript.rhino.jstype.FunctionBuilder var6 = new com.google.javascript.rhino.jstype.FunctionBuilder(var1);
    com.google.javascript.rhino.ErrorReporter var7 = var1.getErrorReporter();
    com.google.javascript.rhino.ErrorReporter var9 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var9);
    var10.identifyNonNullableName("");
    boolean var14 = var10.hasNamespace("");
    com.google.javascript.rhino.ErrorReporter var15 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var15);
    com.google.javascript.rhino.jstype.JSType var17 = null;
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var20 = null;
    var19.setJSDocInfo(var20);
    com.google.javascript.rhino.jstype.FunctionType var22 = var16.createFunctionType(var17, var19);
    com.google.javascript.rhino.jstype.JSType var24 = null;
    var16.unregisterPropertyOnType("hi!", var24);
    java.lang.Iterable var27 = var16.getTypesWithProperty("hi!");
    java.lang.Iterable var29 = var16.getTypesWithProperty("hi!");
    com.google.javascript.rhino.ErrorReporter var30 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var30);
    com.google.javascript.rhino.jstype.JSType var32 = null;
    com.google.javascript.rhino.Node var34 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var35 = null;
    var34.setJSDocInfo(var35);
    com.google.javascript.rhino.jstype.FunctionType var37 = var31.createFunctionType(var32, var34);
    com.google.javascript.rhino.jstype.ObjectType var38 = var37.getParentScope();
    com.google.javascript.rhino.ErrorReporter var39 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var39);
    com.google.javascript.rhino.jstype.JSType var41 = null;
    com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var44 = null;
    var43.setJSDocInfo(var44);
    com.google.javascript.rhino.jstype.FunctionType var46 = var40.createFunctionType(var41, var43);
    boolean var47 = var46.matchesInt32Context();
    com.google.javascript.rhino.jstype.ObjectType var48 = var46.toObjectType();
    com.google.javascript.rhino.jstype.FunctionType var49 = var16.createFunctionTypeWithNewThisType(var37, (com.google.javascript.rhino.jstype.ObjectType)var46);
    java.lang.String var50 = var46.getTemplateTypeName();
    var46.clearCachedValues();
    com.google.javascript.rhino.jstype.FunctionType var52 = var46.toMaybeFunctionType();
    java.lang.String var53 = var46.toString();
    boolean var54 = var46.isRegexpType();
    com.google.javascript.rhino.jstype.ObjectType var55 = var10.createObjectType((com.google.javascript.rhino.jstype.ObjectType)var46);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.overwriteDeclaredType("module$(InputId: )", (com.google.javascript.rhino.jstype.JSType)var46);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "function (): ?"+ "'", var53.equals("function (): ?"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test125"); }


    com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var3 = null;
    var2.setJSDocInfo(var3);
    boolean var5 = var2.isAssignAdd();
    boolean var6 = var2.isGetElem();
    boolean var7 = var2.isNumber();
    com.google.javascript.jscomp.CheckLevel var8 = null;
    com.google.javascript.jscomp.DiagnosticType var11 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "hi!");
    java.lang.String[] var13 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var14 = com.google.javascript.jscomp.JSError.make("hi!", var2, var8, var11, var13);
    java.lang.String var15 = var14.toString();
    boolean var17 = var14.equals((java.lang.Object)10L);
    com.google.javascript.jscomp.CheckLevel var18 = var14.getDefaultLevel();
    java.lang.Class var19 = var18.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var21 = java.lang.Enum.<java.lang.Enum>valueOf(var19, "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!. hi! at hi! line (unknown line) : (unknown column)"+ "'", var15.equals("hi!. hi! at hi! line (unknown line) : (unknown column)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test126"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var2 = null;
    var1.setJSDocInfo(var2);
    boolean var4 = var1.isAssignAdd();
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var7 = null;
    var6.setJSDocInfo(var7);
    boolean var9 = var6.isAssignAdd();
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.throwNode(var6);
    com.google.javascript.rhino.Node var11 = var1.srcrefTree(var10);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var14 = null;
    var13.setJSDocInfo(var14);
    boolean var16 = var13.isAssignAdd();
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var19 = null;
    var18.setJSDocInfo(var19);
    boolean var21 = var18.isAssignAdd();
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.throwNode(var18);
    com.google.javascript.rhino.Node var23 = var13.srcrefTree(var22);
    var1.addChildrenToFront(var13);
    boolean var25 = var1.isContinue();
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.name("");
    boolean var28 = var27.isGetElem();
    boolean var29 = var27.isNull();
    com.google.javascript.rhino.Node var30 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var31 = var27.srcref(var30);
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.name("");
    var31.addChildrenToFront(var33);
    boolean var35 = var1.isEquivalentToTyped(var31);
    com.google.javascript.rhino.JSDocInfoBuilder var37 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
    boolean var38 = var37.recordInterface();
    boolean var39 = var37.isPopulated();
    com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var42 = null;
    var41.setJSDocInfo(var42);
    boolean var44 = var41.isAssignAdd();
    com.google.javascript.rhino.Node var46 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var47 = null;
    var46.setJSDocInfo(var47);
    boolean var49 = var46.isAssignAdd();
    com.google.javascript.rhino.Node var50 = com.google.javascript.rhino.IR.throwNode(var46);
    com.google.javascript.rhino.Node var51 = var41.srcrefTree(var50);
    com.google.javascript.rhino.Node.AncestorIterable var52 = var50.getAncestors();
    com.google.javascript.rhino.Node var53 = var50.getLastChild();
    com.google.javascript.rhino.JSDocInfo var54 = var37.build(var50);
    com.google.javascript.rhino.Node var56 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var57 = null;
    var56.setJSDocInfo(var57);
    boolean var59 = var56.isSyntheticBlock();
    com.google.javascript.rhino.Node var60 = var50.useSourceInfoFromForTree(var56);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var61 = com.google.javascript.rhino.IR.caseNode(var1, var56);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
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
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);

  }

  public void test127() {}
//   public void test127() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test127"); }
// 
// 
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithNodeAnnotations();
//     com.google.javascript.rhino.Node var2 = com.google.javascript.rhino.IR.name("");
//     boolean var3 = var0.hasNode((java.lang.Object)"");
//     com.google.javascript.jscomp.graph.SubGraph var4 = var0.newSubGraph();
//     boolean var5 = var0.isDirected();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var6 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var7 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithNodeAnnotations();
//     com.google.javascript.rhino.Node var9 = com.google.javascript.rhino.IR.name("");
//     boolean var10 = var7.hasNode((java.lang.Object)"");
//     com.google.javascript.jscomp.graph.SubGraph var11 = var7.newSubGraph();
//     var7.clearNodeAnnotations();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var13 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var14 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var15 = var13.createDirectedGraphNode((java.lang.Object)var14);
//     java.util.List var16 = var7.getNeighborNodes(var15);
//     java.util.List var17 = var6.getNeighborNodes(var15);
//     java.util.List var18 = var0.getNeighborNodes(var15);
//     var0.popEdgeAnnotations();
// 
//   }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test128"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.JSType var2 = null;
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var5 = null;
    var4.setJSDocInfo(var5);
    com.google.javascript.rhino.jstype.FunctionType var7 = var1.createFunctionType(var2, var4);
    com.google.javascript.rhino.ErrorReporter var8 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var8);
    com.google.javascript.rhino.jstype.JSType var10 = null;
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var13 = null;
    var12.setJSDocInfo(var13);
    com.google.javascript.rhino.jstype.FunctionType var15 = var9.createFunctionType(var10, var12);
    boolean var16 = var15.matchesInt32Context();
    com.google.javascript.rhino.ErrorReporter var17 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var17);
    com.google.javascript.rhino.jstype.JSType var19 = null;
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var22 = null;
    var21.setJSDocInfo(var22);
    com.google.javascript.rhino.jstype.FunctionType var24 = var18.createFunctionType(var19, var21);
    com.google.javascript.rhino.jstype.JSType[] var25 = new com.google.javascript.rhino.jstype.JSType[] { var19};
    com.google.javascript.rhino.jstype.FunctionType var26 = var1.createConstructorType((com.google.javascript.rhino.jstype.JSType)var15, var25);
    com.google.javascript.rhino.ErrorReporter var27 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var27);
    com.google.javascript.rhino.jstype.JSType var29 = null;
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var32 = null;
    var31.setJSDocInfo(var32);
    com.google.javascript.rhino.jstype.FunctionType var34 = var28.createFunctionType(var29, var31);
    boolean var35 = var34.matchesInt32Context();
    com.google.javascript.rhino.jstype.JSType var37 = null;
    com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var40 = null;
    var39.setJSDocInfo(var40);
    boolean var42 = var39.isNE();
    boolean var43 = var39.isAdd();
    boolean var45 = var39.getBooleanProp(100);
    com.google.javascript.rhino.Node var47 = com.google.javascript.rhino.IR.name("");
    boolean var48 = var47.isGetElem();
    boolean var49 = var47.isNull();
    boolean var50 = var47.isDebugger();
    boolean var51 = var47.isArrayLit();
    var39.addChildToBack(var47);
    boolean var53 = var39.hasMoreThanOneChild();
    boolean var54 = var34.defineInferredProperty("", var37, var39);
    var26.matchConstraint((com.google.javascript.rhino.jstype.ObjectType)var34);
    boolean var56 = var34.isStringObjectType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test129"); }


    com.google.javascript.rhino.JSDocInfo var0 = new com.google.javascript.rhino.JSDocInfo();
    boolean var1 = var0.isNoShadow();
    java.util.Collection var2 = var0.getMarkers();
    boolean var3 = var0.shouldPreserveTry();
    boolean var4 = var0.containsDeclaration();
    boolean var5 = var0.isOverride();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test130"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.DiagnosticGroup var1 = null;
    com.google.javascript.jscomp.CheckLevel var2 = null;
    var0.setWarningLevel(var1, var2);
    var0.setLocale("hi!");
    com.google.javascript.jscomp.CheckLevel var6 = null;
    var0.setCheckUnreachableCode(var6);
    com.google.javascript.jscomp.CompilerOptions.TracerMode var8 = var0.getTracerMode();
    boolean var9 = var0.assumeStrictThis();
    var0.setCheckSuspiciousCode(false);
    var0.setCheckControlStructures(false);
    var0.setDefineToDoubleLiteral("", (-1.0d));
    com.google.javascript.jscomp.SourceMap.DetailLevel var17 = null;
    var0.setSourceMapDetailLevel(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test131"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.JSType var2 = null;
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var5 = null;
    var4.setJSDocInfo(var5);
    com.google.javascript.rhino.jstype.FunctionType var7 = var1.createFunctionType(var2, var4);
    com.google.javascript.rhino.jstype.JSType var9 = null;
    var1.unregisterPropertyOnType("hi!", var9);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.name("");
    boolean var14 = var13.isGetElem();
    boolean var15 = var13.isNull();
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var17 = var13.srcref(var16);
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.name("");
    boolean var20 = var19.isGetElem();
    boolean var21 = var19.isNull();
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var23 = var19.srcref(var22);
    com.google.javascript.rhino.Node var24 = var17.useSourceInfoFromForTree(var23);
    com.google.javascript.rhino.ErrorReporter var25 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var25);
    com.google.javascript.rhino.jstype.JSType var27 = null;
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var30 = null;
    var29.setJSDocInfo(var30);
    com.google.javascript.rhino.jstype.FunctionType var32 = var26.createFunctionType(var27, var29);
    com.google.javascript.rhino.jstype.ObjectType var33 = var1.createObjectType("goog.abstractMethod", var24, (com.google.javascript.rhino.jstype.ObjectType)var32);
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var37 = null;
    var36.setJSDocInfo(var37);
    boolean var39 = var36.isAssignAdd();
    com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var42 = null;
    var41.setJSDocInfo(var42);
    boolean var44 = var41.isAssignAdd();
    com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.IR.throwNode(var41);
    com.google.javascript.rhino.Node var46 = var36.srcrefTree(var45);
    com.google.javascript.rhino.ErrorReporter var47 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var47);
    com.google.javascript.rhino.jstype.JSType var49 = null;
    com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var52 = null;
    var51.setJSDocInfo(var52);
    com.google.javascript.rhino.jstype.FunctionType var54 = var48.createFunctionType(var49, var51);
    com.google.javascript.rhino.jstype.ObjectType var55 = var54.getParentScope();
    com.google.javascript.rhino.jstype.EnumType var56 = var1.createEnumType("hi!. hi! at hi! line (unknown line) : (unknown column)", var36, (com.google.javascript.rhino.jstype.JSType)var55);
    com.google.javascript.rhino.jstype.EnumType var57 = var56.toMaybeEnumType();
    com.google.javascript.rhino.jstype.EnumElementType var58 = var56.getElementsType();
    com.google.javascript.rhino.Node var61 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var63 = com.google.javascript.rhino.IR.name("");
    boolean var64 = var63.isGetElem();
    boolean var65 = var63.isNull();
    com.google.javascript.rhino.Node var66 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var67 = var63.srcref(var66);
    com.google.javascript.rhino.Node var70 = new com.google.javascript.rhino.Node(100, var61, var66, 0, 0);
    com.google.javascript.rhino.jstype.StaticSourceFile var71 = com.google.javascript.jscomp.NodeUtil.getSourceFile(var70);
    boolean var72 = var56.defineElement("LinkedGraph", var70);
    com.google.javascript.rhino.Node var74 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var75 = null;
    var74.setJSDocInfo(var75);
    boolean var77 = var74.isAssignAdd();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var78 = com.google.javascript.rhino.IR.ifNode(var70, var74);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
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
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
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
    assertNotNull(var61);
    
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
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);

  }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test132"); }


    java.lang.String var1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("TRUE");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "(TRUE)"+ "'", var1.equals("(TRUE)"));

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test133"); }


    com.google.javascript.rhino.jstype.JSTypeRegistry var0 = null;
    com.google.javascript.rhino.jstype.FunctionBuilder var1 = new com.google.javascript.rhino.jstype.FunctionBuilder(var0);

  }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test134"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.DiagnosticGroup var1 = null;
    com.google.javascript.jscomp.CheckLevel var2 = null;
    var0.setWarningLevel(var1, var2);
    var0.setLocale("hi!");
    com.google.javascript.jscomp.CheckLevel var6 = null;
    var0.setCheckUnreachableCode(var6);
    com.google.javascript.jscomp.CompilerOptions.TracerMode var8 = var0.getTracerMode();
    boolean var9 = var0.assumeStrictThis();
    var0.setCollapseVariableDeclarations(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test135() {}
//   public void test135() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test135"); }
// 
// 
//     com.google.javascript.jscomp.SourceAst var0 = null;
//     com.google.javascript.rhino.InputId var1 = null;
//     com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, var1, false);
//     java.util.logging.Logger var4 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var5 = new com.google.javascript.jscomp.LoggerErrorManager(var4);
//     com.google.javascript.jscomp.Compiler var6 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var5);
//     com.google.javascript.jscomp.JSError[] var7 = var6.getErrors();
//     var3.setCompiler((com.google.javascript.jscomp.AbstractCompiler)var6);
//     java.lang.String var9 = var6.getAstDotGraph();
//     com.google.javascript.jscomp.Compiler.IntermediateState var10 = var6.getState();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var11 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithNodeAnnotations();
//     com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.name("");
//     boolean var14 = var11.hasNode((java.lang.Object)"");
//     com.google.javascript.jscomp.graph.SubGraph var15 = var11.newSubGraph();
//     var11.clearNodeAnnotations();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var17 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();
//     com.google.javascript.jscomp.graph.LinkedDirectedGraph var18 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
//     com.google.javascript.jscomp.graph.DiGraph.DiGraphNode var19 = var17.createDirectedGraphNode((java.lang.Object)var18);
//     java.util.List var20 = var11.getNeighborNodes(var19);
//     com.google.javascript.jscomp.CompilerOptions var21 = new com.google.javascript.jscomp.CompilerOptions();
//     com.google.javascript.jscomp.DiagnosticGroup var22 = null;
//     com.google.javascript.jscomp.CheckLevel var23 = null;
//     var21.setWarningLevel(var22, var23);
//     var21.setLocale("hi!");
//     com.google.javascript.jscomp.CheckLevel var27 = null;
//     var21.setCheckUnreachableCode(var27);
//     com.google.javascript.jscomp.CompilerOptions.TracerMode var29 = var21.getTracerMode();
//     boolean var30 = var21.assumeStrictThis();
//     var21.setCheckSuspiciousCode(false);
//     com.google.javascript.rhino.JSDocInfo var33 = new com.google.javascript.rhino.JSDocInfo();
//     java.util.Collection var34 = var33.getTypeNodes();
//     boolean var35 = var33.isInterface();
//     var33.addSuppression("");
//     boolean var38 = var33.isNoCompile();
//     java.util.Set var39 = var33.getParameterNames();
//     boolean var40 = var33.isExterns();
//     boolean var41 = var33.shouldPreserveTry();
//     int var42 = var33.getParameterCount();
//     boolean var43 = var33.isDeprecated();
//     java.util.List var44 = var33.getThrownTypes();
//     var21.setSourceMapLocationMappings(var44);
//     com.google.javascript.rhino.Node var46 = com.google.javascript.rhino.IR.paramList(var44);
//     com.google.javascript.jscomp.deps.SortedDependencies var47 = new com.google.javascript.jscomp.deps.SortedDependencies(var44);
//     java.util.List var48 = var47.getInputsWithoutProvides();
//     com.google.javascript.jscomp.CompilerOptions var49 = new com.google.javascript.jscomp.CompilerOptions();
//     com.google.javascript.jscomp.DiagnosticGroup var50 = null;
//     com.google.javascript.jscomp.CheckLevel var51 = null;
//     var49.setWarningLevel(var50, var51);
//     var49.setLocale("hi!");
//     com.google.javascript.jscomp.CheckLevel var55 = null;
//     var49.setCheckUnreachableCode(var55);
//     com.google.javascript.jscomp.CompilerOptions.TweakProcessing var57 = null;
//     var49.setTweakProcessing(var57);
//     var49.setNameReferenceReportPath("hi!");
//     var49.setDefineToDoubleLiteral("goog.abstractMethod", 0.0d);
//     com.google.javascript.rhino.JSDocInfo var64 = new com.google.javascript.rhino.JSDocInfo();
//     java.util.Collection var65 = var64.getTypeNodes();
//     boolean var66 = var64.isInterface();
//     var64.addSuppression("");
//     boolean var69 = var64.isNoCompile();
//     java.util.Set var70 = var64.getParameterNames();
//     boolean var71 = var64.isExterns();
//     java.util.Set var72 = var64.getSuppressions();
//     var49.setStripTypePrefixes(var72);
//     com.google.javascript.jscomp.Result var74 = var6.<com.google.javascript.jscomp.SourceFile,com.google.javascript.jscomp.SourceFile>compile(var20, var48, var49);
// 
//   }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test136"); }


    com.google.javascript.rhino.ErrorReporter var1 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var1);
    com.google.javascript.rhino.jstype.JSType var3 = null;
    com.google.javascript.rhino.Node var5 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var6 = null;
    var5.setJSDocInfo(var6);
    com.google.javascript.rhino.jstype.FunctionType var8 = var2.createFunctionType(var3, var5);
    com.google.javascript.rhino.jstype.SimpleSlot var10 = new com.google.javascript.rhino.jstype.SimpleSlot("module$hi!", (com.google.javascript.rhino.jstype.JSType)var8, false);
    java.lang.String var11 = var10.getName();
    com.google.javascript.rhino.JSDocInfo var12 = var10.getJSDocInfo();
    boolean var13 = var10.isTypeInferred();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "module$hi!"+ "'", var11.equals("module$hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test137"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.DiagnosticGroup var1 = null;
    com.google.javascript.jscomp.CheckLevel var2 = null;
    var0.setWarningLevel(var1, var2);
    var0.setLocale("hi!");
    var0.setSyntheticBlockEndMarker("module$hi!");
    com.google.javascript.jscomp.VariableRenamingPolicy var8 = null;
    com.google.javascript.jscomp.PropertyRenamingPolicy var9 = null;
    var0.setRenamingPolicy(var8, var9);
    var0.setRemoveDeadCode(false);

  }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test138"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.VariableRenamingPolicy var1 = com.google.javascript.jscomp.VariableRenamingPolicy.valueOf("function (): {1260910291}");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test139"); }


    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var4 = null;
    var3.setJSDocInfo(var4);
    boolean var6 = var3.isAssignAdd();
    boolean var7 = var3.isGetElem();
    boolean var8 = var3.isNumber();
    com.google.javascript.jscomp.CheckLevel var9 = null;
    com.google.javascript.jscomp.DiagnosticType var12 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "hi!");
    java.lang.String[] var14 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var15 = com.google.javascript.jscomp.JSError.make("hi!", var3, var9, var12, var14);
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var18 = null;
    var17.setJSDocInfo(var18);
    boolean var20 = var17.isNE();
    boolean var21 = var17.isAdd();
    boolean var22 = var17.isLabel();
    com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var25 = null;
    var24.setJSDocInfo(var25);
    boolean var27 = var24.isAssignAdd();
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var30 = null;
    var29.setJSDocInfo(var30);
    boolean var32 = var29.isAssignAdd();
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.throwNode(var29);
    com.google.javascript.rhino.Node var34 = var24.srcrefTree(var33);
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var37 = null;
    var36.setJSDocInfo(var37);
    boolean var39 = var36.isAssignAdd();
    com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var42 = null;
    var41.setJSDocInfo(var42);
    boolean var44 = var41.isAssignAdd();
    com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.IR.throwNode(var41);
    com.google.javascript.rhino.Node var46 = var36.srcrefTree(var45);
    com.google.javascript.rhino.Node var48 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var49 = null;
    var48.setJSDocInfo(var49);
    boolean var51 = var48.isAssignAdd();
    com.google.javascript.rhino.Node var53 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var54 = null;
    var53.setJSDocInfo(var54);
    boolean var56 = var53.isAssignAdd();
    com.google.javascript.rhino.Node var57 = com.google.javascript.rhino.IR.throwNode(var53);
    com.google.javascript.rhino.Node var58 = var48.srcrefTree(var57);
    var36.addChildrenToFront(var48);
    boolean var60 = var34.hasChild(var36);
    com.google.javascript.rhino.Node var62 = com.google.javascript.rhino.Node.newNumber(0.0d);
    com.google.javascript.rhino.Node var63 = new com.google.javascript.rhino.Node(100, var3, var17, var34, var62);
    com.google.javascript.rhino.Node var65 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var66 = null;
    var65.setJSDocInfo(var66);
    boolean var68 = var65.isNE();
    boolean var69 = var65.isOnlyModifiesThisCall();
    boolean var70 = var65.isContinue();
    boolean var71 = var65.isAnd();
    boolean var72 = var65.isExprResult();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var73 = com.google.javascript.rhino.IR.assign(var17, var65);
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
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);

  }

  public void test140() {}
//   public void test140() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test140"); }
// 
// 
//     com.google.javascript.jscomp.SourceFile var2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
//     com.google.javascript.jscomp.JsAst var3 = new com.google.javascript.jscomp.JsAst(var2);
//     com.google.javascript.jscomp.SourceFile var5 = new com.google.javascript.jscomp.SourceFile("module$hi!");
//     com.google.javascript.jscomp.CompilerInput var7 = new com.google.javascript.jscomp.CompilerInput(var5, true);
//     java.lang.String var8 = var7.getCode();
//     com.google.javascript.rhino.InputId var9 = var7.getInputId();
//     com.google.javascript.rhino.InputId var10 = null;
//     com.google.javascript.jscomp.CompilerInput var12 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var7, var10, false);
//     com.google.javascript.jscomp.SourceAst var13 = null;
//     com.google.javascript.rhino.InputId var14 = null;
//     com.google.javascript.jscomp.CompilerInput var16 = new com.google.javascript.jscomp.CompilerInput(var13, var14, false);
//     java.util.logging.Logger var17 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var18 = new com.google.javascript.jscomp.LoggerErrorManager(var17);
//     com.google.javascript.jscomp.Compiler var19 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var18);
//     com.google.javascript.jscomp.JSError[] var20 = var19.getErrors();
//     var16.setCompiler((com.google.javascript.jscomp.AbstractCompiler)var19);
//     java.lang.String var22 = var19.getAstDotGraph();
//     com.google.javascript.jscomp.Compiler.IntermediateState var23 = var19.getState();
//     com.google.javascript.jscomp.JSError[] var24 = var19.getMessages();
//     var7.setCompiler((com.google.javascript.jscomp.AbstractCompiler)var19);
//     com.google.javascript.jscomp.JSError[] var26 = var19.getMessages();
//     com.google.javascript.rhino.Node var27 = var3.getAstRoot((com.google.javascript.jscomp.AbstractCompiler)var19);
// 
//   }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test141"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var2 = null;
    var1.setJSDocInfo(var2);
    boolean var4 = var1.isAssignAdd();
    boolean var5 = var1.isGetElem();
    boolean var6 = var1.isNumber();
    boolean var7 = var1.isDelProp();
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.nullNode();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var9 = var1.removeChildAfter(var8);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test142"); }


    com.google.javascript.jscomp.SourceAst var0 = null;
    com.google.javascript.rhino.InputId var1 = null;
    com.google.javascript.jscomp.CompilerInput var3 = new com.google.javascript.jscomp.CompilerInput(var0, var1, false);
    java.util.logging.Logger var4 = null;
    com.google.javascript.jscomp.LoggerErrorManager var5 = new com.google.javascript.jscomp.LoggerErrorManager(var4);
    com.google.javascript.jscomp.Compiler var6 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var5);
    com.google.javascript.jscomp.JSError[] var7 = var6.getErrors();
    var3.setCompiler((com.google.javascript.jscomp.AbstractCompiler)var6);
    com.google.javascript.jscomp.JSError[] var9 = var6.getErrors();
    com.google.javascript.jscomp.NodeTraversal.Callback var10 = null;
    com.google.javascript.jscomp.NodeTraversal var11 = new com.google.javascript.jscomp.NodeTraversal((com.google.javascript.jscomp.AbstractCompiler)var6, var10);
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var15 = null;
    var14.setJSDocInfo(var15);
    boolean var17 = var14.isAssignAdd();
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var20 = null;
    var19.setJSDocInfo(var20);
    boolean var22 = var19.isAssignAdd();
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.throwNode(var19);
    com.google.javascript.rhino.Node var24 = var14.srcrefTree(var23);
    boolean var25 = var24.isLocalResultCall();
    com.google.javascript.jscomp.ClosureCodingConvention var26 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.name("");
    boolean var29 = var28.isGetElem();
    boolean var30 = var28.isNull();
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var32 = var28.srcref(var31);
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.throwNode(var32);
    java.lang.String var34 = var26.getSingletonGetterClassName(var33);
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.name("");
    boolean var37 = var36.isGetElem();
    boolean var38 = var36.isNull();
    com.google.javascript.rhino.Node var39 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var40 = var36.srcref(var39);
    com.google.javascript.rhino.Node var42 = com.google.javascript.rhino.IR.name("");
    var40.addChildrenToFront(var42);
    com.google.javascript.rhino.ErrorReporter var45 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var45);
    com.google.javascript.rhino.jstype.JSType var47 = null;
    com.google.javascript.rhino.Node var49 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var50 = null;
    var49.setJSDocInfo(var50);
    com.google.javascript.rhino.jstype.FunctionType var52 = var46.createFunctionType(var47, var49);
    boolean var53 = var52.isGlobalThisType();
    boolean var54 = var52.isConstructor();
    var40.putProp(0, (java.lang.Object)var52);
    com.google.javascript.rhino.Node var57 = com.google.javascript.rhino.IR.name("");
    boolean var58 = var57.isGetElem();
    boolean var59 = var57.isNull();
    com.google.javascript.rhino.Node var60 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var61 = var57.srcref(var60);
    com.google.javascript.rhino.Node var62 = new com.google.javascript.rhino.Node(0, var24, var33, var40, var61);
    com.google.javascript.rhino.Node var65 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var66 = null;
    var65.setJSDocInfo(var66);
    boolean var68 = var65.isAssignAdd();
    boolean var69 = var65.isGetElem();
    boolean var70 = var65.isNumber();
    com.google.javascript.jscomp.CheckLevel var71 = null;
    com.google.javascript.jscomp.DiagnosticType var74 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "hi!");
    java.lang.String[] var76 = new java.lang.String[] { ""};
    com.google.javascript.jscomp.JSError var77 = com.google.javascript.jscomp.JSError.make("hi!", var65, var71, var74, var76);
    com.google.javascript.jscomp.CheckLevel var81 = null;
    com.google.javascript.jscomp.DiagnosticType var84 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "hi!");
    java.lang.String[] var86 = new java.lang.String[] { "hi!"};
    com.google.javascript.jscomp.JSError var87 = com.google.javascript.jscomp.JSError.make("hi!", 100, 0, var81, var84, var86);
    com.google.javascript.jscomp.JSError var88 = var11.makeError(var40, var74, var86);
    com.google.javascript.jscomp.DiagnosticType var89 = var88.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
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
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);

  }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test143"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var3 = com.google.javascript.rhino.IR.name("");
    boolean var4 = var3.isGetElem();
    boolean var5 = var3.isNull();
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var7 = var3.srcref(var6);
    com.google.javascript.rhino.Node var10 = new com.google.javascript.rhino.Node(100, var1, var6, 0, 0);
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var13 = null;
    var12.setJSDocInfo(var13);
    boolean var15 = var12.isAssignAdd();
    com.google.javascript.rhino.Node var17 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var18 = null;
    var17.setJSDocInfo(var18);
    boolean var20 = var17.isAssignAdd();
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.throwNode(var17);
    com.google.javascript.rhino.Node var22 = var12.srcrefTree(var21);
    com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var25 = null;
    var24.setJSDocInfo(var25);
    boolean var27 = var24.isAssignAdd();
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var30 = null;
    var29.setJSDocInfo(var30);
    boolean var32 = var29.isAssignAdd();
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.throwNode(var29);
    com.google.javascript.rhino.Node var34 = var24.srcrefTree(var33);
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var37 = null;
    var36.setJSDocInfo(var37);
    boolean var39 = var36.isAssignAdd();
    com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var42 = null;
    var41.setJSDocInfo(var42);
    boolean var44 = var41.isAssignAdd();
    com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.IR.throwNode(var41);
    com.google.javascript.rhino.Node var46 = var36.srcrefTree(var45);
    var24.addChildrenToFront(var36);
    boolean var48 = var22.hasChild(var24);
    var6.addChildrenToFront(var24);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var50 = com.google.javascript.rhino.IR.defaultCase(var6);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test144() {}
//   public void test144() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test144"); }
// 
// 
//     java.util.logging.Logger var0 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var1 = new com.google.javascript.jscomp.LoggerErrorManager(var0);
//     com.google.javascript.jscomp.Compiler var2 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var1);
//     com.google.javascript.rhino.Node var3 = var2.getRoot();
//     var2.disableThreads();
//     com.google.javascript.jscomp.CompilerInput var6 = var2.newExternInput("hi!: hi!");
// 
//   }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test145"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.SourceFile var3 = com.google.javascript.jscomp.SourceFile.fromCode("", "Node tree inequality:\nTree1:\nNAME \n\n\nTree2:\nNAME  [jsdoc_info: JSDocInfo] [length: 26]\n    NAME \n\n\nSubtree1: NAME \n\n\nSubtree2: NAME  [jsdoc_info: JSDocInfo] [length: 26]\n    NAME \n", "(NAME \n    NAME \n)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test146() {}
//   public void test146() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test146"); }
// 
// 
//     com.google.javascript.rhino.ErrorReporter var0 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
//     com.google.javascript.rhino.jstype.JSType var2 = null;
//     com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var5 = null;
//     var4.setJSDocInfo(var5);
//     com.google.javascript.rhino.jstype.FunctionType var7 = var1.createFunctionType(var2, var4);
//     com.google.javascript.rhino.jstype.JSType var9 = null;
//     var1.unregisterPropertyOnType("hi!", var9);
//     com.google.javascript.rhino.ErrorReporter var11 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var11);
//     com.google.javascript.rhino.jstype.JSType var13 = null;
//     com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var16 = null;
//     var15.setJSDocInfo(var16);
//     com.google.javascript.rhino.jstype.FunctionType var18 = var12.createFunctionType(var13, var15);
//     com.google.javascript.rhino.jstype.JSType var20 = null;
//     var12.unregisterPropertyOnType("hi!", var20);
//     java.lang.Iterable var23 = var12.getTypesWithProperty("hi!");
//     com.google.javascript.rhino.ErrorReporter var24 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var24);
//     com.google.javascript.rhino.jstype.JSType var26 = null;
//     com.google.javascript.rhino.Node var28 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var29 = null;
//     var28.setJSDocInfo(var29);
//     com.google.javascript.rhino.jstype.FunctionType var31 = var25.createFunctionType(var26, var28);
//     com.google.javascript.rhino.jstype.JSType var33 = null;
//     var25.unregisterPropertyOnType("hi!", var33);
//     java.lang.Iterable var36 = var25.getTypesWithProperty("hi!");
//     java.lang.Iterable var38 = var25.getTypesWithProperty("hi!");
//     com.google.javascript.rhino.ErrorReporter var39 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var39);
//     com.google.javascript.rhino.jstype.JSType var41 = null;
//     com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var44 = null;
//     var43.setJSDocInfo(var44);
//     com.google.javascript.rhino.jstype.FunctionType var46 = var40.createFunctionType(var41, var43);
//     com.google.javascript.rhino.jstype.ObjectType var47 = var46.getParentScope();
//     com.google.javascript.rhino.ErrorReporter var48 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var48);
//     com.google.javascript.rhino.jstype.JSType var50 = null;
//     com.google.javascript.rhino.Node var52 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var53 = null;
//     var52.setJSDocInfo(var53);
//     com.google.javascript.rhino.jstype.FunctionType var55 = var49.createFunctionType(var50, var52);
//     boolean var56 = var55.matchesInt32Context();
//     com.google.javascript.rhino.jstype.ObjectType var57 = var55.toObjectType();
//     com.google.javascript.rhino.jstype.FunctionType var58 = var25.createFunctionTypeWithNewThisType(var46, (com.google.javascript.rhino.jstype.ObjectType)var55);
//     java.lang.String var59 = var55.getTemplateTypeName();
//     var55.clearCachedValues();
//     com.google.javascript.rhino.jstype.FunctionType var61 = var55.toMaybeFunctionType();
//     var12.resolveTypesInScope((com.google.javascript.rhino.jstype.StaticScope)var55);
//     com.google.javascript.rhino.ErrorReporter var63 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var63);
//     com.google.javascript.rhino.jstype.JSType var65 = null;
//     com.google.javascript.rhino.Node var67 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var68 = null;
//     var67.setJSDocInfo(var68);
//     com.google.javascript.rhino.jstype.FunctionType var70 = var64.createFunctionType(var65, var67);
//     com.google.javascript.rhino.ErrorReporter var71 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var71);
//     com.google.javascript.rhino.jstype.JSType var73 = null;
//     com.google.javascript.rhino.Node var75 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var76 = null;
//     var75.setJSDocInfo(var76);
//     com.google.javascript.rhino.jstype.FunctionType var78 = var72.createFunctionType(var73, var75);
//     boolean var79 = var78.matchesInt32Context();
//     com.google.javascript.rhino.ErrorReporter var80 = null;
//     com.google.javascript.rhino.jstype.JSTypeRegistry var81 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var80);
//     com.google.javascript.rhino.jstype.JSType var82 = null;
//     com.google.javascript.rhino.Node var84 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var85 = null;
//     var84.setJSDocInfo(var85);
//     com.google.javascript.rhino.jstype.FunctionType var87 = var81.createFunctionType(var82, var84);
//     com.google.javascript.rhino.jstype.JSType[] var88 = new com.google.javascript.rhino.jstype.JSType[] { var82};
//     com.google.javascript.rhino.jstype.FunctionType var89 = var64.createConstructorType((com.google.javascript.rhino.jstype.JSType)var78, var88);
//     com.google.javascript.rhino.jstype.FunctionType var90 = var1.createFunctionType((com.google.javascript.rhino.jstype.JSType)var55, var88);
//     java.util.List var91 = null;
//     com.google.javascript.rhino.Node var92 = var1.createParameters(var91);
// 
//   }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test147"); }


    com.google.javascript.rhino.JSDocInfoBuilder var1 = new com.google.javascript.rhino.JSDocInfoBuilder(false);
    boolean var2 = var1.recordInterface();
    boolean var3 = var1.isPopulated();
    boolean var4 = var1.recordNoAlias();
    com.google.javascript.rhino.JSDocInfo.Visibility var5 = null;
    boolean var6 = var1.recordVisibility(var5);
    boolean var7 = var1.recordPreserveTry();
    com.google.javascript.rhino.jstype.StaticSourceFile var9 = null;
    var1.markName("module$", var9, 26, 100);
    com.google.javascript.rhino.Node var15 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var16 = null;
    var15.setJSDocInfo(var16);
    boolean var18 = var15.isAssignAdd();
    com.google.javascript.rhino.Node var20 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var21 = null;
    var20.setJSDocInfo(var21);
    boolean var23 = var20.isAssignAdd();
    com.google.javascript.rhino.Node var24 = com.google.javascript.rhino.IR.throwNode(var20);
    com.google.javascript.rhino.Node var25 = var15.srcrefTree(var24);
    boolean var26 = var25.isLocalResultCall();
    com.google.javascript.jscomp.ClosureCodingConvention var27 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.name("");
    boolean var30 = var29.isGetElem();
    boolean var31 = var29.isNull();
    com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var33 = var29.srcref(var32);
    com.google.javascript.rhino.Node var34 = com.google.javascript.rhino.IR.throwNode(var33);
    java.lang.String var35 = var27.getSingletonGetterClassName(var34);
    com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.IR.name("");
    boolean var38 = var37.isGetElem();
    boolean var39 = var37.isNull();
    com.google.javascript.rhino.Node var40 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var41 = var37.srcref(var40);
    com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.IR.name("");
    var41.addChildrenToFront(var43);
    com.google.javascript.rhino.ErrorReporter var46 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var46);
    com.google.javascript.rhino.jstype.JSType var48 = null;
    com.google.javascript.rhino.Node var50 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var51 = null;
    var50.setJSDocInfo(var51);
    com.google.javascript.rhino.jstype.FunctionType var53 = var47.createFunctionType(var48, var50);
    boolean var54 = var53.isGlobalThisType();
    boolean var55 = var53.isConstructor();
    var41.putProp(0, (java.lang.Object)var53);
    com.google.javascript.rhino.Node var58 = com.google.javascript.rhino.IR.name("");
    boolean var59 = var58.isGetElem();
    boolean var60 = var58.isNull();
    com.google.javascript.rhino.Node var61 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var62 = var58.srcref(var61);
    com.google.javascript.rhino.Node var63 = new com.google.javascript.rhino.Node(0, var25, var34, var41, var62);
    var63.setLineno((-1));
    com.google.javascript.rhino.JSTypeExpression var67 = new com.google.javascript.rhino.JSTypeExpression(var63, "");
    boolean var69 = var1.recordThrowDescription(var67, "goog.abstractMethod");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
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
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);

  }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test148"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.JSType var2 = null;
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var5 = null;
    var4.setJSDocInfo(var5);
    com.google.javascript.rhino.jstype.FunctionType var7 = var1.createFunctionType(var2, var4);
    boolean var8 = var7.isGlobalThisType();
    com.google.javascript.rhino.jstype.FunctionType var9 = var7.toMaybeFunctionType();
    java.lang.String var10 = var9.getDisplayName();
    boolean var11 = var9.isNullType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.jstype.ObjectType var12 = var9.getInstanceType();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
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
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test149() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test149"); }


    java.lang.String var1 = com.google.javascript.rhino.ScriptRuntime.escapeString("(NAME \n    NAME \n)");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "(NAME \\n    NAME \\n)"+ "'", var1.equals("(NAME \\n    NAME \\n)"));

  }

  public void test150() {}
//   public void test150() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test150"); }
// 
// 
//     com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
//     var0.setSourceMapOutputPath("module$hi!");
//     com.google.javascript.jscomp.CheckLevel var3 = null;
//     var0.setCheckMissingReturn(var3);
//     var0.setCollapsePropertiesOnExternTypes(false);
//     var0.setRemoveUnusedPrototypePropertiesInExterns(false);
//     var0.setGenerateExports(false);
//     var0.setRemoveUnusedLocalVars(true);
//     var0.setSmartNameRemoval(false);
//     var0.setRemoveUnusedPrototypeProperties(false);
//     var0.setCrossModuleMethodMotion(true);
//     com.google.javascript.jscomp.CompilerOptions var19 = new com.google.javascript.jscomp.CompilerOptions();
//     com.google.javascript.jscomp.DiagnosticType var22 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "hi!");
//     com.google.javascript.jscomp.DiagnosticGroup var23 = com.google.javascript.jscomp.DiagnosticGroup.forType(var22);
//     com.google.javascript.jscomp.CheckLevel var24 = null;
//     var19.setWarningLevel(var23, var24);
//     com.google.javascript.jscomp.DiagnosticType var28 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "hi!");
//     com.google.javascript.jscomp.DiagnosticGroup var29 = com.google.javascript.jscomp.DiagnosticGroup.forType(var28);
//     com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.IR.name("");
//     com.google.javascript.rhino.JSDocInfo var33 = null;
//     var32.setJSDocInfo(var33);
//     boolean var35 = var32.isAssignAdd();
//     boolean var36 = var32.isGetElem();
//     boolean var37 = var32.isNumber();
//     com.google.javascript.jscomp.CheckLevel var38 = null;
//     com.google.javascript.jscomp.DiagnosticType var41 = com.google.javascript.jscomp.DiagnosticType.disabled("hi!", "hi!");
//     java.lang.String[] var43 = new java.lang.String[] { ""};
//     com.google.javascript.jscomp.JSError var44 = com.google.javascript.jscomp.JSError.make("hi!", var32, var38, var41, var43);
//     java.util.logging.Logger var45 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var46 = new com.google.javascript.jscomp.LoggerErrorManager(var45);
//     com.google.javascript.jscomp.JSError[] var47 = var46.getWarnings();
//     boolean var48 = var44.equals((java.lang.Object)var46);
//     com.google.javascript.jscomp.CheckLevel var49 = var44.getDefaultLevel();
//     com.google.javascript.jscomp.DiagnosticGroupWarningsGuard var50 = new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(var29, var49);
//     var0.setWarningLevel(var23, var49);
//     com.google.javascript.jscomp.CompilerOptions.Reach var52 = null;
//     var0.setInlineFunctions(var52);
// 
//   }

  public void test151() {}
//   public void test151() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test151"); }
// 
// 
//     com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
//     boolean var2 = var1.isGetElem();
//     boolean var3 = var1.isNull();
//     com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.returnNode();
//     com.google.javascript.rhino.Node var5 = var1.srcref(var4);
//     com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
//     boolean var8 = var7.isGetElem();
//     boolean var9 = var7.isNull();
//     com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.returnNode();
//     com.google.javascript.rhino.Node var11 = var7.srcref(var10);
//     com.google.javascript.rhino.Node var12 = var5.useSourceInfoFromForTree(var11);
//     com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.name("");
//     boolean var15 = var14.isGetElem();
//     boolean var16 = var14.isNull();
//     boolean var17 = var14.isDebugger();
//     com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.or(var12, var14);
//     com.google.javascript.rhino.JSDocInfo var19 = new com.google.javascript.rhino.JSDocInfo();
//     java.util.Set var20 = var19.getParameterNames();
//     var14.setDirectives(var20);
//     var14.removeProp((-1));
//     com.google.javascript.rhino.Node var24 = null;
//     com.google.javascript.rhino.Node var25 = var14.copyInformationFrom(var24);
// 
//   }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test152"); }


    com.google.javascript.jscomp.CompilerOptions var0 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.DiagnosticGroup var1 = null;
    com.google.javascript.jscomp.CheckLevel var2 = null;
    var0.setWarningLevel(var1, var2);
    var0.setLocale("hi!");
    com.google.javascript.jscomp.CheckLevel var6 = null;
    var0.setCheckUnreachableCode(var6);
    var0.setCollapseProperties(false);
    var0.setInputDelimiter("hi!");
    com.google.javascript.jscomp.CompilerOptions.TracerMode var12 = null;
    var0.setTracer(var12);
    var0.setCrossModuleMethodMotion(true);
    var0.setRewriteFunctionExpressions(false);
    com.google.javascript.jscomp.ComposeWarningsGuard var18 = null;
    var0.setWarningsGuard(var18);
    var0.resetWarningsGuard();

  }

  public void test153() {}
//   public void test153() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test153"); }
// 
// 
//     com.google.javascript.jscomp.DiagnosticType var2 = com.google.javascript.jscomp.DiagnosticType.error("", "goog.abstractMethod");
//     com.google.javascript.jscomp.DiagnosticType var3 = null;
//     int var4 = var2.compareTo(var3);
// 
//   }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test154"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.JSType var2 = null;
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var5 = null;
    var4.setJSDocInfo(var5);
    com.google.javascript.rhino.jstype.FunctionType var7 = var1.createFunctionType(var2, var4);
    com.google.javascript.rhino.jstype.JSType var9 = null;
    var1.unregisterPropertyOnType("hi!", var9);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.name("");
    boolean var14 = var13.isGetElem();
    boolean var15 = var13.isNull();
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var17 = var13.srcref(var16);
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.name("");
    boolean var20 = var19.isGetElem();
    boolean var21 = var19.isNull();
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var23 = var19.srcref(var22);
    com.google.javascript.rhino.Node var24 = var17.useSourceInfoFromForTree(var23);
    com.google.javascript.rhino.ErrorReporter var25 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var25);
    com.google.javascript.rhino.jstype.JSType var27 = null;
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var30 = null;
    var29.setJSDocInfo(var30);
    com.google.javascript.rhino.jstype.FunctionType var32 = var26.createFunctionType(var27, var29);
    com.google.javascript.rhino.jstype.ObjectType var33 = var1.createObjectType("goog.abstractMethod", var24, (com.google.javascript.rhino.jstype.ObjectType)var32);
    com.google.javascript.rhino.Node var36 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var37 = null;
    var36.setJSDocInfo(var37);
    boolean var39 = var36.isAssignAdd();
    com.google.javascript.rhino.Node var41 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var42 = null;
    var41.setJSDocInfo(var42);
    boolean var44 = var41.isAssignAdd();
    com.google.javascript.rhino.Node var45 = com.google.javascript.rhino.IR.throwNode(var41);
    com.google.javascript.rhino.Node var46 = var36.srcrefTree(var45);
    com.google.javascript.rhino.ErrorReporter var47 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var47);
    com.google.javascript.rhino.jstype.JSType var49 = null;
    com.google.javascript.rhino.Node var51 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var52 = null;
    var51.setJSDocInfo(var52);
    com.google.javascript.rhino.jstype.FunctionType var54 = var48.createFunctionType(var49, var51);
    com.google.javascript.rhino.jstype.ObjectType var55 = var54.getParentScope();
    com.google.javascript.rhino.jstype.EnumType var56 = var1.createEnumType("hi!. hi! at hi! line (unknown line) : (unknown column)", var36, (com.google.javascript.rhino.jstype.JSType)var55);
    com.google.javascript.rhino.Node var58 = new com.google.javascript.rhino.Node(0);
    boolean var59 = var58.isString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var60 = com.google.javascript.rhino.IR.sub(var36, var58);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
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
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);

  }

  public void test155() {}
//   public void test155() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test155"); }
// 
// 
//     java.util.logging.Logger var0 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var1 = new com.google.javascript.jscomp.LoggerErrorManager(var0);
//     com.google.javascript.jscomp.Compiler var2 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var1);
//     com.google.javascript.rhino.Node var3 = var2.getRoot();
//     var2.disableThreads();
//     com.google.javascript.jscomp.SourceFile var7 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
//     com.google.javascript.jscomp.JsAst var8 = new com.google.javascript.jscomp.JsAst(var7);
//     com.google.javascript.jscomp.CompilerInput var11 = new com.google.javascript.jscomp.CompilerInput((com.google.javascript.jscomp.SourceAst)var8, "goog.exportProperty", false);
//     var2.addNewScript(var8);
// 
//   }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test156"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.jscomp.AnonymousFunctionNamingPolicy var1 = com.google.javascript.jscomp.AnonymousFunctionNamingPolicy.valueOf("NAME \n");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test157"); }


    int var1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator(38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test158"); }


    com.google.javascript.jscomp.ClosureCodingConvention var1 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.jstype.FunctionType var2 = null;
    com.google.javascript.rhino.jstype.FunctionType var3 = null;
    com.google.javascript.jscomp.CodingConvention.SubclassType var4 = null;
    var1.applySubclassRelationship(var2, var3, var4);
    java.lang.String var6 = var1.getAbstractMethodName();
    boolean var8 = var1.isSuperClassReference("function (): ?");
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var11 = null;
    var10.setJSDocInfo(var11);
    boolean var13 = var10.isNE();
    boolean var14 = var10.isAdd();
    boolean var16 = var10.getBooleanProp(100);
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.name("");
    boolean var19 = var18.isGetElem();
    boolean var20 = var18.isNull();
    boolean var21 = var18.isDebugger();
    boolean var22 = var18.isArrayLit();
    var10.addChildToBack(var18);
    com.google.javascript.jscomp.ClosureCodingConvention var24 = new com.google.javascript.jscomp.ClosureCodingConvention();
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var27 = null;
    var26.setJSDocInfo(var27);
    boolean var29 = var26.isAssignAdd();
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var32 = null;
    var31.setJSDocInfo(var32);
    boolean var34 = var31.isAssignAdd();
    com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.IR.throwNode(var31);
    com.google.javascript.rhino.Node var36 = var26.srcrefTree(var35);
    com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var39 = null;
    var38.setJSDocInfo(var39);
    boolean var41 = var38.isAssignAdd();
    com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var44 = null;
    var43.setJSDocInfo(var44);
    boolean var46 = var43.isAssignAdd();
    com.google.javascript.rhino.Node var47 = com.google.javascript.rhino.IR.throwNode(var43);
    com.google.javascript.rhino.Node var48 = var38.srcrefTree(var47);
    var26.addChildrenToFront(var38);
    com.google.javascript.jscomp.CodingConvention.SubclassRelationship var50 = var24.getClassesDefinedByCall(var26);
    com.google.javascript.rhino.Node[] var51 = new com.google.javascript.rhino.Node[] { var26};
    com.google.javascript.rhino.Node var52 = com.google.javascript.rhino.IR.newNode(var10, var51);
    java.util.Map var53 = null;
    var1.checkForCallingConventionDefiningCalls(var52, var53);
    com.google.javascript.rhino.jstype.StaticSourceFile var55 = var52.getStaticSourceFile();
    com.google.javascript.rhino.Node[] var56 = new com.google.javascript.rhino.Node[] { var52};
    com.google.javascript.rhino.Node var57 = com.google.javascript.rhino.IR.arraylit(var56);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var60 = new com.google.javascript.rhino.Node(38, var56, (-1), 3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "goog.abstractMethod"+ "'", var6.equals("goog.abstractMethod"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test159"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.JSType var2 = null;
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var5 = null;
    var4.setJSDocInfo(var5);
    com.google.javascript.rhino.jstype.FunctionType var7 = var1.createFunctionType(var2, var4);
    com.google.javascript.rhino.jstype.JSType var9 = null;
    var1.unregisterPropertyOnType("hi!", var9);
    com.google.javascript.rhino.Node var13 = com.google.javascript.rhino.IR.name("");
    boolean var14 = var13.isGetElem();
    boolean var15 = var13.isNull();
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var17 = var13.srcref(var16);
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.name("");
    boolean var20 = var19.isGetElem();
    boolean var21 = var19.isNull();
    com.google.javascript.rhino.Node var22 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var23 = var19.srcref(var22);
    com.google.javascript.rhino.Node var24 = var17.useSourceInfoFromForTree(var23);
    com.google.javascript.rhino.ErrorReporter var25 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var25);
    com.google.javascript.rhino.jstype.JSType var27 = null;
    com.google.javascript.rhino.Node var29 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var30 = null;
    var29.setJSDocInfo(var30);
    com.google.javascript.rhino.jstype.FunctionType var32 = var26.createFunctionType(var27, var29);
    com.google.javascript.rhino.ErrorReporter var33 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var33);
    com.google.javascript.rhino.jstype.JSType var35 = null;
    com.google.javascript.rhino.Node var37 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var38 = null;
    var37.setJSDocInfo(var38);
    com.google.javascript.rhino.jstype.FunctionType var40 = var34.createFunctionType(var35, var37);
    boolean var41 = var40.matchesInt32Context();
    com.google.javascript.rhino.ErrorReporter var42 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var42);
    com.google.javascript.rhino.jstype.JSType var44 = null;
    com.google.javascript.rhino.Node var46 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var47 = null;
    var46.setJSDocInfo(var47);
    com.google.javascript.rhino.jstype.FunctionType var49 = var43.createFunctionType(var44, var46);
    com.google.javascript.rhino.jstype.JSType[] var50 = new com.google.javascript.rhino.jstype.JSType[] { var44};
    com.google.javascript.rhino.jstype.FunctionType var51 = var26.createConstructorType((com.google.javascript.rhino.jstype.JSType)var40, var50);
    com.google.javascript.rhino.jstype.FunctionType var52 = com.google.javascript.rhino.jstype.JSType.toMaybeFunctionType((com.google.javascript.rhino.jstype.JSType)var51);
    com.google.javascript.rhino.jstype.FunctionType var54 = var51.getBindReturnType(0);
    com.google.javascript.rhino.jstype.EnumType var55 = var1.createEnumType("", var17, (com.google.javascript.rhino.jstype.JSType)var51);
    int var56 = var51.getExtendedInterfacesCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
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
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0);

  }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test160"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var2 = null;
    var1.setJSDocInfo(var2);
    boolean var4 = var1.isNE();
    boolean var5 = var1.isAdd();
    com.google.javascript.rhino.ErrorReporter var6 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var6);
    com.google.javascript.rhino.jstype.JSType var8 = null;
    com.google.javascript.rhino.Node var10 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var11 = null;
    var10.setJSDocInfo(var11);
    com.google.javascript.rhino.jstype.FunctionType var13 = var7.createFunctionType(var8, var10);
    com.google.javascript.rhino.jstype.JSType var15 = null;
    var7.unregisterPropertyOnType("hi!", var15);
    java.lang.Iterable var18 = var7.getTypesWithProperty("hi!");
    com.google.javascript.rhino.ErrorReporter var19 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var19);
    com.google.javascript.rhino.jstype.JSType var21 = null;
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var24 = null;
    var23.setJSDocInfo(var24);
    com.google.javascript.rhino.jstype.FunctionType var26 = var20.createFunctionType(var21, var23);
    com.google.javascript.rhino.jstype.JSType var28 = null;
    var20.unregisterPropertyOnType("hi!", var28);
    java.lang.Iterable var31 = var20.getTypesWithProperty("hi!");
    java.lang.Iterable var33 = var20.getTypesWithProperty("hi!");
    com.google.javascript.rhino.ErrorReporter var34 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var34);
    com.google.javascript.rhino.jstype.JSType var36 = null;
    com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var39 = null;
    var38.setJSDocInfo(var39);
    com.google.javascript.rhino.jstype.FunctionType var41 = var35.createFunctionType(var36, var38);
    com.google.javascript.rhino.jstype.ObjectType var42 = var41.getParentScope();
    com.google.javascript.rhino.ErrorReporter var43 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var43);
    com.google.javascript.rhino.jstype.JSType var45 = null;
    com.google.javascript.rhino.Node var47 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var48 = null;
    var47.setJSDocInfo(var48);
    com.google.javascript.rhino.jstype.FunctionType var50 = var44.createFunctionType(var45, var47);
    boolean var51 = var50.matchesInt32Context();
    com.google.javascript.rhino.jstype.ObjectType var52 = var50.toObjectType();
    com.google.javascript.rhino.jstype.FunctionType var53 = var20.createFunctionTypeWithNewThisType(var41, (com.google.javascript.rhino.jstype.ObjectType)var50);
    java.lang.String var54 = var50.getTemplateTypeName();
    var50.clearCachedValues();
    com.google.javascript.rhino.jstype.FunctionType var56 = var50.toMaybeFunctionType();
    var7.resolveTypesInScope((com.google.javascript.rhino.jstype.StaticScope)var50);
    var7.setTemplateTypeName("");
    com.google.javascript.rhino.JSDocInfo var60 = new com.google.javascript.rhino.JSDocInfo();
    java.util.Collection var61 = var60.getTypeNodes();
    boolean var62 = var60.isInterface();
    var60.addSuppression("");
    boolean var65 = var60.isNoCompile();
    com.google.javascript.rhino.JSTypeExpression var66 = var60.getTypedefType();
    com.google.javascript.rhino.JSDocInfo.Visibility var67 = var60.getVisibility();
    java.util.List var68 = var60.getThrownTypes();
    com.google.javascript.rhino.Node var69 = var7.createParametersWithVarArgs(var68);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.Node var70 = com.google.javascript.rhino.IR.tryCatch(var1, var69);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test161"); }


    com.google.javascript.jscomp.graph.LinkedDirectedGraph var0 = com.google.javascript.jscomp.graph.LinkedDirectedGraph.create();
    var0.clearEdgeAnnotations();
    com.google.javascript.jscomp.CompilerOptions var2 = new com.google.javascript.jscomp.CompilerOptions();
    com.google.javascript.jscomp.DiagnosticGroup var3 = null;
    com.google.javascript.jscomp.CheckLevel var4 = null;
    var2.setWarningLevel(var3, var4);
    var2.setLocale("hi!");
    var2.setSyntheticBlockEndMarker("module$hi!");
    var2.setAliasStringsBlacklist("hi!. hi! at hi! line (unknown line) : (unknown column)");
    var2.setDeadAssignmentElimination(true);
    var2.setRemoveUnusedPrototypePropertiesInExterns(false);
    com.google.javascript.rhino.Node var16 = com.google.javascript.rhino.IR.continueNode();
    com.google.javascript.rhino.Node var18 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var19 = null;
    var18.setJSDocInfo(var19);
    boolean var21 = var18.isAssignAdd();
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var24 = null;
    var23.setJSDocInfo(var24);
    boolean var26 = var23.isAssignAdd();
    com.google.javascript.rhino.Node var27 = com.google.javascript.rhino.IR.throwNode(var23);
    com.google.javascript.rhino.Node var28 = var18.srcrefTree(var27);
    com.google.javascript.rhino.Node.AncestorIterable var29 = var27.getAncestors();
    boolean var30 = var16.isEquivalentTo(var27);
    com.google.javascript.rhino.Node var32 = com.google.javascript.rhino.Node.newNumber(0.0d);
    boolean var33 = var32.isDefaultCase();
    com.google.javascript.rhino.Node var34 = var27.clonePropsFrom(var32);
    com.google.javascript.rhino.Node.FileLevelJsDocBuilder var35 = var32.getJsDocBuilderForNode();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var36 = var0.isConnectedInDirection((java.lang.Object)var2, (java.lang.Object)var32);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test162() {}
//   public void test162() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test162"); }
// 
// 
//     java.util.logging.Logger var0 = null;
//     com.google.javascript.jscomp.LoggerErrorManager var1 = new com.google.javascript.jscomp.LoggerErrorManager(var0);
//     com.google.javascript.jscomp.Compiler var2 = new com.google.javascript.jscomp.Compiler((com.google.javascript.jscomp.ErrorManager)var1);
//     com.google.javascript.jscomp.JSError[] var3 = var2.getErrors();
//     int var4 = var2.getWarningCount();
//     int var5 = var2.getErrorCount();
//     com.google.javascript.jscomp.CodingConvention var6 = var2.getCodingConvention();
// 
//   }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test163"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    boolean var2 = var1.isGetElem();
    boolean var3 = var1.isNull();
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var5 = var1.srcref(var4);
    com.google.javascript.rhino.Node var7 = com.google.javascript.rhino.IR.name("");
    var5.addChildrenToFront(var7);
    com.google.javascript.rhino.JSTypeExpression var10 = new com.google.javascript.rhino.JSTypeExpression(var7, "hi!");
    com.google.javascript.rhino.Node var11 = var10.getRoot();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.JSTypeExpression var12 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(var10);
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
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test164"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var2 = null;
    var1.setJSDocInfo(var2);
    boolean var4 = var1.isNE();
    boolean var5 = var1.isSyntheticBlock();
    java.lang.Iterable var6 = var1.siblings();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test165"); }


    com.google.javascript.rhino.ErrorReporter var0 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var0);
    com.google.javascript.rhino.jstype.JSType var2 = null;
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var5 = null;
    var4.setJSDocInfo(var5);
    com.google.javascript.rhino.jstype.FunctionType var7 = var1.createFunctionType(var2, var4);
    com.google.javascript.rhino.ErrorReporter var8 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var8);
    com.google.javascript.rhino.jstype.JSType var10 = null;
    com.google.javascript.rhino.Node var12 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var13 = null;
    var12.setJSDocInfo(var13);
    com.google.javascript.rhino.jstype.FunctionType var15 = var9.createFunctionType(var10, var12);
    boolean var16 = var15.matchesInt32Context();
    com.google.javascript.rhino.ErrorReporter var17 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var17);
    com.google.javascript.rhino.jstype.JSType var19 = null;
    com.google.javascript.rhino.Node var21 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var22 = null;
    var21.setJSDocInfo(var22);
    com.google.javascript.rhino.jstype.FunctionType var24 = var18.createFunctionType(var19, var21);
    com.google.javascript.rhino.jstype.JSType[] var25 = new com.google.javascript.rhino.jstype.JSType[] { var19};
    com.google.javascript.rhino.jstype.FunctionType var26 = var1.createConstructorType((com.google.javascript.rhino.jstype.JSType)var15, var25);
    com.google.javascript.rhino.jstype.FunctionType var27 = var15.toMaybeFunctionType();
    boolean var28 = var27.isNominalType();
    com.google.javascript.rhino.ErrorReporter var29 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var29);
    com.google.javascript.rhino.jstype.JSType var31 = null;
    com.google.javascript.rhino.Node var33 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var34 = null;
    var33.setJSDocInfo(var34);
    com.google.javascript.rhino.jstype.FunctionType var36 = var30.createFunctionType(var31, var33);
    var30.setLastGeneration(true);
    java.lang.Iterable var40 = var30.getEachReferenceTypeWithProperty("goog.abstractMethod");
    com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode var41 = null;
    var30.setResolveMode(var41);
    com.google.javascript.rhino.ErrorReporter var43 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var43);
    com.google.javascript.rhino.jstype.JSType var45 = null;
    com.google.javascript.rhino.Node var47 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var48 = null;
    var47.setJSDocInfo(var48);
    com.google.javascript.rhino.jstype.FunctionType var50 = var44.createFunctionType(var45, var47);
    com.google.javascript.rhino.jstype.JSType var52 = null;
    var44.unregisterPropertyOnType("hi!", var52);
    java.lang.Iterable var55 = var44.getTypesWithProperty("hi!");
    java.lang.Iterable var57 = var44.getTypesWithProperty("hi!");
    com.google.javascript.rhino.ErrorReporter var58 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var58);
    com.google.javascript.rhino.jstype.JSType var60 = null;
    com.google.javascript.rhino.Node var62 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var63 = null;
    var62.setJSDocInfo(var63);
    com.google.javascript.rhino.jstype.FunctionType var65 = var59.createFunctionType(var60, var62);
    com.google.javascript.rhino.jstype.ObjectType var66 = var65.getParentScope();
    com.google.javascript.rhino.ErrorReporter var67 = null;
    com.google.javascript.rhino.jstype.JSTypeRegistry var68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(var67);
    com.google.javascript.rhino.jstype.JSType var69 = null;
    com.google.javascript.rhino.Node var71 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var72 = null;
    var71.setJSDocInfo(var72);
    com.google.javascript.rhino.jstype.FunctionType var74 = var68.createFunctionType(var69, var71);
    boolean var75 = var74.matchesInt32Context();
    com.google.javascript.rhino.jstype.ObjectType var76 = var74.toObjectType();
    com.google.javascript.rhino.jstype.FunctionType var77 = var44.createFunctionTypeWithNewThisType(var65, (com.google.javascript.rhino.jstype.ObjectType)var74);
    java.lang.String var78 = var74.getTemplateTypeName();
    var74.clearCachedValues();
    com.google.javascript.rhino.jstype.FunctionType var80 = var74.toMaybeFunctionType();
    com.google.javascript.rhino.jstype.JSType var82 = var80.getPropertyType("hi!. hi! at hi! line (unknown line) : (unknown column)");
    com.google.javascript.rhino.jstype.JSType var83 = var30.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType)var80);
    com.google.javascript.rhino.jstype.FunctionType var85 = var80.getBindReturnType(1);
    var27.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType)var85);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.google.javascript.rhino.jstype.ObjectType var88 = var27.getTopMostDefiningType("");
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
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

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test166"); }


    com.google.javascript.rhino.Node var1 = com.google.javascript.rhino.IR.name("");
    boolean var2 = var1.isGetElem();
    boolean var3 = var1.isNull();
    com.google.javascript.rhino.Node var4 = com.google.javascript.rhino.IR.returnNode();
    com.google.javascript.rhino.Node var5 = var1.srcref(var4);
    com.google.javascript.rhino.Node var6 = com.google.javascript.rhino.IR.throwNode(var5);
    com.google.javascript.rhino.Node[] var7 = new com.google.javascript.rhino.Node[] { var6};
    com.google.javascript.rhino.Node var8 = com.google.javascript.rhino.IR.block(var7);
    boolean var9 = var8.isQuotedString();
    var8.putBooleanProp((-1), false);
    com.google.javascript.rhino.Node var14 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var15 = null;
    var14.setJSDocInfo(var15);
    boolean var17 = var14.isAssignAdd();
    com.google.javascript.rhino.Node var19 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var20 = null;
    var19.setJSDocInfo(var20);
    boolean var22 = var19.isAssignAdd();
    com.google.javascript.rhino.Node var23 = com.google.javascript.rhino.IR.throwNode(var19);
    com.google.javascript.rhino.Node var24 = var14.srcrefTree(var23);
    com.google.javascript.rhino.Node var26 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var27 = null;
    var26.setJSDocInfo(var27);
    boolean var29 = var26.isAssignAdd();
    com.google.javascript.rhino.Node var31 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var32 = null;
    var31.setJSDocInfo(var32);
    boolean var34 = var31.isAssignAdd();
    com.google.javascript.rhino.Node var35 = com.google.javascript.rhino.IR.throwNode(var31);
    com.google.javascript.rhino.Node var36 = var26.srcrefTree(var35);
    com.google.javascript.rhino.Node var38 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var39 = null;
    var38.setJSDocInfo(var39);
    boolean var41 = var38.isAssignAdd();
    com.google.javascript.rhino.Node var43 = com.google.javascript.rhino.IR.name("");
    com.google.javascript.rhino.JSDocInfo var44 = null;
    var43.setJSDocInfo(var44);
    boolean var46 = var43.isAssignAdd();
    com.google.javascript.rhino.Node var47 = com.google.javascript.rhino.IR.throwNode(var43);
    com.google.javascript.rhino.Node var48 = var38.srcrefTree(var47);
    var26.addChildrenToFront(var38);
    boolean var50 = var24.hasChild(var26);
    var26.setWasEmptyNode(true);
    boolean var53 = var26.isHook();
    com.google.javascript.rhino.Node var54 = var8.srcrefTree(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (capt
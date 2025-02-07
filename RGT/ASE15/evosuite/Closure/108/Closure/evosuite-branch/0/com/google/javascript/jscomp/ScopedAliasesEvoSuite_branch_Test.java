/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:14:09 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.DefaultPassConfig;
import com.google.javascript.jscomp.PreprocessorSymbolTable;
import com.google.javascript.jscomp.ScopedAliases;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class ScopedAliasesEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      DefaultPassConfig defaultPassConfig0 = compiler0.ensureDefaultPassConfig();
      assertNotNull(defaultPassConfig0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      PreprocessorSymbolTable preprocessorSymbolTable0 = defaultPassConfig0.getPreprocessorSymbolTable();
      assertNull(preprocessorSymbolTable0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      CompilerOptions.AliasTransformationHandler compilerOptions_AliasTransformationHandler0 = null;
      ScopedAliases scopedAliases0 = new ScopedAliases(compiler0, preprocessorSymbolTable0, compilerOptions_AliasTransformationHandler0);
      assertNotNull(scopedAliases0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      int int0 = 2968;
      Node node0 = new Node(int0);
      assertNotNull(node0);
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isGetProp());
      assertEquals(-1, node0.getCharno());
      assertEquals(0, node0.getChangeTime());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(false, node0.isIf());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isCast());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isQuotedString());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isFalse());
      assertEquals(2968, node0.getType());
      assertEquals(false, node0.isDelProp());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isWith());
      
      Node node1 = new Node(int0, node0);
      assertNotSame(node1, node0);
      assertNotSame(node0, node1);
      assertNotNull(node1);
      assertEquals(false, node1.isBlock());
      assertEquals(false, node1.isScript());
      assertEquals(false, node1.isNull());
      assertEquals(true, node1.hasChildren());
      assertEquals(false, node1.isGetterDef());
      assertEquals(false, node1.isName());
      assertEquals(false, node1.isAdd());
      assertEquals(false, node1.isParamList());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.isDebugger());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(false, node1.isTry());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(false, node1.isWith());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(true, node1.hasOneChild());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node1.isDo());
      assertEquals(false, node1.isNew());
      assertEquals(false, node1.isVoid());
      assertEquals(-1, node1.getLineno());
      assertEquals(false, node1.isDefaultCase());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(false, node1.isCast());
      assertEquals(false, node1.isEmpty());
      assertEquals(false, node1.isBreak());
      assertEquals(false, node1.isNE());
      assertEquals(0, node1.getLength());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(1, node1.getChildCount());
      assertEquals(false, node1.isCall());
      assertEquals(false, node1.isContinue());
      assertEquals(false, node1.isObjectLit());
      assertEquals(false, node1.isIf());
      assertEquals(false, node1.isGetProp());
      assertEquals(2968, node1.getType());
      assertEquals(false, node1.isThrow());
      assertEquals(false, node1.isOnlyModifiesArgumentsCall());
      assertEquals(false, node1.isFor());
      assertEquals(false, node1.isIn());
      assertEquals(0, node1.getChangeTime());
      assertEquals(false, node1.isLabel());
      assertEquals(false, node1.isAnd());
      assertEquals(true, node1.mayMutateGlobalStateOrThrow());
      assertEquals(false, node1.isReturn());
      assertEquals(false, node1.isNumber());
      assertEquals(false, node1.isString());
      assertEquals(false, node1.isDelProp());
      assertEquals(false, node1.isSwitch());
      assertEquals(false, node1.isWhile());
      assertEquals(false, node1.isFunction());
      assertEquals(false, node1.isSetterDef());
      assertEquals(false, node1.isVar());
      assertEquals(false, node1.isCatch());
      assertEquals(false, node1.isArrayLit());
      assertEquals(false, node1.isTrue());
      assertEquals(false, node1.isGetElem());
      assertEquals(false, node1.isRegExp());
      assertEquals(false, node1.isFromExterns());
      assertEquals(false, node1.isInstanceOf());
      assertEquals(false, node1.isAssign());
      assertEquals(true, node1.mayMutateArguments());
      assertEquals(false, node1.isInc());
      assertEquals(false, node1.isFalse());
      assertEquals(false, node1.isNot());
      assertEquals(false, node1.isComma());
      assertEquals(false, node1.isTypeOf());
      assertNull(node1.getSourceFileName());
      assertEquals(false, node1.isDec());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node1.isStringKey());
      assertEquals(-1, node1.getSourcePosition());
      assertEquals(false, node1.isLabelName());
      assertEquals(false, node1.isThis());
      assertEquals(false, node1.isExprResult());
      assertEquals(false, node1.isCase());
      assertEquals(-1, node1.getCharno());
      assertEquals(false, node1.isAssignAdd());
      assertEquals(false, node1.isHook());
      assertEquals(false, node1.isOr());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isGetProp());
      assertEquals(-1, node0.getCharno());
      assertEquals(0, node0.getChangeTime());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(false, node0.isIf());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isCast());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isQuotedString());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isFalse());
      assertEquals(2968, node0.getType());
      assertEquals(false, node0.isDelProp());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isWith());
      assertFalse(node1.equals((Object)node0));
      assertFalse(node0.equals((Object)node1));
      
      scopedAliases0.process(node0, node0);
      assertNotSame(node0, node1);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isGetProp());
      assertEquals(-1, node0.getCharno());
      assertEquals(0, node0.getChangeTime());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(false, node0.isIf());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isCast());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isQuotedString());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isFalse());
      assertEquals(2968, node0.getType());
      assertEquals(false, node0.isDelProp());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isWith());
      assertFalse(node0.equals((Object)node1));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      DefaultPassConfig defaultPassConfig0 = compiler0.ensureDefaultPassConfig();
      assertNotNull(defaultPassConfig0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      PreprocessorSymbolTable preprocessorSymbolTable0 = defaultPassConfig0.getPreprocessorSymbolTable();
      assertNull(preprocessorSymbolTable0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      CompilerOptions.AliasTransformationHandler compilerOptions_AliasTransformationHandler0 = null;
      ScopedAliases scopedAliases0 = new ScopedAliases(compiler0, preprocessorSymbolTable0, compilerOptions_AliasTransformationHandler0);
      assertNotNull(scopedAliases0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      int int0 = 2968;
      Node node0 = new Node(int0);
      assertNotNull(node0);
      assertEquals(false, node0.isVarArgs());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isInc());
      assertEquals(2968, node0.getType());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isNot());
      assertEquals(0, node0.getLength());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isWith());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isCatch());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isSetterDef());
      assertEquals(-1, node0.getLineno());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isOr());
      assertEquals(0, node0.getChangeTime());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isIf());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isDefaultCase());
      
      scopedAliases0.process(node0, node0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, node0.isVarArgs());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isInc());
      assertEquals(2968, node0.getType());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isNot());
      assertEquals(0, node0.getLength());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isWith());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isCatch());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isSetterDef());
      assertEquals(-1, node0.getLineno());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isOr());
      assertEquals(0, node0.getChangeTime());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isIf());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isDefaultCase());
  }
}

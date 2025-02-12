/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:41:41 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.NameAnalyzer;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class NameAnalyzerEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      boolean boolean0 = false;
      NameAnalyzer nameAnalyzer0 = new NameAnalyzer(compiler0, boolean0);
      assertNotNull(nameAnalyzer0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      double double0 = (-801.7118511239948);
      Node node0 = Node.newNumber(double0);
      assertNotNull(node0);
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isTry());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isCall());
      assertEquals(true, node0.isNumber());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isDebugger());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isAssign());
      assertEquals(0, node0.getChangeTime());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isGetterDef());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isTrue());
      assertEquals(39, node0.getType());
      assertEquals(false, node0.isString());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(false, node0.isFalse());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isThis());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isDec());
      
      nameAnalyzer0.process(node0, node0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isTry());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isCall());
      assertEquals(true, node0.isNumber());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isDebugger());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isAssign());
      assertEquals(0, node0.getChangeTime());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isGetterDef());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isTrue());
      assertEquals(39, node0.getType());
      assertEquals(false, node0.isString());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(false, node0.isFalse());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isThis());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isDec());
      
      nameAnalyzer0.process(node0, node0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isTry());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isCall());
      assertEquals(true, node0.isNumber());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isDebugger());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isAssign());
      assertEquals(0, node0.getChangeTime());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isGetterDef());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isTrue());
      assertEquals(39, node0.getType());
      assertEquals(false, node0.isString());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(false, node0.isFalse());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isThis());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isDec());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      boolean boolean0 = true;
      NameAnalyzer nameAnalyzer0 = new NameAnalyzer(compiler0, boolean0);
      assertNotNull(nameAnalyzer0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      int int0 = (-315);
      String string0 = nameAnalyzer0.getHtmlReport();
      assertNotNull(string0);
      assertEquals("<html><body><style type=\"text/css\">body, td, p {font-family: Arial; font-size: 83%} ul {margin-top:2px; margin-left:0px; padding-left:1em;} li {margin-top:3px; margin-left:24px; padding-left:0px;padding-bottom: 4px}</style>OVERALL STATS<ul><li>Total Names: 0</li>\n<li>Total Classes: 0</li>\n<li>Total Static Functions: 0</li>\n<li>Referenced Names: 0</li>\n<li>Referenced Classes: 0</li>\n<li>Referenced Functions: 0</li>\n</ul>ALL NAMES<ul>\n</ul></body></html>", string0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      Node node0 = Node.newString(int0, string0);
      assertNotNull(node0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isIn());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isExprResult());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isRegExp());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isBlock());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isComma());
      assertEquals(-315, node0.getType());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isString());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isFromExterns());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isThrow());
      assertEquals(0, node0.getChangeTime());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOptionalArg());
      
      nameAnalyzer0.process(node0, node0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isIn());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isExprResult());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isRegExp());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isBlock());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isComma());
      assertEquals(-315, node0.getType());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isString());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isFromExterns());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isThrow());
      assertEquals(0, node0.getChangeTime());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOptionalArg());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      boolean boolean0 = false;
      NameAnalyzer nameAnalyzer0 = new NameAnalyzer(compiler0, boolean0);
      assertNotNull(nameAnalyzer0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      
      double double0 = (-801.7118511239948);
      Node node0 = Node.newNumber(double0);
      assertNotNull(node0);
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isAdd());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isFromExterns());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isName());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(0, node0.getChangeTime());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isFunction());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isGetProp());
      assertEquals(39, node0.getType());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isLabel());
      assertEquals(0, node0.getChildCount());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(true, node0.isNumber());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.hasChildren());
      
      nameAnalyzer0.process(node0, node0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isAdd());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isFromExterns());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isName());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(0, node0.getChangeTime());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isFunction());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isGetProp());
      assertEquals(39, node0.getType());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isLabel());
      assertEquals(0, node0.getChildCount());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(true, node0.isNumber());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.hasChildren());
      
      String string0 = nameAnalyzer0.getHtmlReport();
      assertNotNull(string0);
      assertEquals("<html><body><style type=\"text/css\">body, td, p {font-family: Arial; font-size: 83%} ul {margin-top:2px; margin-left:0px; padding-left:1em;} li {margin-top:3px; margin-left:24px; padding-left:0px;padding-bottom: 4px}</style>OVERALL STATS<ul><li>Total Names: 2</li>\n<li>Total Classes: 0</li>\n<li>Total Static Functions: 2</li>\n<li>Referenced Names: 2</li>\n<li>Referenced Classes: 0</li>\n<li>Referenced Functions: 2</li>\n</ul>ALL NAMES<ul>\n<li><a name=\"Function\">Function</a><ul></li></ul></li><li><a name=\"window\">window</a><ul></li></ul></li></ul></body></html>", string0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
  }
}

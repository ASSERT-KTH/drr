/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 23:51:34 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.CollapseVariableDeclarations;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.JSSourceFile;
import com.google.javascript.jscomp.SourceFile;
import com.google.javascript.rhino.Node;
import java.io.File;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

 
public class CollapseVariableDeclarationsEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      CollapseVariableDeclarations collapseVariableDeclarations0 = new CollapseVariableDeclarations(compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(collapseVariableDeclarations0);
      
      String string0 = "=Bi8N>";
      MockFile mockFile0 = (MockFile)MockFile.createTempFile(string0, string0);
      assertNotNull(mockFile0);
      
      Charset charset0 = Charset.defaultCharset();
      assertEquals(true, charset0.isRegistered());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.name());
      assertEquals("UTF-8", charset0.toString());
      assertEquals("UTF-8", charset0.displayName());
      assertNotNull(charset0);
      
      JSSourceFile jSSourceFile0 = JSSourceFile.fromFile((File) mockFile0, charset0);
      assertEquals("/tmp/=Bi8N>0=Bi8N>", jSSourceFile0.toString());
      assertEquals("/tmp/=Bi8N>0=Bi8N>", jSSourceFile0.getName());
      assertEquals("/tmp/=Bi8N>0=Bi8N>", jSSourceFile0.getOriginalPath());
      assertEquals(false, jSSourceFile0.isExtern());
      assertEquals(true, charset0.isRegistered());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.name());
      assertEquals("UTF-8", charset0.toString());
      assertEquals("UTF-8", charset0.displayName());
      assertNotNull(jSSourceFile0);
      
      Node node0 = compiler0.parse((SourceFile) jSSourceFile0);
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isRegExp());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isNew());
      assertEquals(true, node0.isScript());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isLabel());
      assertEquals(0, node0.getCharno());
      assertEquals(0, node0.getLength());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isDec());
      assertEquals("/tmp/=Bi8N>0=Bi8N>", node0.getSourceFileName());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isHook());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isString());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isCatch());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals("/tmp/=Bi8N>0=Bi8N>", jSSourceFile0.toString());
      assertEquals("/tmp/=Bi8N>0=Bi8N>", jSSourceFile0.getName());
      assertEquals("/tmp/=Bi8N>0=Bi8N>", jSSourceFile0.getOriginalPath());
      assertEquals(false, jSSourceFile0.isExtern());
      assertEquals(true, charset0.isRegistered());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.name());
      assertEquals("UTF-8", charset0.toString());
      assertEquals("UTF-8", charset0.displayName());
      assertNotNull(node0);
      
      collapseVariableDeclarations0.process(node0, node0);
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isRegExp());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isNew());
      assertEquals(true, node0.isScript());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isLabel());
      assertEquals(0, node0.getCharno());
      assertEquals(0, node0.getLength());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isDec());
      assertEquals("/tmp/=Bi8N>0=Bi8N>", node0.getSourceFileName());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isHook());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isString());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isCatch());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals("/tmp/=Bi8N>0=Bi8N>", jSSourceFile0.toString());
      assertEquals("/tmp/=Bi8N>0=Bi8N>", jSSourceFile0.getName());
      assertEquals("/tmp/=Bi8N>0=Bi8N>", jSSourceFile0.getOriginalPath());
      assertEquals(false, jSSourceFile0.isExtern());
      assertEquals(true, charset0.isRegistered());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.name());
      assertEquals("UTF-8", charset0.toString());
      assertEquals("UTF-8", charset0.displayName());
  }
}

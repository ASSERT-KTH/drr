/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:41:34 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.common.base.Supplier;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.DefaultPassConfig;
import com.google.javascript.jscomp.ErrorManager;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.jscomp.PrintStreamErrorManager;
import com.google.javascript.jscomp.TypeValidator;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

 
public class CompilerEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      String string0 = compiler0.getAstDotGraph();
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Compiler.CodeBuilder compiler_CodeBuilder0 = new Compiler.CodeBuilder();
      assertNotNull(compiler_CodeBuilder0);
      
      String string0 = "yN";
      boolean boolean0 = compiler_CodeBuilder0.endsWith(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Compiler.CodeBuilder compiler_CodeBuilder0 = new Compiler.CodeBuilder();
      assertNotNull(compiler_CodeBuilder0);
      
      String string0 = "yN";
      Compiler.CodeBuilder compiler_CodeBuilder1 = compiler_CodeBuilder0.append(string0);
      assertSame(compiler_CodeBuilder0, compiler_CodeBuilder1);
      assertSame(compiler_CodeBuilder1, compiler_CodeBuilder0);
      assertNotNull(compiler_CodeBuilder1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      // Undeclared exception!
      try {
        TypeValidator typeValidator0 = compiler0.getTypeValidator();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      LoggerErrorManager loggerErrorManager0 = (LoggerErrorManager)compiler0.getErrorManager();
      assertNotNull(loggerErrorManager0);
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      
      DefaultPassConfig defaultPassConfig0 = compiler0.ensureDefaultPassConfig();
      assertNotNull(defaultPassConfig0);
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      
      CompilerOptions compilerOptions0 = defaultPassConfig0.options;
      assertFalse(compilerOptions0.inlineAnonymousFunctionExpressions);
      assertFalse(compilerOptions0.markNoSideEffectCalls);
      assertFalse(compilerOptions0.inferTypesInGlobalScope);
      assertFalse(compilerOptions0.lineBreak);
      assertFalse(compilerOptions0.closurePass);
      assertFalse(compilerOptions0.collapseVariableDeclarations);
      assertFalse(compilerOptions0.printInputDelimiter);
      assertFalse(compilerOptions0.crossModuleMethodMotion);
      assertFalse(compilerOptions0.optimizeCalls);
      assertFalse(compilerOptions0.inlineGetters);
      assertFalse(compilerOptions0.specializeInitialModule);
      assertFalse(compilerOptions0.devirtualizePrototypeMethods);
      assertFalse(compilerOptions0.allowLegacyJsMessages);
      assertFalse(compilerOptions0.smartNameRemoval);
      assertFalse(compilerOptions0.collapseProperties);
      assertFalse(compilerOptions0.optimizeArgumentsArray);
      assertFalse(compilerOptions0.deadAssignmentElimination);
      assertFalse(compilerOptions0.tightenTypes);
      assertFalse(compilerOptions0.strictMessageReplacement);
      assertFalse(compilerOptions0.inlineFunctions);
      assertFalse(compilerOptions0.coalesceVariableNames);
      assertFalse(compilerOptions0.checkSymbols);
      assertFalse(compilerOptions0.disambiguateProperties);
      assertFalse(compilerOptions0.foldConstants);
      assertFalse(compilerOptions0.flowSensitiveInlineVariables);
      assertFalse(compilerOptions0.reserveRawExports);
      assertFalse(compilerOptions0.optimizeReturns);
      assertFalse(compilerOptions0.generateExports);
      assertFalse(compilerOptions0.aliasAllStrings);
      assertFalse(compilerOptions0.prettyPrint);
      assertFalse(compilerOptions0.exportTestFunctions);
      assertFalse(compilerOptions0.groupVariableDeclarations);
      assertFalse(compilerOptions0.removeUnusedVars);
      assertFalse(compilerOptions0.optimizeParameters);
      assertFalse(compilerOptions0.moveFunctionDeclarations);
      assertFalse(compilerOptions0.inlineLocalFunctions);
      assertFalse(compilerOptions0.removeTryCatchFinally);
      assertFalse(compilerOptions0.generatePseudoNames);
      assertFalse(compilerOptions0.markAsCompiled);
      assertFalse(compilerOptions0.checkDuplicateMessages);
      assertFalse(compilerOptions0.removeEmptyFunctions);
      assertFalse(compilerOptions0.removeUnusedPrototypeProperties);
      assertFalse(compilerOptions0.checkCaja);
      assertFalse(compilerOptions0.recordFunctionInformation);
      assertFalse(compilerOptions0.ideMode);
      assertFalse(compilerOptions0.rewriteFunctionExpressions);
      assertFalse(compilerOptions0.aliasExternals);
      assertFalse(compilerOptions0.instrumentForCoverageOnly);
      assertFalse(compilerOptions0.convertToDottedProperties);
      assertFalse(compilerOptions0.removeUnusedPrototypePropertiesInExterns);
      assertFalse(compilerOptions0.ambiguateProperties);
      assertFalse(compilerOptions0.checkSuspiciousCode);
      assertFalse(compilerOptions0.checkEs5Strict);
      assertFalse(compilerOptions0.collapseAnonymousFunctions);
      assertFalse(compilerOptions0.inlineConstantVars);
      assertFalse(compilerOptions0.ignoreCajaProperties);
      assertFalse(compilerOptions0.collapseObjectLiterals);
      assertFalse(compilerOptions0.inlineLocalVariables);
      assertFalse(compilerOptions0.decomposeExpressions);
      assertFalse(compilerOptions0.removeDeadCode);
      assertFalse(compilerOptions0.instrumentForCoverage);
      assertFalse(compilerOptions0.removeUnusedLocalVars);
      assertFalse(compilerOptions0.checkTypes);
      assertFalse(compilerOptions0.checkTypedPropertyCalls);
      assertFalse(compilerOptions0.aliasKeywords);
      assertFalse(compilerOptions0.checkControlStructures);
      assertFalse(compilerOptions0.crossModuleCodeMotion);
      assertFalse(compilerOptions0.computeFunctionSideEffects);
      assertFalse(compilerOptions0.extractPrototypeMemberDeclarations);
      assertFalse(compilerOptions0.gatherCssNames);
      assertFalse(compilerOptions0.labelRenaming);
      assertFalse(compilerOptions0.inlineVariables);
      assertNotNull(compilerOptions0);
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compilerOptions0.shouldColorizeErrorOutput());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compilerOptions0.getLanguageIn());
      assertEquals(CompilerOptions.TweakProcessing.OFF, compilerOptions0.getTweakProcessing());
      assertNull(compilerOptions0.getLanguageOut());
      assertEquals(false, compilerOptions0.getInferTypes());
      assertEquals(false, compilerOptions0.isExternExportsEnabled());
      assertEquals(false, compilerOptions0.isAssumeStrictThis());
      
      compiler0.startPass(compilerOptions0.jsOutputFile);
      assertFalse(compilerOptions0.inlineAnonymousFunctionExpressions);
      assertFalse(compilerOptions0.markNoSideEffectCalls);
      assertFalse(compilerOptions0.inferTypesInGlobalScope);
      assertFalse(compilerOptions0.lineBreak);
      assertFalse(compilerOptions0.closurePass);
      assertFalse(compilerOptions0.collapseVariableDeclarations);
      assertFalse(compilerOptions0.printInputDelimiter);
      assertFalse(compilerOptions0.crossModuleMethodMotion);
      assertFalse(compilerOptions0.optimizeCalls);
      assertFalse(compilerOptions0.inlineGetters);
      assertFalse(compilerOptions0.specializeInitialModule);
      assertFalse(compilerOptions0.devirtualizePrototypeMethods);
      assertFalse(compilerOptions0.allowLegacyJsMessages);
      assertFalse(compilerOptions0.smartNameRemoval);
      assertFalse(compilerOptions0.collapseProperties);
      assertFalse(compilerOptions0.optimizeArgumentsArray);
      assertFalse(compilerOptions0.deadAssignmentElimination);
      assertFalse(compilerOptions0.tightenTypes);
      assertFalse(compilerOptions0.strictMessageReplacement);
      assertFalse(compilerOptions0.inlineFunctions);
      assertFalse(compilerOptions0.coalesceVariableNames);
      assertFalse(compilerOptions0.checkSymbols);
      assertFalse(compilerOptions0.disambiguateProperties);
      assertFalse(compilerOptions0.foldConstants);
      assertFalse(compilerOptions0.flowSensitiveInlineVariables);
      assertFalse(compilerOptions0.reserveRawExports);
      assertFalse(compilerOptions0.optimizeReturns);
      assertFalse(compilerOptions0.generateExports);
      assertFalse(compilerOptions0.aliasAllStrings);
      assertFalse(compilerOptions0.prettyPrint);
      assertFalse(compilerOptions0.exportTestFunctions);
      assertFalse(compilerOptions0.groupVariableDeclarations);
      assertFalse(compilerOptions0.removeUnusedVars);
      assertFalse(compilerOptions0.optimizeParameters);
      assertFalse(compilerOptions0.moveFunctionDeclarations);
      assertFalse(compilerOptions0.inlineLocalFunctions);
      assertFalse(compilerOptions0.removeTryCatchFinally);
      assertFalse(compilerOptions0.generatePseudoNames);
      assertFalse(compilerOptions0.markAsCompiled);
      assertFalse(compilerOptions0.checkDuplicateMessages);
      assertFalse(compilerOptions0.removeEmptyFunctions);
      assertFalse(compilerOptions0.removeUnusedPrototypeProperties);
      assertFalse(compilerOptions0.checkCaja);
      assertFalse(compilerOptions0.recordFunctionInformation);
      assertFalse(compilerOptions0.ideMode);
      assertFalse(compilerOptions0.rewriteFunctionExpressions);
      assertFalse(compilerOptions0.aliasExternals);
      assertFalse(compilerOptions0.instrumentForCoverageOnly);
      assertFalse(compilerOptions0.convertToDottedProperties);
      assertFalse(compilerOptions0.removeUnusedPrototypePropertiesInExterns);
      assertFalse(compilerOptions0.ambiguateProperties);
      assertFalse(compilerOptions0.checkSuspiciousCode);
      assertFalse(compilerOptions0.checkEs5Strict);
      assertFalse(compilerOptions0.collapseAnonymousFunctions);
      assertFalse(compilerOptions0.inlineConstantVars);
      assertFalse(compilerOptions0.ignoreCajaProperties);
      assertFalse(compilerOptions0.collapseObjectLiterals);
      assertFalse(compilerOptions0.inlineLocalVariables);
      assertFalse(compilerOptions0.decomposeExpressions);
      assertFalse(compilerOptions0.removeDeadCode);
      assertFalse(compilerOptions0.instrumentForCoverage);
      assertFalse(compilerOptions0.removeUnusedLocalVars);
      assertFalse(compilerOptions0.checkTypes);
      assertFalse(compilerOptions0.checkTypedPropertyCalls);
      assertFalse(compilerOptions0.aliasKeywords);
      assertFalse(compilerOptions0.checkControlStructures);
      assertFalse(compilerOptions0.crossModuleCodeMotion);
      assertFalse(compilerOptions0.computeFunctionSideEffects);
      assertFalse(compilerOptions0.extractPrototypeMemberDeclarations);
      assertFalse(compilerOptions0.gatherCssNames);
      assertFalse(compilerOptions0.labelRenaming);
      assertFalse(compilerOptions0.inlineVariables);
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compilerOptions0.shouldColorizeErrorOutput());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compilerOptions0.getLanguageIn());
      assertEquals(CompilerOptions.TweakProcessing.OFF, compilerOptions0.getTweakProcessing());
      assertNull(compilerOptions0.getLanguageOut());
      assertEquals(false, compilerOptions0.getInferTypes());
      assertEquals(false, compilerOptions0.isExternExportsEnabled());
      assertEquals(false, compilerOptions0.isAssumeStrictThis());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      // Undeclared exception!
      try {
        compiler0.processDefines();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      assertNotNull(supplier0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      assertNotNull(byteArrayOutputStream0);
      assertEquals("", byteArrayOutputStream0.toString());
      assertEquals(0, byteArrayOutputStream0.size());
      
      boolean boolean0 = true;
      MockPrintStream mockPrintStream0 = new MockPrintStream((OutputStream) byteArrayOutputStream0, boolean0);
      assertNotNull(mockPrintStream0);
      assertEquals("", byteArrayOutputStream0.toString());
      assertEquals(0, byteArrayOutputStream0.size());
      
      PrintStreamErrorManager printStreamErrorManager0 = new PrintStreamErrorManager((PrintStream) mockPrintStream0);
      assertNotNull(printStreamErrorManager0);
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      assertEquals("", byteArrayOutputStream0.toString());
      assertEquals(0, byteArrayOutputStream0.size());
      
      Compiler compiler0 = new Compiler((ErrorManager) printStreamErrorManager0);
      assertNotNull(compiler0);
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals("", byteArrayOutputStream0.toString());
      assertEquals(0, byteArrayOutputStream0.size());
      
      int int0 = compiler0.getErrorCount();
      assertEquals(0, int0);
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals("", byteArrayOutputStream0.toString());
      assertEquals(0, byteArrayOutputStream0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      assertNotNull(byteArrayOutputStream0);
      assertEquals(0, byteArrayOutputStream0.size());
      assertEquals("", byteArrayOutputStream0.toString());
      
      boolean boolean0 = true;
      MockPrintStream mockPrintStream0 = new MockPrintStream((OutputStream) byteArrayOutputStream0, boolean0);
      assertNotNull(mockPrintStream0);
      assertEquals(0, byteArrayOutputStream0.size());
      assertEquals("", byteArrayOutputStream0.toString());
      
      PrintStreamErrorManager printStreamErrorManager0 = new PrintStreamErrorManager((PrintStream) mockPrintStream0);
      assertNotNull(printStreamErrorManager0);
      assertEquals(0, byteArrayOutputStream0.size());
      assertEquals("", byteArrayOutputStream0.toString());
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      
      Compiler compiler0 = new Compiler((ErrorManager) printStreamErrorManager0);
      assertNotNull(compiler0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, byteArrayOutputStream0.size());
      assertEquals("", byteArrayOutputStream0.toString());
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      
      Compiler.IntermediateState compiler_IntermediateState0 = compiler0.getState();
      assertNotNull(compiler_IntermediateState0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, byteArrayOutputStream0.size());
      assertEquals("", byteArrayOutputStream0.toString());
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, printStreamErrorManager0.getErrorCount());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      // Undeclared exception!
      try {
        String string0 = compiler0.toSource();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Compiler.CodeBuilder compiler_CodeBuilder0 = new Compiler.CodeBuilder();
      assertNotNull(compiler_CodeBuilder0);
      
      String string0 = compiler_CodeBuilder0.toString();
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Compiler.CodeBuilder compiler_CodeBuilder0 = new Compiler.CodeBuilder();
      assertNotNull(compiler_CodeBuilder0);
      
      int int0 = compiler_CodeBuilder0.getColumnIndex();
      assertEquals(0, int0);
  }
}

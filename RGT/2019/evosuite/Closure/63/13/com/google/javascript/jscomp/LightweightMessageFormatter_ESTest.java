/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 23 01:56:44 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.CheckPropertyOrder;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.DiagnosticType;
import com.google.javascript.jscomp.JSError;
import com.google.javascript.jscomp.LightweightMessageFormatter;
import com.google.javascript.jscomp.RenameProperties;
import com.google.javascript.jscomp.SimpleRegion;
import com.google.javascript.jscomp.SourceExcerptProvider;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LightweightMessageFormatter_ESTest extends LightweightMessageFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      String string0 = lightweightMessageFormatter_LineNumberingFormatter0.formatLine("}e/WwthD", (-2193));
      assertEquals("}e/WwthD", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      SourceExcerptProvider.SourceExcerpt sourceExcerptProvider_SourceExcerpt0 = SourceExcerptProvider.SourceExcerpt.REGION;
      LightweightMessageFormatter lightweightMessageFormatter0 = new LightweightMessageFormatter(compiler0, sourceExcerptProvider_SourceExcerpt0);
      JSError jSError0 = JSError.make("@Ty&XHo Ls-2\"[86Bc", (-371), (-371), compiler0.MOTION_ITERATIONS_ERROR, (String[]) null);
      String string0 = lightweightMessageFormatter0.formatError(jSError0);
      assertEquals("@Ty&XHo Ls-2\"[86Bc: ERROR - Exceeded max number of code motion iterations: {0}\n", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LightweightMessageFormatter lightweightMessageFormatter0 = LightweightMessageFormatter.withoutSource();
      DiagnosticType diagnosticType0 = CheckPropertyOrder.UNASSIGNED_PROPERTY;
      JSError jSError0 = JSError.make("", (Node) null, diagnosticType0, (String[]) null);
      String string0 = lightweightMessageFormatter0.formatWarning(jSError0);
      assertEquals(": WARNING - not all control paths assign property {1} in function {0}\n", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LightweightMessageFormatter lightweightMessageFormatter0 = null;
      try {
        lightweightMessageFormatter0 = new LightweightMessageFormatter((SourceExcerptProvider) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      SourceExcerptProvider.SourceExcerpt sourceExcerptProvider_SourceExcerpt0 = SourceExcerptProvider.SourceExcerpt.REGION;
      LightweightMessageFormatter lightweightMessageFormatter0 = new LightweightMessageFormatter(compiler0, sourceExcerptProvider_SourceExcerpt0);
      String[] stringArray0 = new String[6];
      JSError jSError0 = JSError.make(compiler0.OPTIMIZE_LOOP_ERROR, stringArray0);
      String string0 = lightweightMessageFormatter0.formatWarning(jSError0);
      assertEquals("WARNING - Exceeded max number of optimization iterations: null\n", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LightweightMessageFormatter lightweightMessageFormatter0 = LightweightMessageFormatter.withoutSource();
      CheckLevel checkLevel0 = CheckLevel.OFF;
      DiagnosticType diagnosticType0 = RenameProperties.BAD_CALL;
      String[] stringArray0 = new String[4];
      JSError jSError0 = JSError.make("| ", 61, (-2695), checkLevel0, diagnosticType0, stringArray0);
      String string0 = lightweightMessageFormatter0.formatWarning(jSError0);
      assertEquals("| :61: WARNING - Bad JSCompiler_renameProperty call - argument must be a string literal\n", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      SimpleRegion simpleRegion0 = new SimpleRegion(16, 35, ": ERROR - not all control paths assign property {1} in function {0}\n");
      String string0 = lightweightMessageFormatter_LineNumberingFormatter0.formatRegion(simpleRegion0);
      assertNotNull(string0);
      assertEquals("  16| : ERROR - not all control paths assign property {1} in function {0}", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      SimpleRegion simpleRegion0 = new SimpleRegion((-371), 147, "");
      String string0 = lightweightMessageFormatter_LineNumberingFormatter0.formatRegion(simpleRegion0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      SimpleRegion simpleRegion0 = new SimpleRegion(1000, 1000, "8>E");
      String string0 = lightweightMessageFormatter_LineNumberingFormatter0.formatRegion(simpleRegion0);
      assertNotNull(string0);
      assertEquals("  1000| 8>E", string0);
  }
}

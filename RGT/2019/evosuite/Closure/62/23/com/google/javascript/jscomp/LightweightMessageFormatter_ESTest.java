/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 23 01:13:14 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.DiagnosticType;
import com.google.javascript.jscomp.JSError;
import com.google.javascript.jscomp.LightweightMessageFormatter;
import com.google.javascript.jscomp.ProcessClosurePrimitives;
import com.google.javascript.jscomp.Region;
import com.google.javascript.jscomp.ReplaceCssNames;
import com.google.javascript.jscomp.SimpleRegion;
import com.google.javascript.jscomp.SourceExcerptProvider;
import com.google.javascript.jscomp.StrictModeCheck;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LightweightMessageFormatter_ESTest extends LightweightMessageFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      String string0 = lightweightMessageFormatter_LineNumberingFormatter0.formatLine("Mq wOr!", 0);
      assertEquals("Mq wOr!", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LightweightMessageFormatter lightweightMessageFormatter0 = LightweightMessageFormatter.withoutSource();
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      DiagnosticType diagnosticType0 = ReplaceCssNames.STRING_LITERAL_EXPECTED_ERROR;
      JSError jSError0 = JSError.make("S&cYLbiOqk;", 1832, 284, checkLevel0, diagnosticType0, (String[]) null);
      String string0 = lightweightMessageFormatter0.formatError(jSError0);
      assertEquals("S&cYLbiOqk;:1832: ERROR - goog.getCssName called with invalid argument, string literal expected.  Was \"{0}\".\n", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      SourceExcerptProvider.SourceExcerpt sourceExcerptProvider_SourceExcerpt0 = SourceExcerptProvider.SourceExcerpt.LINE;
      LightweightMessageFormatter lightweightMessageFormatter0 = new LightweightMessageFormatter(compiler0, sourceExcerptProvider_SourceExcerpt0);
      // Undeclared exception!
      try { 
        lightweightMessageFormatter0.formatError((JSError) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.LightweightMessageFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LightweightMessageFormatter lightweightMessageFormatter0 = LightweightMessageFormatter.withoutSource();
      Node node0 = Node.newString("");
      DiagnosticType diagnosticType0 = ProcessClosurePrimitives.FUNCTION_NAMESPACE_ERROR;
      JSError jSError0 = JSError.make("", node0, diagnosticType0, (String[]) null);
      String string0 = lightweightMessageFormatter0.formatWarning(jSError0);
      assertEquals(": WARNING - \"{0}\" cannot be both provided and declared as a function\n", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
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
  public void test5()  throws Throwable  {
      LightweightMessageFormatter lightweightMessageFormatter0 = LightweightMessageFormatter.withoutSource();
      DiagnosticType diagnosticType0 = StrictModeCheck.DUPLICATE_OBJECT_KEY;
      JSError jSError0 = JSError.make(diagnosticType0, (String[]) null);
      String string0 = lightweightMessageFormatter0.formatWarning(jSError0);
      assertEquals("WARNING - object literals cannot contain duplicate keys in ES5 strict mode\n", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      SimpleRegion simpleRegion0 = new SimpleRegion(0, (-1239), "");
      String string0 = lightweightMessageFormatter_LineNumberingFormatter0.formatRegion(simpleRegion0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      String string0 = lightweightMessageFormatter_LineNumberingFormatter0.formatRegion((Region) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      SimpleRegion simpleRegion0 = new SimpleRegion(113, 113, "*$7^T[g*>s#u3(`FIe;");
      String string0 = lightweightMessageFormatter_LineNumberingFormatter0.formatRegion(simpleRegion0);
      assertEquals("  113| *$7^T[g*>s#u3(`FIe;", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      SimpleRegion simpleRegion0 = new SimpleRegion(6, 6, "^\n");
      String string0 = lightweightMessageFormatter_LineNumberingFormatter0.formatRegion(simpleRegion0);
      assertEquals("  6| ^", string0);
      assertNotNull(string0);
  }
}

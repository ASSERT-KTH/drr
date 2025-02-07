/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 23 01:43:47 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.DiagnosticType;
import com.google.javascript.jscomp.JSError;
import com.google.javascript.jscomp.LightweightMessageFormatter;
import com.google.javascript.jscomp.Region;
import com.google.javascript.jscomp.SimpleRegion;
import com.google.javascript.jscomp.TypeCheck;
import com.google.javascript.rhino.Node;
import java.io.PrintStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LightweightMessageFormatter_ESTest extends LightweightMessageFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler((PrintStream) null);
      LightweightMessageFormatter lightweightMessageFormatter0 = new LightweightMessageFormatter(compiler0);
      String[] stringArray0 = new String[0];
      JSError jSError0 = JSError.make("Exceeded max number of code motion iterations: {0}", (Node) null, compiler0.OPTIMIZE_LOOP_ERROR, stringArray0);
      String string0 = lightweightMessageFormatter0.formatError(jSError0);
      assertEquals("Exceeded max number of code motion iterations: {0}: ERROR - Exceeded max number of optimization iterations: {0}\n", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LightweightMessageFormatter lightweightMessageFormatter0 = LightweightMessageFormatter.withoutSource();
      DiagnosticType diagnosticType0 = TypeCheck.HIDDEN_SUPERCLASS_PROPERTY_MISMATCH;
      String[] stringArray0 = new String[2];
      JSError jSError0 = JSError.make("", 1263, 2847, diagnosticType0, stringArray0);
      String string0 = lightweightMessageFormatter0.formatWarning(jSError0);
      assertEquals(":1263: WARNING - mismatch of the null property type and the type of the property it overrides from superclass null\noriginal: {2}\noverride: {3}\n", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LightweightMessageFormatter lightweightMessageFormatter0 = LightweightMessageFormatter.withoutSource();
      Compiler compiler0 = new Compiler();
      JSError jSError0 = JSError.make(compiler0.MOTION_ITERATIONS_ERROR, (String[]) null);
      String string0 = lightweightMessageFormatter0.formatError(jSError0);
      assertEquals("ERROR - Exceeded max number of code motion iterations: {0}\n", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      SimpleRegion simpleRegion0 = new SimpleRegion(46, 46, "^\n");
      String string0 = lightweightMessageFormatter_LineNumberingFormatter0.formatRegion(simpleRegion0);
      assertNotNull(string0);
      assertEquals("  46| ^", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      String string0 = lightweightMessageFormatter_LineNumberingFormatter0.formatRegion((Region) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      SimpleRegion simpleRegion0 = new SimpleRegion(32, 32, "");
      String string0 = lightweightMessageFormatter_LineNumberingFormatter0.formatRegion(simpleRegion0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      SimpleRegion simpleRegion0 = new SimpleRegion((-3550), (-2513), "__<Z(");
      String string0 = lightweightMessageFormatter_LineNumberingFormatter0.formatRegion(simpleRegion0);
      assertNotNull(string0);
      assertEquals("  -3550| __<Z(", string0);
  }
}

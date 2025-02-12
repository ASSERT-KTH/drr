/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 15:31:50 GMT 2014
 */

package org.jfree.chart.imagemap;

import static org.junit.Assert.*;
import org.junit.Test;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.jfree.chart.imagemap.StandardToolTipTagFragmentGenerator;
import org.junit.runner.RunWith;

 
public class StandardToolTipTagFragmentGeneratorEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StandardToolTipTagFragmentGenerator standardToolTipTagFragmentGenerator0 = new StandardToolTipTagFragmentGenerator();
      assertNotNull(standardToolTipTagFragmentGenerator0);
      
      String string0 = "";
      String string1 = standardToolTipTagFragmentGenerator0.generateToolTipFragment(string0);
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals(" title=\"\" alt=\"\"", string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
  }
}

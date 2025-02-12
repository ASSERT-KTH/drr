/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:44:25 GMT 2014
 */

package org.apache.commons.lang.enums;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.lang.enums.Enum;
import org.apache.commons.lang.enums.ValuedEnum;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;

import org.junit.runner.RunWith;

 
public class ValuedEnumEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 2060;
      Class<Integer> class0 = null;
      // Undeclared exception!
      try {
        Enum enum0 = ValuedEnum.getEnum(class0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Enum Class must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<String> class0 = String.class;
      int int0 = (-775);
      // Undeclared exception!
      try {
        Enum enum0 = ValuedEnum.getEnum(class0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Class must be a subclass of Enum
         //
      }
  }
}

/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:33:08 GMT 2014
 */

package org.apache.commons.math.analysis.solvers;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.function.Atanh;
import org.apache.commons.math.analysis.function.Constant;
import org.apache.commons.math.analysis.function.Cos;
import org.apache.commons.math.analysis.function.Cosh;
import org.apache.commons.math.analysis.function.Inverse;
import org.apache.commons.math.analysis.function.Sigmoid;
import org.apache.commons.math.analysis.function.Sinc;
import org.apache.commons.math.analysis.function.Sinh;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math.exception.NoBracketingException;
import org.apache.commons.math.exception.NumberIsTooSmallException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class BracketingNthOrderBrentSolverEvoSuite_branch_Test   {

  //@Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(1.0E-6, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertNotNull(bracketingNthOrderBrentSolver0);
      
      int int0 = 447;
      Cos cos0 = new Cos();
      assertNotNull(cos0);
      
      double double0 = 36.581713957;
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double1 = bracketingNthOrderBrentSolver0.solve(int0, (UnivariateFunction) cos0, double0, (double) int0, allowedSolution0);
      assertEquals(221.4822812027902, double1, 0.01D);
      assertEquals(36.581713957, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(1.0E-6, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(21, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(447, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(241.79085697850002, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(447.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double double0 = (-2.134635143);
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      assertEquals(1.0E-6, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertNotNull(bracketingNthOrderBrentSolver0);
      
      int int0 = 626;
      boolean boolean0 = false;
      Sinc sinc0 = new Sinc(boolean0);
      assertNotNull(sinc0);
      
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double1 = bracketingNthOrderBrentSolver0.solve(int0, (UnivariateFunction) sinc0, double0, (double) int0, allowedSolution0);
      assertEquals(311.01767270538954, double1, 0.01D);
      assertEquals(626, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(311.93268242849996, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-6, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(8, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals((-2.134635143), bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(626.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = 445;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((double) int0, int0);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(445, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(445.0, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertNotNull(bracketingNthOrderBrentSolver0);
      
      Cos cos0 = new Cos();
      assertNotNull(cos0);
      
      double double0 = (-4225.90262762);
      double double1 = bracketingNthOrderBrentSolver0.solve(int0, (UnivariateFunction) cos0, double0, (double) int0);
      assertEquals((-2105.159587167893), double1, 0.01D);
      assertEquals((-1890.45131381), bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals((-4225.90262762), bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(5, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(445, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(445.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(445.0, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(445, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double double0 = 1809.942082645591;
      int int0 = 1461;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(double0, int0);
      assertEquals(1461, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(1809.942082645591, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertNotNull(bracketingNthOrderBrentSolver0);
      
      Cosh cosh0 = new Cosh();
      assertNotNull(cosh0);
      
      Sinh sinh0 = (Sinh)cosh0.derivative();
      assertNotNull(sinh0);
      
      double double1 = (-3227.4001);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double2 = bracketingNthOrderBrentSolver0.solve(int0, (UnivariateFunction) sinh0, double1, double0, (double) int0, allowedSolution0);
      assertEquals(288.89997500000004, double2, 0.01D);
      assertEquals(1461, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(1809.942082645591, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals((-3227.4001), bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(4, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(1809.942082645591, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1461, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(1461.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
  }

  //@Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(1.0E-6, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertNotNull(bracketingNthOrderBrentSolver0);
      
      int int0 = 447;
      Cos cos0 = new Cos();
      assertNotNull(cos0);
      
      double double0 = 36.581713957;
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double1 = bracketingNthOrderBrentSolver0.solve(int0, (UnivariateFunction) cos0, double0, (double) int0, allowedSolution0);
      assertEquals(221.4822812027902, double1, 0.01D);
      assertEquals(241.79085697850002, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(21, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(36.581713957, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(447.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(447, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-6, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertNotNull(bracketingNthOrderBrentSolver0);
      
      double[] doubleArray0 = new double[8];
      int int0 = 1880;
      Sinc sinc0 = new Sinc();
      assertNotNull(sinc0);
      
      double double0 = bracketingNthOrderBrentSolver0.solve(int0, (UnivariateFunction) sinc0, doubleArray0[2], (double) int0);
      assertEquals(939.3362034233481, double0, 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(940.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(1880, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(8, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(1.0E-6, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1880.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double double0 = (-2576.7209644908667);
      int int0 = 519;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(double0, double0, double0, int0);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(519, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals((-2576.7209644908667), bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals((-2576.7209644908667), bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals((-2576.7209644908667), bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertNotNull(bracketingNthOrderBrentSolver0);
      
      double[] doubleArray0 = new double[20];
      doubleArray0[0] = double0;
      doubleArray0[1] = doubleArray0[0];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {(-2576.7209644908667), (-2576.7209644908667), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double1 = bracketingNthOrderBrentSolver0.solve(int0, (UnivariateFunction) polynomialFunction0, doubleArray0[0], (double) int0, allowedSolution0);
      assertEquals((-1.0), double1, 0.01D);
      assertArrayEquals(new double[] {(-2576.7209644908667), (-2576.7209644908667), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1, polynomialFunction0.degree());
      assertEquals(519, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(519, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals((-2576.7209644908667), bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals((-2576.7209644908667), bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals((-2576.7209644908667), bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(4, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals((-2576.7209644908667), bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals((-1028.8604822454333), bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(519.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = 445;
      Sigmoid sigmoid0 = new Sigmoid();
      assertNotNull(sigmoid0);
      
      UnivariateFunction univariateFunction0 = sigmoid0.derivative();
      assertNotNull(univariateFunction0);
      
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((double) int0, int0);
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(445.0, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(445, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertNotNull(bracketingNthOrderBrentSolver0);
      
      double double0 = (-137.70046036808168);
      double double1 = 889.7125662823967;
      double double2 = bracketingNthOrderBrentSolver0.solve(int0, univariateFunction0, double0, double1, (double) int0);
      assertEquals(889.7125662823967, double2, 0.01D);
      assertEquals(3, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(889.7125662823967, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(445.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals((-137.70046036808168), bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(445.0, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(445, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(445, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertTrue(double1 == double2);
      assertFalse(double1 == double0);
      assertTrue(double2 == double1);
      assertFalse(double2 == double0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double double0 = (-2.845114717);
      int int0 = 49;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(double0, double0, double0, int0);
      assertEquals((-2.845114717), bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals((-2.845114717), bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(49, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals((-2.845114717), bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertNotNull(bracketingNthOrderBrentSolver0);
      
      Sinh sinh0 = new Sinh();
      assertNotNull(sinh0);
      
      // Undeclared exception!
      try {
        double double1 = bracketingNthOrderBrentSolver0.solve(int0, (UnivariateFunction) sinh0, (double) int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [\uFFFD, \uFFFD], values: [\uFFFD, \uFFFD]
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double double0 = (-2.845114717);
      double double1 = 4160.81912276341;
      int int0 = 49;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(double0, double0, double1, int0);
      assertEquals((-2.845114717), bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals((-2.845114717), bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(4160.81912276341, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(49, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertNotNull(bracketingNthOrderBrentSolver0);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      
      Sinh sinh0 = new Sinh();
      assertNotNull(sinh0);
      
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double2 = bracketingNthOrderBrentSolver0.solve(int0, (UnivariateFunction) sinh0, double0, double1, allowedSolution0);
      assertEquals(5.2870419968289255, double2, 0.01D);
      assertEquals((-2.845114717), bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(4160.81912276341, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals((-2.845114717), bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(2078.987004023205, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(49, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(10, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(4160.81912276341, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals((-2.845114717), bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(49, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      
      Atanh atanh0 = new Atanh();
      assertNotNull(atanh0);
      
      double double3 = 0.0;
      assertFalse(double3 == double2);
      
      double double4 = bracketingNthOrderBrentSolver0.solve(int0, (UnivariateFunction) atanh0, double3, double2, allowedSolution0);
      assertEquals(0.0, double4, 0.01D);
      assertEquals((-2.845114717), bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(2.6435209984144628, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals((-2.845114717), bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(49, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(4160.81912276341, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(2, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(5.2870419968289255, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(49, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertFalse(double2 == double0);
      assertFalse(double2 == double3);
      assertFalse(double2 == double4);
      assertFalse(double2 == double1);
      assertFalse(double1 == double4);
      assertFalse(double1 == double2);
      assertFalse(double1 == double3);
      assertFalse(double1 == double0);
      assertFalse(double4 == double0);
      assertFalse(double4 == double1);
      assertTrue(double4 == double3);
      assertFalse(double4 == double2);
      assertFalse(double0 == double1);
      assertFalse(double0 == double3);
      assertFalse(double0 == double2);
      assertFalse(double0 == double4);
      assertFalse(double3 == double2);
      assertTrue(double3 == double4);
      assertFalse(double3 == double0);
      assertFalse(double3 == double1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double double0 = 0.0;
      int int0 = 4;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(double0, int0);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(4, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertNotNull(bracketingNthOrderBrentSolver0);
      
      Constant constant0 = new Constant(double0);
      assertNotNull(constant0);
      
      double double1 = bracketingNthOrderBrentSolver0.solve(int0, (UnivariateFunction) constant0, double0, (double) int0);
      assertEquals(2.0, double1, 0.01D);
      assertEquals(4, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(4, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(4.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(2.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double double0 = 58.83459644118;
      int int0 = 1454;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(double0, double0, int0);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(58.83459644118, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(58.83459644118, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1454, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertNotNull(bracketingNthOrderBrentSolver0);
      
      int int1 = (-3461);
      Inverse inverse0 = new Inverse();
      assertNotNull(inverse0);
      
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double1 = bracketingNthOrderBrentSolver0.solve(int0, (UnivariateFunction) inverse0, (double) int1, (double) int0, double0, allowedSolution0);
      assertEquals((-3461.0), double1, 0.01D);
      assertEquals(1454, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals((-3461.0), bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(2, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(58.83459644118, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(58.83459644118, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1454.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1454, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(58.83459644118, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double double0 = (-1.0);
      int int0 = (-23);
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = null;
      try {
        bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(double0, double0, double0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -23 is smaller than the minimum (2)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double double0 = (-0.9353834713564563);
      int int0 = (-243);
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = null;
      try {
        bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((double) int0, double0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -243 is smaller than the minimum (2)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double double0 = (-2.134635143);
      int int0 = (-1991);
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = null;
      try {
        bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(double0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1,991 is smaller than the minimum (2)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double double0 = 58.83459644118;
      int int0 = 1454;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(double0, double0, int0);
      assertEquals(1454, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(58.83459644118, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(58.83459644118, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertNotNull(bracketingNthOrderBrentSolver0);
      
      int int1 = bracketingNthOrderBrentSolver0.getMaximalOrder();
      assertEquals(1454, int1);
      assertEquals(1454, bracketingNthOrderBrentSolver0.getMaximalOrder());
      assertEquals(58.83459644118, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getMaxEvaluations());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMax(), 0.01D);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, bracketingNthOrderBrentSolver0.getEvaluations());
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getMin(), 0.01D);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01D);
      assertEquals(58.83459644118, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01D);
      assertTrue(int0 == int1);
      assertTrue(int1 == int0);
  }
}

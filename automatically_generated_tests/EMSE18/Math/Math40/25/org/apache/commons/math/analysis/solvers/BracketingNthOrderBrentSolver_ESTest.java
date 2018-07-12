

package org.apache.commons.math.analysis.solvers;

import org.junit.Assert;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.junit.Test;
import org.apache.commons.math.analysis.UnivariateFunction;

public class BracketingNthOrderBrentSolver_ESTest  {
    @Test(timeout = 4000)
    public void test06() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-6.680679913078676E139), 1231);
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2285, ((UnivariateFunction) (expm1Function0)), (-271.2078544082334), 7.116796041373163E-11, allowedSolution0);
        Assert.assertEquals(0.0, double0, 0.01);
        double double1 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(0.0, double1, 0.01);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1950.6717488661288), 2266);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2266, ((UnivariateFunction) (sincFunction0)), (-1950.6717488661288), ((double) (2266)), allowedSolution0);
        Assert.assertEquals(2266, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(2164.5573383233673, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(440.54746148066556, 440.54746148066556, 440.54746148066556, 4216);
        SinFunction sinFunction0 = new SinFunction();
        bracketingNthOrderBrentSolver0.setup(4216, sinFunction0, 764.913932593, 5424.1013, 1565.8152865);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(1565.8152865, double0, 0.01);
        Assert.assertEquals(4216, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1940.9728452), 2266);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2266, univariateFunction0, (-1940.9728452), ((double) (2266)), allowedSolution0);
        Assert.assertEquals((-519.9316608417924), double0, 0.01);
        double double1 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(2266, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals((-519.9316608417924), double1, 0.01);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1210.571), (-1210.571), 3643.0542, 296);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(296, ((UnivariateFunction) (sinFunction0)), (-1210.571), 3643.0542, ((double) (296)), allowedSolution0);
        Assert.assertEquals(296, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(3643.0542, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(156.14330112823, 156.14330112823, 156.14330112823, 1766);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1766, ((UnivariateFunction) (sincFunction0)), (-2004.438886070063), 156.14330112823, (-964.813), allowedSolution0);
        Assert.assertEquals(156.14330112823, bracketingNthOrderBrentSolver0.getMax(), 0.01);
        Assert.assertEquals((-964.813), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1210.571), (-1210.571), 3643.0542, 296);
        Expm1Function expm1Function0 = new Expm1Function();
        double double0 = bracketingNthOrderBrentSolver0.solve(296, ((UnivariateFunction) (expm1Function0)), (-1.0), 769.177408);
        Assert.assertEquals((-1.0), double0, 0.01);
        Assert.assertEquals(296, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(3132.3239727623836, 2706.1885, 998);
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(4, ((UnivariateFunction) (sinFunction0)), Double.NaN, 0.0, (-1145.1786984885296), allowedSolution0);
        Assert.assertEquals((-1145.1786984885296), bracketingNthOrderBrentSolver0.getStartValue(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1950.6717488661288), 2266);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2266, univariateFunction0, ((double) (0)), 32.0, allowedSolution0);
        Assert.assertEquals(2266, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1950.6717488661288), 2266);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        bracketingNthOrderBrentSolver0.solve(2249, univariateFunction0, (-9.628709342929729E-9), ((double) (0)), allowedSolution0);
        Assert.assertEquals(2266, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(((double) (2)), 1304.27, 2);
        int int0 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        Assert.assertEquals(2, int0);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2266, ((UnivariateFunction) (sincFunction0)), (-1940.9728452), 0.0, allowedSolution0);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(-1617.9202165987494, double0, 0.01);
    }
}


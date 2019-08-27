

package org.apache.commons.math.analysis.solvers;

import org.junit.Assert;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.junit.Test;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.XMinus5Function;

public class BracketingNthOrderBrentSolver_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-28.26735), (-28.26735), (-28.26735), 674);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        bracketingNthOrderBrentSolver0.solve(674, univariateFunction0, 1.0E-15, 1.0E-14, allowedSolution0);
        Assert.assertEquals(674, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-28.26735), (-28.26735), (-28.26735), 674);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(674, univariateFunction0, 0.0, 4571.922012603346, 865.7174594137362, allowedSolution0);
        Assert.assertEquals(674, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        bracketingNthOrderBrentSolver0.solve(238, univariateFunction0, (-1951.1113417855), 0.0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(201.0, 2387);
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2387, ((UnivariateFunction) (xMinus5Function0)), (-4837.1848040565), ((double) (2387)), 201.0, allowedSolution0);
        Assert.assertEquals(5.0, double0, 0.01);
        Assert.assertEquals(2387, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.5, ((double) (2536)), 0.5, 2536);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2536, ((UnivariateFunction) (sincFunction0)), 0.5, ((double) (2536)), 2.381466522851052, allowedSolution0);
        Assert.assertEquals(2.381466522851052, double0, 0.01);
        Assert.assertEquals(2536, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1162.951), 2387);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2387, univariateFunction0, (-1162.951), ((double) (2387)), 201.0, allowedSolution0);
        Assert.assertEquals((-1116.835292964234), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(((double) (2537)), 0.0, 0.0, 2537);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2537, ((UnivariateFunction) (sincFunction0)), 0.0, ((double) (2537)), 1.0, allowedSolution0);
        Assert.assertEquals(2537, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(2537.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(((double) (2537)), 2537);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2537, ((UnivariateFunction) (sincFunction0)), 6.595784859136531E-8, ((double) (2537)), 1.0, allowedSolution0);
        Assert.assertEquals(2537, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(2537.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(1.0, 1.0, 5);
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(59, ((UnivariateFunction) (expm1Function0)), (-1.0), ((double) (59)), ((double) (5)), allowedSolution0);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals((-1.0), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        bracketingNthOrderBrentSolver0.solve(2544, ((UnivariateFunction) (sincFunction0)), 0.0, ((double) (2544)), 1.0, allowedSolution0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(2541.5484567541425, double0, 0.01);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-377.483983429), 1176);
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(687, ((UnivariateFunction) (expm1Function0)), (-377.483983429), 0.0, allowedSolution0);
        Assert.assertEquals(1176, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        bracketingNthOrderBrentSolver0.solve(2544, ((UnivariateFunction) (sincFunction0)), (-4.551803911102389), ((double) (2544)), 1.0, allowedSolution0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(1.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-3.1415926529206515), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1704.09), (-1704.09), 2);
        int int0 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        Assert.assertEquals(2, int0);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(((double) (0)), 0.5, (-276.965), 3);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(298, ((UnivariateFunction) (sinFunction0)), (-2686.9), (-276.965), allowedSolution0);
        Assert.assertEquals(-1266.0589562841958, double0, 0.01);
    }
}




package org.apache.commons.math.analysis.solvers;

import org.junit.Assert;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.junit.Test;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.XMinus5Function;

public class BracketingNthOrderBrentSolver_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(1.0E-12, 1.0E-12, 1.0E-14, 42);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(42, ((UnivariateFunction) (sincFunction0)), (-1026.856630569), (-380.654164449545), allowedSolution0);
        Assert.assertEquals((-684.867198482575), double0, 0.01);
        double double1 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(42, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals((-684.867198482575), double1, 0.01);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1497, ((UnivariateFunction) (expm1Function0)), (-519.5520607326234), 1.0186485886120274E93, ((double) (1497)), allowedSolution0);
        Assert.assertEquals(3.0520030946945553E-13, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        double double0 = bracketingNthOrderBrentSolver0.solve(5, ((UnivariateFunction) (expm1Function0)), (-0.0625), 3.0520030946945553E-13);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(1271.556993317, (-1061.9679184843262), 1271.556993317, 322);
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(158, ((UnivariateFunction) (xMinus5Function0)), (-1061.9679184843262), ((double) (158)), allowedSolution0);
        Assert.assertEquals(322, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals((-451.9839592421631), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(934.707, 4);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(186, ((UnivariateFunction) (sincFunction0)), (-686.8192784280162), 1856.255184299331, ((double) (4)), allowedSolution0);
        Assert.assertEquals((-686.8192784280162), double0, 0.01);
        Assert.assertEquals(4, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(5102.5081809245985, 1770);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        bracketingNthOrderBrentSolver0.solve(1770, ((UnivariateFunction) (sinFunction0)), 0.5, ((double) (1770)), allowedSolution0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(885.25, double0, 0.01);
        Assert.assertEquals(1770, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(1271.556993317, (-1061.9679184843262), 1271.556993317, 310);
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(158, ((UnivariateFunction) (xMinus5Function0)), (-1061.9679184843262), ((double) (158)), allowedSolution0);
        Assert.assertEquals((-451.9839592421631), double0, 0.01);
        Assert.assertEquals(310, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-102.5880786765102), 0.0, (-102.5880786765102), 616);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        bracketingNthOrderBrentSolver0.solve(43, ((UnivariateFunction) (quinticFunction0)), (-102.5880786765102), 0.0, allowedSolution0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(0.0, double0, 0.01);
        Assert.assertEquals(616, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(((double) (345)), (-877.989), 345);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(345, univariateFunction0, 0.0, 2994.162845481887, ((double) (345)), allowedSolution0);
        Assert.assertEquals(0.0, double0, 0.01);
        Assert.assertEquals(345, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-102.5880786765102), 0.0, (-102.5880786765102), 616);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        double double0 = bracketingNthOrderBrentSolver0.solve(616, ((UnivariateFunction) (quinticFunction0)), 0.0);
        Assert.assertEquals(0.0, double0, 0.01);
        Assert.assertEquals(616, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(1271.556993317, (-1061.9679184843262), 0.001308644216531514, 322);
        int int0 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        Assert.assertEquals(322, int0);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(934.707, 4);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(616, ((UnivariateFunction) (sincFunction0)), ((double) (616)), 4333748.525810779, allowedSolution0);
        Assert.assertEquals(1237238.2605985648, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 0.0, 1.0E-14, 42);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(42, ((UnivariateFunction) (sincFunction0)), (-1026.856630569), (-8.64864445321803E-144), allowedSolution0);
        Assert.assertEquals(-1011.5928344559135, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateFunction) (sincFunction0)));
        double double0 = bracketingNthOrderBrentSolver0.solve(345, ((UnivariateFunction) (monitoredFunction0)), 218.6475453464542, 2090866.333131593);
        Assert.assertEquals(14, monitoredFunction0.getCallsCount());
        Assert.assertEquals(1045540.8846706047, double0, 0.01);
    }
}


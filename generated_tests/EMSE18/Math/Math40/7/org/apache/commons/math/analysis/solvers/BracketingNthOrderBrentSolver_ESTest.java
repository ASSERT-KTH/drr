

package org.apache.commons.math.analysis.solvers;

import org.junit.Assert;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.junit.Test;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.XMinus5Function;

public class BracketingNthOrderBrentSolver_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 15);
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(3, ((UnivariateFunction) (quinticFunction0)), 0.0, ((double) (15)), allowedSolution0);
        Assert.assertEquals(0.0, double0, 0.01);
        Assert.assertEquals(15, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        bracketingNthOrderBrentSolver0.solve(1266, ((UnivariateFunction) (sinFunction0)), (-1853.5397511042008), 1419.0, allowedSolution0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals((-1853.539665617978), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 0.0, 2814);
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        double double0 = bracketingNthOrderBrentSolver0.solve(2814, ((UnivariateFunction) (xMinus5Function0)), (-1662.0), ((double) (2814)), 0.0);
        Assert.assertEquals(5.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        double double0 = bracketingNthOrderBrentSolver0.solve(2940, ((UnivariateFunction) (sincFunction0)), ((double) (2940)), 4.63985600437427E180, 1.1599640010935675E180, allowedSolution0);
        Assert.assertEquals(5.799820005467837E179, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        QuinticFunction quinticFunction0 = new QuinticFunction();
        double double0 = bracketingNthOrderBrentSolver0.solve(1694, ((UnivariateFunction) (quinticFunction0)), (-393.29135342879397), 3.2357396082754035);
        Assert.assertEquals(1.0000000011641532, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(((double) (2)), ((double) (2)), 5);
        double double0 = bracketingNthOrderBrentSolver0.solve(2936, ((UnivariateFunction) (sincFunction0)), ((double) (2)), 4.63985600437427E180, allowedSolution0);
        Assert.assertEquals(2.0, bracketingNthOrderBrentSolver0.getMin(), 0.01);
        Assert.assertEquals(2.319928002187135E180, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1266, ((UnivariateFunction) (sinFunction0)), (-1853.5397511042008), 1419.0, allowedSolution0);
        Assert.assertEquals((-1853.5396650062044), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(2955.660401676489, 2.739393621390718, 2);
        SinFunction sinFunction0 = new SinFunction();
        UnivariateFunction univariateFunction0 = sinFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2, univariateFunction0, (-1695.0), 1175.430853089637, ((double) (2)), allowedSolution0);
        Assert.assertEquals((-1695.0), double0, 0.01);
        Assert.assertEquals(2, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, ((double) (2814)), 0.0, 2814);
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        bracketingNthOrderBrentSolver0.solve(2814, ((UnivariateFunction) (xMinus5Function0)), (-1662.0), 1319.2783594438824, 0.0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(2814, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        bracketingNthOrderBrentSolver0.solve(2814, ((UnivariateFunction) (xMinus5Function0)), (-1662.0), ((double) (5)), 0.0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(5.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 2);
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(3, ((UnivariateFunction) (quinticFunction0)), 0.0, ((double) (2)), allowedSolution0);
        Assert.assertEquals(1.0, double0, 0.01);
        Assert.assertEquals(2, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        QuinticFunction quinticFunction0 = new QuinticFunction();
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 2);
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(5, ((UnivariateFunction) (quinticFunction0)), 0.0, ((double) (3)), 0.20804896039091147, allowedSolution0);
        Assert.assertEquals(2, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        double double0 = bracketingNthOrderBrentSolver0.solve(2940, ((UnivariateFunction) (sincFunction0)), ((double) (2)), 4.63985600437427E180, allowedSolution0);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(1.1599640010935675E180, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, ((double) (2814)), 0.0, 2814);
        int int0 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        Assert.assertEquals(2814, int0);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        double double0 = bracketingNthOrderBrentSolver0.solve(2940, ((UnivariateFunction) (sincFunction0)), ((double) (2940)), 4.63985600437427E180, 3268.115774966102, allowedSolution0);
        Assert.assertEquals(2953.0970943670745, double0, 0.01);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }
}


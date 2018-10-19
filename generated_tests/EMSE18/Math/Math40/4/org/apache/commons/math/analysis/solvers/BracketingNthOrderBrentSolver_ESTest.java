

package org.apache.commons.math.analysis.solvers;

import org.junit.Assert;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.junit.Test;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.XMinus5Function;

public class BracketingNthOrderBrentSolver_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1513, ((UnivariateFunction) (sinFunction0)), (-0.48237584797874283), ((double) (1513)), allowedSolution0);
        Assert.assertEquals(289.026524130261, double0, 0.01);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(1651.7, 1651.7, 1475);
        SincFunction sincFunction0 = new SincFunction();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateFunction) (sincFunction0)));
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        bracketingNthOrderBrentSolver0.solve(1126, ((UnivariateFunction) (monitoredFunction0)), (-1656.4), (-4.649545746314638), allowedSolution0);
        Assert.assertEquals(2, monitoredFunction0.getCallsCount());
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals((-1656.4), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(1772.6790270021, 729);
        Assert.assertEquals(729, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        double double0 = bracketingNthOrderBrentSolver0.solve(2572, ((UnivariateFunction) (xMinus5Function0)), (-1656.3925528995937), ((double) (2572)));
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(5.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(155, ((UnivariateFunction) (sinFunction0)), (-1077.5445541012214), 50.12, allowedSolution0);
        Assert.assertEquals((-1074.4246875427878), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        SinFunction sinFunction0 = new SinFunction();
        double double0 = bracketingNthOrderBrentSolver0.solve(148, ((UnivariateFunction) (sinFunction0)), (-752284.7342315135), ((double) (148)), (-1077.925), allowedSolution0);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals((-826.2388678941156), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        bracketingNthOrderBrentSolver0.solve(1513, ((UnivariateFunction) (sinFunction0)), ((double) (1513)), 1766.165326506592);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(1652.477735788231, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-0.7568024953079282), ((double) (4)), ((double) (4)), 4);
        double double0 = bracketingNthOrderBrentSolver0.solve(4, ((UnivariateFunction) (sinFunction0)), (-16.798884938861587), ((double) (4)), allowedSolution0);
        Assert.assertEquals(4, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals((-6.399442469430793), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        SinFunction sinFunction0 = new SinFunction();
        double double0 = bracketingNthOrderBrentSolver0.solve(148, ((UnivariateFunction) (sinFunction0)), (-1077.925), 0.0, allowedSolution0);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        bracketingNthOrderBrentSolver0.solve(1513, ((UnivariateFunction) (sinFunction0)), 0.0, ((double) (1513)), allowedSolution0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        SinFunction sinFunction0 = new SinFunction();
        double double0 = bracketingNthOrderBrentSolver0.solve(190, ((UnivariateFunction) (sinFunction0)), (-752284.6045023812), ((double) (190)), 0.0, allowedSolution0);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-3269.5657), (-3269.5657), 2035.4, 502524);
        int int0 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        Assert.assertEquals(502524, int0);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        SinFunction sinFunction0 = new SinFunction();
        double double0 = bracketingNthOrderBrentSolver0.solve(155, ((UnivariateFunction) (sinFunction0)), (-752284.7342315135), ((double) (155)), 2.1363039614477183E-13, allowedSolution0);
        Assert.assertEquals(3.141592653569853, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        SinFunction sinFunction0 = new SinFunction();
        double double0 = bracketingNthOrderBrentSolver0.solve(155, ((UnivariateFunction) (sinFunction0)), (-752280.2998500463), ((double) (155)), (-803.0), allowedSolution0);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(-701649.5864380515, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        double double0 = bracketingNthOrderBrentSolver0.solve(155, ((UnivariateFunction) (sinFunction0)), ((double) (155)), 542.405469);
        Assert.assertEquals(157.07963267948966, double0, 0.01);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }
}


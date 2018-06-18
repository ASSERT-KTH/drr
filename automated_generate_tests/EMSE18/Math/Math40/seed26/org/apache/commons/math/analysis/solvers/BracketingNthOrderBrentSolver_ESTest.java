

package org.apache.commons.math.analysis.solvers;

import org.junit.Assert;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.junit.Test;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.XMinus5Function;

public class BracketingNthOrderBrentSolver_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateFunction) (expm1Function0)));
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2146794608, ((UnivariateFunction) (monitoredFunction0)), 0.0, 3513.1, allowedSolution0);
        Assert.assertEquals(2, monitoredFunction0.getCallsCount());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(621.8156447581625, 0.0, 1718);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        bracketingNthOrderBrentSolver0.solve(1718, ((UnivariateFunction) (quinticFunction0)), 0.0, ((double) (1718)), 0.5925495624542236, allowedSolution0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(1718, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(622.4876692416501, 0.5, 1718);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        bracketingNthOrderBrentSolver0.solve(1718, ((UnivariateFunction) (quinticFunction0)), 0.5, ((double) (1718)), 0.5925495624542236, allowedSolution0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(0.5, bracketingNthOrderBrentSolver0.getMin(), 0.01);
        Assert.assertEquals(0.5, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(471, ((UnivariateFunction) (xMinus5Function0)), 1.0, 682.33, allowedSolution0);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(5.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1317, ((UnivariateFunction) (sincFunction0)), (-2692.12), ((double) (1317)), 47.6, allowedSolution0);
        Assert.assertEquals((-2689.203311474879), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateFunction) (expm1Function0)));
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        bracketingNthOrderBrentSolver0.solve(2146794608, ((UnivariateFunction) (monitoredFunction0)), (-1836.17572989694), 3513.1, allowedSolution0);
        bracketingNthOrderBrentSolver0.doSolve();
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(622.4876692416501, 0.5, 1718);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        UnivariateFunction univariateFunction0 = quinticFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1718, univariateFunction0, 0.5, ((double) (1718)), 0.5925495624542236, allowedSolution0);
        Assert.assertEquals(0.5, bracketingNthOrderBrentSolver0.getMin(), 0.01);
        Assert.assertEquals(0.5925495624542236, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(((double) (31)), ((double) (31)), 31);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(31, univariateFunction0, (-3115.6249883), 1.2338834973551724E-20, allowedSolution0);
        Assert.assertEquals(31, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(1.2338834973551724E-20, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(((double) (31)), ((double) (31)), 31);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(31, ((UnivariateFunction) (sincFunction0)), (-3115.6249883), 1.2338834973551724E-20, allowedSolution0);
        Assert.assertEquals(31, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals((-1557.81249415), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(1288.3386, 3156);
        Expm1Function expm1Function0 = new Expm1Function();
        double double0 = bracketingNthOrderBrentSolver0.solve(3156, ((UnivariateFunction) (expm1Function0)), ((double) (0)));
        Assert.assertEquals(0.0, double0, 0.01);
        Assert.assertEquals(3156, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        int int0 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        Assert.assertEquals(5, int0);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1317, ((UnivariateFunction) (sincFunction0)), (-444.9468412), 712.10573218609, 47.6, allowedSolution0);
        Assert.assertEquals(521.5043804959057, double0, 0.01);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(((double) (-792)), 2568);
        double double0 = bracketingNthOrderBrentSolver0.solve(2568, ((UnivariateFunction) (sincFunction0)), ((double) (-792)), ((double) (2568)), allowedSolution0);
        Assert.assertEquals(2057.743188101316, double0, 0.01);
        Assert.assertEquals(2568, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(((double) (-792)), 2568);
        double double0 = bracketingNthOrderBrentSolver0.solve(2568, ((UnivariateFunction) (sincFunction0)), ((double) (-792)), ((double) (2568)), allowedSolution0);
        Assert.assertEquals(2057.743188101316, double0, 0.01);
        Assert.assertEquals(2568, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }
}


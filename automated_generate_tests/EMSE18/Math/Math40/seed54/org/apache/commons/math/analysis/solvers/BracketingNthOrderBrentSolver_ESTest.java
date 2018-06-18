

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
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(3816.8723390563, 1430);
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1430, ((UnivariateFunction) (expm1Function0)), (-173.493255522887), ((double) (1430)), 0.0, allowedSolution0);
        Assert.assertEquals(1430, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 0.0, 842);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        bracketingNthOrderBrentSolver0.setup(1631, quinticFunction0, 0.0, 1631, 842);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(842, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1646515738, ((UnivariateFunction) (xMinus5Function0)), (-1729.08336), ((double) (1646515738)), allowedSolution0);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(5.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-36.827592049922025), 842);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        bracketingNthOrderBrentSolver0.solve(842, ((UnivariateFunction) (sinFunction0)), (-36.827592049922025), ((double) (5)), allowedSolution0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(3.141592653589794, double0, 0.01);
        Assert.assertEquals(842, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(1.7020465042442242E-8, 1333);
        Assert.assertEquals(1333, bracketingNthOrderBrentSolver0.getMaximalOrder());
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1333, ((UnivariateFunction) (sincFunction0)), (-2812.142311538163), 2759.0019524313, 1.7020465042442242E-8, allowedSolution0);
        Assert.assertEquals((-2811.725424962865), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(((double) (3)), 296.767647832509, (-1685.4780254), 3);
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        QuinticFunction quinticFunction0 = new QuinticFunction();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateFunction) (quinticFunction0)));
        double double0 = bracketingNthOrderBrentSolver0.solve(3, ((UnivariateFunction) (monitoredFunction0)), (-1685.4780254), 296.767647832509, allowedSolution0);
        Assert.assertEquals(3, monitoredFunction0.getCallsCount());
        Assert.assertEquals(296.767647832509, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(1.0E-6, 1333);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1333, ((UnivariateFunction) (sincFunction0)), (-2812.142311538163), 1.0E-6, ((double) (0)), allowedSolution0);
        Assert.assertEquals((-2811.7254249831167), double0, 0.01);
        Assert.assertEquals(1333, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 0.0, 842);
        Expm1Function expm1Function0 = new Expm1Function();
        UnivariateFunction univariateFunction0 = expm1Function0.derivative();
        bracketingNthOrderBrentSolver0.solve(842, univariateFunction0, (-2711.0));
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(842, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals((-2711.0), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(((double) (3)), 296.767647832509, (-1685.4780254), 3);
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        QuinticFunction quinticFunction0 = new QuinticFunction();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateFunction) (quinticFunction0)));
        double double0 = bracketingNthOrderBrentSolver0.solve(3, ((UnivariateFunction) (monitoredFunction0)), (-1685.4780254), 0.0, allowedSolution0);
        Assert.assertEquals(3, monitoredFunction0.getCallsCount());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        int int0 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        Assert.assertEquals(5, int0);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1942, ((UnivariateFunction) (sincFunction0)), 149.135493827405, ((double) (1942)), allowedSolution0);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(1017.8760200587367, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1942, ((UnivariateFunction) (sincFunction0)), ((double) (1942)), 4236.84, allowedSolution0);
        Assert.assertEquals(3012.7873547935374, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-0.2300990602343948), 1333);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1333, ((UnivariateFunction) (sincFunction0)), (-2812.142311538163), 2759.0019524313, (-2807.7080534236866), allowedSolution0);
        Assert.assertEquals(2759.0019524313, bracketingNthOrderBrentSolver0.getMax(), 0.01);
        Assert.assertEquals(1118.4069846779662, double0, 0.01);
    }
}


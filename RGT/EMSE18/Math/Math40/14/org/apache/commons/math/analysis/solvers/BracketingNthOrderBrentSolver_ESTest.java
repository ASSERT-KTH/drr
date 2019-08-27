

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
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.5611542903777339, 0.5611542903777339, 0.5611542903777339, 1467);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateFunction) (quinticFunction0)));
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1467, ((UnivariateFunction) (monitoredFunction0)), (-0.0625), 0.5611542903777339, allowedSolution0);
        Assert.assertEquals(2, monitoredFunction0.getCallsCount());
        Assert.assertEquals((-0.0625), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        SincFunction sincFunction0 = new SincFunction();
        UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(694.9712080354432, 0.0, 17);
        double double0 = bracketingNthOrderBrentSolver0.solve(1351, univariateFunction0, (-3371.755), ((double) (17)), 1.0000244947677721E-6, allowedSolution0);
        Assert.assertEquals(1.0000244947677721E-6, double0, 0.01);
        Assert.assertEquals(17, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1.6745661720946737E-8), 6.079434951446575E-234, 2791);
        SinFunction sinFunction0 = new SinFunction();
        double double0 = bracketingNthOrderBrentSolver0.solve(72, ((UnivariateFunction) (sinFunction0)), (-1.6745661720946737E-8), ((double) (2791)));
        Assert.assertEquals(7.349698265880664E-19, double0, 0.01);
        double double1 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(2791, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(7.349698265880664E-19, double1, 0.01);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(980.1267706289548, (-1.0), (-398.39), 1030);
        Expm1Function expm1Function0 = new Expm1Function();
        UnivariateFunction univariateFunction0 = expm1Function0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        bracketingNthOrderBrentSolver0.solve(1030, univariateFunction0, (-3533.98139831), ((double) (1030)), 1.0E-6, allowedSolution0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals((-3533.98139831), double0, 0.01);
        Assert.assertEquals(1030, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-4.116620704120123), (-4.116620704120123), (-4.116620704120123), 253);
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(253, ((UnivariateFunction) (xMinus5Function0)), (-4.116620704120123), ((double) (253)), allowedSolution0);
        Assert.assertEquals(5.0, double0, 0.01);
        Assert.assertEquals(253, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(387, ((UnivariateFunction) (sinFunction0)), 874.1514801631286, 3494.249, allowedSolution0);
        Assert.assertEquals(1900.6635562266792, double0, 0.01);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.1693800985813141, 946.1121712249029, 0.1693800985813141, 255);
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(255, ((UnivariateFunction) (xMinus5Function0)), 0.1693800985813141, ((double) (255)), allowedSolution0);
        Assert.assertEquals(127.58469004929066, double0, 0.01);
        Assert.assertEquals(255, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        SincFunction sincFunction0 = new SincFunction();
        double double0 = bracketingNthOrderBrentSolver0.solve(387, ((UnivariateFunction) (sincFunction0)), ((double) (0)), 874.1514801631286, allowedSolution0);
        Assert.assertEquals(436.68137886224673, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(387, ((UnivariateFunction) (sincFunction0)), ((double) (26)), 874.1514801631286, allowedSolution0);
        Assert.assertEquals(442.96456415610265, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-2569.5), (-2569.5), 1067.1535471, 1581);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        bracketingNthOrderBrentSolver0.solve(793782218, ((UnivariateFunction) (quinticFunction0)), (-875.729186837), 1259.182804, 1067.1535471, allowedSolution0);
        bracketingNthOrderBrentSolver0.doSolve();
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 0.0, 0.0, 1467);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateFunction) (quinticFunction0)));
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1467, ((UnivariateFunction) (monitoredFunction0)), (-0.0625), 0.0, allowedSolution0);
        Assert.assertEquals(3, monitoredFunction0.getCallsCount());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        SincFunction sincFunction0 = new SincFunction();
        UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        bracketingNthOrderBrentSolver0.solve(1351, univariateFunction0, 0.0, 1109.6463365);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        SincFunction sincFunction0 = new SincFunction();
        UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        double double0 = bracketingNthOrderBrentSolver0.solve(1351, univariateFunction0, (-3371.755), ((double) (17)), 0.0, allowedSolution0);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(387, ((UnivariateFunction) (sinFunction0)), ((double) (387)), 3494.249, allowedSolution0);
        Assert.assertEquals(2488.141381628299, double0, 0.01);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-2569.5), (-2569.5), 1067.1535471, 1581);
        int int0 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        Assert.assertEquals(1581, int0);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(387, ((UnivariateFunction) (sincFunction0)), 875.3909151754606, 3494.249, allowedSolution0);
        Assert.assertEquals(1372.8759896187396, double0, 0.01);
    }
}


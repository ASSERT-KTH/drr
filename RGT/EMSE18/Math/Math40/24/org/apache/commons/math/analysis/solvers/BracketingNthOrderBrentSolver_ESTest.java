

package org.apache.commons.math.analysis.solvers;

import org.junit.Assert;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.junit.Test;
import org.apache.commons.math.analysis.UnivariateFunction;

public class BracketingNthOrderBrentSolver_ESTest  {
    @Test(timeout = 4000)
    public void test04() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        try {
            bracketingNthOrderBrentSolver0.solve(1435, ((UnivariateFunction) (sincFunction0)), ((double) (1435)), 2117.0, ((AllowedSolution) (null)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1435, univariateFunction0, ((double) (1435)), 2117.0, allowedSolution0);
        Assert.assertEquals(2040.463938421987, double0, 0.01);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2637, ((UnivariateFunction) (sincFunction0)), (-2788.6581660714123), ((double) (2637)), 2069.9027396166894, allowedSolution0);
        Assert.assertEquals(2067.167966062084, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(18.704788193976338, 1051);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(univariateFunction0);
        double double0 = bracketingNthOrderBrentSolver0.solve(1051, ((UnivariateFunction) (monitoredFunction0)), (-941.3960339), ((double) (1051)), 18.704788193976338);
        Assert.assertEquals(3, monitoredFunction0.getCallsCount());
        Assert.assertEquals((-941.3960339), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1082.5115235747128), (-1082.5115235747128), 3203);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1442, ((UnivariateFunction) (sincFunction0)), (-1082.5115235747128), ((double) (3203)), allowedSolution0);
        Assert.assertEquals((-1082.5115235747128), bracketingNthOrderBrentSolver0.getMin(), 0.01);
        Assert.assertEquals((-1074.4246875277092), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(5, ((UnivariateFunction) (sincFunction0)), (-1.0), 1.1897985529427766E28, allowedSolution0);
        Assert.assertEquals(2.9744963823569416E27, double0, 0.01);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0625, (-630.64294529105), 0.0625, 673);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        double double0 = bracketingNthOrderBrentSolver0.solve(673, ((UnivariateFunction) (quinticFunction0)), 0.0625, 0.5);
        Assert.assertEquals(673, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.5, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 0.0, 2708);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2708, ((UnivariateFunction) (quinticFunction0)), 0.0, ((double) (2708)), allowedSolution0);
        Assert.assertEquals(2708, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        double double0 = bracketingNthOrderBrentSolver0.solve(2276, ((UnivariateFunction) (sinFunction0)), ((double) (0)));
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        bracketingNthOrderBrentSolver0.solve(2637, ((UnivariateFunction) (quinticFunction0)), (-2814.05890885), ((double) (2637)), (-1.545495535488274E-89), allowedSolution0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(0.0, double0, 0.01);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        int int0 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        Assert.assertEquals(5, int0);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        bracketingNthOrderBrentSolver0.solve(2637, ((UnivariateFunction) (quinticFunction0)), (-2814.05890885), ((double) (2637)), 2086.271608305562, allowedSolution0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(2086.271608305562, bracketingNthOrderBrentSolver0.getStartValue(), 0.01);
        Assert.assertEquals(-0.9999999971924272, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1435, ((UnivariateFunction) (sincFunction0)), ((double) (1435)), 2117.0, allowedSolution0);
        Assert.assertEquals(1599.0706599150708, double0, 0.01);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(18.704788193976338, 1051);
        SincFunction sincFunction0 = new SincFunction();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateFunction) (sincFunction0)));
        double double0 = bracketingNthOrderBrentSolver0.solve(1051, ((UnivariateFunction) (monitoredFunction0)), (-941.3960339156645), ((double) (1051)), 18.704788193976338);
        Assert.assertEquals(12, monitoredFunction0.getCallsCount());
        Assert.assertEquals(147.81290701655087, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        bracketingNthOrderBrentSolver0.solve(2637, ((UnivariateFunction) (sincFunction0)), (-2814.05890885), ((double) (2637)), 2086.271608305562, allowedSolution0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(-1228.362727553562, double0, 0.01);
    }
}


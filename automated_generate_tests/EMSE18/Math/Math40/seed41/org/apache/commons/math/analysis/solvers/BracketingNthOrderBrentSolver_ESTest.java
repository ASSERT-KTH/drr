

package org.apache.commons.math.analysis.solvers;

import org.junit.Assert;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.junit.Test;
import org.apache.commons.math.analysis.UnivariateFunction;

public class BracketingNthOrderBrentSolver_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateFunction) (sinFunction0)));
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(3429, ((UnivariateFunction) (monitoredFunction0)), 0.0, ((double) (3429)), allowedSolution0);
        Assert.assertEquals(2, monitoredFunction0.getCallsCount());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-393.29), (-681.7256058301051), 1975);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        bracketingNthOrderBrentSolver0.solve(1975, ((UnivariateFunction) (quinticFunction0)), (-186.156515250129), ((double) (1975)), allowedSolution0);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-393.29), (-681.7256058301051), 1975);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        bracketingNthOrderBrentSolver0.solve(1975, ((UnivariateFunction) (quinticFunction0)), (-94.2886363499), ((double) (1975)), allowedSolution0);
        bracketingNthOrderBrentSolver0.doSolve();
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-3733.14843), 1916);
        Assert.assertEquals(1916, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        bracketingNthOrderBrentSolver0.solve(265985202, ((UnivariateFunction) (expm1Function0)), (-2015.814), 1.0174178286896879E-4);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateFunction) (sinFunction0)));
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        bracketingNthOrderBrentSolver0.solve(3429, ((UnivariateFunction) (monitoredFunction0)), (-1404.81939971581), (-1.0), allowedSolution0);
        Assert.assertEquals(13, monitoredFunction0.getCallsCount());
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals((-675.4424205264859), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.5573811531066895, 0.5573811531066895, 92);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        UnivariateFunction univariateFunction0 = quinticFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(92, univariateFunction0, (-502.2745526), 0.5573811531066895, allowedSolution0);
        Assert.assertEquals(0.557381147296951, double0, 0.01);
        Assert.assertEquals(92, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        double double0 = bracketingNthOrderBrentSolver0.solve(229, ((UnivariateFunction) (sinFunction0)), (-1379.3383), 4615.56076566, 0.014183459340613824, allowedSolution0);
        Assert.assertEquals(2353.052897538755, double0, 0.01);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(889, ((UnivariateFunction) (sincFunction0)), (-4146.1), 0.5497026943127139, allowedSolution0);
        Assert.assertEquals((-2070.309558758052), double0, 0.01);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1354, ((UnivariateFunction) (sinFunction0)), 2.0769322678328357E-128, 1920.761038318423, allowedSolution0);
        Assert.assertEquals(3.1415926562327763, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        UnivariateFunction univariateFunction0 = sinFunction0.derivative();
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1362, univariateFunction0, (-1379.3383), 2.0769322678328357E-128, (-451.7), allowedSolution0);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals((-925.1990364822075), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        double double0 = bracketingNthOrderBrentSolver0.solve(1354, ((UnivariateFunction) (sinFunction0)), (-554.4911033604202), 0.0, (-0.0022426204954334628), allowedSolution0);
        Assert.assertEquals(0.0, double0, 0.01);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-393.29), (-681.7256058301051), 1975);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        UnivariateFunction univariateFunction0 = quinticFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1975, univariateFunction0, 0.6291294097900391, 1128.8771, allowedSolution0);
        Assert.assertEquals(1975, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.8222164340791343, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        SincFunction sincFunction0 = new SincFunction();
        UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        double double0 = bracketingNthOrderBrentSolver0.solve(3429, univariateFunction0, (-1404.81939971581), 2.0792221071775106E163, allowedSolution0);
        Assert.assertEquals((-1404.81939971581), bracketingNthOrderBrentSolver0.getMin(), 0.01);
        Assert.assertEquals(1.0396110535887553E163, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        int int0 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        Assert.assertEquals(5, int0);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        UnivariateFunction univariateFunction0 = sinFunction0.derivative();
        bracketingNthOrderBrentSolver0.setup(3033, univariateFunction0, 0.0, 7.75933511025868E163, 0.2409527599811554);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(7.126401313189868E163, double0, 0.01);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }
}

